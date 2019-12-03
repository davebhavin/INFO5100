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
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author parth
 */
public abstract class Role {
        
   private RoleType type;

    public Component createWorkArea(JPanel LeftPanel, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, Network inNetwork, EcoSystem system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
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
    
        public abstract void createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, JFrame frame);

  
       

    
}
