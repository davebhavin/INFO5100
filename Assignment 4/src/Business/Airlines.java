/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author parth
 */
public class Airlines {
    private String airplaneName;
    private FlightDirectory flightDirectory=new FlightDirectory();
     private String Origin;

    
    public Airlines(){
    
}

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
   
  /*  private String flightNum;
    private String arrival;
    private String departure;
    private int price;
    private String Date;
    private int availSeats;
    private String prefTime;
    public Object getFlight;*/
    
    /*public Airlines(String flightNum, String arrival, String departure, String prefTime, int availSeats, int price, String Date) {
        this.flightNum= flightNum;
        this.arrival=arrival;
        this.departure=departure;
        this.prefTime=prefTime;
        this.availSeats=availSeats;
        this.price= price;
        this.Date= Date;
    }
    public Airlines() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
   
     public String toString()
    {
        return this.airplaneName;
    }
}
