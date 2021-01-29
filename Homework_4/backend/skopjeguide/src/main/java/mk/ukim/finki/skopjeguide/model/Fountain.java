package mk.ukim.finki.skopjeguide.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Java class for Fountain in Skopje.
 */
@Entity
@Table(name = "fountain")
public class Fountain {

    @Id
    private long id;
    private double lon;
    private double lat;
    private String name;
    private String website;
    private String phone;

    public Fountain() {
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
    public Fountain(long id, double lon, double lat, String name, String website, String phone) {
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
