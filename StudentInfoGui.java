/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markingsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author adamc
 */
public class StudentInfoGui extends javax.swing.JFrame {
    //decalre ArrayList
    private ArrayList <NCI> aList;
   // private ArrayList <NCIStudent> sList;
   //declare vars
    private String snum,address,pps;
    private int count;
    
    /**
     * Creates new form StudentInfoGui
     */
    public StudentInfoGui() {
        initComponents();
        //create ArrayList
        aList = new ArrayList<>();
      
        //creating vars new strings
        snum = new String();
        address = new String();
        pps = new String();
        count = 0;


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLBL = new javax.swing.JLabel();
        addressLBL = new javax.swing.JLabel();
        ppsLBL = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        ppsTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        dsiplayBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        snumTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(255, 0, 51));
        titleLBL.setText("Student Personal Information");

        addressLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addressLBL.setText("Address");

        ppsLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ppsLBL.setText("PPS ");

        addBTN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        dsiplayBTN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dsiplayBTN.setText("Display");
        dsiplayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsiplayBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Student Number");

        snumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snumTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(titleLBL))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(addBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(84, 84, 84)
                                .addComponent(dsiplayBTN))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressLBL)
                                    .addComponent(ppsLBL)
                                    .addComponent(jLabel1))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addressTF, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(ppsTF)
                                    .addComponent(snumTF))))
                        .addGap(22, 22, 22)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLBL)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLBL)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppsLBL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dsiplayBTN))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        
        //getting text from textfield event handling and creating new Constructor then adding it to arrayList
        address =(addressTF.getText());
        pps = (ppsTF.getText());
        snum = (snumTF.getText());
        
        
        NCI n = new NCI();
        n.setSnum(snum);
        n.setAddress(address);
        n.setPps(pps);
         
        aList.add(n);
        
        count++;
        
    }//GEN-LAST:event_addBTNActionPerformed

    private void dsiplayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsiplayBTNActionPerformed
        // TODO add your handling code here:
        
        //event handling using a for loop to print the text we get from the textfields 
        for(int i = 0; i < aList.size(); i++){
        
            JOptionPane.showMessageDialog(null,"Student Number: "+aList.get(i).getSnum()+"\n PPS: "+aList.get(i).getPps()+"\n Address: "+aList.get(i).getAddress());            
        }
             
    }//GEN-LAST:event_dsiplayBTNActionPerformed

    private void snumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snumTFActionPerformed

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
            java.util.logging.Logger.getLogger(StudentInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfoGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel addressLBL;
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton dsiplayBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ppsLBL;
    private javax.swing.JTextField ppsTF;
    private javax.swing.JTextField snumTF;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
