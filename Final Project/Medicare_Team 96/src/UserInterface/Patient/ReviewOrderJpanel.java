/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Department;
import Business.Work.OrderRequest;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author DAVE
 */
public class ReviewOrderJpanel extends javax.swing.JPanel {
    
    private EcoSystem system;
    private OrderRequest order;
    private Department dept;
    private PatientProfileJPanel Panel;
    private OrderDetailJPanel detailPanel;

    public ReviewOrderJpanel(EcoSystem system, OrderRequest order, Department dept, PatientProfileJPanel Panel, 
            OrderDetailJPanel detailPanel, String pattern) {
        initComponents();
        this.system= system;
        this.order = order;
        this.dept = dept;
        this.Panel = Panel;
        this.detailPanel = detailPanel;
        
//        if(pattern.equalsIgnoreCase("View")) {
//            jLabel4.setText("View Review");
//            submitButton.setVisible(false);
//            cancelButton.setVisible(false);
//            this.rateSpinner.setEnabled(false);
//            this.commentTextArea.setEnabled(false);
//            this.rateSpinner.setValue(order.getReview().getRate());
//            this.commentTextArea.setText(order.getReview().getMessage());
//        }
//        this.merchantTextField.setText(shop.getName());
//        
//        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
