/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Shubham
 */
public class addproduct extends javax.swing.JFrame {

    /**
     * Creates new form addproduct
     */
    public addproduct() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("             Add  product");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 0, 250, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("  BrandName");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 101, 96, 46));

        t1.setText(" ");
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 102, 400, 44));

        t2.setText(" ");
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 165, 400, 43));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("  Item Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 194, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("add product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 310, 230, 60));

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(102, 0, 102));
        price.setText("price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 245, 58, -1));

        t3.setText(" ");
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 222, 400, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 153));
        jLabel4.setText("Product_id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 67, -1, 28));

        t4.setText(" ");
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 51, 400, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1001, 517));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            PreparedStatement ps=co.prepareStatement("insert into addproduct values(?,?,?,?)");
           
            ps.setInt(1,Integer.parseInt(t4.getText()));
            ps.setString(2,t1.getText());
            ps.setString(3,t2.getText());
            ps.setInt(4,Integer.parseInt(t3.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"product add succesfully");
         }catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new addproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel price;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
