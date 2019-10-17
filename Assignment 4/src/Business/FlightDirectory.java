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

    public FlightDirectory()
    {
    airlinedirectory = new ArrayList<>();
    }

    public ArrayList<Flight> getAirlinedirectory() {
        return airlinedirectory;
    }

    public void setAirlinedirectory(ArrayList<Flight> airlinedirectory) {
        this.airlinedirectory = airlinedirectory;
    }
    public Flight addFlights()
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
