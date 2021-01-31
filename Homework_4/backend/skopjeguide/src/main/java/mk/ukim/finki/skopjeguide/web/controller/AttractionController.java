package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import mk.ukim.finki.skopjeguide.service.AttractionService;
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
@RequestMapping("/api/attractions")
@CrossOrigin("*")
public class AttractionController {

  /**
     * Service is injected using this variable and the constructor.
     */
   
    private final AttractionService attractionService;

  
  /**
     * Constructor with parameter.
     *
     * @param attractionService
     */
   
    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }


    
    
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllAttractions(){return ResponseEntity.ok(this.attractionService.listall());}
}
