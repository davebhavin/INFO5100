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
    
}
