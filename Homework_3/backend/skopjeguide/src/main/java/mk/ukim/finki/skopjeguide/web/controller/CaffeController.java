package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import mk.ukim.finki.skopjeguide.repository.CaffeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/caffes")

public class CaffeController {
    private final CaffeRepository repository;
    public CaffeController(CaffeRepository repository){
        this.repository=repository;
    }
    @GetMapping
    public ResponseEntity getAllCaffes(){return ResponseEntity.ok(this.repository.findByNameNotNull());}
}
