package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.ParkingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parkings")
@CrossOrigin("*")
public class ParkingController {

    private final ParkingRepository repository;

    public ParkingController(ParkingRepository repository) {
        this.repository =  repository;
    }

    @GetMapping
    public ResponseEntity getAllParkings() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}

