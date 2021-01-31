package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Hotel;
import mk.ukim.finki.skopjeguide.repository.HotelRepository;
import mk.ukim.finki.skopjeguide.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class HotelServiceImpl implements HotelService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final HotelRepository hotelRepository;
    /**
     * Constructor
     *
     * @param hotelRepository
     */
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Hotel> listall() {
        return this.hotelRepository.findByNameNotNull();
    }
}
