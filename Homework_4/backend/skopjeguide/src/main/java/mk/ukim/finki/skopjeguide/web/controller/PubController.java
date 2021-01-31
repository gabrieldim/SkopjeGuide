package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.PubRepository;
import mk.ukim.finki.skopjeguide.service.PubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * This is Rest Controller in Java that is mapped on the path written in RequestMapping annotation.
 * This path is used like a default path for every mapped method in this class.
 */
@RestController
@RequestMapping("/api/pubs")
@CrossOrigin("*")
public class PubController {

   /**
     * Service is injected using this variable and the constructor.
     */
    private final PubService pubService;

   /**
     * Constructor with parameter.
     *
     * @param pubService
     */
    public PubController(PubService pubService) {
        this.pubService = pubService;

 
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllPubs() {
        return ResponseEntity.ok(this.pubService.listall());
    }
}
