/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shu;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Shubham
 */
public class userlogin extends javax.swing.JFrame {
Object[]row=new Object[6];

DefaultTableModel model;
    /**
     * Creates new form userlogin
     */
    public userlogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t6 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTable();
        t2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(51, 0, 51)));
        jPanel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("UserName");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 83, -1, 36));

        t1.setText(" ");
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 88, 127, 29));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 92, 82, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 140, -1, -1));

        t3.setText(" ");
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 138, 127, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("role");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 140, 70, -1));

        t4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"user","admin"}));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 138, 188, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 198, -1, -1));

        t5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active","passive" }));
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 196, 115, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 234, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 234, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 198, -1, -1));

        t6.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 196, 188, -1));

        model=new DefaultTableModel();
        Object []columns={"username","password","name","role","staus","date"};
        model.setColumnIdentifiers(columns);
        ta2.setModel(model);
        /*
    });
    */

    ta2.setBackground(new java.awt.Color(153, 255, 102));
    //ta2.setForeground(new java.awt.Color(153, 255, 102));
    jScrollPane3.setViewportView(ta2);

    jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 677, 150));
    jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 84, 188, 36));

    jLabel7.setText("                       Registration");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 220, 35));

    jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shubham\\Pictures\\shu\\w1.jpg")); // NOI18N
    jLabel8.setText("jLabel8");
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 410));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 827, 428));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{ 
        row[0]=t1.getText();
         row[1]=t2.getPassword();
         row[2]=t3.getText();
        row[3]=t4.getSelectedItem();
        row[4]=t5.getSelectedItem();
        row[5]=t6.getDate();
        
        
         model.addRow(row);
         
      
        Class.forName("com.mysql.jdbc.Driver");
        Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
        PreparedStatement ps=co.prepareStatement("insert into user values(?,?,?,?,?,?)");
        
        ps.setString(1, t1.getText());
        ps.setString(2,new String(t2.getPassword()));
        ps.setString(3,t3.getText());
        ps.setString(4, (String) t4.getSelectedItem());
        ps.setString(5, (String) t5.getSelectedItem());
     
     SimpleDateFormat sdf=new simpleDateFormat("yyyy-mm-dd");
        
        String date;
            date = sdf.format(t6.getDate());
            
            
       
        ps.setString(6,date);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"insert succesfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        //t6.set;
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
                UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
                //</editor-fold>
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JComboBox<String> t4;
    private javax.swing.JComboBox<String> t5;
    private com.toedter.calendar.JDateChooser t6;
    private javax.swing.JTable ta2;
    // End of variables declaration//GEN-END:variables
}
