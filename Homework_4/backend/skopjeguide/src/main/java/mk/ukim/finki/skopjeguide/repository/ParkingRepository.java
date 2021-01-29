package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParkingRepository extends JpaRepository<Parking, Long> {

    List<Parking> findByNameNotNull();

}
