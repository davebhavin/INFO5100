/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Enterprise.Department;
import Business.Enterprise.Lab.Lab;
import Business.Enterprise.Product;

/**
 *
 * @author DAVE
 */
public class TestOrder extends ProductOrder {
    private Lab Lab;
    
    public TestOrder(Department department, Product product, int quantity){
        super(department, product,quantity);
        this.Lab=(Lab) department;
        
    }
    @Override
    public Department getDepartment(){
        return this.Lab;
    }
    
    public Lab getLab() {
        return (Lab) this.getLab();
    }

    @Override
    public Department getdepartmentModel() {
        return this.Lab;
    }
    
}
