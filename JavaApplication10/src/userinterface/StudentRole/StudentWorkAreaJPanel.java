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
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PermHousingOrganization;
import Business.Organization.StudentOrganization;
import Business.UserAccount.UserAccount;
import Business.Student.StudentDirectory;
import Business.WorkQueue.GradSchoolRequest;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.MentalHealthCareRequest;
import Business.WorkQueue.PermHousingRequest;
import Business.WorkQueue.PhysicalHealthCareRequest;
import Business.WorkQueue.TempHousingRequest;
import Business.WorkQueue.PartTimeRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import static java.time.Clock.system;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.RequestLabTestJPanel;

/**
 *
 * @author sahitinallamolu
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StudentOrganization organization;
    private Enterprise enterprise;
     private EcoSystem system;
    private StudentDirectory vd;
    private UserAccount userAccount;
   
    
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form StudentWorkAreaJPanel
     */
    public StudentWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, StudentOrganization organization, Enterprise enterprise, StudentDirectory vd) {
        initComponents();
        
        

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        
        populateRequestTable();

    }

    public StudentWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, StudentDirectory vd, EcoSystem system) {

        initComponents();
        
        
        this.userProcessContainer = userProcessContainer;
        this.vd = vd;
        this.userAccount = userAccount;
        this.system = system;

//        system = dB4OUtil.retrieveSystem();
        populateRequestTable();
//        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        permhousingrequestjButton = new javax.swing.JButton();
        VocationalRequestJButton = new javax.swing.JButton();
        GradRequestJButton = new javax.swing.JButton();
        PhysicalHealthCareRequestJButton = new javax.swing.JButton();
        MentalHealthCareJButton = new javax.swing.JButton();
        hospPic = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eduPic = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        homePic = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        permhousingrequestjButton1 = new javax.swing.JButton();
        txtTotalRequests1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        eduRequestsTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 198, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshTestJButton.setBackground(new java.awt.Color(12, 36, 60));
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 103, 100, 40));

        permhousingrequestjButton.setBackground(new java.awt.Color(12, 36, 60));
        permhousingrequestjButton.setForeground(new java.awt.Color(255, 255, 255));
        permhousingrequestjButton.setText("Perm Housing Request");
        permhousingrequestjButton.setPreferredSize(new java.awt.Dimension(152, 32));
        permhousingrequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permhousingrequestjButtonActionPerformed(evt);
            }
        });
        add(permhousingrequestjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 200, -1));

        VocationalRequestJButton.setBackground(new java.awt.Color(12, 36, 60));
        VocationalRequestJButton.setForeground(new java.awt.Color(255, 255, 255));
        VocationalRequestJButton.setText("Part-Time Job");
        VocationalRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VocationalRequestJButtonActionPerformed(evt);
            }
        });
        add(VocationalRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 200, 30));

        GradRequestJButton.setBackground(new java.awt.Color(12, 36, 60));
        GradRequestJButton.setForeground(new java.awt.Color(255, 255, 255));
        GradRequestJButton.setText("Apply for Grad School");
        GradRequestJButton.setPreferredSize(new java.awt.Dimension(152, 32));
        GradRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradRequestJButtonActionPerformed(evt);
            }
        });
        add(GradRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 200, -1));

        PhysicalHealthCareRequestJButton.setBackground(new java.awt.Color(12, 36, 60));
        PhysicalHealthCareRequestJButton.setForeground(new java.awt.Color(255, 255, 255));
        PhysicalHealthCareRequestJButton.setText("Physical Healthcare Request");
        PhysicalHealthCareRequestJButton.setPreferredSize(new java.awt.Dimension(152, 32));
        PhysicalHealthCareRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhysicalHealthCareRequestJButtonActionPerformed(evt);
            }
        });
        add(PhysicalHealthCareRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));

        MentalHealthCareJButton.setBackground(new java.awt.Color(12, 36, 60));
        MentalHealthCareJButton.setForeground(new java.awt.Color(255, 255, 255));
        MentalHealthCareJButton.setText("Mental Healthcare Request");
        MentalHealthCareJButton.setPreferredSize(new java.awt.Dimension(152, 32));
        MentalHealthCareJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MentalHealthCareJButtonActionPerformed(evt);
            }
        });
        add(MentalHealthCareJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, -1));
        add(hospPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 80, 70));

        txtWelcome.setBackground(new java.awt.Color(42, 42, 42));
        txtWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add(txtWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Get Medical Help");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 300, -1));
        add(eduPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 80, 70));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Total Requests Raised");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 300, -1));
        add(homePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 70));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Apply for Housing");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 300, -1));

        permhousingrequestjButton1.setBackground(new java.awt.Color(12, 36, 60));
        permhousingrequestjButton1.setForeground(new java.awt.Color(255, 255, 255));
        permhousingrequestjButton1.setText("Temp Housing Request");
        permhousingrequestjButton1.setPreferredSize(new java.awt.Dimension(152, 32));
        permhousingrequestjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permhousingrequestjButton1ActionPerformed(evt);
            }
        });
        add(permhousingrequestjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 200, -1));

        txtTotalRequests1.setBackground(new java.awt.Color(51, 51, 51));
        txtTotalRequests1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTotalRequests1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setFocusable(false);
        txtTotalRequests1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTotalRequests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 110, 70));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Apply for Education");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 300, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 158, 492, -1));

        eduRequestsTable.setBackground(new java.awt.Color(12, 36, 60));
        eduRequestsTable.setForeground(new java.awt.Color(255, 255, 255));
        eduRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestType", "AssignedTo", "Status", "RequestedOn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(eduRequestsTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 510, 210));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("My Requests");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();


    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void permhousingrequestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permhousingrequestjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestPermHousingJPanel", new RequestPermHousingJPanel(userProcessContainer, userAccount, vd, system));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_permhousingrequestjButtonActionPerformed

    private void VocationalRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VocationalRequestJButtonActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestVocTrainingJPanel", new RequestPartTimeJPanel(userProcessContainer, userAccount, vd, system));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_VocationalRequestJButtonActionPerformed

    private void GradRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradRequestJButtonActionPerformed
        // TODO add your handling code here

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestGradJPanel", new RequestGradJPanel(userProcessContainer, userAccount, vd, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_GradRequestJButtonActionPerformed

    private void PhysicalHealthCareRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhysicalHealthCareRequestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("Request_PHC_JPanel", new Request_PHC_JPanel(userProcessContainer, userAccount, vd, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PhysicalHealthCareRequestJButtonActionPerformed

    private void MentalHealthCareJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MentalHealthCareJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("Request_MHC_JPanel", new Request_MHC_JPanel(userProcessContainer, userAccount, vd, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_MentalHealthCareJButtonActionPerformed

    private void permhousingrequestjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permhousingrequestjButton1ActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestTempHousingJPanel", new RequestTempHousingJPanel(userProcessContainer, userAccount, vd, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_permhousingrequestjButton1ActionPerformed

    public void populateRequestTable() {

        String f = "img/ez_logo.png";
        ImageIcon ficon = new ImageIcon(f.toString());
        Image fimage = ficon.getImage();
        Image fimagescaling = fimage.getScaledInstance(300, 75, Image.SCALE_SMOOTH);
        ImageIcon scaled = new ImageIcon(fimagescaling);

        f = "img/edu.png";
        ficon = new ImageIcon(f.toString());
        fimage = ficon.getImage();
        fimagescaling = fimage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        scaled = new ImageIcon(fimagescaling);
        hospPic.setIcon(scaled);

        f = "img/home.png";
        ficon = new ImageIcon(f.toString());
        fimage = ficon.getImage();
        fimagescaling = fimage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        scaled = new ImageIcon(fimagescaling);
        eduPic.setIcon(scaled);

        f = "img/med.png";
        ficon = new ImageIcon(f.toString());
        fimage = ficon.getImage();
        fimagescaling = fimage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        scaled = new ImageIcon(fimagescaling);
        homePic.setIcon(scaled);

        txtWelcome.setText("Welcome back, " + userAccount.getUsername());


        DefaultTableModel eduModel = (DefaultTableModel) eduRequestsTable.getModel();
         eduModel.setRowCount(0);
        int totalRequests = 0;
        int acceptedRequests = 0;
        int rejectedRequests = 0;



        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            totalRequests = totalRequests + 1;

            if (request instanceof PartTimeRequest) {
                Object[] row = new Object[4];
                row[0] = "VocationalTraining";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();

                row[3] = request.getRequestDate();

                eduModel.addRow(row);
            }

            if (request instanceof GradSchoolRequest) {
                Object[] row = new Object[4];
                row[0] = "Grad School";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();

                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            if (request instanceof PhysicalHealthCareRequest) {
                Object[] row = new Object[4];
                row[0] = "Physical Healthcare";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            if (request instanceof MentalHealthCareRequest) {
                Object[] row = new Object[4];
                row[0] = "Mental Healthcare";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            if (request instanceof TempHousingRequest) {
                Object[] row = new Object[4];
                row[0] = "Temp Housing";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            if (request instanceof PermHousingRequest) {
                Object[] row = new Object[4];
                row[0] = "Permanent Housing";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            
            
            if (request instanceof JobWorkRequest) {
                Object[] row = new Object[4];
                row[0] = "Employment Request";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

        }

        txtTotalRequests1.setText(Integer.toString(totalRequests));
    

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GradRequestJButton;
    private javax.swing.JButton MentalHealthCareJButton;
    private javax.swing.JButton PhysicalHealthCareRequestJButton;
    private javax.swing.JButton VocationalRequestJButton;
    private javax.swing.JLabel eduPic;
    private javax.swing.JTable eduRequestsTable;
    private javax.swing.JLabel homePic;
    private javax.swing.JLabel hospPic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton permhousingrequestjButton;
    private javax.swing.JButton permhousingrequestjButton1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel txtTotalRequests1;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
