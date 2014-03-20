package Utils;

/**
 *
 * @author Vinicius
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesAccess {

 /**
  * Gets the property file
  * @return property
  */
    public static Properties getProp() {
        Properties props = new Properties();
        FileInputStream file;
        try {
            file = new FileInputStream("resources/Configuration.properties");
            props.load(file);
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(PropertiesAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return props;
    }
    /**
     * Gets the localization property 
     * @return property
     */
    public static Properties getLocalization() {
        Properties props = new Properties();
        FileInputStream file;
        try {
            file = new FileInputStream("resources/Localization.properties");
            props.load(file);
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(PropertiesAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return props;
    }
}
