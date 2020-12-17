package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
