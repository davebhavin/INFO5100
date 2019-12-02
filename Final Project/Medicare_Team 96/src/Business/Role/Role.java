/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author parth
 */
public abstract class Role {
        
   private RoleType type;
   
   public enum RoleType{
       Manager("Manager"),
       Patient("Patient"),
       Lab("Lab"),
       Doctor("Doctor"),
       DeliveryMan("Delivery Man"),
       SystemAdmin("Ssystem Admin");
   
   private String value;
   private RoleType(String value){
       this.value=value;
       
   }
    public String getValue() {
        return value;
    }
   }
   public Role(RoleType type){
       this.type=type;
   }

    public RoleType getRoleType() {
        return this.type;
    }

    
    @Override
    public abstract String toString();
    
<<<<<<< HEAD
        public abstract JPanel createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en,Organization organization);
=======
        public abstract JPanel createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, Organization organization);
>>>>>>> 94a8aefa4a8a0c77d17bdc83371cb673492b7afa

  
       

    
}
