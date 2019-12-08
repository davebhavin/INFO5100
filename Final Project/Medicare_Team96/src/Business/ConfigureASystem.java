package Business;

import Business.Employee.Employee;
import Business.Enterprise.Delivery.DeliveryCompany;
import Business.Hospital.Doctor.Appointments;
import Business.Hospital.Doctor.Doctor;
import Business.Hospital.Lab.Lab;
import Business.Hospital.Lab.Test;
import Business.Hospital.Pharmacy.Medicines;
import Business.Hospital.Pharmacy.Pharmacy;
import Business.Hospital.SocialEvents.Events;
import Business.Hospital.SocialEvents.SocialEvents;
import Business.Network.Network;
import Business.Organization.DeliveryOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.EventOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Patient.Patient;
import Business.Role.DeliveryManRole;
import Business.Role.DoctorRole;
import Business.Role.EventRole;
import Business.Role.LabAssistantRole;
import Business.Role.ManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
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
        Pharmacy pa1=n1.createPharmacy("CVS", "88888","100 Mass Ave");
        pa1.setCategory(Pharmacy.PharmacyCategory.Medicines);
        pa1.setId("CVS");
        pa1.setDescription("A medical Store");
        Medicines m1= new Medicines(pa1, "Crocin", 10);
        Medicines m2= new Medicines(pa1, "Crocin", 10);
        Medicines m3= new Medicines(pa1, "Crocin", 10);

        pa1.addMedicines(m1);
        pa1.addMedicines(m2);
        pa1.addMedicines(m3);
        
        Lab l1=n1.createLab("XYZ PHARMACY", "100 Mass Ave", "88888");
        l1.setCategory(Lab.LabCatogary.Genrallab);
        l1.setName("XYZ Lab");
        l1.setDescription("A Medical Lab");
        Test t1= new Test(l1, "Full body test", 90);
        Test t2= new Test(l1, "CBC", 49);
        Test t3= new Test(l1, "Dengue", 75);

        l1.addTest(t1);
        l1.addTest(t2);
        l1.addTest(t3);
        
        Doctor d1=n1.createDoctor("Dr. Pal", " Dana R center", "88888");
        d1.setCategory(Doctor.DoctorCatogary.General);
        d1.setName("XYZ Lab");
        d1.setDescription("A Medical Lab");
        Appointments a1= new Appointments(d1, "Consultaion", 50);
        Appointments a2= new Appointments(d1, "Consultaion+Medicines", 70);
        Appointments a3= new Appointments(d1, "Consultaion+Medicines+Vaccinations", 200);

        d1.addAppointments(a1);
        d1.addAppointments(a2);
        d1.addAppointments(a3);
        
        SocialEvents s1=n1.createEvents("Joe", "Ell Hall", "8888");
        s1.setCategory(SocialEvents.EventCategory.DentalCheckup);
        s1.setName("Abc Events");
        s1.setDescription("A social event organizer");
        Events ev1= new Events(s1,"Dental Checkup" ,5);
        Events ev2= new Events(s1,"Eye Checkup" ,5);
        Events ev3= new Events(s1,"Vaccination" ,5);
        
       s1.addEvents(ev1);
       s1.addEvents(ev2);
       s1.addEvents(ev3);
       
        EventOrganization eo1=(EventOrganization)s1.getOrganizationDirectory().getTypicalOrganization(Organization.Type.SocialEvent);
        Employee se1= eo1.getEmployeeDirectory().createEmployee("Chandler", "Bing", "6666", "ww.ww@ww");
        UserAccount eu1= s1.getUserAccountDirectory().createEmployeeAccount("e", "e", new EventRole(), se1);

        
        
        LabOrganization  LO1= (LabOrganization) l1.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Lab);
        System.out.println(LO1);
        Employee lo1= LO1.getEmployeeDirectory().createEmployee("mac", "mac", "9876", "gg@gg.dd");
        UserAccount l2= l1.getUserAccountDirectory().createEmployeeAccount("lab", "lab", new LabAssistantRole(), lo1);
        
        DoctorOrganization  da1= (DoctorOrganization)d1.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Doctor);
        System.out.println(da1);
        Employee ld1= da1.getEmployeeDirectory().createEmployee("das", "das", "07876", "yio@875.ijh");
        UserAccount u2= d1.getUserAccountDirectory().createEmployeeAccount("doc", "doc", new DoctorRole(),ld1);
      
        PharmacyOrganization po1=(PharmacyOrganization) pa1.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Pharmacy);
        Employee pm1= po1.getEmployeeDirectory().createEmployee("Parth", "Shah", "7777", "parth@gmail.com");
        UserAccount pu2= pa1.getUserAccountDirectory().createEmployeeAccount("ma", "ma", new ManagerRole() ,pm1 );

        DeliveryCompany d= n1.createDeliveryCompany("Delivery A", "100 Mass Ave", "1234");
        d.setDescription("This is a delivery company");
        d.setName("Delivery");
        
        DeliveryOrganization  md1= (DeliveryOrganization) d.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Delivery);
        Employee dm1= md1.getEmployeeDirectory().createEmployee("Manager", "Manager", "1234", "bc@abc.com");
        UserAccount du1= d.getUserAccountDirectory().createEmployeeAccount("m", "m", new ManagerRole(), dm1);
        
        DeliveryOrganization  md2= (DeliveryOrganization) d.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Delivery);
        Employee dm2= md2.getEmployeeDirectory().createEmployee("Delivery", "Delivery", "1234", "d.d@ddd.dd");
        UserAccount du2= d.getUserAccountDirectory().createEmployeeAccount("d", "d", new DeliveryManRole(), dm2);
       
        DeliveryOrganization  md3= (DeliveryOrganization) d.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Delivery);
         Employee dm3= md3.getEmployeeDirectory().createEmployee("Delivery", "Delivery", "1234", "d.d@ddd.dd");
        UserAccount du3= d.getUserAccountDirectory().createEmployeeAccount("dd", "dd", new DeliveryManRole(), dm3);

        return system;
    }
    
}
