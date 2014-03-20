/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package openEHR_GUI;

import Elements.RemovableElement;
import Utils.Log;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import openEHR_CONTROL.NodeRemover;
import openEHR_CONTROL.Parser;
import org.apache.xmlbeans.XmlCursor;
import org.openehr.schemas.v1.*;

/**
 *
 * @author vinicius
 */
public class ArchetypePane extends javax.swing.JPanel {

    /**
     * Creates new form ArchetypePane
     */
    public ArchetypePane() {
        initComponents();
    }
    private List<JPanel> panels = new ArrayList<>();
    private JPanel mainpanel = new JPanel();
    private JTabbedPane tabbedpane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
    private String lang = "en";
    private String name = null;
    private Parser parser;
    private List<JCheckBox> checkboxlist;

    public ArchetypePane(File f) {
        initComponents();
        jComboBox1.removeAllItems();
        checkboxlist = new ArrayList<>();
        parser = new Parser(f);
        name = parser.getOntologyText(parser.getArchetype().getConcept(), lang);
        this.setName(name);
        for (RESOURCEDESCRIPTIONITEM rd : parser.getArchetype().getDescription().getDetailsArray()) {
            //System.out.println(rd.getLanguage().getCodeString());
            jComboBox1.addItem(rd.getLanguage().getCodeString());
            if (rd.getLanguage().getCodeString().equals(lang)) {
                if (parser.getArchetype().isSetDescription()) {
                    if (rd.isSetMisuse() && !rd.getMisuse().isEmpty()) {
                        jTextArea4.setText(rd.getMisuse());
                    }
                    if (rd.isSetUse() && !rd.getUse().isEmpty()) {
                        jTextArea1.setText(rd.getUse());
                    }
                    if (!rd.getPurpose().isEmpty()) {
                        jTextArea3.setText(rd.getPurpose());
                    }
                }
                if (!parser.getArchetype().getArchetypeId().getValue().isEmpty()) {
                    // System.out.println(">>>>>>" + parser.getArchetype().getArchetypeId().getValue());
                    jTextArea2.setText(parser.getArchetype().getArchetypeId().getValue());
                }
            }
        }
        jComboBox1.setSelectedItem(lang);
        switch (parser.getArchetype().getDefinition().getRmTypeName()) {
            case "ACTION":
                actionPane(parser);
                break;
            case "OBSERVATION":
                observationPane(parser);
                break;
            case "EVALUATION":
                observationPane(parser);
                break;
            case "INSTRUCTION":
                observationPane(parser);
                break;
            case "CLUSTER":
                observationPane(parser);
                break;
            default:
                break;
        }

        this.setVisible(true);
    }

    public void defaultPane(Parser parser) {
    }

    public void actionPane(Parser parser) {
        TitledBorder title = BorderFactory.createTitledBorder("Pathway");
        Border title2 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        CSINGLEATTRIBUTE csin = (CSINGLEATTRIBUTE) parser.getArchetype().getDefinition().getAttributesArray(0);
        JPanel panel = null;
        XmlCursor xmlc = csin.newCursor();
        JLabel codeforterminology = null;
        jPanel1.setBorder(title);
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.PAGE_AXIS));
        String currentnodeid = null;
        while (xmlc.hasNextToken()) {
            panel = new JPanel();
            panel.setBorder(title2);
            panel.setLayout(new GridLayout(0, 3));
            panel.setAutoscrolls(true);
            panel.setPreferredSize(new Dimension(1_000, 0));
            if (xmlc.getObject() instanceof CCOMPLEXOBJECT) {
                CCOMPLEXOBJECT cco = (CCOMPLEXOBJECT) xmlc.getObject();
                currentnodeid = cco.getNodeId();
            }
            if (xmlc.getObject() instanceof CCODEPHRASE) {
                CCODEPHRASE ccd = (CCODEPHRASE) xmlc.getObject();
                String termi = "";
                if (ccd.getTerminologyId().getValue().equals("openehr")) {
                    for (String s : ccd.getCodeListArray()) {
                        if (s.equals(ccd.getCodeListArray(0))) {
                            termi = parser.getTerminology(s);
                        } else {
                            termi = termi + ", " + parser.getTerminology(s);
                        }
                    }
                    codeforterminology = new JLabel(termi);
                }
                for (String s : ccd.getCodeListArray()) {
                    if (parser.getOntologyText(s, lang) != null) {
                        JCheckBox chk = new JCheckBox(Utils.StringUtils.htmlTagnizer(parser.getOntologyText(s, lang)));
                        chk.setName(currentnodeid);
                        getCheckboxlist().add(chk);
                        panel.add(chk);
                        JLabel jp = new JLabel(parser.getOntologyDescription(s, lang));
                        jp.setToolTipText(parser.getOntologyDescription(s, lang));
                        panel.add(jp);
                        if (codeforterminology != null) {
                            panel.add(codeforterminology);
                        }
                        jPanel1.add(panel);
                    }
                }
            }
            xmlc.toNextToken();
        }
    }

    public void observationPane(Parser parser) {
        jPanel1.setLayout(new BorderLayout());
        for (CCOMPLEXOBJECT c : parser.getCcolist()) {
            String stitle = null;
            JCheckBox checkbox = new JCheckBox();
            JLabel jlb = new JLabel();
            for (StringDictionaryItem sdi : parser.getOntology(c.getNodeId(), lang).getItemsArray()) {
                switch (sdi.getId()) {
                    case "description":
                        jlb.setText("<html>" + org.apache.commons.lang3.StringUtils.capitalize(sdi.getStringValue()) + "</html>");
                        break;
                    case "text":
                        stitle = org.apache.commons.lang3.StringUtils.capitalize(sdi.getStringValue());
                        checkbox.setText(stitle);

                        checkbox.setName(c.getNodeId());
                        getCheckboxlist().add(checkbox);
                        break;
                }
            }
            TitledBorder title = BorderFactory.createTitledBorder("Data");
            JPanel jpanel = new JPanel();
            JPanel jpanel_enabled = new JPanel();
            jpanel_enabled.setPreferredSize(new Dimension(1_000, 0));
            JPanel jpanel_values = new JPanel();
            JPanel jpanel_assumed = new JPanel();
            jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.PAGE_AXIS));
            jpanel_enabled.setBorder(title);
            jpanel_enabled.setLayout(new BoxLayout(jpanel_enabled, BoxLayout.PAGE_AXIS));
            jpanel_values.setLayout(new BoxLayout(jpanel_values, BoxLayout.PAGE_AXIS));
            jpanel_assumed.setLayout(new BoxLayout(jpanel_assumed, BoxLayout.PAGE_AXIS));
            checkbox.setSelected(true);
            jpanel_enabled.add(checkbox);
            jpanel_enabled.add(jlb);
            jpanel.add(jpanel_enabled);

            for (CATTRIBUTE cat : c.getAttributesArray()) {

                jpanel_values.setBorder(BorderFactory.createTitledBorder(cat.getRmAttributeName()));
                jpanel.setName(org.apache.commons.lang3.StringUtils.capitalize(parser.getOntologyText(c.getNodeId(), lang)));
                for (COBJECT cob : cat.getChildrenArray()) {
                    switch (cob.getRmTypeName()) {
                        case "DV_QUANTITY":
                            CDVQUANTITY cdv = (CDVQUANTITY) cob;
                            for (CQUANTITYITEM cq : cdv.getListArray()) {
                                if (cq.isSetMagnitude()) {
                                    checkbox = new JCheckBox("Magnitude: " + cq.getMagnitude().getLower() + " " + cq.getMagnitude().getUpper());
                                    checkbox.setName(c.getNodeId());
                                    getCheckboxlist().add(checkbox);
                                    checkbox.setSelected(true);
                                    jpanel_values.add(checkbox);
                                }
                                if (cq.isSetPrecision()) {
                                    checkbox = new JCheckBox("Precision: " + cq.getPrecision().getLower() + " " + cq.getPrecision().getUpper());
                                    checkbox.setSelected(true);
                                    checkbox.setName(c.getNodeId());
                                    getCheckboxlist().add(checkbox);
                                    jpanel_values.add(checkbox);
                                }
                                checkbox = new JCheckBox("Unit: " + cq.getUnits());
                                checkbox.setName(c.getNodeId());
                                getCheckboxlist().add(checkbox);
                                checkbox.setSelected(true);
                                jpanel_values.add(checkbox);
                            }
                            jpanel_assumed.setBorder(BorderFactory.createTitledBorder("Assumed Values"));

                            JCheckBox chk1 = new JCheckBox("Accuracy");

                            JCheckBox chk2 = new JCheckBox("MagnitudeStatus");
                            JCheckBox chk3 = new JCheckBox("NormalRange");
                            JCheckBox chk4 = new JCheckBox("NormalStatus");
                            JCheckBox chk5 = new JCheckBox("Precision");
                            JCheckBox chk6 = new JCheckBox("AccuracyIsPercent");
                            JCheckBox chk7 = new JCheckBox("OtherReferenceRanges");

                            chk1.setName(c.getNodeId());
                            chk2.setName(c.getNodeId());
                            chk3.setName(c.getNodeId());
                            chk4.setName(c.getNodeId());
                            chk5.setName(c.getNodeId());
                            chk6.setName(c.getNodeId());
                            chk7.setName(c.getNodeId());

                            jpanel_assumed.add(chk1);
                            getCheckboxlist().add(chk1);
                            jpanel_assumed.add(chk2);
                            getCheckboxlist().add(chk2);
                            jpanel_assumed.add(chk3);
                            getCheckboxlist().add(chk3);
                            jpanel_assumed.add(chk4);
                            getCheckboxlist().add(chk4);
                            jpanel_assumed.add(chk5);
                            getCheckboxlist().add(chk5);
                            jpanel_assumed.add(chk6);
                            getCheckboxlist().add(chk6);
                            jpanel_assumed.add(chk7);
                            getCheckboxlist().add(chk7);

                            jpanel.add(jpanel_assumed);
                            jpanel.add(jpanel_values);
                            break;
                        case "DV_CODED_TEXT":
                            XmlCursor xmlc = cob.newCursor();
                            while (xmlc.hasNextToken()) {
                                if (xmlc.getObject() instanceof CCODEPHRASE) {
                                    //    System.out.println(xmlc.getObject().xmlText());
                                    CCODEPHRASE ccd = (CCODEPHRASE) xmlc.getObject();
                                    for (String s : ccd.getCodeListArray()) {
                                        if (parser.getOntologyText(s, lang) != null) {
                                            //   jpanel_enabled.add(new JCheckBox(org.apache.commons.lang3.StringUtils.capitalize(parser.getOntologyText(s, lang)) + "Description: " + org.apache.commons.lang3.StringUtils.capitalize(parser.getOntologyDescription(s, lang))));
                                            jpanel_enabled.add(new JLabel(org.apache.commons.lang3.StringUtils.capitalize(parser.getOntologyText(s, lang)) + "\t\t\r\r\tDescription: " + org.apache.commons.lang3.StringUtils.capitalize(parser.getOntologyDescription(s, lang))));
                                        }
                                    }
                                    break;
                                }
                                xmlc.toNextToken();
                            }
                            break;
                    }
                }
            }
            getPanels().add(jpanel);
        }
        for (JPanel p : getPanels()) {
            tabbedpane.add(p.getName(), p);
        }
        //tabbedpane.setVisible(true);
        //  System.out.println(jPanel1.getName());
        jPanel1.add(tabbedpane);
        jPanel1.updateUI();
    }

    public void evaluationPane(Parser parser) {
        jPanel1.setLayout(new BorderLayout());
        for (CCOMPLEXOBJECT c : parser.getCcolist()) {
            String stitle = null;
            c.getNodeId();
            JCheckBox checkbox = new JCheckBox();
            JLabel jlb = new JLabel();
            for (StringDictionaryItem sdi : parser.getOntology(c.getNodeId(), lang).getItemsArray()) {
                switch (sdi.getId()) {
                    case "description":
                        jlb.setText(sdi.getStringValue());
                        break;
                    case "text":
                        stitle = org.apache.commons.lang3.StringUtils.capitalize(sdi.getStringValue());
                        checkbox.setText(stitle);
                        checkbox.setName(c.getNodeId());
                        break;
                }
            }
            TitledBorder title = BorderFactory.createTitledBorder(stitle);
            JPanel jpanel = new JPanel();
            JPanel jpanel_values = new JPanel();
            JPanel jpanel_assumed = new JPanel();
            jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.PAGE_AXIS));
            jpanel.setBorder(title);
            checkbox.setSelected(true);
            jpanel.add(checkbox);
            jpanel.add(jlb);
            jlb.setAlignmentX(CENTER_ALIGNMENT);
            checkbox.setAlignmentX(CENTER_ALIGNMENT);
            for (CATTRIBUTE cat : c.getAttributesArray()) {
                jpanel_values.setBorder(BorderFactory.createTitledBorder(cat.getRmAttributeName()));
                jpanel.setName(c.getNodeId());
                for (COBJECT cob : cat.getChildrenArray()) {
                    if (cob.getRmTypeName().equals("DV_QUANTITY")) {
                        CDVQUANTITY cdv = (CDVQUANTITY) cob;
                        for (CQUANTITYITEM cq : cdv.getListArray()) {
                            if (cq.isSetMagnitude()) {
                                checkbox = new JCheckBox("Magnitude: " + cq.getMagnitude().getLower() + " " + cq.getMagnitude().getUpper());
                                checkbox.setSelected(true);
                                jpanel_values.add(checkbox);
                            }
                            if (cq.isSetPrecision()) {
                                checkbox = new JCheckBox("Precision: " + cq.getPrecision().getLower() + " " + cq.getPrecision().getUpper());
                                checkbox.setSelected(true);
                                jpanel_values.add(checkbox);
                            }
                            checkbox = new JCheckBox("Unit: " + cq.getUnits());
                            checkbox.setSelected(true);
                            jpanel_values.add(checkbox);
                        }
                        jpanel.add(jpanel_values);
                        jpanel_assumed.setBorder(BorderFactory.createTitledBorder("Assumed Values"));
                        jpanel_assumed.add(new JCheckBox("Accuracy"));
                        jpanel_assumed.add(new JCheckBox("MagnitudeStatus"));
                        jpanel_assumed.add(new JCheckBox("NormalRange"));
                        jpanel_assumed.add(new JCheckBox("NormalStatus"));
                        jpanel_assumed.add(new JCheckBox("Precision"));
                        jpanel_assumed.add(new JCheckBox("AccuracyIsPercent"));
                        jpanel_assumed.add(new JCheckBox("OtherReferenceRanges"));
                        jpanel.add(jpanel_assumed);
                    }
                }

            }
            getPanels().add(jpanel);
        }
        for (JPanel p : getPanels()) {
            tabbedpane.add(p.getName(), p);
        }
        tabbedpane.setVisible(true);
        jPanel1.add(tabbedpane);
        jPanel1.updateUI();
    }

    /**
     * @return the panels
     */
    public List<JPanel> getPanels() {
        return panels;
    }

    /**
     * @param panels the panels to set
     */
    public void setPanels(List<JPanel> panels) {
        this.panels = panels;
    }

    /**
     * @return the mainpanel
     */
    public JPanel getMainpanel() {
        return mainpanel;
    }

    /**
     * @param mainpanel the mainpanel to set
     */
    public void setMainpanel(JPanel mainpanel) {
        this.mainpanel = mainpanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setAutoscrolls(true);

        jLabel2.setText("Archetype ID");

        jLabel3.setText("Purpose");

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(1);
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTextArea3);

        jLabel1.setText("Use");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Misuse");

        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setAutoscrolls(false);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(1);
        jScrollPane2.setViewportView(jTextArea2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Language");

        jScrollPane5.setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(575, 400));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 571, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 441, Short.MAX_VALUE)
        );

        jScrollPane5.setViewportView(jPanel1);

        jButton1.setText("Customize Archetype");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jLabel1)
                    .add(jLabel4)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 196, Short.MAX_VALUE)
                        .add(jButton1)
                        .add(591, 591, 591))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane3)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane2)
                            .add(jScrollPane4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(24, 24, 24)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 162, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 7, Short.MAX_VALUE))
                    .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(jButton1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void proccessArquetype() {
        List<RemovableElement> re = new ArrayList<>();
        NodeRemover nr = new NodeRemover();
        for (JCheckBox cb : getCheckboxlist()) {
            if (!cb.isSelected()) {
                if (cb.getText().equals(org.apache.commons.lang3.StringUtils.capitalize(
                        getParser().getOntologyText(cb.getName(), lang)))) {
                    re.add(new RemovableElement(cb.getName(), cb.getText(), getParser().getArchetype().getArchetypeId().getValue(), true));
                } else {
                    re.add(new RemovableElement(cb.getName(), cb.getText(), getParser().getArchetype().getArchetypeId().getValue(), false));
                }
            }
        }
        nr.removeNodeByNodeId(re, getParser().getArchetype().getArchetypeId().getValue());
        System.out.println(name + " Has Been Processed - The useless data were removed. ");

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<RemovableElement> re = new ArrayList<>();
        NodeRemover nr = new NodeRemover();
        for (JCheckBox cb : getCheckboxlist()) {
            if (!cb.isSelected()) {
                if (cb.getText().equals(org.apache.commons.lang3.StringUtils.capitalize(
                        getParser().getOntologyText(cb.getName(), lang)))) {
                    re.add(new RemovableElement(cb.getName(), cb.getText(), getParser().getArchetype().getArchetypeId().getValue(), true));
                } else {
                    re.add(new RemovableElement(cb.getName(), cb.getText(), getParser().getArchetype().getArchetypeId().getValue(), false));
                }
            }
        }
        nr.removeNodeByNodeId(re, getParser().getArchetype().getArchetypeId().getValue());
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the parser
     */
    public Parser getParser() {
        return parser;
    }

    /**
     * @param parser the parser to set
     */
    public void setParser(Parser parser) {
        this.parser = parser;
    }

    /**
     * @return the checkboxlist
     */
    public List<JCheckBox> getCheckboxlist() {
        return checkboxlist;
    }

    /**
     * @param checkboxlist the checkboxlist to set
     */
    public void setCheckboxlist(List<JCheckBox> checkboxlist) {
        this.checkboxlist = checkboxlist;
    }
}
