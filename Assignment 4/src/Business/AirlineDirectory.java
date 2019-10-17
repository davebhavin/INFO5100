/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class AirlineDirectory {
    
    private ArrayList<Airlines> airlinedirectory;
    
    public AirlineDirectory(){
        airlinedirectory= new ArrayList<>();
        Airlines airline1= new Airlines("Emirates", "Dubai");
        Airlines airline2= new Airlines("Air India","India");
        airlinedirectory.add(airline1);
        airlinedirectory.add(airline2);
    }
    

    public ArrayList<Airlines> getAirlinedirectory() {
        return airlinedirectory;
    }

    public void setAirlinedirectory(ArrayList<Airlines> airlinedirectory) {
        this.airlinedirectory = airlinedirectory;
    }
    public Airlines addAirlines(){
        Airlines add= new Airlines();
        airlinedirectory.add(add);
        return add;
    }
    public void removeAirlines(Airlines airlines) {
        airlinedirectory.remove(airlines);
    }
    
}
