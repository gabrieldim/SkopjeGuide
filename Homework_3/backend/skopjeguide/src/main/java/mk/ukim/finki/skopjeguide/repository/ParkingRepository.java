package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Motels;
import mk.ukim.finki.skopjeguide.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking, Long> {
}
