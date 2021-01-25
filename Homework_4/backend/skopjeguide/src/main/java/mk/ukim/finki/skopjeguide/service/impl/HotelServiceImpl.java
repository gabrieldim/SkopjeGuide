package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Hotel;
import mk.ukim.finki.skopjeguide.repository.HotelRepository;
import mk.ukim.finki.skopjeguide.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> listall() {
        return this.hotelRepository.findByNameNotNull();
    }
}
