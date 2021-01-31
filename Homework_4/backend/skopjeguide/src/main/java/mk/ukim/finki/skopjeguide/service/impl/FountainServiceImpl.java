package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Fountain;
import mk.ukim.finki.skopjeguide.repository.FountainRepository;
import mk.ukim.finki.skopjeguide.service.FountainService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class FountainServiceImpl implements FountainService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final FountainRepository fountainRepository;
    /**
     * Constructor
     *
     * @param fountainRepository
     */
    public FountainServiceImpl(FountainRepository fountainRepository) {
        this.fountainRepository = fountainRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Fountain> listall() {
        return this.fountainRepository.findByNameNotNull();
    }
}
