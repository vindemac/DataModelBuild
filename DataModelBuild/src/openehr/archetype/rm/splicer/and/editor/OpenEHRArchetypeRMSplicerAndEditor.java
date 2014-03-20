/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openehr.archetype.rm.splicer.and.editor;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import openEHR_GUI.*;
/**
 *
 * @author vinicius
 */
public class OpenEHRArchetypeRMSplicerAndEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Main_Frame mainf = new Main_Frame();
            // mainf.setVisible(true);
            for(int i=0;i<UIManager.getInstalledLookAndFeels().length;i++){
            }
             UIManager.setLookAndFeel( "javax.swing.plaf.nimbus.NimbusLookAndFeel"); // Se der erro no loading trocar aqui
  
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(OpenEHRArchetypeRMSplicerAndEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
        MainFrame mainframe = new MainFrame();
        mainframe.setVisible(true);
        
       /* NodeRemover nr = new NodeRemover();
        List<String> lo = new ArrayList<>();
        lo.add("at0004");
        nr.removeNodeByNodeId(lo, "openEHR-EHR-OBSERVATION.blood_pressure.v1");*/
      
    }
}
