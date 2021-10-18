/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markingsystem;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author adamc
 */
public class ResultGui extends javax.swing.JFrame {
    //declaration of ArrayLists
    ArrayList<Course> courses;
    ArrayList<Student> students;
    
    /**
     * Creates new form ResultGui
     */
    public ResultGui() {
        initComponents();
        //Creating ArrayLists and use of populate arraylist method 
        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
        populateArrayList();
         
        //Array created and increased when courses are added
        String [] coursesArray = new String[courses.size()];
        
        for (int i=0; i < courses.size(); i++){
        
            coursesArray[i] = courses.get(i).getName() + "";
            }
        
        rCB.setModel(new javax.swing.DefaultComboBoxModel<>(coursesArray));  
        
        String [] studArray = new String[students.size()];
        
        for (int i=0; i < students.size(); i++){
        
            studArray[i] = students.get(i).getName() + ", " + students.get(i).getSurname();
            }
        
        chooseCB.setModel(new javax.swing.DefaultComboBoxModel<>(studArray));  
        
        chooseCB.setSelectedIndex(0);
    }
    
    //saves courses to file stored in combo box
     public void saveCoursesToFile(){
        try{
            FileOutputStream file = new FileOutputStream("Courses.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
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
    
      //saves Students to file stored in combo box
      public void saveStudentsToFile(){
        try{
            FileOutputStream file = new FileOutputStream("Students.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for(int i = 0; i < students.size(); i++){
            outputFile.writeObject(students.get(i));
            }
            outputFile.close();
            
                JOptionPane.showMessageDialog(null, "Thank you your student result details have been saved");
                this.dispose();

        }
                catch(IOException e){
                JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }
      
         //saves Students to file stored in combo box allows them to be delted from the the arraylist 
        public void saveStudentsToFileDelete(){
        try{
            FileOutputStream file = new FileOutputStream("Students.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for(int i = 0; i < students.size(); i++){
            outputFile.writeObject(students.get(i));
            }
            outputFile.close();
            
            JOptionPane.showMessageDialog(null, "You have deleted this student successfully");
            this.dispose();

        }
            catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }
        
    //use of Populate Arraylist method creating helps read dat from file Courses.dat IO and try catch methods used 
    public void populateArrayList()
    {
             try
        {
            FileInputStream file = new FileInputStream("Courses.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            
            while(!endOfFile){
            
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
    
        try
        {
            FileInputStream file2 = new FileInputStream("Students.dat");
            ObjectInputStream inputFile2 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            
            while(!endOfFile){
            
            try
            {
                students.add((Student)inputFile2.readObject());
            }
            
            catch(EOFException e){
                     endOfFile = true;
                    }
            
            catch(Exception f)
                    {
                JOptionPane.showMessageDialog(null, f.getMessage());
                    }
            
            }
            inputFile2.close();
            
        }
            catch(IOException e)
         {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        csLBL = new javax.swing.JLabel();
        fnLBL = new javax.swing.JLabel();
        snLBL = new javax.swing.JLabel();
        resultLBL = new javax.swing.JLabel();
        clLBL = new javax.swing.JLabel();
        chooseCB = new javax.swing.JComboBox<>();
        rCB = new javax.swing.JComboBox<>();
        rfnTF = new javax.swing.JTextField();
        rsnTF = new javax.swing.JTextField();
        rrTF = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Please enter the correct credentials for these fields below");

        csLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        csLBL.setText("Choose student ");

        fnLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fnLBL.setText("First name ");

        snLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        snLBL.setText("Surname");

        resultLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resultLBL.setText("Result (%)");

        clLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clLBL.setText("Course name");

        chooseCB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chooseCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        chooseCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCBActionPerformed(evt);
            }
        });

        rCB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCBActionPerformed(evt);
            }
        });

        rrTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrTFActionPerformed(evt);
            }
        });

        saveBTN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(csLBL)
                                .addComponent(fnLBL, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(snLBL, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(resultLBL, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(clLBL))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rCB, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rfnTF)
                                .addComponent(chooseCB, 0, 100, Short.MAX_VALUE)
                                .addComponent(rsnTF)
                                .addComponent(rrTF))
                            .addComponent(deleteBTN)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(saveBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csLBL)
                    .addComponent(chooseCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rfnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rsnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rrTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fnLBL)
                        .addGap(18, 18, 18)
                        .addComponent(snLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clLBL)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBTN)
                            .addComponent(deleteBTN))
                        .addGap(40, 40, 40))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCBActionPerformed
        // TODO add your handling code here:
        
        //event handling
        int selectedIndex = chooseCB.getSelectedIndex();      
        rfnTF.setText(students.get(selectedIndex).getName());    
        rsnTF.setText(students.get(selectedIndex).getSurname());   
        rrTF.setText(students.get(selectedIndex).getResult()+"");

        Course course = students.get(selectedIndex).getCourse();
        int index = 0;
       
        //for loop for courses ArrayList
        for(int i=0; i < courses.size(); i++){
        
        if(courses.get(i).equals(course)){
        
            index = i;
            break;     
        }
            
    }
        rCB.setSelectedIndex(index);
    }//GEN-LAST:event_chooseCBActionPerformed

    private void rCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rCBActionPerformed

    private void rrTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rrTFActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
        
        //event handling if stament when user enters nothing and error message
         if (rfnTF.getText().isEmpty() || rsnTF.getText().isEmpty() || rrTF.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Please enter all fields");
        }
         //otherwise saves info to file
        else{
        
            int selectedIndex = chooseCB.getSelectedIndex();
            students.get(selectedIndex).setName(rfnTF.getText().trim());
            students.get(selectedIndex).setSurname(rsnTF.getText().trim());
            students.get(selectedIndex).setResult(Integer.parseInt(rrTF.getText().trim()));
            Course course = courses.get(rCB.getSelectedIndex());
            students.get(selectedIndex).setCourse(course);
            
            saveStudentsToFile();
            saveCoursesToFile();
            }
        
    }//GEN-LAST:event_saveBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
            // TODO add your handling code here:
            //event handling deletes student from file
            int selectedIndex = chooseCB.getSelectedIndex();           
            students.remove(selectedIndex);            
            saveStudentsToFileDelete();  
    }//GEN-LAST:event_deleteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ResultGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseCB;
    private javax.swing.JLabel clLBL;
    private javax.swing.JLabel csLBL;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel fnLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> rCB;
    private javax.swing.JLabel resultLBL;
    private javax.swing.JTextField rfnTF;
    private javax.swing.JTextField rrTF;
    private javax.swing.JTextField rsnTF;
    private javax.swing.JButton saveBTN;
    private javax.swing.JLabel snLBL;
    // End of variables declaration//GEN-END:variables
}
