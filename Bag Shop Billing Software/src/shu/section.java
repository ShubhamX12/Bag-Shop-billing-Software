/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shu;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Shubham
 */
public class section extends javax.swing.JFrame {

    /**
     * Creates new form section
     */
    public section() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        employeesection = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 255, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shu/img/addproduct2.jpg"))); // NOI18N
        jButton5.setText(" ");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 140, 126));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shu/images/sla.jpg"))); // NOI18N
        jButton3.setText(" ");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 430, 180));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 255, 102));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shu/images/pa2.jpg"))); // NOI18N
        jButton9.setText(" ");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 153, 104));

        jLabel3.setBackground(new java.awt.Color(204, 255, 102));
        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 0));
        jLabel3.setText("Employee section");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        employeesection.setBackground(new java.awt.Color(204, 255, 102));
        employeesection.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        employeesection.setForeground(new java.awt.Color(153, 255, 0));
        employeesection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shu/img/employee.jpg"))); // NOI18N
        employeesection.setText(" ");
        employeesection.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        employeesection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesectionActionPerformed(evt);
            }
        });
        jPanel1.add(employeesection, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 140, 126));

        customer.setBackground(new java.awt.Color(204, 255, 102));
        customer.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        customer.setForeground(new java.awt.Color(153, 255, 0));
        customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shu/img/customer.jpg"))); // NOI18N
        customer.setText(" ");
        customer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        jPanel1.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 140, 126));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 102));
        jLabel5.setText("customer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 68, 24));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 102));
        jLabel1.setText("product");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 102));
        jLabel2.setText("Product Billing");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shu/i/back20button.png"))); // NOI18N
        jButton4.setText(" ");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       this.dispose();
        new stocksection().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void employeesectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesectionActionPerformed
       this.dispose();
       new  main1().setVisible(true);
    }//GEN-LAST:event_employeesectionActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
         // TODO add your handling code here:
      this.dispose();
        new main11().setVisible(true);
    }//GEN-LAST:event_customerActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new productbill().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     this.dispose();
        new newuser().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
                new section().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customer;
    private javax.swing.JButton employeesection;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
