/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

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
        
}
