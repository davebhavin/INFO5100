/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Delivery.DeliveryCompany;
import Business.Enterprise.Pharmacy.Medicines;
import Business.Enterprise.Pharmacy.Pharmacy;
import Business.Network.Network;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Patient.Patient;
import Business.Role.DeliveryManRole;
import Business.Role.ManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author parth
 */
public class ConfigureASystem {

    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
       
         Employee e1 = system.getEmployeeDirectory().createEmployee("Saurabh", "Satra", "8575882333", "s.satra@gmail.com");
        UserAccount ua1 = system.getUserAccountDirectory().createEmployeeAccount("admin", "admin", new SystemAdminRole(), e1);

        Patient p1 = system.getPatients().createPatient("Parthiv", "Shah", "parthiv@husky.neu.edu", "9999999");
        UserAccount ua2 = system.getUserAccountDirectory().createPatientAccount("p", "p", p1);
        
        Patient p2 = system.getPatients().createPatient("Bhavin", "Dave", "bhavin@husky.neu.", "888888");
        UserAccount ua3 = system.getUserAccountDirectory().createPatientAccount("b", "b", p2);
        
        Network n1= system.createNetwork("Boston");
        n1.setId("Boston");
         Network network2 = system.createNetwork("New York");
         network2.setId("NewYork");        
        Pharmacy pa1=n1.createPharmacy("CVS", "100 Mass Ave", "88888");
        pa1.setCategory(Pharmacy.PharmacyCategory.Medicines);
        pa1.setId("CVS");
        pa1.setDescription("A medical Store");
        Medicines m1= new Medicines(pa1, "Crocin", 10);
        Medicines m2= new Medicines(pa1, "Crocin", 10);
        Medicines m3= new Medicines(pa1, "Crocin", 10);

        pa1.addMedicines(m1);
        pa1.addMedicines(m2);
        pa1.addMedicines(m3);
        
      
        PharmacyOrganization po1=(PharmacyOrganization) pa1.getOrganizations().getTypicalOrganization(Organization.Type.Pharmacy);
        Employee pm1= po1.getEmployeeDirectory().createEmployee("Parth", "Shah", "7777", "parth@gmail.com");
        UserAccount pu2= pa1.getUserAccountDirectory().createEmployeeAccount("ma", "ma", new ManagerRole() ,pm1 );
        
        DeliveryCompany d= n1.createDeliveryCompany("Delivery A", "100 Mass Ave", "1234");
        d.setDescription("This is a delivery company");
        d.setId("Delivery");
        
        DeliveryOrganization  md1= (DeliveryOrganization) d.getOrganizations().getTypicalOrganization(Organization.Type.Delivery);
        Employee dm1= md1.getEmployeeDirectory().createEmployee("Manager", "Manager", "1234", "bc@abc.com");
        UserAccount du1= d.getUserAccountDirectory().createEmployeeAccount("m", "m", new ManagerRole(), dm1);
        
        DeliveryOrganization  md2= (DeliveryOrganization) d.getOrganizations().getTypicalOrganization(Organization.Type.Delivery);
        Employee dm2= md2.getEmployeeDirectory().createEmployee("Delivery", "Delivery", "1234", "d.d@ddd.dd");
        UserAccount du2= d.getUserAccountDirectory().createEmployeeAccount("d", "d", new DeliveryManRole(), dm2);

        

        return system;
}}
