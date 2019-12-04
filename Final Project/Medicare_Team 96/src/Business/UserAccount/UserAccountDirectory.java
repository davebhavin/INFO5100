/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class UserAccountDirectory {
    public ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        this.userAccountList= new ArrayList<>();
        
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    public UserAccount authenticateUser(String username, String password) {
        UserAccount account = null;
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equalsIgnoreCase(username) && ua.getPassword().equals(password)) {
                account = ua;
            }
        }
        return account;
    }

    public boolean isUsernameValid(String username) {
        if (userAccountList.isEmpty()) {
            return true;
        }
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equalsIgnoreCase(username)) {
                return false;
            }
        }
        return true;
    }
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount(username, password, role) {};
        userAccount.setUserName(username);
        userAccount.setPassword(password);
               userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public EmployeeAccount createEmployeeAccount(String username, String password, Role role, Employee em) {
        EmployeeAccount ua = new EmployeeAccount(username, password, role, em);
        userAccountList.add(ua);
        return ua;
    }

    public PatientAccount createPatientAccount(String username, String password, Patient patient) {
        PatientAccount ua = new PatientAccount(username, password, patient);
        userAccountList.add(ua);
        return ua;
    }

    public void addAccount(UserAccount account) {
        userAccountList.add(account);
    }

    public ArrayList<EmployeeAccount> toEmployeeAccounts() {
        ArrayList<EmployeeAccount> result = new ArrayList<>();
        for (UserAccount ua : this.userAccountList) {
            EmployeeAccount ea = (EmployeeAccount) ua;
            result.add(ea);
        }
        return result;
    }

    public ArrayList<UserAccount> searchCustomerByOverall(String key) {
        ArrayList<UserAccount> result = new ArrayList<>();
        if (!userAccountList.isEmpty()) {
            for (UserAccount u : this.userAccountList) {
                if (u instanceof PatientAccount) {
                    PatientAccount c = (PatientAccount) u;
                    if (c.getUserName().toLowerCase().contains(key.toLowerCase())) {
                        if(!result.contains(c)) {
                            result.add(c);
                        }
                    }
                    if (c.getPatient().getFullName().toLowerCase().contains(key.toLowerCase())) {
                        if(!result.contains(c)) {
                            result.add(c);
                        }
                    }
                    if (c.getPatient().getContactNum().toLowerCase().contains(key.toLowerCase())) {
                        if(!result.contains(c)) {
                            result.add(c);
                        }
                    }
                    if (c.getPatient().getEmailID().toLowerCase().contains(key.toLowerCase())) {
                        if(!result.contains(c)) {
                            result.add(c);
                        }
                    }
                }
            }
        }
        return result;
    }
    
    public void removeAccount(UserAccount account) {
        if (this.userAccountList.contains(account)) {
            this.userAccountList.remove(account);
        }
    }

        
}
