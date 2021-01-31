package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.ParkingRepository;
import mk.ukim.finki.skopjeguide.service.ParkingService;
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
@RequestMapping("/api/parkings")
@CrossOrigin("*")
public class ParkingController {

 /**
     * Service is injected using this variable and the constructor.
     */
    private final ParkingService parkingService;

   /**
     * Constructor with parameter.
     *
     * @param parkingService
     */
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;

    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllParkings() {
        return ResponseEntity.ok(this.parkingService.listall());
    }
}

