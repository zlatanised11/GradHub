/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Student.Student;
import Business.Student.StudentDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shreyas
 */
public class RegisterStudent extends javax.swing.JPanel {
    
    UserAccountDirectory user_Dir;
    StudentDirectory vet_Dir;
    
    /**
     * Creates new form RegisterStudent
     */
    private JPanel userProcessContainer;
    private Employee emp;
    private EcoSystem system;
    

    public RegisterStudent(JPanel userProcessContainer, EcoSystem system, StudentDirectory vet_Dir, UserAccountDirectory user_Dir) {
        initComponents();
        
        this.vet_Dir = vet_Dir;
        this.user_Dir = user_Dir;
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        

        String f = "img/ez_logo.png";
        
        ImageIcon ficon = new ImageIcon(f.toString());
        Image fimage = ficon.getImage();
        Image fimagescaling = fimage.getScaledInstance(300, 75, Image.SCALE_SMOOTH);
        ImageIcon scaled = new ImageIcon(fimagescaling);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtResAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtArmyType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEducationDetails = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 198, 103));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 220, -1));

        jLabel3.setText("Last Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 220, -1));

        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 60, 20));
        add(txtResAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 220, -1));

        jLabel5.setText("Undergrad Major");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 20));

        txtArmyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArmyTypeActionPerformed(evt);
            }
        });
        add(txtArmyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 220, -1));

        jLabel6.setText("Age");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, 20));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 220, -1));

        jLabel7.setText("Gender");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel8.setText("Education Details");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        txtEducationDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEducationDetailsActionPerformed(evt);
            }
        });
        add(txtEducationDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 220, -1));

        jButton1.setBackground(new java.awt.Color(12, 36, 60));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 160, 30));

        jLabel9.setText("Student ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 220, -1));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 220, -1));

        jLabel10.setText("User Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jLabel11.setText("Password");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Details");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 90, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setText("Credentials");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 100, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setText("Register a Student");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 250, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 220, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer not to Answer" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 220, -1));

        btnBack.setBackground(new java.awt.Color(12, 36, 60));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtEducationDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEducationDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEducationDetailsActionPerformed

    private void txtArmyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArmyTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArmyTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        char[] passwordCharArray = jPasswordField1.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        if (txtFirstName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " First Name can't be empty");
            return;
        }
        
        if (txtLastName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Last Name can't be empty");
            return;
        }
        
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " User Name can't be empty");
            return;
        }
        
        if (password.equals("")) {
            JOptionPane.showMessageDialog(null, " Password can't be empty");
            return;
        }
        
        try {
            if (!txtAge.getText().equals("")) {
                Integer.parseInt(txtAge.getText());
            }
        } 
        
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Age cannot be String");
            return;
        }

       

        Student v = system.getVd().addStudent();
        
        system.getUad().createUserAccount(txtUsername.getText(), password);
        v.setFirstName(txtFirstName.getText());
        v.setLastName(txtLastName.getText());
        v.setAge(txtAge.getText());
        v.setArmyType(txtArmyType.getText());
        v.setStudent_ID(txtEducationDetails.getText());
        v.setGender((String) jComboBox1.getSelectedItem());
        v.setResidentAddress(txtResAddress.getText());
        v.setArmyType(txtArmyType.getText());
        v.setStudent_ID(txtStudentID.getText());
        v.setUsername(txtUsername.getText());
        v.setPassword(password);
        System.out.println("Registered Student succesfully");
        
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtArmyType.setText("");

        txtEducationDetails.setText("");
        txtArmyType.setText("");
        txtResAddress.setText("");
        txtStudentID.setText("");
        txtUsername.setText("");
        jPasswordField1.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtArmyType;
    private javax.swing.JTextField txtEducationDetails;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtResAddress;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
