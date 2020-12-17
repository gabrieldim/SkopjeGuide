package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    private final ParkingController repository;

    public ParkingController(ParkingController repository) {
        this.repository = (ParkingController) repository;
    }

    @GetMapping
    public ResponseEntity getAllParkings() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}

