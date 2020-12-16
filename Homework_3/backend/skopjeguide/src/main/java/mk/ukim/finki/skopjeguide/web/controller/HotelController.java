package mk.ukim.finki.skopjeguide.web.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hotel")
public class HotelController {
    @GetMapping
    public ResponseEntity getAllHotels() {
        return ResponseEntity.ok("All Hotels");
    }

    @GetMapping(value = "{hotelName}")
    public ResponseEntity searchByName() {

        return ResponseEntity.ok("Search by name");
    }
}
