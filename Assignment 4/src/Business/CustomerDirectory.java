/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class CustomerDirectory {
 private ArrayList<Customer> custDir;
 public CustomerDirectory()
    {
    custDir = new ArrayList<>();
    
    Customer customer1 = new Customer("AI123", "Mumbai", "Boston", "Morning", 123, 1000, "12/10/2017");
    
    custDir.add(customer1);
    }

    public ArrayList<Customer> getCustDir() {
        return custDir;
    }

    public void setCustDir(ArrayList<Customer> custDir) {
        this.custDir = custDir;
    }
    
    public Customer addData(){
     Customer c= new Customer();
     custDir.add(c);
     return c;
 }
  

}
