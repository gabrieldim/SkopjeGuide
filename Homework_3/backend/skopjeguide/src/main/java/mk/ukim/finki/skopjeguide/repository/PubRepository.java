package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Motels;
import mk.ukim.finki.skopjeguide.model.Parking;
import mk.ukim.finki.skopjeguide.model.Pub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PubRepository extends JpaRepository<Pub, Long> {
}
