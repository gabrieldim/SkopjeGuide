package mk.ukim.finki.skopjeguide.restaurantsservice.repository;

import mk.ukim.finki.skopjeguide.restaurantsservice.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * This is the Restaurant Repository.
 * It extends the JpaRepository.
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByNameNotNull();
}