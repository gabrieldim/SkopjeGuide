package mk.ukim.finki.skopjeguide.web.controller;

import mk.ukim.finki.skopjeguide.repository.MotelsRepository;
import mk.ukim.finki.skopjeguide.service.MotelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motels")
@CrossOrigin("*")
public class MotelsController {

    private final MotelService motelService;

    public MotelsController(MotelService motelService) {
        this.motelService = motelService;
    }

    @GetMapping
    public ResponseEntity getAllMotels() {
        return ResponseEntity.ok(this.motelService.listall());
    }
}
