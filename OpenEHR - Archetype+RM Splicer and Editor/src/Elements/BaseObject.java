/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

/**
 *
 * @author Vinicius e Jaqueline
 */
public class BaseObject {
    private String name;

    public BaseObject(String name){
    this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
