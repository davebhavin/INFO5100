/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Role.Role.RoleType;

/**
 *
 * @author parth
 */
public class RoleDirectory {
    public static Role createRole(RoleType type){
        if(type.equals(RoleType.Manager)){
            return new ManagerRole();
        }
        if(type.equals(RoleType.DeliveryMan)){
            return new DeliveryManRole();
        }
        if(type.equals(RoleType.Patient)){
            return new PatientRole();
        }
        if(type.equals(RoleType.SystemAdmin)){
            return new SystemAdminRole();
        }
        return null;
    }

    
}
