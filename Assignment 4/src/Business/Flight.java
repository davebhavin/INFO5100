/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

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
