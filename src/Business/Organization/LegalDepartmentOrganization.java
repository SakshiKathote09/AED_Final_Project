/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LawyerRole;
import Business.Role.ManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class LegalDepartmentOrganization extends Organization{

    public LegalDepartmentOrganization() {
        super(Organization.Type.Legal.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LawyerRole());
        return roles;
    }
     
}