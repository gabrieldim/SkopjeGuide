package mk.ukim.finki.skopjeguidesearch.web;

import mk.ukim.finki.skopjeguidesearch.repository.LocationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/searchLocation")
@CrossOrigin("*")
public class LocationController {
    private final LocationRepository repository;
    public LocationController(LocationRepository repository){
        this.repository=repository;
    }

    @GetMapping
    public ResponseEntity getLocationsByName(@RequestParam String searchString){
        return ResponseEntity.ok(this.repository.findAllByNameLike(searchString));
    }
}
