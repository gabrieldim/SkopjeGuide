package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import mk.ukim.finki.skopjeguide.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * This is Rest Controller in Java that is mapped on the path written in RequestMapping annotation.
 * This path is used like a default path for every mapped method in this class.
 */
@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin("*")
public class RestaurantController {

  
    /**
     * Service is injected using this variable and the constructor.
     */
    private final RestaurantService restaurantService;

   /**
     * Constructor with parameter.
     *
     * @param restaurantService
     */
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;

  
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllRestaurants() {
        return ResponseEntity.ok(this.restaurantService.listall());
    }
}
