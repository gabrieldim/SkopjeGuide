package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Parking;
import mk.ukim.finki.skopjeguide.repository.ParkingRepository;
import mk.ukim.finki.skopjeguide.service.ParkingService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class ParkingServiceImpl implements ParkingService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final ParkingRepository parkingRepository;
    /**
     * Constructor
     *
     * @param parkingRepository
     */
    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Parking> listall() {
        return this.parkingRepository.findByNameNotNull();
    }
}
