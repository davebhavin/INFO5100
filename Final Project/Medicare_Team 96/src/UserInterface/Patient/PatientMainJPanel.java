/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Department;
import Business.Enterprise.Department.departmenttype;
import Business.Network.Network;
import Business.Role.PatientRole;
import Business.UserAccount.PatientAccount;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import userInterface.MainJFrame;

/**
 *
 * @author DAVE
 */
public class PatientMainJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private PatientAccount Account;
    private JPanel LeftPanel;
    private JFrame frame;

    /**
     * Creates new form PatientMainJPanel
     *
     * @param system
     * @param container
     * @param userAccount
     */
    public PatientMainJPanel(EcoSystem system, JPanel LeftPanel, UserAccount userAccount) {
        initComponents();
        this.system = system;
        this.LeftPanel = LeftPanel;
        this.Account = (PatientAccount) userAccount;
        
        
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) cityList1.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Network net : this.system.getNetworkList()) {
            model.addElement(net.getId());
        }
        cityList1.setModel(model);
        nameLabel.setText(Account.getPatient().getFirstName());
        goButton2.setEnabled(false);
        //this.setSize(750,651);
        
      
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cityList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        goButton2 = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        typeList = new javax.swing.JList<>();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Welcome, ");

        nameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        nameLabel.setText("<Name>");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Please select your location: ");

        cityList1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cityList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                cityList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(cityList1);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel5.setText("City");

        goButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        goButton2.setText("GO!!");
        goButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButton2ActionPerformed(evt);
            }
        });

        profileButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        profileButton.setText("My Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        typeList.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        typeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                typeListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(typeList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(554, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(466, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(goButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(profileButton)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameLabel)
                    .addComponent(profileButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(goButton2)
                        .addGap(250, 250, 250))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_cityList1ValueChanged
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) typeList.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultListModel<departmenttype> model = new DefaultListModel<>();
        for (departmenttype type : departmenttype.values()) {
            model.addElement(type);
        }
        typeList.setModel(model);
        goButton2.setEnabled(false);
    }//GEN-LAST:event_cityList1ValueChanged

    private void goButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton2ActionPerformed
        if (cityList1.getSelectedValue() != null) {
            Network net = system.getNetworkByCity((String) cityList1.getSelectedValue());
            String city = (String) cityList1.getSelectedValue();
            departmenttype dept = (departmenttype) typeList.getSelectedValue();

            ShoppingListJpanel panel = new ShoppingListJpanel(system, net, this.LeftPanel, this.Account, dept, this.frame);
            LeftPanel.add(panel);
            CardLayout layout = (CardLayout) this.LeftPanel.getLayout();
            layout.next(LeftPanel);
        }
    }//GEN-LAST:event_goButton2ActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        PatientProfileJPanel panel = new PatientProfileJPanel(this.system, this.LeftPanel, this.Account, new PatientRole());
        this.LeftPanel.add(panel);
        CardLayout layout = (CardLayout) this.LeftPanel.getLayout();
        layout.next(this.LeftPanel);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void typeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_typeListValueChanged
        goButton2.setEnabled(true);
    }//GEN-LAST:event_typeListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> cityList1;
    private javax.swing.JButton goButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton profileButton;
    private javax.swing.JList<departmenttype> typeList;
    // End of variables declaration//GEN-END:variables
}
