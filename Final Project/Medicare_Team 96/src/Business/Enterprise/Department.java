/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author parth
 */
public abstract class Department extends Enterprise{
    
    private String name;
    private String phone;
    private String description;
    private department department;

    public Department(String name) {
        super(name);
        
    }
    
    public enum department{
        Doctor("Doctor"),
        Lab("Lab");
        private String value;
        
        private department (String value){
            this.value=value;
        }
        
    }
}
