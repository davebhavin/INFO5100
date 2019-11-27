/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author parth
 */
public abstract class Enterprise extends Organization {
    private OrganizationDirectory organizations;
    private static int counter=0;

    public Enterprise(String name) {
        super(name);
        this.organizations= new OrganizationDirectory();
        
    }

    public OrganizationDirectory getOrganizations() {
        return organizations;
    }
    
    public abstract String getID();
    

  
}
