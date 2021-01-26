package mk.ukim.finki.skopjeguidesearch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    private long id;
    private double lon;
    private double lan;
    private String name;
    private String website;
    private String phone;

    public Location() {
    }

    public Location(long id, double lon, double lan, String name, String website, String phone) {
        this.id = id;
        this.lon = lon;
        this.lan = lan;
        this.name = name;
        this.website = website;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLan() {
        return lan;
    }

    public void setLan(double lan) {
        this.lan = lan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
