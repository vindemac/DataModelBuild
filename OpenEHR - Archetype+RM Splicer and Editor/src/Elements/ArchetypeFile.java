/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

/**
 *  
 * @author vinicius
 */
public class ArchetypeFile {

    private String type;
    private String id;

    /**
     * @return the name
     */
    public String getType() {
        return type;
    }

    /**
     * @param name the name to set
     */
    public void setType(String name) {
        this.type = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
/**
 * @return the archetype name
 *
 *
 */
    @Override
    public String toString() {
        String str[] = org.apache.commons.lang3.StringUtils.split(id, ".");
        for (int i = 0; i < str.length; i++) {
            if(str[i].contains(getType())){
                return org.apache.commons.lang3.StringUtils.replaceChars(org.apache.commons.lang3.StringUtils.capitalize(str[i+1]), "_", " ");
                
            }
        }
        return getId();
    }
}
