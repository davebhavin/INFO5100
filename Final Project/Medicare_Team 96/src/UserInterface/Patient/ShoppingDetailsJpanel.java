/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.DB4O.DB4O;
import Business.EcoSystem;
import Business.Enterprise.Department;
import Business.Enterprise.Department.departmenttype;
import Business.Enterprise.Doctor.Doctor;
import Business.Enterprise.Lab.Lab;
import Business.Enterprise.Pharmacy.Medicines;
import Business.Enterprise.Pharmacy.Pharmacy;
import Business.Enterprise.Product;
import Business.Network.Network;
import Business.Patient.MedicineOrder;
import Business.Patient.ProductOrder;
import Business.UserAccount.PatientAccount;
import Business.Work.OrderRequest;
import Business.Work.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



 
/**
 *
 * @author DAVE
 */
public class ShoppingDetailsJpanel extends javax.swing.JPanel {

     private EcoSystem system;
    private Department Dept;
    private PatientAccount account;
    private Network net;
    private departmenttype departmenttype;
    /**
     * Creates new form ShoppingDetailsJpanel
     */
    public ShoppingDetailsJpanel(EcoSystem system, Department Dept, PatientAccount account, Network net, departmenttype departmenttype) {
        initComponents();
        this.system = system;
        this.Dept = Dept;
        this.account = account;
        this.net = net;
        this.departmenttype = departmenttype;

        if (!departmenttype.equals(departmenttype.Doctor)) {
            this.jTabbedPane1.setTitleAt(1, "Product");
        }

        populateTable();

     if (Dept.getRate() == -1) {
          rateLabel.setText("N/A");
        } else {
        rateLabel.setText(Dept.getType() + "");
     }
        addressTextArea.setText(Dept.getAddress());
        addressTextArea.setEnabled(false);
        descriptionTextArea.setText(Dept.getDescription());
        descriptionTextArea.setEnabled(false);
        phoneLabel.setText(Dept.getPhone());

        // Review tab
        populateReviewTable();
    }

    public void populateReviewTable() {
        DefaultTableModel dtm = (DefaultTableModel) reviewTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : Dept.getWorkQ().getWorkRequestList()) {
            OrderRequest or = (OrderRequest) wr;
            if (or.isReviewed()) {
                Object row[] = new Object[4];
                row[0] = or.getReview();
                row[1] = or.getAccount().getUserName();
                row[2] = or.getReview().getRate();
                row[3] = or.getReview().getMessage();
                dtm.addRow(row);
            }

        }
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) menuTable.getModel();
        dtm.setRowCount(0);
        if (departmenttype.equals(departmenttype.Doctor)) {
            Doctor res = (Doctor) Dept;
            if (res.getType() != null) {
                categoryLabel.setText(res.getType().name());
            }
            
//            for (Dash dash : res.getMenu()) {
//                Object row[] = new Object[2];
//                row[0] = dash;
//                row[1] = dash.getPrice();
//                dtm.addRow(row);
//            }
        }
        if (departmenttype.equals(departmenttype.Pharmacy)) {
            Pharmacy medicines = (Pharmacy) Dept;
            if (medicines.getType() != null) {
                categoryLabel.setText(medicines.getType().name());
            }
           for (Medicines p : medicines.getGoods()) {
                Object row[] = new Object[2];
                row[0] = p;
                row[1] = p.getPrice();
                dtm.addRow(row);
//            }
        }
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rateLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        commentTextArea = new javax.swing.JTextArea();

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Phone:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Category: ");

        categoryLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        categoryLabel.setText("N/A");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Description: ");

        addressTextArea.setBackground(new java.awt.Color(238, 238, 238));
        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        addressTextArea.setLineWrap(true);
        addressTextArea.setBorder(null);
        addressTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(addressTextArea);

        descriptionTextArea.setBackground(new java.awt.Color(238, 238, 238));
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        descriptionTextArea.setForeground(new java.awt.Color(238, 238, 238));
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setBorder(null);
        descriptionTextArea.setCaretColor(new java.awt.Color(238, 238, 238));
        descriptionTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(descriptionTextArea);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Address: ");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Rate:");

        rateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        rateLabel.setText("<Rate>");

        phoneLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        phoneLabel.setText("<Phone>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(phoneLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryLabel)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Details", jPanel1);

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);

        addButton.setText("Add to Cart");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Catalog", jPanel2);

        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Patient", "Rate", "Comment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reviewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reviewTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(reviewTable);

        commentTextArea.setColumns(20);
        commentTextArea.setRows(5);
        jScrollPane5.setViewportView(commentTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reviews", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       int selectedRow = menuTable.getSelectedRow();

        if (selectedRow >= 0) {
            Product item = (Product) menuTable.getValueAt(selectedRow, 0);
            int quantity = (int) quantitySpinner.getValue();

            ProductOrder line = null;
            if (this.departmenttype.equals(departmenttype.Pharmacy)) {
                line = new MedicineOrder(Dept, item, quantity);
            }
           // if (this.departmenttype.equals(departmenttype.Lab)) {
                //line = new ProductOrder(this.Dept, item, quantity);
            //}
            if (!this.account.getCart().isCartEmpty()) {
                for (ProductOrder or : this.account.getCart().getProductList()) {
                    if (!or.getdepartmentModel().equals(this.Dept)) {
                        int choice = JOptionPane.showConfirmDialog(null, "You alreay have dashes from other restaurant in shopping cart. \n"
                                + "Adding this dash will remove all previous dashes in shopping cart.\n" + "Do you want to continue?",
                                "Restaurant Conflicts", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            this.account.getCart().clearCart();
                            break;
                        } else {
                            return;
                        }
                    }
                    if (or.getdepartmentModel().equals(this.Dept) && or.getProduct().equals(item)) {
                        line.setQuantity(or.getQuantity() + quantity);
                        this.account.getCart().getProductList().remove(or);
                        break;
                    }
                }
            }
            this.account.getCart().addToCart(line);

            JOptionPane.showMessageDialog(null, "Medicines has been successfully added to Shopping Cart");
            DB4O.getInstance().storeSystem(system);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Product.");
        }
                                            
    
    }//GEN-LAST:event_addButtonActionPerformed

    private void reviewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewTableMouseClicked
      
    }//GEN-LAST:event_reviewTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextArea commentTextArea;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable menuTable;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JLabel rateLabel;
    private javax.swing.JTable reviewTable;
    // End of variables declaration//GEN-END:variables
}
