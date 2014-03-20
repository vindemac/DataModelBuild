/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import org.apache.xmlbeans.XmlOptions;

/**
 *
 * @author Vinicius e Jaqueline
 */
public class XmlBeansOptions {

    public static XmlOptions getOptions() {
        XmlOptions xmlopt = new XmlOptions();
        xmlopt.setSavePrettyPrint().setSavePrettyPrintIndent(4);
        xmlopt.setSaveNamespacesFirst();
        return xmlopt;
    }
}
