/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.DB4O.DB4O;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DAVE
 */
public class MainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainJPanel
     */ private EcoSystem system;
    private DB4O dB4O = DB4O.getInstance();
    private RegisterJPanel register;
    private JFrame frame;
    public MainJPanel( JPanel Rightpanel) {
        initComponents();
         this.Rightpanel = Rightpanel;
        LogoutJButton.setEnabled(false);
        this.setSize(946,651);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Rightpanel = new javax.swing.JPanel();
        UserNamejTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        LoginjButton = new javax.swing.JButton();
        LogoutJButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jSplitPane1.setMinimumSize(new java.awt.Dimension(200, 31));

        Rightpanel.setBackground(new java.awt.Color(204, 204, 204));
        Rightpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Rightpanel.setMinimumSize(new java.awt.Dimension(200, 0));
        Rightpanel.setPreferredSize(new java.awt.Dimension(200, 651));

        UserNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNamejTextFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("User name:-");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Password:-");

        jLabel20.setText("New user?");

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setText("Register here");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        LoginjButton.setText("Login");
        LoginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginjButtonActionPerformed(evt);
            }
        });

        LogoutJButton.setText("Logout");
        LogoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutJButtonActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setText("LOGIN");

        javax.swing.GroupLayout RightpanelLayout = new javax.swing.GroupLayout(Rightpanel);
        Rightpanel.setLayout(RightpanelLayout);
        RightpanelLayout.setHorizontalGroup(
            RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightpanelLayout.createSequentialGroup()
                .addGroup(RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LoginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightpanelLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel20))
                            .addGroup(RightpanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(LogoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(RightpanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel21)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        RightpanelLayout.setVerticalGroup(
            RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightpanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(LoginjButton)
                .addGap(18, 18, 18)
                .addComponent(LogoutJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(51, 51, 51))
        );

        jSplitPane1.setLeftComponent(Rightpanel);

        LeftPanel.setBackground(new java.awt.Color(204, 255, 204));
        LeftPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 5));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Medicare System");

        jLabel15.setText("-Made with");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("❤");

        jLabel17.setText("by Team 96");

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(241, 241, 241))))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(33, 33, 33))
        );

        jSplitPane1.setRightComponent(LeftPanel);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void UserNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNamejTextFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegisterJPanel rp = new RegisterJPanel(this.Rightpanel,this.system);
        this.Rightpanel.add("RegisterJPanel", rp);
        CardLayout layout = (CardLayout) this.Rightpanel.getLayout();
        layout.next(Rightpanel);
        dB4O.storeSystem(system);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LoginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginjButtonActionPerformed

        String userName = UserNamejTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField2.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccounts().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        Network inNetwork=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDir().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizations().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                inNetwork = network;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)LeftPanel.getLayout();
            //LeftPanel.add("workArea",userAccount.getRole().createWorkArea(LeftPanel, userAccount, inOrganization, inEnterprise,inNetwork, system));
            layout.next(LeftPanel);
        }

        LoginjButton.setEnabled(false);
        LogoutJButton.setEnabled(true);
        UserNamejTextField.setEnabled(false);
        passwordField2.setEnabled(false);
    }//GEN-LAST:event_LoginjButtonActionPerformed

    private void LogoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutJButtonActionPerformed
        LogoutJButton.setEnabled(false);
        UserNamejTextField.setEnabled(true);

        passwordField2.setEnabled(true);
        LoginjButton.setEnabled(true);

        UserNamejTextField.setText("");
        passwordField2.setText("");

        LeftPanel.removeAll();
        JPanel blankJP = new JPanel();
        LeftPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) LeftPanel.getLayout();
        crdLyt.next(LeftPanel);
        dB4O.storeSystem(system);
    }//GEN-LAST:event_LogoutJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton LoginjButton;
    private javax.swing.JButton LogoutJButton;
    private javax.swing.JPanel Rightpanel;
    private javax.swing.JTextField UserNamejTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField passwordField2;
    // End of variables declaration//GEN-END:variables
}