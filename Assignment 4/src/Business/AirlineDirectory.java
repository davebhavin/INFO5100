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

        Airlines Airline = new Airlines("AI123", "Mumbai", "Boston", "Morning", 123, 1000, "12/10/2017");
        airlinedirectory.add(Airline);

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
