/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Work;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class WorkQueue {
 private ArrayList<WorkRequest> workRequestList;
 
 public WorkQueue(){
    workRequestList=new ArrayList<>();
}

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
 
       public OrderRequest getOderById(String id) {
        for (WorkRequest wr:this.workRequestList) {
            OrderRequest or = (OrderRequest)wr;
            if(or.getId().equals(id)) {
                return or;
            }
        }
        return null;
    }  
}