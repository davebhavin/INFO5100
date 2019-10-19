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
    private ArrayList<Flight> airlinedirectory;
    private ArrayList<Flight> FlightDir;

    public ArrayList<Flight> getFlightDir() {
        return FlightDir;
    }

    public void setFlightDir(ArrayList<Flight> FlightDir) {
        this.FlightDir = FlightDir;
    }

    public FlightDirectory()
    {
    airlinedirectory = new ArrayList<>();
        FlightDir = new ArrayList<>();
    
    //Flight flight1 = new Flight("AI123", "Mumbai", "Boston", "Morning", 123, 1000, "12-10-2017");
    //Flight flight2 = new Flight("AI124", "Boston", "Mumbai", "Evening", 123, 1000, 12/11/2017);
    
   // FlightDir.add(flight1);
    //FlightDir.add(flight2);
    }

    public ArrayList<Flight> getAirlinedirectory() {
        return airlinedirectory;
    }

    public void setAirlinedirectory(ArrayList<Flight> airlinedirectory) {
        this.airlinedirectory = airlinedirectory;
    }
    public Flight addData()
    {
    
        Flight air = new Flight();
        airlinedirectory.add(air);
        return air;
    
    }
    
    public void deleteFlight(Flight flight)
    {
        airlinedirectory.remove(flight);
    }
        
}
