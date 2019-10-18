/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Airlines;


import Business.AirlineDirectory;
import Business.Airlines;
import Business.Customer;
import javax.swing.JPanel;
import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DAVE
 */
public final class ManageAirlinesCatalog extends javax.swing.JPanel {

    private final JPanel bottomPanel;
   private final Airlines airlines;
    public ManageAirlinesCatalog(JPanel bottomPanel, Airlines airlines) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.airlines=airlines;
        AirlinenameTextField.setText(airlines.getAirplaneName());
        populate1();
    }
    public void populate1(){
      int rowCount = FlightsJTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)FlightsJTable.getModel();
        dtm.setRowCount(0);
        
        for(Flight f : airlines.getFlight().getAirlinedirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=f;
            row[1]=f.getSource();
            row[2]=f.getDest();
            row[3]=f.getSeat();
            row[4]=f.getPrice();
            row[5]=f.getDate();
            row[6]=f.getTime();
            row[7]=f.getAdate();
            row[8]=f.getAtime();
            
            dtm.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        AirlinenameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ViewJButton = new javax.swing.JButton();
        CreateJButton = new javax.swing.JButton();
        BackJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsJTable = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Airlines :");

        AirlinenameTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Manage Airlines Catalog");

        ViewJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewJButton.setText("View");
        ViewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewJButtonActionPerformed(evt);
            }
        });

        CreateJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CreateJButton.setText("Create");
        CreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJButtonActionPerformed(evt);
            }
        });

        BackJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackJButton.setText("Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });

        FlightsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight Number", "Departure", "Arrival", "Available Seats", "Price", "Departure Date", "Departure Time", "Arrival Date", "Arrival Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FlightsJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AirlinenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(BackJButton)
                                .addGap(43, 43, 43)
                                .addComponent(CreateJButton)
                                .addGap(52, 52, 52)
                                .addComponent(ViewJButton)))
                        .addGap(0, 312, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AirlinenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackJButton)
                    .addComponent(ViewJButton)
                    .addComponent(CreateJButton))
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewJButtonActionPerformed
        // TODO add your handling code here:
        int row = FlightsJTable.getSelectedRow();
        if(row>=0) {
            Flight f = (Flight)FlightsJTable.getValueAt(row, 0);
            ViewSchedules vs = new ViewSchedules(bottomPanel,f);
            bottomPanel.add("View Schedules", vs);
            CardLayout layout = (CardLayout)bottomPanel.getLayout();
            layout.next(bottomPanel);

        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first");
        }

    }//GEN-LAST:event_ViewJButtonActionPerformed

    private void CreateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJButtonActionPerformed
        // TODO add your handling code here:
        CreateSchedule cs = new CreateSchedule(bottomPanel, airlines);
        bottomPanel.add("CreateSchedule",cs);
        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_CreateJButtonActionPerformed

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed
        // TODO add your handling code here:
        bottomPanel.remove(this);
        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.previous(bottomPanel);
    }//GEN-LAST:event_BackJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AirlinenameTextField;
    private javax.swing.JButton BackJButton;
    private javax.swing.JButton CreateJButton;
    private javax.swing.JTable FlightsJTable;
    private javax.swing.JButton ViewJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
