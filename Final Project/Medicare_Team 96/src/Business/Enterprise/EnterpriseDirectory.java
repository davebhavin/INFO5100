/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList= new ArrayList<>();
        
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void removeEnterprise(Enterprise e){
        Enterprise result=null;
        if(!enterpriseList.isEmpty()){
            for(Enterprise en: enterpriseList){
                if(en.getID().equalsIgnoreCase(e.getID())){
                    result=en;
                }
            }
            enterpriseList.remove(result);
        }
        
    }
    
}
