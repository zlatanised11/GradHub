/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.JobRole;

import Business.EcoSystem;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Gamer
 */
public class ProcessJobWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessJobWorkRequestJPanel
     */
    JPanel userProcessContainer;
    WorkRequest request;
    EcoSystem system;

    public ProcessJobWorkRequestJPanel(JPanel userProcessContainer, WorkRequest request, EcoSystem system) {
        initComponents();
        
        this.request = (JobWorkRequest) request;
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        
        txtJobRole.setText(((JobWorkRequest) request).getAreaOfInterest());
        txtCandidateName.setText(((JobWorkRequest) request).getCandidateName());

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
        jLabel2 = new javax.swing.JLabel();
        txtJobRole = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCandidateName = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 198, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Process Job Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel2.setText("Suggested Job Role :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        txtJobRole.setEditable(false);
        add(txtJobRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 340, -1));

        btnApprove.setBackground(new java.awt.Color(12, 36, 60));
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 100, 50));

        btnReject.setBackground(new java.awt.Color(12, 36, 60));
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 110, 50));

        jLabel3.setText("Comments :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));
        add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 340, -1));

        jLabel4.setText("Candidate Name :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, 20));

        txtCandidateName.setEditable(false);
        txtCandidateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCandidateNameActionPerformed(evt);
            }
        });
        add(txtCandidateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 340, -1));

        btnback.setBackground(new java.awt.Color(12, 36, 60));
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        request.setStatus("Approved");
        if (txtComment.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Add a comment");
            return;
        }
        JOptionPane.showMessageDialog(null, "Candidate: " + ((JobWorkRequest) request).getCandidateName() + " Approved. Status will be updated accordingly.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        btnApprove.setEnabled(false);
        btnReject.setEnabled(false);
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        request.setStatus("Rejected");
        JOptionPane.showMessageDialog(null, "Candidate: " + ((JobWorkRequest) request).getCandidateName() + " Rejected. Status will be updated accordingly.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        btnReject.setEnabled(false);
        btnApprove.setEnabled(false);
    }//GEN-LAST:event_btnRejectActionPerformed

    private void txtCandidateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCandidateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCandidateNameActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        JobWorkAreaJPanel dwjp = (JobWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCandidateName;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtJobRole;
    // End of variables declaration//GEN-END:variables
}
