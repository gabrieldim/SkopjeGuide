package mk.ukim.finki.skopjeguide.web.controller;


import mk.ukim.finki.skopjeguide.repository.HotelRepository;
import mk.ukim.finki.skopjeguide.service.HotelService;
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
@RequestMapping("/api/hotels")
@CrossOrigin("*")
public class HotelController {

    /**
     * Service is injected using this variable and the constructor.
     */
    private final HotelService hotelService;

     /**
     * Constructor with parameter.
     *
     * @param hotelService
     */
   
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
  
 
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllHotels() {
        return ResponseEntity.ok(this.hotelService.listall());
    }


}
