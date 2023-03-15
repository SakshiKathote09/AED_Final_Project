/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PoliceDepartmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.InvestigatorRole.InvestigatorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class InvestigatorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InvestigatorWorkAreaJPanel(userProcessContainer, account, (PoliceDepartmentOrganization)organization, enterprise);
    }
    
    
}