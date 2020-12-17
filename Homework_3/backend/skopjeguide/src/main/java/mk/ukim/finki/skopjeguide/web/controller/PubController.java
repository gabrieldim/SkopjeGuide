package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.PubRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pubs")
public class PubController {

    private final PubRepository repository;

    public PubController(PubRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity getAllPubs() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}
