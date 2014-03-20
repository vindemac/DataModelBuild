/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openEHR_DAO;

import Elements.ArchetypeFile;
import Utils.PropertiesAccess;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import openEHR_CONTROL.Parser;
import org.apache.xmlbeans.XmlException;
import org.openehr.schemas.v1.ArchetypeDocument;

/**
 *
 * @author vinicius
 */
public class ArchetypeAccess {

    private List<ArchetypeFile> full_archetype_list = new ArrayList<>();
    private List<String> types = new ArrayList<>();

    public ArchetypeAccess() {
        fillArchetypesList(new File(PropertiesAccess.getProp().getProperty("repository.dir")));
    }
/**
 * Build the archetype document from the parameter
 * @param file
 * @return 
 */
    public static ArchetypeFile getArchetypeFile(File file) {
        ArchetypeDocument ad1 = null;
        try {
            ad1 = ArchetypeDocument.Factory.parse(file);
        } catch (XmlException | IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArchetypeFile af = new ArchetypeFile();
        af.setId(ad1.getArchetype().getArchetypeId().getValue());
        af.setType(ad1.getArchetype().getDefinition().getRmTypeName());
        return af;
    }
/**
 * Fills an archetype list
 * @param dir 
 */
    public final void fillArchetypesList(File dir) {
        FileNameExtensionFilter fnef = new FileNameExtensionFilter(null, "xml");
        ArchetypeFile afile;
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                fillArchetypesList(f);
            } else {
                if (fnef.accept(f)) {
                    afile = ArchetypeAccess.getArchetypeFile(f);
                    if (!types.contains(afile.getType())) {
                        types.add(afile.getType());
                    }
                    getFull_archetype_list().add(ArchetypeAccess.getArchetypeFile(f));
                }
            }
        }
    }

    public List<ArchetypeFile> getFull_archetype_list() {
        return full_archetype_list;
    }

    public void setFull_archetype_list(List<ArchetypeFile> full_archetype_list) {
        this.full_archetype_list = full_archetype_list;
    }
/**
 * Gets archetypes by type ( i.e Observation )
 * @param type
 * @return 
 */
    public List<ArchetypeFile> getArchetypesByType(String type) {
        List<ArchetypeFile> listbytype = new ArrayList<>();
        for (ArchetypeFile afile : full_archetype_list) {
            if (afile.getType().equals(type)) {
                listbytype.add(afile);
            }
        }
        return listbytype;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
