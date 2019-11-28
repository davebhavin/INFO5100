/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Pharmacy.Pharmacy;
import Business.Enterprise.Delivery.DeliveryCompany;
import Business.Enterprise.Doctor.Doctor;
import Business.Enterprise.Lab.Lab;

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
        if (type.equalsIgnoreCase("Delivery Company")) {
            DeliveryCompany d = new DeliveryCompany(name, address, contactNum);
            d.setDescription(description);
            d.createOrganizations();
            return d;
        }
        if (type.equalsIgnoreCase("Lab")) {
            Lab l = new Lab(name, address, contactNum);
            l.setDescription(description);
            l.createOrganizations();
            return l;
        }
        if(type.equalsIgnoreCase("Doctor")){
            Doctor d=new Doctor(name,address,contactNum);
            d.setDescription(description);
            d.createOrganizations();
            return d;
        }
    return null;
}
}
