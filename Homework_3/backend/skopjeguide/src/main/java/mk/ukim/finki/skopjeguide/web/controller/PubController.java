package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pub")
public class PubController {

    private final PubController repository;

    public PubController(PubController repository) {
        this.repository = (PubController) repository;
    }

    @GetMapping
    public ResponseEntity getAllPubs() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}
