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
public class Customer {
    private String name;
    private String Pnum;
    private String Seatnum;
    private String flightNum;
    private String arrival;
    private String departure;
    private int price;
    private String Date;
    private int availSeats;
    private String prefTime;

    public Customer(String flightNum, String arrival, String departure, String prefTime, int availSeats, int price, String Date) {
        this.flightNum= flightNum;
        this.arrival=arrival;
        this.departure=departure;
        this.prefTime=prefTime;
        this.availSeats=availSeats;
        this.price= price;
        this.Date= Date;
    }

    Customer() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPnum() {
        return Pnum;
    }

    public void setPnum(String Pnum) {
        this.Pnum = Pnum;
    }

    public String getSeatnum() {
        return Seatnum;
    }

    public void setSeatnum(String Seatnum) {
        this.Seatnum = Seatnum;
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
     @Override
    public String toString(){
    
        return this.getName();
    
    }
   
}
