package mk.ukim.finki.skopjeguide.web.controller;


import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import mk.ukim.finki.skopjeguide.repository.Exchange_officeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchangeOffices")
public class Exchange_officeController {
    private final Exchange_officeRepository repository;
    public Exchange_officeController(Exchange_officeRepository repository){
        this.repository=repository;
    }
    @GetMapping
    public ResponseEntity getAllExchange_Offices(){return ResponseEntity.ok(this.repository.findByNameNotNull());}
}
