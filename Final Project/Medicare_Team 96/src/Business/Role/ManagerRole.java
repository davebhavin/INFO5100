/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Delivery.DeliveryCompany;
import static Business.Enterprise.Department.departmenttype.Pharmacy;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Pharmacy.Pharmacy;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DeliveryCompany.DeliveryCompanyManagerJPanel;
import UserInterface.Pharmacy.Medicines.MedicinesManagerJpanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author parth
 */
public class ManagerRole extends Role{
    public ManagerRole(){
        super(Role.RoleType.Manager);
    }
  @Override
    public String toString() {
        return Role.RoleType.Manager.getValue();
    }   

//    @Override
//    public void createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, JFrame frame) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public JPanel createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, Organization organization) {
 if (en instanceof Pharmacy){
        return new MedicinesManagerJpanel(container,en);
 }
 if(en instanceof  DeliveryCompany){
     return new DeliveryCompanyManagerJPanel(container,en);
 }
        return null;
       
    }

}
