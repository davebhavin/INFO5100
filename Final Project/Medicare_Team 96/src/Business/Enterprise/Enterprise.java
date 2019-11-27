/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.EmployeeAccount;
import Business.UserAccount.UserAccount;

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
    
    public void removeEmployeeAccount(UserAccount account) {
        EmployeeAccount ac = (EmployeeAccount) account;
        Employee em = ac.getEmployee();

        UserAccount ac1 = null;
        for (UserAccount ua : this.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getUserName().equalsIgnoreCase(account.getUserName())) {
                ac1 = ua;
            }
        }
        if (ac1 != null) {
            this.getUserAccountDirectory().getUserAccountList().remove(ac1);
            return;
        }
        for (Organization or : organizations.getOrganizationList()) {
            for (UserAccount ua : or.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUserName().equalsIgnoreCase(ac.getUserName())) {
                    ac1 = ua;
                }
            }
            if (ac1 != null) {
                or.getUserAccountDirectory().getUserAccountList().remove(ac1);
                return;
            }
        }
    }
    
    public void removeEmployee(Employee employee) {

        Employee em = null;
        for (Employee e : this.getEmployeeDirectory().getEmployeeList()) {
            if (e.getID() == employee.getID()) {
                em = e;
            }
        }
        if (em != null) {
            this.getEmployeeDirectory().getEmployeeList().remove(em);
            return;
        }
        for (Organization or : organizations.getOrganizationList()) {
            for (Employee e : or.getEmployeeDirectory().getEmployeeList()) {
                if (e.getID() == employee.getID()) {
                    em = e;
                }
            }
            if (em != null) {
                or.getEmployeeDirectory().getEmployeeList().remove(em);
                return;
            }
        }
    }
    
    public abstract String getID();
    

  
}
