/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Vinicius
 */
public class TeleconsultationActors extends BaseObject{

    private String name;
    private String role;
    private List<TeleconsultationProperty> teleproper= new ArrayList<>();
    
    public TeleconsultationActors(String name, String role) {
        super(name);
        this.role = role;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the property containing type, name and screen
     * 
     */
    public List<TeleconsultationProperty> getTeleproper() {
        return teleproper;
    }

    public void setTeleproper(List<TeleconsultationProperty> teleproper) {
        this.teleproper = teleproper;
    }
    public void addProper(String name, String type, String screen){
    this.teleproper.add(new TeleconsultationProperty(name, type, screen));
    }
}
