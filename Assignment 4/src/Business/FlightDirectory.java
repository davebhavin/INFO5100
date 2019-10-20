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
    //Flight flight2 = new Flight("AI124", "Boston", "Mumbai", "Evening", 123, 1000, "12-11-2017");
    Flight flight1 = new Flight("Emirates","EM101", "Mumbai", "Boston", "Morning", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight2 = new Flight("Emirtaes","EM102", "Boston", "Mumbai", "Evening", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight3 = new Flight("Emirtaes","EM103", "Mumbai", "New York", "Afternoon", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight4 = new Flight("Emirtaes","EM104", "New York", "Mumbai", "Morning", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");
    Flight flight5 = new Flight("Etihad","ET105", "Dubai", "Mumbai", "Morning", 50,50,50, 1000, "October 9, 2019","11:15am","October 9, 2019", "12:30pm");

    FlightDir.add(flight1);
    FlightDir.add(flight2);
    FlightDir.add(flight3);
    FlightDir.add(flight4);
    FlightDir.add(flight5);
    
   //FlightDir.add(flight1);
    //FlightDir.add(flight2);
     //   System.out.println("created flight 1 2");
    }

    public ArrayList<Flight> getAirlinedirectory() {
        return airlinedirectory;
    }

    public void setAirlinedirectory(ArrayList<Flight> airlinedirectory) {
        this.airlinedirectory = airlinedirectory;
    }
    public Flight addData()
    {   
        System.out.println("in addData");
        Flight air = new Flight();
        airlinedirectory.add(air);
        return air;
    
    }
    
    public void deleteFlight(Flight flight)
    {
        airlinedirectory.remove(flight);
    }
        
}
