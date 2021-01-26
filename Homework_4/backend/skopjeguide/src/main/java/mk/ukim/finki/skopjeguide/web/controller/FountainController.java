package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.FountainRepository;
import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
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
@RequestMapping("/api/fountains")
@CrossOrigin("*")
public class FountainController {
    /**
     * Repository is injected using this variable and the constructor.
     */
    private final FountainRepository repository;
    /**
     * Constructor with parameter.
     *
     * @param repository
     */
    public FountainController(FountainRepository repository) {
        this.repository = repository;
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllFountains() {
        return ResponseEntity.ok(this.repository.findByNameNotNull());
    }

}
