/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeliveryCompany;

import Business.DB4O.DB4O;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Delivery.DeliveryCompany;
import Business.Enterprise.Department;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.EmployeeAccount;
import Business.UserAccount.UserAccount;
import Business.Work.DeliveryRequest;
import Business.Work.OrderRequest;
import Business.Work.WorkRequest;
import Business.Work.WorkRequest.StatusEnum;
import UserInterface.Pharmacy.Medicines.createEmployeeJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parth
 */
public class DeliveryCompanyManagerJPanel extends javax.swing.JPanel {
private EcoSystem system;
    private JPanel container;
    private Network net;
    private Enterprise en;
    private EmployeeAccount employeeAccount;
    private DeliveryCompany company;
    private JFrame frame;
    private Role accessRole;
    private String path;
    private String originPath;
    private DeliveryRequest selectedRequest = null;
    private Employee employee;
    private Organization organization;
    
    /**
     * Creates new form DeliveryCompanyManagerJPanel
     */
    

    public DeliveryCompanyManagerJPanel(EcoSystem system, JPanel container, UserAccount userAccount,Enterprise en, Organization organization) {
        this.system = system;
        this.container=container;
       // this.net=net;
        this.en=en;
        this.organization=organization;
        this.employeeAccount = (EmployeeAccount) userAccount;
        this.employee = this.employeeAccount.getEmployee();
        this.company=(DeliveryCompany) en;
        initComponents();
        populateOrderTable(getAllDeliveryRequest());
        populateEmployeeTable(company.getOrganizations().getOrganizationList());
        
        //Overview
        btnEdit.setEnabled(true);
        btnSave.setEnabled(false);        
        btnCancel.setEnabled(false);
        setOverviewFieldsEditable(false);
        setOverviewInfo();
        //Profile
        btnProfileSave.setEnabled(false);
        btnProfileCancel.setEnabled(false);
        btnProfileEdit.setEnabled(true);
        setInfo();
        setProfileFieldsEditable(false);
       //password
        txtoldPword.setText("");
        txtNewPword.setText("");
        txtConfirmPWord.setText("");
        //
        btnDeliveryCancel.setVisible(false);
    }

    
    private void setInfo(){
      lblName.setText(employee.getFirstName() +"   " + employee.getLastName());
    txtFirstName.setText(employee.getFirstName());
    txtLastName.setText(employee.getLastName());
    txtProfilePhone.setText(employee.getContactNum());
    txtEmail.setText(employee.getEmailID());
    txtUsername.setText(employeeAccount.getUserName());
    txtRole.setText(this.employeeAccount.getRole().getRoleType().getValue());
    
}
    private void setProfileFieldsEditable(boolean b) {
        txtEmail.setEnabled(b);
        txtFirstName.setEnabled(b);
        txtLastName.setEnabled(b);
        txtProfilePhone.setEnabled(b);
        txtUsername.setEnabled(b);
        txtRole.setEnabled(b);
    }
    private void setOverviewFieldsEditable(boolean b) {
        txtName.setEnabled(b);
        txtAddress.setEnabled(b);
        txtPhone.setEnabled(b);
        txtDescription.setEnabled(b);
    }
    private void setOverviewInfo(){
     txtName.setText(company.getName());
     txtAddress.setText(company.getAddress());
     txtPhone.setText(company.getPhone());
     txtDescription.setText(company.getDescription());
 }
    private void resetPasswordField() {
        txtoldPword.setText("");
        txtNewPword.setText("");
        txtConfirmPWord.setText("");
    }
    private ArrayList<WorkRequest> getAllDeliveryRequest() {
        ArrayList<WorkRequest> list = new ArrayList<>();
        for (WorkRequest wr:en.getWorkQ().getWorkRequestList()) {
            if (wr instanceof DeliveryRequest) {
                list.add(wr);
            }
        }
        for (UserAccount ac : en.getOrganizations().getTypicalOrganization(Organization.Type.Delivery).
                getUserAccountDirectory().getUserAccountList()) {
            list.addAll(ac.getWork().getWorkRequestList());
        }
        return list;
    }
     public void populateOrderTable(ArrayList<WorkRequest> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : list) {
            DeliveryRequest or = (DeliveryRequest) wr;
            Object row[] = new Object[4];
            row[0] = or.getOrder().getId();
            row[1] = or;
            row[2] = (Department) or.getOrder().getEnterprise();
            row[3] = or.getStatus();
            dtm.addRow(row);
        }
    }
     private void populateDetails() {
        Department d = (Department) selectedRequest.getOrder().getEnterprise();
        txtPickupAddress.setText(d.getAddress());
        txtPickupName.setText(d.getName());
        txtPickupPhone.setText(d.getPhone());
        OrderRequest or = (OrderRequest) selectedRequest.getOrder();
        txtDeliveryAddress.setText(or.getDeliveryAddress());
        txtDeliveryName.setText(or.getDeliveryName());
        txtDeliveryPhone.setText(or.getDeliveryPhone());
    }


    public void populateEmployeeTable(ArrayList<Organization> list) {
        ArrayList<EmployeeAccount> result = new ArrayList<>();

        result.addAll(this.en.getUserAccountDirectory().toEmployeeAccounts());

        for (Organization org : list) {
            result.addAll(org.getUserAccountDirectory().toEmployeeAccounts());
        }

        DefaultTableModel dtm = (DefaultTableModel) tblEmployee.getModel();
        dtm.setRowCount(0);
        for (EmployeeAccount e : result) {
            Object row[] = new Object[4];
            row[0] = e;
            row[1] = e.getRole();
            row[2] = e.getEmployee().getFirstName() + e.getEmployee().getLastName();
            row[3] = e.getEmployee().getEmailID();
            dtm.addRow(row);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        OverviewPanel = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        employeePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        workPanel = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        DeliveryPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPickupName = new javax.swing.JTextField();
        txtPickupPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDeliveryName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDeliveryPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnDeliveryCancel = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPickupAddress = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDeliveryAddress = new javax.swing.JTextArea();
        profilePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtProfilePhone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        btnProfileEdit = new javax.swing.JButton();
        btnProfileSave = new javax.swing.JButton();
        btnProfileCancel = new javax.swing.JButton();
        passwordPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnPWordSave = new javax.swing.JButton();
        btnPwordCancel = new javax.swing.JButton();
        txtoldPword = new javax.swing.JPasswordField();
        txtNewPword = new javax.swing.JPasswordField();
        txtConfirmPWord = new javax.swing.JPasswordField();
        lblWelcome = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        lblname.setText("Name:");

        lblAddress.setText("Address:");

        lblPhone.setText("Phone:");

        lblDescription.setText("Description");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane3.setViewportView(txtAddress);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane4.setViewportView(txtDescription);

        javax.swing.GroupLayout OverviewPanelLayout = new javax.swing.GroupLayout(OverviewPanel);
        OverviewPanel.setLayout(OverviewPanelLayout);
        OverviewPanelLayout.setHorizontalGroup(
            OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverviewPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OverviewPanelLayout.createSequentialGroup()
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(OverviewPanelLayout.createSequentialGroup()
                        .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAddress)
                            .addComponent(lblPhone)
                            .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OverviewPanelLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(OverviewPanelLayout.createSequentialGroup()
                                .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                                .addGap(0, 570, Short.MAX_VALUE))))))
            .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OverviewPanelLayout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(573, Short.MAX_VALUE)))
        );
        OverviewPanelLayout.setVerticalGroup(
            OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverviewPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OverviewPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverviewPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnCancel))
                .addGap(154, 154, 154))
            .addGroup(OverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OverviewPanelLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(465, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Overview", OverviewPanel);

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Username", "Role"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnCreate.setText("Add New Employee");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employeePanelLayout = new javax.swing.GroupLayout(employeePanel);
        employeePanel.setLayout(employeePanelLayout);
        employeePanelLayout.setHorizontalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        employeePanelLayout.setVerticalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(26, 26, 26)
                .addComponent(btnCreate)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Employee", employeePanel);

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Date", "Pharmacy", "Status"
            }
        ));
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        jLabel2.setText("Pickup Details:");

        jLabel3.setText("Name:");

        jLabel4.setText("Phone:");

        jLabel5.setText("Address:");

        jLabel6.setText("Delivery Details:");

        jLabel7.setText("Name:");

        jLabel8.setText("Phone:");

        jLabel9.setText("Address:");

        btnDeliveryCancel.setText("Cancel Order");
        btnDeliveryCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryCancelActionPerformed(evt);
            }
        });

        txtPickupAddress.setColumns(20);
        txtPickupAddress.setRows(5);
        jScrollPane5.setViewportView(txtPickupAddress);

        txtDeliveryAddress.setColumns(20);
        txtDeliveryAddress.setRows(5);
        jScrollPane6.setViewportView(txtDeliveryAddress);

        javax.swing.GroupLayout DeliveryPanelLayout = new javax.swing.GroupLayout(DeliveryPanel);
        DeliveryPanel.setLayout(DeliveryPanelLayout);
        DeliveryPanelLayout.setHorizontalGroup(
            DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeliveryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeliveryPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(DeliveryPanelLayout.createSequentialGroup()
                                    .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(50, 50, 50)
                                    .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPickupPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(txtPickupName)
                                        .addComponent(jScrollPane5)))
                                .addGroup(DeliveryPanelLayout.createSequentialGroup()
                                    .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDeliveryPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(txtDeliveryName, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6))))))
                    .addGroup(DeliveryPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnDeliveryCancel)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        DeliveryPanelLayout.setVerticalGroup(
            DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeliveryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeliveryPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(DeliveryPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPickupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPickupPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDeliveryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDeliveryPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeliveryCancel)
                        .addGap(64, 64, 64))))
        );

        jTabbedPane1.addTab("Manage Delivery", DeliveryPanel);

        jLabel1.setText("First Name:");

        jLabel10.setText("Last Name:");

        jLabel11.setText("Phone:");

        jLabel12.setText("Email:");

        jLabel13.setText("Username:");

        jLabel14.setText("Role:");

        btnProfileEdit.setText("Edit");
        btnProfileEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileEditActionPerformed(evt);
            }
        });

        btnProfileSave.setText("Save");
        btnProfileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileSaveActionPerformed(evt);
            }
        });

        btnProfileCancel.setText("Cancel");
        btnProfileCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(txtFirstName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(80, 80, 80)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProfilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(83, 83, 83))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(123, 123, 123))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                                        .addComponent(btnProfileEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)))))
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(btnProfileSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProfileCancel))
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(txtRole))))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtProfilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfileEdit)
                    .addComponent(btnProfileSave)
                    .addComponent(btnProfileCancel))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", profilePanel);

        jLabel15.setText("Old Password:");

        jLabel16.setText("New Password:");

        jLabel17.setText("Confirm Password:");

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
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)))
                .addGap(34, 34, 34)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPwordCancel)
                    .addComponent(txtoldPword, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtNewPword)
                    .addComponent(txtConfirmPWord))
                .addContainerGap(560, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtoldPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNewPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtConfirmPWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPWordSave)
                    .addComponent(btnPwordCancel))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", passwordPanel);

        lblWelcome.setText("Welcome");

        lblName.setText("<Name>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcome)
                .addGap(34, 34, 34)
                .addComponent(lblName)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnEdit.setEnabled(false);

        setOverviewFieldsEditable(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setOverviewFieldsEditable(false);
        setOverviewInfo();

        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       this.workPanel.removeAll();
        createEmployeeJPanel ep = new createEmployeeJPanel(this.system, this, this.workPanel, this.en, this.accessRole);
        this.workPanel.add(ep);
        CardLayout layout = (CardLayout) this.workPanel.getLayout();
        layout.next(this.workPanel); // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeliveryCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryCancelActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Are you sure to cancel this order?");
        if (input == 0) {
            selectedRequest.setStatus(StatusEnum.Cancelled);
            selectedRequest.getOrder().setStatus(StatusEnum.Cancelled);
            system.getCustomerAccountByUsername(selectedRequest.getOrder().getAccount().getUserName()).
                    getWork().getOrderById(selectedRequest.getOrder().getId()).setStatus(StatusEnum.Cancelled);
            system.getEnterpriseById(selectedRequest.getOrder().getEnterprise().getID()).getWorkQ().
                    getOrderById(selectedRequest.getOrder().getId()).setStatus(StatusEnum.Cancelled);
            DB4O.getInstance().storeSystem(system);
            populateOrderTable(getAllDeliveryRequest());
        } // TODO add your handling code here:
    }//GEN-LAST:event_btnDeliveryCancelActionPerformed

    private void btnProfileEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileEditActionPerformed
       btnProfileSave.setEnabled(true);
        btnProfileCancel.setEnabled(true);
        btnProfileEdit.setEnabled(false);

        setProfileFieldsEditable(true); // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileEditActionPerformed

    private void btnProfileCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileCancelActionPerformed
       setProfileFieldsEditable(false);
        setInfo();

        btnProfileSave.setEnabled(false);
        btnProfileCancel.setEnabled(false);
        btnProfileEdit.setEnabled(true); // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileCancelActionPerformed

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
        }
    }//GEN-LAST:event_btnPWordSaveActionPerformed

    private void btnPwordCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPwordCancelActionPerformed
        resetPasswordField();
    }//GEN-LAST:event_btnPwordCancelActionPerformed

    private void btnProfileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileSaveActionPerformed
      if (!txtEmail.getText().equals("") && !txtFirstName.getText().equals("")
                && !txtLastName.getText().equals("") && !txtProfilePhone.getText().equals("")) {
            this.employee.setEmailID(txtEmail.getText());
            this.employee.setFirstName(txtFirstName.getText());
            this.employee.setLastName(txtLastName.getText());
            this.employee.setContactNum(txtProfilePhone.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }
        setProfileFieldsEditable(false);
        btnProfileSave.setEnabled(false);
        btnProfileCancel.setEnabled(false);
        btnProfileEdit.setEnabled(true);

        DB4O.getInstance().storeSystem(system);  // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileSaveActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      if (!txtPhone.getText().equals("") && !txtAddress.getText().equals("")
                && !txtDescription.getText().equals("") && !txtName.getText().equals("")) {
            company.setName(txtName.getText());
            company.setAddress(txtAddress.getText());
            company.setDescription(txtDescription.getText());
            company.setPhone(txtPhone.getText());
            
        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }
        setOverviewFieldsEditable(false);
        setOverviewInfo();
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(true);

        DB4O.getInstance().storeSystem(system);  // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        int index = tblOrder.getSelectedRow();

        if (index >= 0) {
            selectedRequest = (DeliveryRequest) tblOrder.getValueAt(index, 1);
            if (!selectedRequest.getStatus().equals(StatusEnum.Cancelled)
                    && !selectedRequest.getStatus().equals(StatusEnum.Completed)) {
                btnDeliveryCancel.setVisible(true);
            }
            populateDetails();
        } else {
            btnDeliveryCancel.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblOrderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeliveryPanel;
    private javax.swing.JPanel OverviewPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDeliveryCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPWordSave;
    private javax.swing.JButton btnProfileCancel;
    private javax.swing.JButton btnProfileEdit;
    private javax.swing.JButton btnProfileSave;
    private javax.swing.JButton btnPwordCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel employeePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblname;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JPasswordField txtConfirmPWord;
    private javax.swing.JTextArea txtDeliveryAddress;
    private javax.swing.JTextField txtDeliveryName;
    private javax.swing.JTextField txtDeliveryPhone;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextArea txtPickupAddress;
    private javax.swing.JTextField txtPickupName;
    private javax.swing.JTextField txtPickupPhone;
    private javax.swing.JTextField txtProfilePhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtoldPword;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
