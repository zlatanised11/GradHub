/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.MentalHealthCareOrganzition;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Student.StudentDirectory;
import Business.WorkQueue.MentalHealthCareRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author sahitinallamolu
 */
public class Request_MHC_JPanel extends javax.swing.JPanel {
  private JPanel userProcessContainer;
    private Enterprise enterprise;
    private StudentDirectory vd;
    private EcoSystem system;
    private UserAccount userAccount;
    
    private String injuries[] ={};
    
    private String[] healthconditions ={"Fever","acne","Body Ache","Cough"};
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    private DB4OUtil dB4OUtil;
    /**
     * Creates new form Request_MHC_JPanel
     */
     public Request_MHC_JPanel(JPanel userProcessContainer, UserAccount userAccount, StudentDirectory vd, EcoSystem system) {
         
        initComponents();
        
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.vd = vd;
        
        this.system = system;
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
        txt_MedicalHistory = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_brainInjury = new javax.swing.JComboBox<String>();
        c_MentalSymptons = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mood = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        c_before_MHC = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txt_mainConcern = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 198, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("List any medication that you are on:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 280, 20));
        add(txt_MedicalHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 152, -1));

        requestTestJButton.setBackground(new java.awt.Color(12, 36, 60));
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Mental Healthcare");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 290, 40));

        backJButton.setBackground(new java.awt.Color(12, 36, 60));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        jLabel2.setText("Did you have brain injury previously?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 20));

        jLabel3.setText("Do you think you have any of listed Symptoms:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 186, -1, 30));

        c_brainInjury.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Yes", "No" }));
        add(c_brainInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 150, -1));

        c_MentalSymptons.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "None", "Depression", "Post traumatic stress disorder", "Anxiety", "Obsessive compulsive disorder", "Bipolar disorder", "Sleep disorder" }));
        add(c_MentalSymptons, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 150, -1));

        jLabel4.setText("Describe your Mood:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, -1));

        txt_mood.setColumns(20);
        txt_mood.setRows(5);
        jScrollPane1.setViewportView(txt_mood);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 290, 80));

        jLabel5.setText("Have you availed Mental Health Services before:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        c_before_MHC.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Yes", "No" }));
        add(c_before_MHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 150, -1));

        jLabel6.setText("Enter any additional information that you feel ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 400, 20));

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane2.setViewportView(txtDetails);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 300, 170));

        jLabel7.setText("State your concern ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));
        add(txt_mainConcern, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 155, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText(" Mental Healthcare Request");
        jLabel8.setFocusable(false);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel9.setText("is necessary to aid your diagnosis");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

       
String message = " Hello Doctor,"
                         + "Please consider the following patient with details has requested for MHC: \n "
                         + userAccount.getUsername()+ " with description:"+ txt_mainConcern.getText()+ "  \n"
                         + " Main concern: "+  txt_mainConcern.getText() + "  \n"+ 
                          " Detailed concern: " + String.valueOf(txtDetails.getText());


String concern=txt_mainConcern.getText();
        MentalHealthCareRequest request = new MentalHealthCareRequest();
        request.setMessage(concern);
        request.setSender(userAccount);
        request.setStatus("Sent");
        
        
        ///////////////////////////////////////////////
        request.setBrain_injury(String.valueOf(c_brainInjury.getSelectedItem()));
        request.setMental_diagnoze_before(String.valueOf(c_before_MHC));
        request.setMain_Concern(txt_mainConcern.getText());
        request.setDetails_concern(String.valueOf(txtDetails.getText()));
        request.setMental_symptons(String.valueOf(c_MentalSymptons.getSelectedItem()));
        request.setMood(txt_mood.getText());
        request.setMedicalHistory_mental(txt_MedicalHistory.getText());
          
        Organization org = null;
        
        
        

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof MentalHealthCareOrganzition) {
                        org = organization;
                        break;
                    }

                }
            }
        }
        
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Request to Org ");
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Request to UserAccount ");
            
            
             String to ="sahitinallamolu@gmail.com";
                String subject = "Request from student for MHC : with following details : " + String.valueOf(c_MentalSymptons.getSelectedItem()) +"  and concern : "+  txt_mainConcern.getText();
                String user = "sahitinallamolu@gmail.com";
                String pass = "sahiti22";
                 
                 
            //            dB4OUtil.storeSystem(system);
            //            System.out.println("Stored Inside System");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        
        
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        
        StudentWorkAreaJPanel dwjp = (StudentWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> c_MentalSymptons;
    private javax.swing.JComboBox<String> c_before_MHC;
    private javax.swing.JComboBox<String> c_brainInjury;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txt_MedicalHistory;
    private javax.swing.JTextField txt_mainConcern;
    private javax.swing.JTextArea txt_mood;
    // End of variables declaration//GEN-END:variables
}
