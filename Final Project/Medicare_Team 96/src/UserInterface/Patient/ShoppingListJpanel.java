/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Department;
import Business.Enterprise.Department.departmenttype;
import Business.Enterprise.Doctor.Doctor;
import Business.Enterprise.Lab.Lab;
import Business.Enterprise.Pharmacy.Pharmacy;
import Business.Network.Network;
import Business.Role.PatientRole;
import static Business.Role.Role.RoleType.Doctor;
import Business.UserAccount.PatientAccount;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import userInterface.MainJFrame;

/**
 *
 * @author DAVE
 */
public class ShoppingListJpanel extends javax.swing.JPanel {

    
    private EcoSystem system;
    private JPanel container;
    private PatientAccount account;
    private Network net;
    private departmenttype dept;
    private JFrame frame;
    /**
     * Creates new form ShoppingListJpanel
     */
    public ShoppingListJpanel(EcoSystem system, Network net, JPanel container, PatientAccount account, departmenttype dept, JFrame frame) {
        initComponents();
        this.system = system;
        this.container = container;
        this.account = account;
        this.net = net;
        this.dept = dept;
        this.frame = frame;
        
        
        populateTable();
        nameLabel.setText(account.getPatient().getFirstName());
        typeLabel.setText(dept.getValue());
        areaLabel.setText(net.getCity());
    }
    
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) ShopTable.getModel();
        dtm.setRowCount(0);
        if (dept.equals(departmenttype.Pharmacy)) {
            for (Pharmacy res : net.getPharmacyList()) {
                Object row[] = new Object[2];
                row[0] = res;
                row[1] = res.getCategory();
                dtm.addRow(row);
            }
        }
        if (dept.equals(departmenttype.Lab)) {
            for (Lab Lab : net.getLabList()) {
                Object row[] = new Object[2];
                row[0] = Lab;
                row[1] = Lab.getCategory();
                dtm.addRow(row);
            }
        }
      
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
        detailPanel = new javax.swing.JPanel();
        areaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShopTable = new javax.swing.JTable();
        cartButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        JPanel = new javax.swing.JPanel();
        PharmacyNameLabel = new javax.swing.JLabel();
        detailPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Welcome, ");

        detailPanel.setLayout(new java.awt.CardLayout());

        setBackground(new java.awt.Color(0, 51, 102));

        areaLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        areaLabel.setForeground(new java.awt.Color(255, 255, 255));
        areaLabel.setText("<Area>");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 404));

        ShopTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ShopTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ShopTable.setPreferredSize(new java.awt.Dimension(200, 100));
        ShopTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShopTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ShopTable);

        cartButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cartButton.setText("Shopping Cart");
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        profileButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        profileButton.setText("My Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        JPanel.setPreferredSize(new java.awt.Dimension(655, 498));

        PharmacyNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        PharmacyNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        detailPanel2.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(detailPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PharmacyNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PharmacyNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(255, 255, 255));
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        typeLabel.setText("<Type>");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome, ");

        nameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("<Name>");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("in ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaLabel)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel)
                        .addGap(109, 109, 109)
                        .addComponent(profileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartButton)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartButton)
                    .addComponent(profileButton)
                    .addComponent(backButton)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ShopTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopTableMouseClicked
        int index = ShopTable.getSelectedRow();
        TableModel model = ShopTable.getModel();

        if (index >= 0) {
            if (dept.equals(departmenttype.Doctor)) {
                Doctor store = (Doctor) model.getValueAt(index, 0);
                PharmacyNameLabel.setText(store.getName());
                ShoppingDetailsJpanel panel = new ShoppingDetailsJpanel(this.system, store, this.account, net, dept);
                detailPanel2.remove(this);
                detailPanel2.add(panel);
            }
            if (dept.equals(departmenttype.Lab)) {
                Lab l = (Lab) model.getValueAt(index, 0);
                PharmacyNameLabel.setText(l.getName());
                ShoppingDetailsJpanel panel = new ShoppingDetailsJpanel(this.system, l, this.account, net, dept);
                detailPanel2.remove(this);
                detailPanel2.add(panel);
            }
            if (dept.equals(departmenttype.Pharmacy)) {
                Pharmacy l = (Pharmacy) model.getValueAt(index, 0);
                PharmacyNameLabel.setText(l.getName());
                ShoppingDetailsJpanel panel = new ShoppingDetailsJpanel(this.system, l, this.account, net, dept);
                detailPanel2.remove(this);
                detailPanel2.add(panel);
            }

            CardLayout layout = (CardLayout) this.detailPanel2.getLayout();
            layout.next(detailPanel2);
        }
    }//GEN-LAST:event_ShopTableMouseClicked

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        CartJFrame frame = new CartJFrame(this.system, this.account, net);
        frame.setSize(500, 620);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_cartButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        PatientProfileJPanel panel = new PatientProfileJPanel(this.system, this.container, this.account, new PatientRole());
        this.container.add(panel);
        CardLayout layout = (CardLayout) this.container.getLayout();
        layout.next(this.container);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout) this.container.getLayout();
        PatientMainJPanel cp = new PatientMainJPanel(system, container, this.account);
        this.container.add(cp);
        layout.next(this.container);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JLabel PharmacyNameLabel;
    private javax.swing.JTable ShopTable;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cartButton;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JPanel detailPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
