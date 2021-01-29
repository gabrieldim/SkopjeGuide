package mk.ukim.finki.skopjeguide.model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Java class for Exchange offices in Skopje.
 */
@Entity
public class Exchange_office {
    @Id
    private long id;
    private double lon;
    private double lat;
    private String name;
    private String website;
    private String phone;

    public Exchange_office() {
    }

    /**
     * Constructor with all parameters.
     *
     * @param id
     * @param lon
     * @param lat
     * @param name
     * @param website
     * @param phone
     */
    public Exchange_office(long id, double lon, double lat, String name, String website, String phone) {
        this.id = id;
        this.lon = lon;
        this.lat = lat;
        this.name = name;
        this.website = website;
        this.phone = phone;
    }

    //GET AND SET METHODS
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

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
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
