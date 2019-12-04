/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Doctor;

import Business.Enterprise.Department;
import Business.Organization.DoctorOrganization;

/**
 *
 * @author parth
 */
public class Doctor extends Department{
private int photoId;
    private String id;
    private static int counter = 0;
    private String photoPath;
    private String address;
    public Doctor(String name, String phone, String contactNum,String address) {
        super(name, phone, contactNum,address);
        this.photoId = counter;
        this.id = "Doctor" + counter;
        counter++;
        this.setDepartment(Department.departmenttype.Doctor);
    }
    public departmenttype getType(){
        return Department.departmenttype.Doctor;
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
       this.getOrganizations().getOrganizationList().add(new DoctorOrganization());

    }

    @Override
    public double getRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
