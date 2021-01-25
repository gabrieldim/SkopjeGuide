package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.FountainRepository;
import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import mk.ukim.finki.skopjeguide.service.FountainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fountains")
@CrossOrigin("*")
public class FountainController {

    private final FountainService fountainService;

    public FountainController(FountainService fountainService) {
        this.fountainService = fountainService;
    }

    @GetMapping
    public ResponseEntity getAllFountains() {
        return ResponseEntity.ok(this.fountainService.listall());
    }

}
