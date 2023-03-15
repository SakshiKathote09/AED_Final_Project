/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * 
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ChildSafetyDepartment.getValue())){
            organization = new ChildSafetyDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PoliceDepartment.getValue())){
            organization = new PoliceDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Legal.getValue())){
            organization = new LegalDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Management.getValue())){
            organization = new ManagementOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.BankManager.getValue())){
            organization = new BankManagerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}