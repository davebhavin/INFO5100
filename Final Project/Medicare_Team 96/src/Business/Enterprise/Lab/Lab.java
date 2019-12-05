/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Lab;

import Business.Enterprise.Department;
import Business.Enterprise.Product;
import Business.Organization.LabOrganization;
import Business.Work.OrderRequest;
import Business.Work.WorkRequest;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class Lab extends Department{
     private int photoId;
     private LabCatogary category;
    private String id;
    private static int counter = 0;
    private String photoPath;

    public LabCatogary getCategory() {
        return category;
    }

    public void setCategory(LabCatogary category) {
        this.category = category;
    }
    

    public Lab(String name, String phone, String contactNum) {
        super(name, phone, contactNum);
        this.photoId = counter;
        this.id = "Lab" + counter;
        counter++;
        this.setDepartment(Department.departmenttype.Lab);
    }
    public enum LabCatogary {
           Genrallab
            }
     
    @Override
    public String getID() {
       return this.id;
    }

    @Override
    public void setId(String id) {
         this.id = id;
    }

    @Override
    public void createOrganizations() {
      this.getOrganizations().getOrganizationList().add(new LabOrganization());
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public departmenttype getType() {
    return departmenttype.Lab;    
    }
    public void addTest(Test t){
        this.getProduct().add(t);
    }
    public ArrayList<Test> getGoods() {
        ArrayList<Test> result = new ArrayList<>();
        for (Product product : this.getProduct()) {
            Test test = (Test) product;
            result.add(test);
        }
        return result;
    }

    @Override
    public double getRate() {
        double totalRate = 0;
        double num = 0;
        for (WorkRequest wr : this.getWorkQ().getWorkRequestList()) {
            OrderRequest order = (OrderRequest) wr;
            if (order.isReviewed()) {
                totalRate = totalRate + order.getReview().getRate();
                num++;
            }
        }
        if (num == 0) {
            return -1;
        }
        BigDecimal bd = new BigDecimal(totalRate / num);
        return bd.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    
    
}
