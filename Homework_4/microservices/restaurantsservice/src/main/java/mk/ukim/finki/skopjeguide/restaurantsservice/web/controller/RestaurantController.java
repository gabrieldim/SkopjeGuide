package mk.ukim.finki.skopjeguide.restaurantsservice.web.controller;

import mk.ukim.finki.skopjeguide.restaurantsservice.repository.RestaurantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a controller mapped to /api/restaurants.
 */
@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin("*")
public class RestaurantController {
    
    private final RestaurantRepository repository;

    public RestaurantController(RestaurantRepository repository) {
        this.repository = repository;
    }

    /**
     * This is a GET mapping and it returns a list of all restaurants. 
     * @return {@link ResponseEntity}.
     */
    @GetMapping
    public ResponseEntity getAllRestaurants() {
        return ResponseEntity.ok(this.repository.findByNameNotNull());
    }
}