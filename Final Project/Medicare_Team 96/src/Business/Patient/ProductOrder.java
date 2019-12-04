/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Enterprise.Department;
import Business.Enterprise.Product;

/**
 *
 * @author parth
 */
public abstract  class ProductOrder {
    
    private Product product;
    private int quantity;
    private double total;
    private Department department;
    
    public ProductOrder(Department department, Product product, int quantity) {
        this.department = department;
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    
     public abstract Department getdepartmentModel();
    
    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
    
    
}
