/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlineresevation;

import static airlineresevation.myvariables.password;
import static airlineresevation.myvariables.path;
import static airlineresevation.myvariables.place;
import static airlineresevation.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author gtbstud
 */
public class flightdetail extends javax.swing.JInternalFrame implements myvariables{

    /**
     * Creates new form flightdetail
     */
    public flightdetail() {
        initComponents();
    }
    void generateflightid()
{
      try
            {
                 Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                
                try
                {
                    String q="select max(flighid) from flightdetail";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    
                     ResultSet myresult=mystatement.executeQuery();
                
                      if(myresult.next())
                      {
                          int flightid=myresult.getInt(1);
                          if(flightid>0)
                          {
                          jTextField1.setText(String.valueOf(flightid+1));
                          }
                         
                      
                       else
                         {
                          jTextField1.setText("4000");
                         }
                            }
                   
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    myconnection.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
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

        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Flight Details");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 140, -1));

        jLabel8.setText("Destination");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jButton2.setText("ADD FLIGHT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 200, 40));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 140, -1));

        jLabel9.setText("Arrival_TIME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 168, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 140, 30));

        jLabel6.setText("Flight_CHARGES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jLabel4.setText("Departure");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel3.setText("Source");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel1.setText("Flight_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel2.setText("Flight_NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Source" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 130, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Destination" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 165, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 178, 29));

        jLabel5.setText("DateOfDeparture");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineresevation/images/No title(48).jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 270, 270));

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel10.setText("ADD FLIGHTS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 70));

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try
            {
               Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                
                try
                {
                    String q="insert into flightdetail values(?,?,?,?,?,?,?,?)";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                   mystatement.setString(1, jTextField1.getText());
                    mystatement.setString(2,jTextField2.getText());
                   mystatement.setString(3, jComboBox1.getSelectedItem().toString());
                       
                    mystatement.setString(4, jTextField4.getText());
                     mystatement.setString(5, jTextField6.getText());
                   
                     mystatement.setString(6, jComboBox2.getSelectedItem().toString());    
                       mystatement.setString(7, jTextField9.getText());
                         SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                  String dod=myformat.format(jDateChooser1.getDate());
                       mystatement.setString(8, dod);
                        generateflightid();
                   mystatement.executeUpdate();
                   generateflightid();
                       jTextField2.setText("");
                       jComboBox1.setSelectedIndex(0);
                       jComboBox2.setSelectedIndex(0);
                       jTextField4.setText("");
                       jTextField6.setText("");
                      
                       jTextField9.setText("");
                       jDateChooser1.setDate(null);
                        
                       
                       JOptionPane.showMessageDialog(rootPane, "Flight details submitted", "Flight details", JOptionPane.INFORMATION_MESSAGE);
                         
                       
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    myconnection.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
    }                                         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       try
        {
              Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);

            try
            {
                String q="select * from sourcetable";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                ResultSet myresult=mystatement.executeQuery();
                
                if(myresult.next())
                {
                    do
                    {
                        jComboBox1.addItem(myresult.getString("source"));
                    }
                    while(myresult.next());
                }
                 String p="select * from destination";
                PreparedStatement mystatement1=myconnection.prepareStatement(p);
                ResultSet myresult1=mystatement1.executeQuery();
                
                if(myresult1.next())
                {
                    do
                    {
                        jComboBox2.addItem(myresult1.getString("destination"));
                    }
                    while(myresult1.next());
                }
                generateflightid();
                  
                       
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    myconnection.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
    }                                    
               
            
          
            
            
            
    }//GEN-LAST:event_formInternalFrameActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
