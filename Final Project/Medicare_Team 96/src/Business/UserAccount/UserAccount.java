/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.Work.WorkQueue;

/**
 *
 * @author parth
 */
public abstract class UserAccount {
    private int id;
    private String UserName;
    private String Password;
    private WorkQueue work;
    private static int counter=0;
    private Role role;
    
    public UserAccount(String UserName,String Password, Role role){
        this.id=counter;
        counter++;
        this.UserName=UserName;
        this.Password=Password;
        this.role=role;
        this.work= new WorkQueue();
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWork() {
        return work;
    }
    
    @Override
    public String toString(){
        return this.UserName;
    }
}
