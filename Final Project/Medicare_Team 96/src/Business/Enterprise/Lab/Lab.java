/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Lab;

import Business.Enterprise.Department;
import Business.Organization.LabOrganization;

/**
 *
 * @author parth
 */
public class Lab extends Department{
     private int photoId;
    private String id;
    private static int counter = 0;
    private String photoPath;

    public Lab(String name, String phone, String contactNum) {
        super(name, phone, contactNum);
        this.photoId = counter;
        this.id = "Lab" + counter;
        counter++;
        this.setDepartment(Department.department.Lab);
    }

    @Override
    public String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createOrganizations() {
      this.getOrganizations().getOrganizationList().add(new LabOrganization());
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}