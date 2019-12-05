/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
    this.organizationList= new ArrayList<>();
}

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
   
         public Organization getTypicalOrganization(Organization.Type type) {
        if (type.equals(Organization.Type.Delivery)) {
            for (Organization or:this.organizationList) {
                if (or.getName().equalsIgnoreCase(Organization.Type.Delivery.getValue())) {
                    return or;
                }
            }
        }
        if (type.equals(Organization.Type.Pharmacy)) {
            for (Organization or:this.organizationList) {
                if (or.getName().equalsIgnoreCase(Organization.Type.Pharmacy.getValue())) {
                    return or;
                }
            }
        }
        return null;
    }  
    
}
