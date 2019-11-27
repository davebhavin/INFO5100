/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.Pharmacy.Pharmacy;

/**
 *
 * @author parth
 */
public class Network {
    private String id;
    private EnterpriseDirectory enterpriseDir;
    private String City;
    private static int counter=0;
    
    public Network(String name){
        enterpriseDir= new EnterpriseDirectory();
        this.City=City;
        this.id="Network" + counter;
        counter++;
    }   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Network.counter = counter;
    }
     public Pharmacy createPharmacy(String name, String address, String phone) {
        Pharmacy p = new Pharmacy(name, address, phone);
        p.createOrganizations();
        this.enterpriseDir.getEnterpriseList().add(p);
        return p;
    }

    
}
