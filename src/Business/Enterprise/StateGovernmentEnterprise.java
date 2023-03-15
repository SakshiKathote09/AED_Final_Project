/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class StateGovernmentEnterprise extends Enterprise {
    
    public StateGovernmentEnterprise(String name){
        super(name,Enterprise.EnterpriseType.StateGovernment);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}