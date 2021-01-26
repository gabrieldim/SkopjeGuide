package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
List<Restaurant> findByNameNotNull();
}
