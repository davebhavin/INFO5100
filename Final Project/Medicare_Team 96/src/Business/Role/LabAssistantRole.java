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
import UserInterface.DeliveryCompany.DeliveryManJPanel;
import UserInterface.Lab.LabAssistantJPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author parth
 */
public class LabAssistantRole extends Role{

    public LabAssistantRole() {
        super(Role.RoleType.Lab);
    }

    @Override
    public String toString() {
        return Role.RoleType.Lab.getValue();
    }


    @Override
    public JPanel createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, Organization organization) {
        return new LabAssistantJPanel(system,container,en,userAccount);
    }
    
    
}
