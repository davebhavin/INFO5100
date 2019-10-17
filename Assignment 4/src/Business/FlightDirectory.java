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
public class FlightDirectory {
    private ArrayList<Flight> flightdirectory;

    public FlightDirectory()
    {
    flightdirectory = new ArrayList<>();
    Flight flight1= new Flight ("AI123", "Mumbai", "Boston", "Morning", 123, 1000, "12/10/2017");
    Flight flight2= new Flight ("AI124", "Mumbai", "New York", "Morning", 123, 1000, "12/10/2017"); 
    flightdirectory.add(flight1);
    flightdirectory.add(flight2);
    }

    public ArrayList<Flight> getFlightdirectory() {
        return flightdirectory;
    }

    public void setFlightdirectory(ArrayList<Flight> flightdirectory) {
        this.flightdirectory = flightdirectory;
    }

    
    public Flight addData()
    {
    
        Flight air = new Flight();
        flightdirectory.add(air);
        return air;
    
    }
    
    public void deleteFlight(Flight flight)
    {
        flightdirectory.remove(flight);
    }
        
}
