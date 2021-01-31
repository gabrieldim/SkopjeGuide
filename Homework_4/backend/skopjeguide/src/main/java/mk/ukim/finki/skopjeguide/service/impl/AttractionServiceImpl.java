package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Attraction;
import mk.ukim.finki.skopjeguide.repository.AttractionRepository;
import mk.ukim.finki.skopjeguide.service.AttractionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is class for service implementation
 */
@Service
public class AttractionServiceImpl implements AttractionService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final AttractionRepository attractionRepository;

    /**
     * Constructor
     *
     * @param attractionRepository
     */
    public AttractionServiceImpl(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Attraction> listall() {
        return this.attractionRepository.findByNameNotNull();
    }
}
