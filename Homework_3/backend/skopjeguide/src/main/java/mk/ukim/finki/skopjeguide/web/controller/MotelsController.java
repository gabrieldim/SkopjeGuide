package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.MotelsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motels")
public class MotelsController {

    private final MotelsRepository repository;

    public MotelsController(MotelsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity getAllMotels() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}
