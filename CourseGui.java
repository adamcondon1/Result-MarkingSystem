/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markingsystem;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author adamc
 */
public class CourseGui extends javax.swing.JFrame {
    //Use of Array list and declared
    ArrayList<Course> courses;
    
    /**
     * Creates new form GuiApp
     */
    public CourseGui() {
        initComponents();
        //Creating new Array list
        courses = new ArrayList<Course>();
        populateArrayList();
    }

    //use of Populate Arraylist method creating helps read dat from file Courses.dat
    public void populateArrayList()
    {
    
        try
        {
            FileInputStream file = new FileInputStream("Courses.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            
            while(!endOfFile){
            
            //reading to a file with for loop
            try
            {
                courses.add((Course)inputFile.readObject());
            }
            
            catch(EOFException e){
                     endOfFile = true;
                    }
            
            catch(Exception f)
                    {
                     JOptionPane.showMessageDialog(null, f.getMessage());
                    }
            
            }
            inputFile.close();
            
        }
        catch(IOException e)
         {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //saving courses to a file
    public void saveCoursesToFile(){
        try{
            FileOutputStream file = new FileOutputStream("Courses.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            //writing to file with for loop implemented
            for(int i = 0; i < courses.size(); i++){
            outputFile.writeObject(courses.get(i));
            }
            outputFile.close();
            
                    JOptionPane.showMessageDialog(null, "Thank you your course has been saved");
                    this.dispose();

        }
        catch(IOException e){
                JOptionPane.showMessageDialog(null, e.getMessage());

        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLBL = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(255, 0, 51));
        titleLBL.setText("Add a new Course");

        nameLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameLBL.setText("Name of course ");

        saveBTN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(saveBTN)
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLBL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(nameLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLBL)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(saveBTN)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
        
        //event handling 
        if(nameTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All fields must be filled");
        }
        else{
            String name = nameTF.getText().trim();
            
            Course course = new Course(name);
            
            courses.add(course);
            
            saveCoursesToFile();   
        }
        
    }//GEN-LAST:event_saveBTNActionPerformed

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
            java.util.logging.Logger.getLogger(CourseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton saveBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
