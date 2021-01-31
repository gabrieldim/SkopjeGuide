package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import mk.ukim.finki.skopjeguide.repository.CaffeRepository;
import mk.ukim.finki.skopjeguide.service.CaffeService;
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
@RequestMapping("/api/caffes")
@CrossOrigin("*")
public class CaffeController {


   /**
     * Service is injected using this variable and the constructor.
     */
    private final CaffeService caffeService;

  
   /**
     * Constructor with parameter.
     *
     * @param caffeService
     */
    public CaffeController(CaffeService caffeService) {
        this.caffeService = caffeService;
    }


    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllCaffes(){return ResponseEntity.ok(this.caffeService.listall());}
}
