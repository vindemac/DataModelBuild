/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openEHR_CONTROL;

import Elements.RemovableElement;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openehr.schemas.v1.ArchetypeDocument;
import org.openehr.schemas.v1.CCOMPLEXOBJECT;

/**
 *
 * @author Vinicius
 */
public class NodeRemover {

    XmlOptions xmlopt = new XmlOptions();
    private ArchetypeDocument ad;

    public NodeRemover() {
        xmlopt.setSavePrettyPrint().setSavePrettyPrintIndent(4);
        xmlopt.setSaveNamespacesFirst();
    }
/**
 * Removes elements from archetypes
 * @param elements List of elements that will be removed
 * @param archetype_id Archetype that will have the elements removed
 */
    public void removeNodeByNodeId(List<RemovableElement> elements, String archetype_id) {
        // System.out.println(">>"+archetype_id);
        File file = new File("output/" + archetype_id + ".xml");
        try {
            ad = ArchetypeDocument.Factory.parse(file, xmlopt);

        } catch (IOException | XmlException ex) {
            Logger.getLogger(NodeRemover.class.getName()).log(Level.SEVERE, null, ex);
        }
        XmlCursor xmlc;
        XmlCursor xmlc2;
        CCOMPLEXOBJECT cco;


        for (RemovableElement re : elements) {
            //   System.out.println(xmlc.getObject().getDomNode().getNodeName());
            xmlc = ad.getArchetype().newCursor();
            while (xmlc.hasNextToken()) {
                if (xmlc.getObject() instanceof CCOMPLEXOBJECT) {
                    cco = (CCOMPLEXOBJECT) xmlc.getObject();
                    if (cco.getNodeId() != null) {
                        if (cco.getNodeId().equals(re.getNode_id())) {
                            if (re.isRoot()) {
                                xmlc.removeXml();
                                break;
                            } else {
                                xmlc2 = cco.newCursor();
                                while (xmlc2.hasNextToken()) {
                                    if (xmlc2.getName() != null) {
                                        if (org.apache.commons.lang3.StringUtils.capitalize(xmlc2.getName().getLocalPart()).equals(re.getName())) {
                                            xmlc2.removeXml();
                                            break;
                                           
                                        }
                                    }
                                    xmlc2.toNextToken();
                                }
                                xmlc2 = null;
                                break;
                            }
                        }
                    }
                }
                xmlc.toNextToken();
            }
        }
        saveArchetype();
    }

    /**
     * Saves the edited archetype
     */
    public void saveArchetype() {
        try {
            //  System.out.println(ad.xmlText(xmlopt));
            ad.save(new File(ad.getArchetype().getArchetypeId().getValue() + ".xml"), xmlopt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeAssumedValue(String node_id, String name, String archetype_id) {
    }
}