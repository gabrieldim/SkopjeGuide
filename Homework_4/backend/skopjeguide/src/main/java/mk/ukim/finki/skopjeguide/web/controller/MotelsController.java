package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.MotelsRepository;
import mk.ukim.finki.skopjeguide.service.MotelService;
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
@RequestMapping("/api/motels")
@CrossOrigin("*")
public class MotelsController {

  
    /**
     * Service is injected using this variable and the constructor.
     */
    private final MotelService motelService;

  
    /**
     * Constructor with parameter.
     *
     * @param motelService
     */
    public MotelsController(MotelService motelService) {
        this.motelService = motelService;

    
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllMotels() {
        return ResponseEntity.ok(this.motelService.listall());
    }
}
