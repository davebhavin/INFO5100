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
    private FlightDirectory flight = new FlightDirectory();
    private String Origin;

    private String flightNum;
    private String arrival;
    private String departure;
    private int price;
    private String Date;
    private int availSeats;
    private String prefTime;
    public Object getFlight;
    
    public Airlines(String flightNum, String arrival, String departure, String prefTime, int availSeats, int price, String Date) {
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

    
    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getAvailSeats() {
        return availSeats;
    }

    public void setAvailSeats(int availSeats) {
        this.availSeats = availSeats;
    }

    public String getPrefTime() {
        return prefTime;
    }

    public void setPrefTime(String prefTime) {
        this.prefTime = prefTime;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public FlightDirectory getFlight() {
        return flight;
    }

    public void setFlight(FlightDirectory flight) {
        this.flight = flight;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }
     public String toString()
    {
        return this.airplaneName;
    }
}
