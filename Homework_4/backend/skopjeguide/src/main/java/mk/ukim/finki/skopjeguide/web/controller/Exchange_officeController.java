package mk.ukim.finki.skopjeguide.web.controller;


import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import mk.ukim.finki.skopjeguide.repository.Exchange_officeRepository;
import mk.ukim.finki.skopjeguide.service.Exchange_OfficeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchangeOffices")
@CrossOrigin("*")
public class Exchange_officeController {
    private final Exchange_OfficeService exchange_officeService;

    public Exchange_officeController(Exchange_OfficeService exchange_officeService) {
        this.exchange_officeService = exchange_officeService;
    }

    @GetMapping
    public ResponseEntity getAllExchange_Offices(){return ResponseEntity.ok(this.exchange_officeService.listall());}
}
