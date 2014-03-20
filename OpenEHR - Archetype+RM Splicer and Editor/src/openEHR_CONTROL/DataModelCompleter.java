/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package openEHR_CONTROL;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.xmlbeans.*;
import org.openehr.schemas.v1.*;

/**
 *
 * @author Vinicius
 */
public class DataModelCompleter {

    OBSERVATION obs;
    String archetype_name = "openEHR-EHR-OBSERVATION.blood_pressure.v1";
    Object obj;
    XmlOptions xmlopt = new XmlOptions().setSavePrettyPrint().setSavePrettyPrintIndent(4);
    private List<Object> list = new ArrayList<>();
    private ARCHETYPE arch;
    File output;
    private String glub;

    public List<Object> getModifiableItemsList() {
        List<Object> list = new ArrayList<>();
        return list;
    }

    public RESOURCEDESCRIPTION getArchDef() {
        return arch.getDescription();
    }
 /**
  * Completes the archetype with the implicit data from the reference model, making a complete data model.
  * @param arch_doc ArchetypeDocument as parameter
  * @throws IllegalArgumentException
  * @throws IllegalAccessException
  * @throws InvocationTargetException
  * @throws InstantiationException
  * @throws SecurityException
  * @throws NoSuchMethodException 
  */
    public void archetypeFiller(ArchetypeDocument arch_doc) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException,
        SecurityException, NoSuchMethodException {
        setArch(arch_doc.getArchetype());
        XmlCursor xmlc = getArch().newCursor(); // Cursor para iteração nas linhas do
        // xml       
        while (xmlc.hasNextToken()) {
            Object dt = null; //
            obj = xmlc.getObject();
            Method[] methods = null; // Array de Métodos
            if (obj == null) { // Linhas que não são instancias de classes
                // openEHR caem aqui.
                xmlc.toNextToken();
                continue;
            }


            String cname = obj.getClass().getName(); // Nome da Classe para o cast
            cname = cname.replace("Impl", ""); // Talvez não precise disso, checar se é possível cast ARCHETYPEImpl por exemplo.
            cname = cname.replace("impl.", ""); // Related to the above statement :)

            //  System.out.println(cname);
            if (obj.getClass().getName().contains("org.openehr.schemas.v1.impl")) {

                try {
                    // Cast dinâmico para a classe que o nome está na variável
                    // cname;
                    Object casted_o = Class.forName(cname).cast(obj);
                    // Preenche array de métodos com os contidos no casted_o
                    methods = casted_o.getClass().getMethods();
                    // System.out.println(casted_o.getClass().getMethod("xmlText",null).invoke(casted_o, null));
                } catch (ClassNotFoundException e) {
                }

                for (Method m : methods) { // Reflection

                    String name = m.getName(); // Nome do método
                    // A condição se dá quando há algum método chamado addNewAssumedValue, pois todos os dataTypes o tem;
                    if (name.contains("addNewAssumedValue")) {
                        dt = m.invoke(obj, null); // invoca o método addNewAssumedValue q retorna a instancia de sua classe... ex: addNewAssumedValue retorna DVQUANTITY       
                        methods = dt.getClass().getMethods(); //Preenche array de métodos com 
                        for (Method m2 : methods) {
                            String name2 = m2.getName();
                            //Se o nome do método começar com set e a classe que o declarou conter "org.openehr..."  
                            if (name2.startsWith("set") && m2.getDeclaringClass().getName().contains("org.openehr.schemas.v1.impl")) {
                                Class<?>[] types = m2.getParameterTypes(); // Preenche array de tipos dos argumentos do método m2
                                Object[] args = new Object[types.length]; // Cria array de objetos que contêm a quantidade de argumentos do método
                                for (int i = 0; i < types.length; i++) {
                                    if (!types[i].isPrimitive()) { // Se o tipo for primitivo	
                                        if (types[i].getName().contains("org.openehr.schemas.v1")) {
                                            // TODO Fazer o tipo ser instanciado para poder usar os metodos.
                                            Method[] methods2 = types[i].getClass().getMethods(); //Preenche array de métodos com 

                                            for (Method m3 : methods2) {
                                                String name3 = m3.getName();
                                                //Se o nome do método começar com set e a classe que o declarou conter "org.openehr..."  
                                                if (name3.startsWith("add")) {
                                                    if (name3.startsWith("add")) {
                                                        Object[] args2 = null; // Cria array de objetos que contêm a quantidade de argumentos do método
                                                        //    System.out.println(name3 + m3.getParameterTypes().length);
                                                        m3.invoke(dt, args2);
                                                    }
                                                }
                                            }

                                            args[i] = null; // O argumento será nulo
                                        } else {
                                            args[i] = types[i].newInstance();
                                        }
                                    } else {
                                        String type = types[i].getName();
                                        switch (type) {
                                            case "boolean":
                                                args[i] = false;
                                                break;
                                            case "int":
                                                args[i] = 0;
                                                break;
                                            default:
                                                args[i] = (char) 0;
                                                break;
                                        }
                                    }
                                }
                                for (int i = 0; i < args.length; i++) {
                                }
                                if (args.length == 1) {
                                    m2.invoke(dt, args);
                                }
                            }

                        }
                        break;
                    }
                }
            }
            xmlc.toNextToken();
        }

        output = new File("output/" + arch_doc.getArchetype().getArchetypeId().getValue() + ".xml");

        try {
            arch_doc.save(output);
           // System.out.println("Funcionou");
        } catch (IOException e) {
            e.printStackTrace();
        }
      //  System.out.println(arch_doc);


    }

    /**
     * Parses the arhetype
     * @param arquivo 
     */
    public void parse(File arquivo) {


        DataModelCompleter ps = new DataModelCompleter();
        ArchetypeDocument arch_doc = null;

        try {

            arch_doc = ArchetypeDocument.Factory.parse(arquivo, xmlopt);

            arch = arch_doc.getArchetype();

            ps.archetypeFiller(arch_doc);
        } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException | InstantiationException | SecurityException | NoSuchMethodException ex) {
            Logger.getLogger(DataModelCompleter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XmlException e) {
        } catch (IOException e) {
        }

    }


    /**
     * @return the arch
     */
    public String getArchString() {

        return arch.xmlText();

    }

    public ARCHETYPE getArch() {
        return arch;
    }

    /**
     * @param arch the arch to set
     */
    public void setArch(ARCHETYPE arch) {
        this.arch = arch;
    }

    /**
     * @return the list
     */
    public List<Object> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Object> list) {
        this.list = list;
    }
}
