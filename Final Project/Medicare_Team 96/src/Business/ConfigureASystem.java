/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Pharmacy.Medicines;
import Business.Enterprise.Pharmacy.Pharmacy;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Patient.Patient;
import Business.Role.ManagerRole;
import static Business.Role.Role.RoleType.Patient;
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
        
        Network n1= system.createNetwork("Boston");
        n1.setId("Boston");
        
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
        
       //Employee pe1= pa1.getEmployeeDirectory().createEmployee("Bhavin", "Dave", "77777", "b.dave@gmail.com");
        //UserAccount pu1=pa1.getUserAccountDirectory().createEmployeeAccount("b", "b", new ManagerRole(), pe1);
        
        PharmacyOrganization po1=(PharmacyOrganization) pa1.getOrganizations().getTypicalOrganization(Organization.Type.Pharmacy);
        Employee pm1= po1.getEmployeeDirectory().createEmployee("Parth", "Shah", "7777", "parth@gmail.com");
        UserAccount pu2= pa1.getUserAccountDirectory().createEmployeeAccount("manager", "manager", new ManagerRole() ,pm1 );
        

        
        return system;
}}
