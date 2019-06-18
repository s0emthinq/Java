package entity;

import java.util.ArrayList;

public class Aircompany {
    private String name;
    private String creationDate;
    private ArrayList<Airplane> airplanes;

    private static final String DEFAULT_NAME = "DEFAULT_NAME";
    private static final String DEFAULT_CREATIONDATE = "1.1.0000";
    private static final ArrayList<Airplane> DEFAULT_AIRPLANES = new ArrayList<Airplane>(0);

    public Aircompany() {
        name = DEFAULT_NAME;
        creationDate = DEFAULT_CREATIONDATE;
        airplanes = DEFAULT_AIRPLANES;
    }

    public Aircompany(String name, String creationDate, ArrayList<Airplane> airplanes) {
        if (name != null && creationDate != null && airplanes != null) {
            this.name = name;
            this.creationDate = creationDate;
            this.airplanes = airplanes;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        if (creationDate != null) {
            this.creationDate = creationDate;
        }
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        if (airplanes != null) {
            this.airplanes = airplanes;
        }
    }

}
