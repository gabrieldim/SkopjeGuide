package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
