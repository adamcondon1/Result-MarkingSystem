/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markingsystem;

/**
 *
 * @author adamc
 */
public class CalculatorGUI extends javax.swing.JFrame {
    //declaring variables
    double result;
    Percentage p;
    
    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI() {
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

        titleLBL = new javax.swing.JLabel();
        resultLBL = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        percentageBtn = new javax.swing.JButton();
        percentageTF = new javax.swing.JTextField();
        resultTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(255, 0, 51));
        titleLBL.setText("Result Calcultor");

        resultLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resultLBL.setText("Result");

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        percentageBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        percentageBtn.setText("Percentage of grade");
        percentageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addBtn)
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(percentageBtn)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLBL)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultLBL)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percentageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLBL)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultLBL))
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addGap(18, 18, 18)
                .addComponent(percentageBtn)
                .addGap(18, 18, 18)
                .addComponent(percentageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
    // TODO add your handling code here: 
    result = Double.parseDouble(resultTf.getText());
    p = new Percentage(result);   
    }//GEN-LAST:event_addBtnActionPerformed

    private void percentageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageBtnActionPerformed
    // TODO add your handling code here:  
    double result;
    p.computeResult();
    String i = Double.toString(result = p.getResult());
    percentageTF.setText(i);
    }//GEN-LAST:event_percentageBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton percentageBtn;
    private javax.swing.JTextField percentageTF;
    private javax.swing.JLabel resultLBL;
    private javax.swing.JTextField resultTf;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}