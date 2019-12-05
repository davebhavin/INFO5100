/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Enterprise.Department;
import Business.Enterprise.Pharmacy.Pharmacy;
import Business.Enterprise.Product;

/**
 *
 * @author parth
 */
public class MedicineOrder extends ProductOrder {
    
    private Pharmacy pharmacy;
    
    public MedicineOrder(Department department, Product product, int quantity){
        super(department, product,quantity);
        this.pharmacy=(Pharmacy) department;
        
    }
    @Override
    public Department getDepartment(){
        return this.pharmacy;
    }
    
    public Pharmacy getPharmacy() {
        return (Pharmacy) this.getDepartment();
    }

    @Override
    public Department getdepartmentModel() {
        return this.pharmacy;
    }
    
}
