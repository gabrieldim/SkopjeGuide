package mk.ukim.finki.skopjeguide.model;



import javax.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    private long id;
    private double lon;
    private double lat;
    private String name;

    public Restaurant() {
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
}
