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
    }

    public ArrayList<Flight> getAirlinedirectory() {
        return flightdirectory;
    }

    public void setAirlinedirectory(ArrayList<Flight> airlinedirectory) {
        this.flightdirectory = airlinedirectory;
    }
    public Flight addFlights()
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
