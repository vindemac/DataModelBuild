/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openEHR_CONTROL;

import Utils.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openehr.rm.support.terminology.TerminologyService;
import org.openehr.schemas.v1.*;
import org.openehr.terminology.SimpleTerminologyService;

/**
 *
 * @author Vinicius e Jaqueline
 */
public class Parser {

    private ARCHETYPE archetype;
    ArchetypeDocument ad;
    List<XmlObject> xmlobj = new ArrayList<>();
    private List<CCOMPLEXOBJECT> ccolist = new ArrayList<>();
/**
 * Parses the file and build a CCOMPLEXOBJECT list
 * @param file Archetype
 */
    public Parser(File file) {
        //File file = new File("G://Downloads//openEHR-EHR-OBSERVATION.blood_pressure.v1.xml");
        XmlOptions xmlopt = new XmlOptions();
        xmlopt.setSavePrettyPrintIndent(4);
        xmlopt.setSaveNamespacesFirst();
        try {
            //     System.out.println(file);
            ad = ArchetypeDocument.Factory.parse(file, xmlopt);

            archetype = ad.getArchetype();
            XmlCursor xc = ad.getArchetype().getDefinition().newCursor();

            while (xc.hasNextToken()) {
                if (xc.getObject() != null) {

                    XmlObject obj = xc.getObject();

                    if (obj.getClass().getPackage().getName().equals("org.openehr.schemas.v1.impl")) {
                        // String st = obj.getClass().getSimpleName().substring(0, xc.getObject().getClass().getSimpleName().length() - 4);
                        Method methods[] = obj.getClass().getMethods();
                        for (Method m : methods) {
                            if (m.getName().equals("getRmTypeName")) {
                                String rmtn;
                                rmtn = (String) m.invoke(obj);
                                //  System.out.println(rmtn);
                                if (rmtn.equals("ELEMENT")) {
                                    if (obj instanceof CCOMPLEXOBJECT) {
                                        CCOMPLEXOBJECT cco = (CCOMPLEXOBJECT) obj;
                                        xmlobj.add(cco);
                                        getCcolist().add(cco);
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                xc.toNextToken();
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException | XmlException | IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
/**
 * Gets the ontology
 * @param nodeid Nodeid
 * @param lang Desired Language
 * @return 
 */
    public ARCHETYPETERM getOntology(String nodeid, String lang) {
        for (CodeDefinitionSet cds : ad.getArchetype().getOntology().getTermDefinitionsArray()) {
            if (cds.getLanguage().equals(lang)) {
                for (ARCHETYPETERM at : cds.getItemsArray()) {
                    //System.out.println(at.getCode()+">"+nodeid+"<");
                    if (at.getCode().equals(nodeid)) {
                        //  System.out.println("-->" + at.getItemsArray(0).getStringValue());
                        return at;
                    }
                }
            }

        }
        return null;
    }

  /**
   * Gets ontology text only
   * @param nodeid Nodeid
   * @param lang Desired language
   * @return 
   */
    public String getOntologyText(String nodeid, String lang) {
        for (CodeDefinitionSet cds : ad.getArchetype().getOntology().getTermDefinitionsArray()) {
            if (cds.getLanguage().equals(lang)) {
                for (ARCHETYPETERM at : cds.getItemsArray()) {
                    //System.out.println(at.getCode()+">"+nodeid+"<");
                    if (at.getCode().equals(nodeid)) {
                        //  System.out.println("-->" + at.getItemsArray(0).getStringValue());
                        for (StringDictionaryItem sdi : at.getItemsArray()) {
                            if (sdi.getId().equals("text")) {
                                return sdi.getStringValue();
                            }
                        }

                    }
                }
            }

        }

        return null;
    }
/**
 * Gets ontology description only
 * @param nodeid Nodeid
 * @param lang Desired language
 * @return 
 */
    public String getOntologyDescription(String nodeid, String lang) {
        for (CodeDefinitionSet cds : ad.getArchetype().getOntology().getTermDefinitionsArray()) {
            if (cds.getLanguage().equals(lang)) {
                for (ARCHETYPETERM at : cds.getItemsArray()) {
                    //System.out.println(at.getCode()+">"+nodeid+"<");
                    if (at.getCode().equals(nodeid)) {
                        //  System.out.println("-->" + at.getItemsArray(0).getStringValue());
                        for (StringDictionaryItem sdi : at.getItemsArray()) {
                            if (sdi.getId().equals("description")) {
                                return sdi.getStringValue();
                            }
                        }

                    }
                }
            }

        }
        return null;
    }
    /**
     * Gets the openehr terminology by the code 
     * @param code 
     * @return Terminology String
     */
    public String getTerminology(String code) {
        try {
            TerminologyService termServ = SimpleTerminologyService.getInstance();
            return termServ.terminology("openehr").rubricForCode(code, "en");     // SETAR TERMINOLOGIAS EM OUTRAS LINGUAS
        } catch (Exception ex) {
            Log.getLogger().error(null, ex);
        }
        return null;
    }

    /**
     * @return the ccolist
     */
    public List<CCOMPLEXOBJECT> getCcolist() {
        return ccolist;
    }

    /**
     * @param ccolist the ccolist to set
     */
    public void setCcolist(List<CCOMPLEXOBJECT> ccolist) {
        this.ccolist = ccolist;
    }

    /**
     * @return the archetype
     */
    public ARCHETYPE getArchetype() {
        return archetype;
    }

    /**
     * @param archetype the archetype to set
     */
    public void setArchetype(ARCHETYPE archetype) {
        this.archetype = archetype;
    }
}
