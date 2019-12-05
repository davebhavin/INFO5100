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
import UI.SystemAdminWorkArea.SystemAdminMainJpanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author parth
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(Role.RoleType.SystemAdmin);
    }

    @Override
    public String toString() {
     return Role.RoleType.SystemAdmin.getValue();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public void createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, JFrame frame) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public JPanel createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Enterprise en, Organization organization) {
       return new SystemAdminMainJpanel(system,container,userAccount,en,organization);
    }
}
