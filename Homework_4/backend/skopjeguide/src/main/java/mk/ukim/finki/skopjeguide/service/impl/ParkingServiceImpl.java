package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Parking;
import mk.ukim.finki.skopjeguide.repository.ParkingRepository;
import mk.ukim.finki.skopjeguide.service.ParkingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    private final ParkingRepository parkingRepository;

    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public List<Parking> listall() {
        return this.parkingRepository.findAll();
    }
}
