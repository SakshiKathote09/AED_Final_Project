/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.InvestigationQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 *
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private InvestigationQueue investigationQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        ChildSafetyDepartment("Child Safety Department"),
        PoliceDepartment("Police Department"),
        Legal("Legal Department"),
        Management("Management"),
        BankManager("Bank Manager");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        investigationQueue = new InvestigationQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public InvestigationQueue getInvestigationQueue() {
        return investigationQueue;
    }

    public void setInvestigationQueue(InvestigationQueue investigationQueue) {
        this.investigationQueue = investigationQueue;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
