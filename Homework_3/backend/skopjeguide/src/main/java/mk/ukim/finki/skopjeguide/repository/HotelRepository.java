package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Exchange_office;
import mk.ukim.finki.skopjeguide.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
    List<Hotel> findByNameNotNull();
}
