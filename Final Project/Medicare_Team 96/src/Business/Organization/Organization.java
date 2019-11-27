/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Work.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author parth
 */
public abstract class Organization {
 
    private int orgID;
    private String name;
    private WorkQueue workQ;
    private EmployeeDirectory employees;
    private UserAccountDirectory userAccounts;
    private static int counter;
   
 public enum Type {

        Pharmacy("Pharmcy Organization"),
        DeliveryMan("Delivery Man Organization");
        

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
public Organization(String name){
    this.orgID=counter;
    counter++;
    this.name=name;
    this.workQ= new WorkQueue();
    this.employees= new EmployeeDirectory();
    this.userAccounts= new UserAccountDirectory();
    
}
public abstract ArrayList<Role> getSupportedRole();

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQ() {
        return workQ;
    }

    public void setWorkQ(WorkQueue workQ) {
        this.workQ = workQ;
    }

    public EmployeeDirectory getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeDirectory employees) {
        this.employees = employees;
    }

    public UserAccountDirectory getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(UserAccountDirectory userAccounts) {
        this.userAccounts = userAccounts;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employees;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccounts;
    }



}
