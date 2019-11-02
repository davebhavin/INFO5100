/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.AirlineDirectory;
import Business.Airlines;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parth
 */
public final class ViewCustomer extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomer
     */
    private JPanel bottomPanel;
    
    private CustomerDirectory custDir;
    private Flight flight;
    private FlightDirectory flightDir;
    
   
    public ViewCustomer(JPanel bottomPanel, CustomerDirectory custDir, Flight flight, FlightDirectory flightDir) {
        initComponents();
       
        this.bottomPanel=bottomPanel;
        this.custDir=custDir;
       this.flight=flight;
       this.flightDir = flightDir;
        //this.custDir=new CustomerDirectory();
        populate2();
        
    }

    
    public void populate2(){
        int rowCount = tblCustBook.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)tblCustBook.getModel();
        dtm.setRowCount(0);
         for(Customer c : custDir.getCustDir()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=c;
            row[1]=c.getAddress();
            row[2]=c.getPhone();
            row[3]=c.getSeatType();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustBook = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(50, 204, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Customer Bookings");

        tblCustBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Phone Number", "Seat Type"
            }
        ));
        jScrollPane1.setViewportView(tblCustBook);
        if (tblCustBook.getColumnModel().getColumnCount() > 0) {
            tblCustBook.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDetails.setText("View Booking Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel Booking");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnDetails)
                        .addGap(130, 130, 130)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetails)
                    .addComponent(btnCancel))
                .addContainerGap(301, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        bottomPanel.remove(this);
        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.previous(bottomPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
       int row = tblCustBook.getSelectedRow();
        if(row>=0) {
             int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Customer c = (Customer)tblCustBook.getValueAt(row, 0);
                 custDir.removeCustomer(c);
        populate2();
            }}
            else{
                
            
            JOptionPane.showMessageDialog(null, "Please select a row from the table first");
            return;
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int row = tblCustBook.getSelectedRow();
        if(row>=0) {
        Customer c = (Customer)tblCustBook.getValueAt(row, 0);
        ViewCustomerBookings cb = new ViewCustomerBookings(bottomPanel,c, flight, flightDir);
        bottomPanel.add("ViewCustomerBookings", cb);
        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.next(bottomPanel);
             
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first");
        }
    }//GEN-LAST:event_btnDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustBook;
    // End of variables declaration//GEN-END:variables
}
