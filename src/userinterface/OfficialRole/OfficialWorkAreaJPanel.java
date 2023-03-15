/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OfficialRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ChildSafetyDepartmentOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LegalDepartmentOrganization;
import Business.Organization.ManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InvestigationWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.MedicalReportJPanel;
import userinterface.DoctorRole.RequestLabTestJPanel;

/**
 *
 * 
 */
public class OfficialWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ChildSafetyDepartmentOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network NET;
    

    public OfficialWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ChildSafetyDepartmentOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        //valueLabel1.setText(enterprise.getName());
        lblusername.setText(userAccount.getUsername());
        this.system = system;
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((LabTestWorkRequest) request).getTestResult();
            if(request.getStatus()==null){
                row[3] = "Pending";
            }
            else{
            row[3] = request.getStatus().equals("Closed") ? "Available" : "Pending";
            row[4] = request.getAdd()==Boolean.TRUE?"Present":"Not Found";
            model.addRow(row);
            }
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

        btnReportChild = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnRequestMedical = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        btnMedicalReports = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(177, 201, 226));

        btnReportChild.setBackground(new java.awt.Color(255, 255, 255));
        btnReportChild.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReportChild.setText("Report Child");
        btnReportChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportChildActionPerformed(evt);
            }
        });

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child Name", "Investigator Assigned ", "Investigation Status", "Investigation Report", "Adoption Catalog"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnView.setText(" Investigation Report Summary");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnRequestMedical.setBackground(new java.awt.Color(255, 255, 255));
        btnRequestMedical.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRequestMedical.setText("Request Medical Examination");
        btnRequestMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMedicalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Welcome");

        lblusername.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblusername.setText("username");

        btnMedicalReports.setBackground(new java.awt.Color(255, 255, 255));
        btnMedicalReports.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMedicalReports.setText("click here");
        btnMedicalReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalReportsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText(" To Access Medical Examination Reports");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText(" To Add Selected Child to Child Adoption Catalogue");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("click here");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusername)
                .addGap(18, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReportChild, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(81, 81, 81)
                        .addComponent(btnRequestMedical)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(btnMedicalReports))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblusername))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportChild, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestMedical, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnMedicalReports))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportChildActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestInvestigationJPanel", new RequestInvestigationJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReportChildActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Closed"))
        {
        ReportSummary processWorkRequestJPanel = new ReportSummary(userProcessContainer, request);
        userProcessContainer.add("ReportSummary", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Report Summary not Available");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRequestMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMedicalActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        RequestMedicalExaminationJPanel processWorkRequestJPanel = new RequestMedicalExaminationJPanel(userProcessContainer, userAccount, enterprise, request, system);
        userProcessContainer.add("RequestMedicalExaminationJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnRequestMedicalActionPerformed

    private void btnMedicalReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalReportsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("MedicalReportsJPanel", new MedicalReportsJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMedicalReportsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getAdd()==Boolean.TRUE){
            JOptionPane.showMessageDialog(null, "Child Entry already exists in the Catalogue");
        }
        else{
        if(request.getStatus().equals("Report  Filed") || request.getStatus().equals("Open")){
            JOptionPane.showMessageDialog(null, "Investigation still Open. Need to receive Clearence from the Police Department before Adding");
        }
        else if(request.getMedicalReport()==null || request.getMedicalReport().isEmpty()){
            JOptionPane.showMessageDialog(null, "Failed to add entry. Child has not received Medical Clearence");
        }
        else if(request.getStatus().equals("Closed")){
            request.setAdd(Boolean.TRUE);
        Organization org = null;
        
        for(Network network: system.getNetworkList()){
            for(Enterprise ent:network.getEnterpriseDirectory().getEnterpriseList()){
                if(ent==enterprise){
                    NET=network;
                }
            }
        }
            for(Enterprise ent:NET.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
                   if (organization instanceof ManagementOrganization){
                    org = organization;
                    break;
            }
        }
            }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            system.getWorkQueue().getWorkRequestList().add(request);
        }
            JOptionPane.showMessageDialog(null, "Child entry created in the Catalogue");
            populateRequestTable();
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedicalReports;
    private javax.swing.JButton btnReportChild;
    private javax.swing.JButton btnRequestMedical;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}