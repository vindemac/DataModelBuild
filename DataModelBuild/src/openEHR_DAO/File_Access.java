/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openEHR_DAO;

import Utils.PropertiesAccess;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import openEHR_CONTROL.DataModelCompleter;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;

/**
 *
 * @author vinicius
 */
public class File_Access {

    private List<String> archetypes = new ArrayList<>();
    private List<File> list = new ArrayList<>();
    private DataModelCompleter dmc = new DataModelCompleter();

    /**
     * Lists the repository files
     *
     * @return Files list
     */
    public List<File> fileLister() { //lista de arquivos na pasta arquetypes
        File f = new File(PropertiesAccess.getProp().getProperty("repository.dir"));
        repoNavigator(f);
        completedNavigator();
        return list;
    }

    /**
     * Lists the repository files and sets the archetypes types
     *
     * @param archetypes
     * @return
     */
    public List<File> fileLister(List<String> archetypes) { //lista de arquivos na pasta arquetypes
        this.setArchetypes(archetypes);
        File f = new File(PropertiesAccess.getProp().getProperty("repository.dir"));
        repoNavigator(f);
        completedNavigator();
        return list;
    }

    /**
     * Finds the file and send it to the data model completer
     *
     * @param dir
     */
    public void repoNavigator(File dir) {
        FileNameExtensionFilter fnef = new FileNameExtensionFilter(null, "xml");
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                repoNavigator(f);
            } else {
                if (fnef.accept(f)) {
                    for (String s : getArchetypes()) {
                        //  System.out.println(s + ".xml " + f.getName());
                        if (f.getName().equals(s + ".xml")) {
                            dmc.parse(f);
                        }
                    }
                }
            }
        }
    }

    /**
     * Lists completed files
     */
    public void completedNavigator() {
        FileNameExtensionFilter fnef = new FileNameExtensionFilter(null, "xml");
        File dir = new File("output");
        for (File f : dir.listFiles()) {
            if (fnef.accept(f)) {
                for (String s : getArchetypes()) {
                    //System.out.println(s + ".xml " + f.getName());
                    if (f.getName().equals(s + ".xml")) {
                        list.add(f);
                    }
                }
            }
        }
        listprint();
    }

    /**
     * Prints the file list
     */
    public void listprint() {
        for (File f : list) {
        }
    }


    public List<String> getArchetypes() {
        return archetypes;
    }

    public void setArchetypes(List<String> archetypes) {
        this.archetypes = archetypes;
    }
}
