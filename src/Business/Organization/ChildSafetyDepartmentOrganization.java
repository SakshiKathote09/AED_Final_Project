/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OfficialRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 *
 */
public class ChildSafetyDepartmentOrganization extends Organization{

    public ChildSafetyDepartmentOrganization() {
        super(Organization.Type.ChildSafetyDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OfficialRole());
        return roles;
    }
     
}