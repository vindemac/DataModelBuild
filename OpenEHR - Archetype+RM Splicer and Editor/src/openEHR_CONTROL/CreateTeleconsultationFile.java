/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openEHR_CONTROL;

import Elements.ArchetypeFile;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import noNamespace.TeleconsultationMMDocument;
import openEHR_DAO.TeleconsultationFileAccess;

/**
 * Creates the teleconsultation.xml which is used in the next SPLiCE module
 * @author Vinicius e Jaqueline
 */
public class CreateTeleconsultationFile {
    /**
     *
     * @param models
     */
    public static void createFile(List<DefaultListModel> models) {
        TeleconsultationFileAccess tfa = new TeleconsultationFileAccess();
        TeleconsultationMMDocument teledoc = tfa.getTmmd();
        ArchetypeFile af;
        for (int i = 0; i < models.size(); i++) {
            if (i == 0) {
                for (TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property p : teledoc.getTeleconsultationMM().getParamedic().getPropertyArray()) {
                    for (int j = 0; j < models.get(i).getSize(); j++) {
                        af = (ArchetypeFile) models.get(i).get(j);          
                        if (p.getType().equals(af.getType())) {
                            p.addNewEhrReferences().setId(af.getId()); // DEFINIR QUAL ARRAY POR TIPO OBSERVATION
                        }
                    }
                }
            } else {
                 for (TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property p : teledoc.getTeleconsultationMM().getSpecialistArray(i-1).getPropertyArray()) {
                    for (int j = 0; j < models.get(i).getSize(); j++) {
                        af = (ArchetypeFile) models.get(i).get(j);                
                        if (p.getType().equals(af.getType())) {
                            p.addNewEhrReferences().setId(af.getId()); // DEFINIR QUAL ARRAY POR TIPO OBSERVATION
                        }
                    }
                }
            }
        }
        try {
            teledoc.save(new File("output/"+"teleconsultation.xml"));
        } catch (IOException ex) {
            Logger.getLogger(CreateTeleconsultationFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
