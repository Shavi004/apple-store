
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shavionanayakkara
 */
public class Log_Cashier extends javax.swing.JFrame {

    /**
     * Creates new form Log_Cashier
     */
    public Log_Cashier() {
        initComponents();
    }
    public static String name_reg;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jexit = new javax.swing.JButton();
        jlogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cashier Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 122, -1, -1));

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, 40));

        jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 102, 40));

        uname.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 150, 30));

        pass.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 150, 30));

        jCheckBox1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jexit.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jexit.setText("Reset");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        getContentPane().add(jexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 80, 30));

        jlogin.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jlogin.setText("Login");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });
        getContentPane().add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 100, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/shavionanayakkara/Downloads/Password-Policy-Best-Practices-2021.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            pass.setEchoChar((char)0);
        }
        else
        {
            pass.setEchoChar('*');
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // TODO add your handling code here:
        uname.setText("");
        pass.setText("");
    }//GEN-LAST:event_jexitActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
        // TODO add your handling code here:
        
        

//        if(uname.getText().equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill out username");
//        }
//        else if(pw.getText().equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill out password ");
//        }
//        else if(uname.getText().contains("user123")&& pw.getText().contains("pass123")){
//            JOptionPane.showMessageDialog(null,"Login successfull");
//            Cashier p1=new Cashier();
//            p1.setVisible(true);
//            this.dispose();
//
//        }
//        else{
//            JOptionPane.showMessageDialog(null,"invalid useranme and password","MESSAGE",JOptionPane.ERROR_MESSAGE);
//        }
boolean valid=true;
       if(uname.getText().isEmpty() ||pass.getText().isEmpty() )
       {
           JOptionPane.showMessageDialog(null,"Field can't be blank","Login form",JOptionPane.ERROR_MESSAGE);
           valid=false;
       }
       else
       {
           if(pass.getText().length()<5)
           {
            JOptionPane.showMessageDialog(null,"password must have 8 characters","Login form",JOptionPane.ERROR_MESSAGE);
            valid=false;
           }
       }
       if(valid)
       {
         String username=uname.getText();   
         String password=pass.getText();
         
         
         name_reg = username;
         
         Register user = new Register(username,password);
          
       if(user.validateLogin())
           
       {
           
           
          
            if(username.equals(username)){
                
                
           JOptionPane.showMessageDialog(null,"Cashier logged successfully ","Login",JOptionPane.INFORMATION_MESSAGE);
           new Cashier().setVisible(true);
           this.setVisible(false); 
           this.dispose();  
            }
           
           
       }
         
         
           else
           {
                JOptionPane.showMessageDialog(null,"Invalid username and password", "Warning!!", JOptionPane.ERROR_MESSAGE);
           }
        
       
       
       }
    
    }//GEN-LAST:event_jloginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Log_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jlogin;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
