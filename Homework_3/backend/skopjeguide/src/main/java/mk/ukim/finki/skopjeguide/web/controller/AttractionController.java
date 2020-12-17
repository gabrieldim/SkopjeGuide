package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attractions")
public class AttractionController {
    private final AttractionRepository repository;
    public AttractionController(AttractionRepository repository){
        this.repository=repository;
    }
    @GetMapping
    public ResponseEntity getAllAttractions(){return ResponseEntity.ok(this.repository.findByNameNotNull());}
}
