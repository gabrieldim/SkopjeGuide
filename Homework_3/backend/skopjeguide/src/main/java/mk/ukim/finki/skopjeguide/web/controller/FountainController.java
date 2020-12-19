package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.FountainRepository;
import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fountains")
public class FountainController {

    private final FountainRepository repository;

    public FountainController(FountainRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity getAllFountains() {
        return ResponseEntity.ok(this.repository.findByNameNotNull());
    }

}
