/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author parth
 */
public class Flight {
    private String flightNum;
    private int price;
    private int seat;
    private String source;
    private String dest;

    private String date;


    //private Date date;
    private int availSeats;
    private String prefTime;
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    //Date today = sdf.parse(today);
    
    public Flight(String flightNum, String source, String dest, String prefTime, int availSeats, int price, String date) {
        this.flightNum= flightNum;
        this.source=source;
        this.dest=dest;
        this.prefTime=prefTime;
        this.availSeats=availSeats;
        this.price= price;
       // this.date= date;
    }

    Flight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        this.prefTime = prefTime;}

  
    private String time;
    private String Adate;
    private String Atime;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAdate() {
        return Adate;
    }

    public void setAdate(String Adate) {
        this.Adate = Adate;
    }

    public String getAtime() {
        return Atime;
    }

    public void setAtime(String Atime) {
        this.Atime = Atime;

    }


    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }
    @Override
    public String toString()
    {
        return this.flightNum;
    }

    
}
