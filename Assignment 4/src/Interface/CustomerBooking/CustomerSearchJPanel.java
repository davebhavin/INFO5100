/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerBooking;

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
 * @author saura
 */
public class CustomerSearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSearchJPanel
     */
    private JPanel bottomPanel;
   // private AirlineDirectory airlinesDirectory;
    private CustomerDirectory custDir;
    private FlightDirectory FlightDir;
    
    public CustomerSearchJPanel(JPanel bottomPanel,  FlightDirectory FlightDir, CustomerDirectory custDir) {
      initComponents();
      // System.out.print("in constructor");
      this.bottomPanel=bottomPanel;
      //this.airlinesDirectory=airlinesDirectory;
      this.FlightDir=FlightDir;
      this.custDir= custDir;
       // System.out.print("in constructor");
         populateTable();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DeptTxt = new javax.swing.JTextField();
        ArrivalTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsJTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        ViewFlightsBtn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search For Flights");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Source:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date:");

        ArrivalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrivalTxtActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Destination:");

        FlightsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Flight number", "Source", "Destination", "Window Seats", "Middle Seats", "Aisle Seats", "Price", "Departure Date", "Departure time", "Arrival Date", "Arrival time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FlightsJTable);
        if (FlightsJTable.getColumnModel().getColumnCount() > 0) {
            FlightsJTable.getColumnModel().getColumn(0).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            FlightsJTable.getColumnModel().getColumn(1).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(1).setPreferredWidth(125);
            FlightsJTable.getColumnModel().getColumn(2).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            FlightsJTable.getColumnModel().getColumn(3).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(3).setPreferredWidth(180);
            FlightsJTable.getColumnModel().getColumn(4).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(4).setPreferredWidth(75);
            FlightsJTable.getColumnModel().getColumn(5).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(5).setPreferredWidth(200);
            FlightsJTable.getColumnModel().getColumn(6).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(7).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(8).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(9).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(10).setResizable(false);
            FlightsJTable.getColumnModel().getColumn(11).setResizable(false);
        }

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        ViewFlightsBtn.setText("View Flight Details");
        ViewFlightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewFlightsBtnActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addComponent(ViewFlightsBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(DeptTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ArrivalTxt)
                                            .addComponent(datePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 370, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeptTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArrivalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(searchBtn)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ViewFlightsBtn)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ArrivalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrivalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrivalTxtActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
            // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)FlightsJTable.getModel();
     dtm.setRowCount(0);
     
     for(Flight c : FlightDir.getFlightDir())
            {
                if(DeptTxt.getText().equalsIgnoreCase(c.getSource()) && ArrivalTxt.getText().equalsIgnoreCase(c.getDest()) &&
                        datePicker1.getText().equalsIgnoreCase(c.getdate())) 
                {
                Object[] row = new Object[12];
                row[0] = c;
                row[1] = c.getFlightNum();
                row[2] = c.getSource();
                row[3] = c.getDest();
                
                row[4] = c.getWindowSeats();
                row[5] = c.getMiddleSeats();
                row[6] = c.getAisleSeats();
                row[7] = c.getPrice();
                row[8] = c.getdate();
                row[9] = c.getTime();
                row[10] = c.getAdate();
                row[11]= c.getAtime();
                
                dtm.addRow(row);
                }               
            }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void ViewFlightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewFlightsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = FlightsJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row" , "Warning" , JOptionPane.WARNING_MESSAGE);
        }
        else {
           Flight c = (Flight) FlightsJTable.getValueAt(selectedRow,0);
           ViewFlightJPanel panel = new ViewFlightJPanel(bottomPanel, c, FlightDir, custDir);
           bottomPanel.add("ViewFlightJPanel", panel);
            CardLayout layout = (CardLayout) bottomPanel.getLayout();
            layout.next(bottomPanel); 
        }
    }//GEN-LAST:event_ViewFlightsBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        bottomPanel.remove(this);
        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.previous(bottomPanel);
    }//GEN-LAST:event_btnBackActionPerformed

public void populateTable(){
    DefaultTableModel dtm = (DefaultTableModel)FlightsJTable.getModel();
     dtm.setRowCount(0);
     
     for(Flight c : FlightDir.getFlightDir())
            {
                
                Object[] row = new Object[12];
                row[0] = c;
                row[1] = c.getFlightNum();
                row[2] = c.getSource();
                row[3] = c.getDest();
                row[4] = c.getWindowSeats();
                row[5] = c.getMiddleSeats();
                row[6] = c.getAisleSeats();
                row[7] = c.getPrice();
                row[8] = c.getdate();
                row[9] = c.getTime();
                row[10] = c.getAdate();
                row[11]= c.getAtime();
                
                dtm.addRow(row);
                                
            }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArrivalTxt;
    private javax.swing.JTextField DeptTxt;
    private javax.swing.JTable FlightsJTable;
    private javax.swing.JButton ViewFlightsBtn;
    private javax.swing.JButton btnBack;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
