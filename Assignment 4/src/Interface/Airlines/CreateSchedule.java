/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Airlines;



import Business.Airlines;
import Business.AirlineDirectory;
import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author DAVE
 */
public class CreateSchedule extends javax.swing.JPanel {

    private Airlines airlines;
    private JPanel bottomPanel;
    private FlightDirectory FlightDir;
    private Airlines airl;
    public CreateSchedule(JPanel bottomPanel, Airlines airlines, FlightDirectory FlightDir, Airlines airl) {
        initComponents();
       
        this.bottomPanel= bottomPanel;
        this.airlines= airlines;
        this.FlightDir=FlightDir;
        this.airl= airl;
        companyTxt.setText(airl.getAirplaneName());
    }

    

       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PriceTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtWindow = new javax.swing.JTextField();
        DestTxtField = new javax.swing.JTextField();
        SourceTextField = new javax.swing.JTextField();
        FlightNumberTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        timePicker2 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel11 = new javax.swing.JLabel();
        companyTxt = new javax.swing.JTextField();
        txtMiddle = new javax.swing.JTextField();
        txtAisle = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setBackground(new java.awt.Color(102, 153, 240));

        jLabel7.setText("Depatrure Date :");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setText("Price :");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setText("No. of Window Seats:");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Back.setText("<<Back");
        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel4.setText("Destination:");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Save.setText("Save");
        Save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Flight Number :");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        PriceTxtField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PriceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Create Flight Schedule");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtWindow.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        DestTxtField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        SourceTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SourceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceTextFieldActionPerformed(evt);
            }
        });

        FlightNumberTxtField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel3.setText("Source : ");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setText("Arrival Date :");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setText("Departure Time :");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel10.setText("Arrival Date :");
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel11.setText("Company");
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        companyTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        companyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyTxtActionPerformed(evt);
            }
        });

        txtMiddle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtAisle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("No. of Aisle Seats:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("No. of Middle Seats:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Back)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(30, 30, 30)
                                .addComponent(companyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel6)
                                .addGap(60, 60, 60)
                                .addComponent(PriceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(DestTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Save)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAisle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FlightNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(companyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(PriceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DestTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(timePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAisle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(368, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        bottomPanel.remove(this);
        Component[] componentArray = bottomPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinesCatalog manageAirlineCatalogJPanel = (ManageAirlinesCatalog) component;
        manageAirlineCatalogJPanel.populate1();
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.previous(bottomPanel);
    }//GEN-LAST:event_BackActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        //   Flights flights = airlines.getFlightsDict().addFlight();
        if(FlightNumberTxtField.getText().isEmpty() && SourceTextField.getText().isEmpty() && DestTxtField.getText().isEmpty() &&
            datePicker1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter all the details correctly");
        }
        else{
                String number = FlightNumberTxtField.getText().trim();
                if(number==null || number.equals("")){
                JOptionPane.showMessageDialog(null, "Flight Number cannot be Empty. Enter Flight Number");
                return;
            }
            
            String src = SourceTextField.getText().trim();
                if(src==null || src.equals("")){
                JOptionPane.showMessageDialog(null, "Source cannot be Empty. Enter Source");
                return;
            }
            else if(! src.matches("^[a-zA-Z]+$")){
                JOptionPane.showMessageDialog(null,"Enter Valid Source. Only Alphabets");
                return;}
            
            String dest = DestTxtField.getText().trim();
                if(dest==null || dest.equals("")){
                JOptionPane.showMessageDialog(null, "Destination cannot be Empty. Enter Destination");
                return;
            }
            else if(! dest.matches("^[a-zA-Z]+$")){
                JOptionPane.showMessageDialog(null,"Enter Valid Destination. Only Alphabets");
                return;}
            
            String w = (txtWindow.getText().trim());
            try{
               Integer.parseInt(w);
               
           }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Enter Valid Seat");
               return;
           }
             if(w==null || w.equals("")){
              JOptionPane.showMessageDialog(null, "Text Field cannot be Empty. Enter Window Seat");
                return; 
           }
             String m = (txtMiddle.getText().trim());
            try{
               Integer.parseInt(m);
               
           }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Enter Valid Seat");
               return;
           }
             if(m==null || m.equals("")){
              JOptionPane.showMessageDialog(null, "Text Field cannot be Empty. Enter Middle Seat");
                return; 
           }
           String a = (txtAisle.getText().trim());
            try{
               Integer.parseInt(a);
               
           }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Enter Valid Seat");
               return;
           }
             if(a==null || a.equals("")){
              JOptionPane.showMessageDialog(null, "Text Field cannot be Empty. Enter Aisle Seat");
                return; 
           }

                String pr =(PriceTxtField.getText().trim());
                 try{
               Integer.parseInt(pr);
               
           }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Enter Valid Price");
               return;
           }
           if(pr==null || pr.equals("")){
              JOptionPane.showMessageDialog(null, "Text Field cannot be Empty. Enter Price");
                return; 
           }
           if(pr.equals("0")){
            JOptionPane.showMessageDialog(null,"Price Cannot be 0");
            return;
        }
        
                
                String date = datePicker1.getText().trim();
                if(date==null || date.equals("")){
                JOptionPane.showMessageDialog(null, "Departure Date cannot be Empty");
                return;
            }
                
                String time = timePicker1.getText().trim();
                if(time==null || time.equals("")){
                JOptionPane.showMessageDialog(null, "Departure Time cannot be Empty");
                return;
            }
                String Adate = datePicker2.getText().trim();
                if(Adate==null || Adate.equals("")){
                JOptionPane.showMessageDialog(null, " Date cannot be Empty");
                return;}
                String Atime = timePicker2.getText().trim();

                if(Atime==null || Atime.equals("")){
                JOptionPane.showMessageDialog(null, "Arrival Time cannot be Empty");
                return;
            }

                String company = companyTxt.getText().trim();
                for(Flight f : airlines.getFlightDirectory().getFlightDir()){
                if(FlightNumberTxtField.getText().equalsIgnoreCase(f.getFlightNum())){
                  JOptionPane.showMessageDialog(null,"Flight Number already Exists");
                return;  
                }
            }

                
                Flight flights = airlines.getFlightDirectory().addData();
                flights.setFlightNum(number);
                flights.setSource(src);
                flights.setDest(dest);
                flights.setWindowSeats(Integer.parseInt(w)); 
                flights.setMiddleSeats(Integer.parseInt(m)); 
                flights.setAisleSeats(Integer.parseInt(a)); 
                flights.setPrice(Integer.parseInt(pr));
                flights.setdate(date);
                flights.setTime(time);
                flights.setAdate(Adate);
                flights.setAtime(Atime);
                flights.setCompany(company);
               

                JOptionPane.showMessageDialog(null, "Schedule Created Successfully");

                FlightNumberTxtField.setText("");
                SourceTextField.setText("");
                DestTxtField.setText("");
                txtWindow.setText("");
                PriceTxtField.setText("");
                datePicker1.setText("");
                timePicker1.setText("");
                datePicker2.setText("");
                timePicker2.setText("");
                txtAisle.setText("");
                txtMiddle.setText("");
                
                   
            
           
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void PriceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTxtFieldActionPerformed

    private void SourceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SourceTextFieldActionPerformed

    private void companyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField DestTxtField;
    private javax.swing.JTextField FlightNumberTxtField;
    private javax.swing.JTextField PriceTxtField;
    private javax.swing.JButton Save;
    private javax.swing.JTextField SourceTextField;
    private javax.swing.JTextField companyTxt;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    private com.github.lgooddatepicker.components.TimePicker timePicker2;
    private javax.swing.JTextField txtAisle;
    private javax.swing.JTextField txtMiddle;
    private javax.swing.JTextField txtWindow;
    // End of variables declaration//GEN-END:variables
}
