/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
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
       return new SystemAdminWorkAreaJPanel(container,system);
    }
    
}
