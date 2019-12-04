/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Pharmacy.Pharmacy;
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
    public Enterprise createAndAddEnterprise(String name,String address,String ContactNum,Department.departmenttype type){
        Enterprise enterprise=null;
        if(type==Department.departmenttype.Pharmacy){
            enterprise=new Pharmacy(name, address, ContactNum);
            enterpriseList.add(enterprise);
        }
        return enterprise;
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
