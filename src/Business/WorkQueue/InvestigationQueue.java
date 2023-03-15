/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import java.util.ArrayList;

/**
 *
 * 
 */
public class InvestigationQueue {
    
    private ArrayList<WorkRequest> investigationRequestList;

    public InvestigationQueue() {
        investigationRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getInvestigationRequestList() {
        return investigationRequestList;
    }
}
