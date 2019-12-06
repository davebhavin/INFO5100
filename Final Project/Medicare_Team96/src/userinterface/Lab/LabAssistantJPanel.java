/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Lab;

import Business.DB4O.DB4O;
import UserInterface.DeliveryCompany.*;
import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Delivery.DeliveryCompany;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalType;
import Business.Hospital.Lab.Lab;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.ProductOrder;
import Business.Role.Role;
import Business.UserAccount.EmployeeAccount;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryRequest;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parth
 */
public class LabAssistantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManJPanel
     */
    private EcoSystem system;
    private JPanel container;
    private Network net;
    private Enterprise en;
    private EmployeeAccount employeeAccount;
    private Lab lab;
    private JFrame frame;
    private Role accessRole;
    private String path;
    private String originPath;
    private OrderRequest selectedRequest = null;
    private DeliveryRequest selectedRequest1 = null;
    private Employee employee;
    private Organization organization;
    private HospitalType department;
    
    public LabAssistantJPanel(EcoSystem system, JPanel container, UserAccount userAccount, Enterprise en, Organization organization
   ) {
        initComponents();
        this.system = system;
        this.container=container;
        //this.net=net;
        this.en=en;
        this.organization=organization;
        this.employeeAccount = (EmployeeAccount) userAccount;
        this.employee = this.employeeAccount.getEmployee();
        this.lab=(Lab) en;
        this.department=department;
        
       
        setInfo();
        Edit.setEnabled(true);
        Save.setEnabled(false);
        Cancel.setEnabled(false);
        setFieldsEditable(false);
        
        // Task Tab
        Proceed.setEnabled(false);
        Confirmthis.setEnabled(false);
        Cancelorder.setEnabled(false);
        txtoldPword.setText("");
        txtNewPword.setText("");
        txtConfirmPWord.setText("");
        
       populateOrderTable(getAllDeliveryRequest());
    }
    
    private ArrayList<WorkRequest> getAllDeliveryRequest() {
        ArrayList<WorkRequest> list = new ArrayList<>();
        list.addAll(this.en.getWorkQueue().getWorkRequestList());
        list.addAll(this.employeeAccount.getWork().getWorkRequestList());
        return list;
    }

    private void populateOrderTable(ArrayList<WorkRequest> list) {
       DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr :lab.getWorkQueue().getWorkRequestList()) {
            OrderRequest or =(OrderRequest) wr;
            Object row[] = new Object[5];
            row[0] = or;
            row[1] = or.getDeliveryName();
            row[2] = or.getItems();
            row[3] = or.getAmount();
           row[4]= or.getStatus();
            dtm.addRow(row);
        }
    
    }

//    private void populateDetails() {
//        ProductOrder order = (ProductOrder) selectedRequest.ge();
//        Address.setText(or.getDeliveryAddress());
//       Name.setText(or.getDeliveryName());
//        Phone.setText(or.getDeliveryPhone());
//    }

    private void setInfo() {
        nameLabel1.setText(employee.getFirstName());
       txtRole.setText(this.employeeAccount.getRole().getRoleType().getValue());
        FirstName.setText(employee.getFirstName());
        txtEmail.setText(employee.getEmailID());
        txtLastName.setText(employee.getLastName());
        txtProfilePhone.setText(employee.getContactNum());
        txtUsername.setText(employeeAccount.getUserName());
    }

    private void resetPasswordField() {
        txtoldPword.setText("");
        txtNewPword.setText("");
        txtConfirmPWord.setText("");
    }

    private void setFieldsEditable(boolean b) {
        txtUsername.setEnabled(b);
        FirstName.setEnabled(b);
        txtLastName.setEnabled(b);
        txtEmail.setEnabled(b);
        txtProfilePhone.setEnabled(b);
        txtUsername.setEnabled(b);
        txtRole.setEnabled(b);
        datePicker1.setEnabled(false);
        timePicker1.setEnabled(false);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel6 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Cancel = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtProfilePhone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        passwordPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnPWordSave = new javax.swing.JButton();
        btnPwordCancel = new javax.swing.JButton();
        txtoldPword = new javax.swing.JPasswordField();
        txtNewPword = new javax.swing.JPasswordField();
        txtConfirmPWord = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        Proceed = new javax.swing.JButton();
        Cancelorder = new javax.swing.JButton();
        Confirmthis = new javax.swing.JButton();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        jLabel6.setText("Welcome, ");
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        nameLabel1.setText("<Name>");
        nameLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jLabel14.setText("Role:");

        jLabel13.setText("Username:");

        jLabel12.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel11.setText("Phone:");

        txtProfilePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfilePhoneActionPerformed(evt);
            }
        });

        jLabel15.setText("Last Name:");

        jLabel1.setText("First Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(FirstName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProfilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancel))
                            .addComponent(txtEmail)
                            .addComponent(txtUsername)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtProfilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(Save)
                    .addComponent(Cancel))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", jPanel2);

        jLabel16.setText("Old Password:");

        jLabel17.setText("New Password:");

        jLabel18.setText("Confirm Password:");

        btnPWordSave.setText("Save");
        btnPWordSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPWordSaveActionPerformed(evt);
            }
        });

        btnPwordCancel.setText("Cancel");
        btnPwordCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPwordCancelActionPerformed(evt);
            }
        });

        txtoldPword.setText("jPasswordField1");

        txtNewPword.setText("jPasswordField2");

        txtConfirmPWord.setText("jPasswordField3");

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPWordSave)
                    .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)))
                .addGap(34, 34, 34)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPwordCancel)
                    .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtoldPword)
                        .addComponent(txtNewPword)
                        .addComponent(txtConfirmPWord, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(553, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel17)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel18))
                    .addGroup(passwordPanelLayout.createSequentialGroup()
                        .addComponent(txtoldPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtNewPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtConfirmPWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPWordSave)
                    .addComponent(btnPwordCancel))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Change Password", jPanel3);

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Name", "Phone", "Amount", "Status"
            }
        ));
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        Proceed.setText("Proceed with this order");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });

        Cancelorder.setText("Cancel order");
        Cancelorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelorderActionPerformed(evt);
            }
        });

        Confirmthis.setText("Confirm");
        Confirmthis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmthisActionPerformed(evt);
            }
        });

        jLabel2.setText("When will be the report, be ready?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Proceed)
                        .addGap(30, 30, 30)
                        .addComponent(Confirmthis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(Cancelorder)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Proceed)
                            .addComponent(Cancelorder)
                            .addComponent(Confirmthis)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Work Area", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(746, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(nameLabel1)
                .addGap(135, 135, 135))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1)
                    .addComponent(jLabel6))
                .addContainerGap(663, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtProfilePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfilePhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfilePhoneActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
     Save.setEnabled(true);
        Cancel.setEnabled(true);
        Edit.setEnabled(false);
        

        setFieldsEditable(true);    // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       setFieldsEditable(false);
        setInfo();

        Save.setEnabled(false);
        Cancel.setEnabled(false);
        Edit.setEnabled(true); // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       if (!txtEmail.getText().equals("") && !FirstName.getText().equals("")
                && !txtLastName.getText().equals("") && !txtProfilePhone.getText().equals("")) {
            this.employee.setEmailID(txtEmail.getText());
            this.employee.setFirstName(FirstName.getText());
            this.employee.setLastName(txtLastName.getText());
            this.employee.setContactNum(txtProfilePhone.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }
        setFieldsEditable(false);
        Save.setEnabled(false);
        Cancel.setEnabled(false);
        Edit.setEnabled(true);

        DB4O.getInstance().storeSystem(system);       // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void btnPWordSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPWordSaveActionPerformed
       char[] passwordCharArray = txtoldPword.getPassword();
        String password = String.valueOf(passwordCharArray);
        char[] passwordCharArray1 = txtNewPword.getPassword();
        String new1 = String.valueOf(passwordCharArray1);
        char[] passwordCharArray2 = txtConfirmPWord.getPassword();
        String new2 = String.valueOf(passwordCharArray2);

        if (password.equals(employeeAccount.getPassword())) {
            if (!new1.equals("")) {
                if (new1.equals(new2)) {
                    employeeAccount.setPassword(new1);
                    JOptionPane.showMessageDialog(null, "Password updated successfully!");
                    DB4O.getInstance().storeSystem(system);
                    resetPasswordField();
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords don't match!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password can't be empty!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correct!");
        } // TODO add your handling code here:
    }//GEN-LAST:event_btnPWordSaveActionPerformed

    private void btnPwordCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPwordCancelActionPerformed
       resetPasswordField(); // TODO add your handling code here:
    }//GEN-LAST:event_btnPwordCancelActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
      int index = tblOrder.getSelectedRow();

        if (index >= 0) {
            OrderRequest selectedRequest = (OrderRequest) tblOrder.getValueAt(index, 0);
           if (selectedRequest.getStatus().equals(WorkRequest.StatusEnum.Processing)){
             Proceed.setEnabled(true);
            DB4O.getInstance().storeSystem(system);
           }
        else {
            Proceed.setEnabled(false);
            Cancelorder.setEnabled(true);
        }}
        
        
        
    }//GEN-LAST:event_tblOrderMouseClicked

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
       datePicker1.setEnabled(true);
       timePicker1.setEnabled(true);
       Cancelorder.setEnabled(true);
       Confirmthis.setEnabled(true);
    }//GEN-LAST:event_ProceedActionPerformed

    private void ConfirmthisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmthisActionPerformed
         String Adate = datePicker1.getText().trim();
         System.out.println(Adate);
          if(Adate==null || Adate.equals("")){
                JOptionPane.showMessageDialog(null, " Date cannot be Empty");
                 return;
            }
          String Atime = timePicker1.getText().trim();
          if(Atime==null || Atime.equals("")){
                JOptionPane.showMessageDialog(null, " Time cannot be Empty");
                 return;
            }
          
          int index = tblOrder.getSelectedRow();

        if (index >= 0) {
            OrderRequest selectedRequest = (OrderRequest) tblOrder.getValueAt(index, 0);
           if (selectedRequest.getStatus().equals(WorkRequest.StatusEnum.Processing)){
             Proceed.setEnabled(true);
             selectedRequest.setStatus(WorkRequest.StatusEnum.Completed);
             selectedRequest.setDeliverydate(Adate);
              selectedRequest.setDeliverytime(Atime);
 
            DB4O.getInstance().storeSystem(system);
             JOptionPane.showMessageDialog(null, " Status have been updated");
             populateOrderTable(getAllDeliveryRequest());
           }
        else {
            Proceed.setEnabled(false);
        }}
       
            
            
            
        
    }//GEN-LAST:event_ConfirmthisActionPerformed

    private void CancelorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelorderActionPerformed
         int index = tblOrder.getSelectedRow();
        if (index >= 0) {
            OrderRequest selectedRequest = (OrderRequest) tblOrder.getValueAt(index, 0);
           if (selectedRequest.getStatus().equals(WorkRequest.StatusEnum.Processing)){
             Proceed.setEnabled(true);
              selectedRequest.setStatus(WorkRequest.StatusEnum.Cancelled);
              DB4O.getInstance().storeSystem(system);
             JOptionPane.showMessageDialog(null, " Status have been updated");
             populateOrderTable(getAllDeliveryRequest());
           }
        else {
            Proceed.setEnabled(false);
        }}
       
    }//GEN-LAST:event_CancelorderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Cancelorder;
    private javax.swing.JButton Confirmthis;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField FirstName;
    private javax.swing.JButton Proceed;
    private javax.swing.JButton Save;
    private javax.swing.JButton btnPWordSave;
    private javax.swing.JButton btnPwordCancel;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JTable tblOrder;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    private javax.swing.JPasswordField txtConfirmPWord;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtNewPword;
    private javax.swing.JTextField txtProfilePhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtoldPword;
    // End of variables declaration//GEN-END:variables
}