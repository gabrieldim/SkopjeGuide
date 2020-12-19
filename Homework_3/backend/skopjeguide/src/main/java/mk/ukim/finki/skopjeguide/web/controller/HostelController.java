package mk.ukim.finki.skopjeguide.web.controller;


import mk.ukim.finki.skopjeguide.repository.HostelRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hostels")
public class HostelController {



    private final HostelRepository repository;

    public HostelController(HostelRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity getAllHostels() {
        return ResponseEntity.ok(this.repository.findByNameNotNull());
    }


}
