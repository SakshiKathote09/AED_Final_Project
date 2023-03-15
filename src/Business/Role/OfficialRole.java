/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ChildSafetyDepartmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.OfficialRole.OfficialWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class OfficialRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new OfficialWorkAreaJPanel(userProcessContainer, account, (ChildSafetyDepartmentOrganization)organization, enterprise, business);
    }
    
    
}