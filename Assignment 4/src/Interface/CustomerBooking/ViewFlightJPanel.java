/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerBooking;

import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author saura
 */
public class ViewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightJPanel
     */
    private JPanel bottomPanel;
    private FlightDirectory FlightDir;
    private Flight c;
    private CustomerDirectory custDir;

    ViewFlightJPanel(JPanel bottomPanel, Flight c, FlightDirectory FlightDir) {
        initComponents();
        this.FlightDir = FlightDir;
        this.bottomPanel = bottomPanel;
        this.c = c;
        custDir = new CustomerDirectory();
        populateFlightDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void populateFlightDetails() {

        FlightNumTxt.setText(c.getFlightNum());
        SourceTxt.setText(c.getSource());
        DestTxt.setText(c.getDest());
        //.setText(c.getPrefTime());
        dateTxt.setText(c.getdate());
        timeTxt.setText(c.getTime());
        ADateTxt.setText(c.getAdate());
        ATimeTxt.setText(c.getAtime());
        
        priceTxt.setText(String.valueOf(c.getPrice()));
        availSeatsTxt.setText(String.valueOf(c.getAvailSeats()));

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        FlightNumTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SourceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DestTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        availSeatsTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ADateTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        timeTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ATimeTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Flight Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 78, 120, 28));

        FlightNumTxt.setEnabled(false);
        FlightNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightNumTxtActionPerformed(evt);
            }
        });
        add(FlightNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 78, 127, 28));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Source:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 119, 120, 28));

        SourceTxt.setEnabled(false);
        add(SourceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 119, 127, 28));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Destination:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 119, 120, 28));

        dateTxt.setEnabled(false);
        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 160, 127, 28));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Departure Date:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 160, 120, 28));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Your flight");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 41, 195, 30));

        DestTxt.setEnabled(false);
        DestTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestTxtActionPerformed(evt);
            }
        });
        add(DestTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 119, 127, 28));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Available Seats:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 242, 120, 28));

        availSeatsTxt.setEnabled(false);
        add(availSeatsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 242, 127, 28));

        priceTxt.setEnabled(false);
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 242, 127, 28));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Price:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 242, 120, 28));

        confirmBtn.setText("Confirm Booking");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 481, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Please Enter Customer Details Below");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 300, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Name:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 330, 120, 28));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Address:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 365, 120, 28));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 330, 127, 28));
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 365, 127, 28));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Phone Number:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 400, 120, 28));
        add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 400, 127, 28));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Window", "Middle", "Aisle" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 438, 127, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Preffered Seat Type:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 435, -1, 28));

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 524, 108, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Arrival Date:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 201, 120, 28));

        ADateTxt.setEnabled(false);
        ADateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADateTxtActionPerformed(evt);
            }
        });
        add(ADateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 201, 127, 28));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Departure Time:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 160, 120, 28));

        timeTxt.setEnabled(false);
        timeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTxtActionPerformed(evt);
            }
        });
        add(timeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 160, 127, 28));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Arrival Time:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 201, 120, 28));

        ATimeTxt.setEnabled(false);
        ATimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATimeTxtActionPerformed(evt);
            }
        });
        add(ATimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 201, 127, 28));
    }// </editor-fold>//GEN-END:initComponents

    private void FlightNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlightNumTxtActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

    private void DestTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestTxtActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        //try{
        //int row = CustomerSearchTable.getSelectedRow();
        String name = nameTxt.getText();
        String address = addressTxt.getText();
        String phone = phoneTxt.getText();
        String seatType = (String) jComboBox2.getSelectedItem();
        int w = c.getWindowSeats();
        int m = c.getMiddleSeats();
        int a = c.getAisleSeats();
        Customer c1 = custDir.addData();
        c1.setName(name);
        c1.setAddress(address);
        c1.setPhone(phone);
        c1.setSeatType(seatType);
         if(seatType.equalsIgnoreCase("Window"))
                {
                    w-=1;
                    c.setWindowSeats(w);
                }
         else if(seatType.equalsIgnoreCase("Middle"))
         {
             m-=1;
             c.setMiddleSeats(m);
         }
         else if(seatType.equalsIgnoreCase("Aisle")){
             a-=1;
             c.setAisleSeats(a);
         }
        int availS = a + m + w;
        JOptionPane.showMessageDialog(null, "Sucessfull");

        
        c.setAvailSeats(availS);
        populateFlightDetails();

        /*Flights f = (Flights)CustomerSearchTable.getValueAt(row, 0);
        int tempseat = 0;
        tempseat = f.getSeat();
        if(tempseat>0){
            tempseat--;
            f.setSeat(tempseat);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry Seats not available please try other flights");
        }*/
 /* customer.setFlightnumber(f.getFlightnumber());
        customer.setSource(f.getSource());
        customer.setDest(f.getDest());
        customer.setPrice(f.getPrice());
        if(row>=0 && !name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Booking successfull");
            populate2();
            CustnameTextField.setEditable(false);
            CustAddressTextField.setEditable(false);
            CustPassportTextField.setEditable(false);
             
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first and fill details");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter details correctly and select your schedule from the table");
          return;
        }*/
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //        userProcessContainer.remove(this);
        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.previous(userProcessContainer);
        bottomPanel.remove(this);
        Component[] componentArray = bottomPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerSearchJPanel customerSearch = (CustomerSearchJPanel) component;
        customerSearch.populateTable();
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.previous(bottomPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ADateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADateTxtActionPerformed

    private void timeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTxtActionPerformed

    private void ATimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ATimeTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADateTxt;
    private javax.swing.JTextField ATimeTxt;
    private javax.swing.JTextField DestTxt;
    private javax.swing.JTextField FlightNumTxt;
    private javax.swing.JTextField SourceTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField availSeatsTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField timeTxt;
    // End of variables declaration//GEN-END:variables

}
