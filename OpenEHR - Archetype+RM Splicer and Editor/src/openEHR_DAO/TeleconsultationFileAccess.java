/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openEHR_DAO;

import Elements.TeleconsultationActors;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import noNamespace.TeleconsultationMMDocument;
import org.apache.xmlbeans.XmlException;

/**
 *
 * @author Vinicius e Jaqueline
 */
public class TeleconsultationFileAccess {

    private List<TeleconsultationActors> tactors;
    private TeleconsultationMMDocument tmmd;

    public TeleconsultationFileAccess() {
        actorsProcess();
    }

    public static void main(String args[]) {
        TeleconsultationFileAccess fa = new TeleconsultationFileAccess();
        fa.actorsProcess();
        // fa.fillArchetypesList(new File(PropertiesAccess.getProp().getProperty("repository.dir")));
    }

    /**
     * Parses the teleconsultation file and build an actors list
     */
    public void actorsProcess() {
        tactors = new ArrayList<>();
        TeleconsultationActors actor = null;
        File file = new File("resources/teleconsultation.xml");
        try {
            setTmmd(TeleconsultationMMDocument.Factory.parse(file));
            if (getTmmd().getTeleconsultationMM().getParamedic() != null) {

                actor = new TeleconsultationActors(getTmmd().getTeleconsultationMM().getParamedic().getName(), "paramedic");
                for (TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property p : getTmmd().getTeleconsultationMM().getParamedic().getPropertyArray()) {
                    actor.addProper(p.getName(), p.getType(), p.getScreen());
                }
                getTactors().add(actor);
            }

            for (TeleconsultationMMDocument.TeleconsultationMM.Specialist s : getTmmd().getTeleconsultationMM().getSpecialistArray()) {
                actor = new TeleconsultationActors(s.getName(), "specialist");
                for (TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property p : s.getPropertyArray()) {
                    actor.addProper(p.getName(), p.getType(), p.getScreen());
                }
                getTactors().add(actor);
            }
        } catch (XmlException | IOException ex) {
            Logger.getLogger(File_Access.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<TeleconsultationActors> getTactors() {
        return tactors;
    }

    public void setTactors(List<TeleconsultationActors> tactors) {
        this.tactors = tactors;
    }

    public TeleconsultationMMDocument getTmmd() {
        return tmmd;
    }

    public void setTmmd(TeleconsultationMMDocument tmmd) {
        this.tmmd = tmmd;
    }
}
