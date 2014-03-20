/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius e Jaqueline
 */
public class TeleconsultationProperty extends BaseObject{

    private String type;
    private String screen;
    private List<String> ehr_references = new ArrayList<>();

    public TeleconsultationProperty(String name, String type, String screen) {
        super(name);
        this.screen = screen;
        this.type = type;

    }

    public void addEhr_References(String arch) {
        ehr_references.add(arch);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public List<String> getEhr_references() {
        return ehr_references;
    }

    public void setEhr_references(List<String> ehr_references) {
        this.ehr_references = ehr_references;
    }
}
