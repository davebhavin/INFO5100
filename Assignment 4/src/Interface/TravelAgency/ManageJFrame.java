/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.AirlineDirectory;
import Business.Airlines;
import Business.CustomerDirectory;
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author parth
 */
public class ManageJFrame extends javax.swing.JPanel {

    /**
     * Creates new form ManageJFrame
     */
    JPanel bottomPanel;
    AirlineDirectory airlinesDirectory;
    CustomerDirectory custDir;

    public ManageJFrame(JPanel bottomPanel, AirlineDirectory airlinesDirectory, CustomerDirectory custDir) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.airlinesDirectory = airlinesDirectory;
        this.custDir = custDir;


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewAirlines = new javax.swing.JButton();
        btnCustDetails = new javax.swing.JButton();

        btnViewAirlines.setText("View Airline Details");
        btnViewAirlines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinesActionPerformed(evt);
            }
        });

        btnCustDetails.setText("View Customer Details");
        btnCustDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnViewAirlines, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(btnCustDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewAirlines, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(539, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAirlinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinesActionPerformed
        // TODO add your handling code here:
        ViewAirlines va = new ViewAirlines(bottomPanel, airlinesDirectory);
        bottomPanel.add("ViewAirlines", va);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_btnViewAirlinesActionPerformed

    private void btnCustDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustDetailsActionPerformed
        // TODO add your handling code here:
        ViewCustomer vc = new ViewCustomer(bottomPanel, custDir);
        bottomPanel.add("ViewCustomer", vc);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);

    }//GEN-LAST:event_btnCustDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustDetails;
    private javax.swing.JButton btnViewAirlines;
    // End of variables declaration//GEN-END:variables
}
