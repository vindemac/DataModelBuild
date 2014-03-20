package Elements;


/**
 * Element that will be removed
 * @author vinicius
 */
public class RemovableElement extends BaseObject{

    private String node_id;
    private String archetype_id;
    private boolean isroot;
    
    public RemovableElement(String node_id, String name, String archetype_id, boolean isroot) {
        super(name);
        this.node_id = node_id;
        this.archetype_id = archetype_id;
        this.isroot = isroot;
    }

    /**
     * @return the node_id
     */
    public String getNode_id() {
        return node_id;
    }

    /**
     * @param node_id the node_id to set
     */
    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }
   /**
     * @return the archetype_id
     */
    public String getArchetype_id() {
        return archetype_id;
    }

    /**
     * @param archetype_id the archetype_id to set
     */
    public void setArchetype_id(String archetype_id) {
        this.archetype_id = archetype_id;
    }
    public boolean isRootElement(){
        return isRoot();
    }
    public void printElement(){
    System.out.println(getArchetype_id()+ " "+ getNode_id()+ " " +getName()+ " "+ isRoot());
    }

    /**
     * @return the isroot
     */
    public boolean isRoot() {
        return isroot;
    }

    /**
     * @param isroot the isroot to set
     */
    public void setIsroot(boolean isroot) {
        this.isroot = isroot;
    }
}

