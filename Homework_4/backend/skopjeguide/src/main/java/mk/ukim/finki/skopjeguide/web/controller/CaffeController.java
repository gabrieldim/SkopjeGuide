package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import mk.ukim.finki.skopjeguide.repository.CaffeRepository;
import mk.ukim.finki.skopjeguide.service.CaffeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/caffes")
@CrossOrigin("*")
public class CaffeController {

    private final CaffeService caffeService;

    public CaffeController(CaffeService caffeService) {
        this.caffeService = caffeService;
    }

    @GetMapping
    public ResponseEntity getAllCaffes(){return ResponseEntity.ok(this.caffeService.listall());}
}
