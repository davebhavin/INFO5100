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
    
    private ArrayList<Flight> flightdirectory;

   

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
         flightdirectory = new ArrayList<>();
    

    
    Flight flight1 = new Flight("Emirates","EM101", "Mumbai", "Boston", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight2 = new Flight("Emirtaes","EM102", "Boston", "Mumbai", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight3 = new Flight("Emirtaes","EM103", "Mumbai", "New York", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight4 = new Flight("Emirtaes","EM104", "New York", "Mumbai", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight5 = new Flight("Etihad","ET105", "Dubai", "Mumbai", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");

   
    FlightDir.add(flight1);
    FlightDir.add(flight2);
    FlightDir.add(flight3);
    FlightDir.add(flight4);
    FlightDir.add(flight5);

    }

    public ArrayList<Flight> getAirlinedirectory() {
        return flightdirectory;
    }

    public void setAirlinedirectory(ArrayList<Flight> airlinedirectory) {
        this.flightdirectory = airlinedirectory;
    }

    
    

    public Flight addData()
    {   
        System.out.println("in addData");

        Flight air = new Flight();
        flightdirectory.add(air);
        return air;
    
    }
    
    public void deleteFlight(Flight flight)
    {
        flightdirectory.remove(flight);
    }
        
}
