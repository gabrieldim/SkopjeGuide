package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.PubRepository;
import mk.ukim.finki.skopjeguide.service.PubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pubs")
@CrossOrigin("*")
public class PubController {

    private final PubService pubService;

    public PubController(PubService pubService) {
        this.pubService = pubService;
    }

    @GetMapping
    public ResponseEntity getAllPubs() {
        return ResponseEntity.ok(this.pubService.listall());
    }
}
