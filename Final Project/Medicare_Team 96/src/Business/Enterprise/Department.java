/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public abstract class Department extends Enterprise{
    
    private String name;
    private String phone;
    private String description;
    private department department;
    private ArrayList<Product> product;

    public Department(String name, String phone,String description) {
        super(name);
        this.name=name;
        this.phone=phone;
        this.description=description;
        this.product= new ArrayList<>();
        
    }
    
    public enum department{
        Doctor("Doctor"),
        Lab("Lab"),
        Pharmacy("Pharmacy");
        private String value;
        
        private department (String value){
            this.value=value;
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public department getDepartment() {
        return department;
    }

    public void setDepartment(department department) {
        this.department = department;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
    
}
