/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Pharmacy.Pharmacy;


/**
 *
 * @author parth
 */
public class EnterpriseType {
    public static Enterprise createEnterprise(String name, String address, String contactNum,String description, String type){
        if(type.equalsIgnoreCase("Pharmacy")){
            Pharmacy p= new Pharmacy(name, address, contactNum);
            p.setDescription(description);
            p.createOrganizations();
            return p;
           
    }
    return null;
}
}
