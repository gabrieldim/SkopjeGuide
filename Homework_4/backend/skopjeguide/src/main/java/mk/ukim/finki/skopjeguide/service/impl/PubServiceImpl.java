package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Pub;
import mk.ukim.finki.skopjeguide.repository.PubRepository;
import mk.ukim.finki.skopjeguide.service.PubService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class PubServiceImpl implements PubService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final PubRepository pubRepository;
    /**
     * Constructor
     *
     * @param pubRepository
     */
    public PubServiceImpl(PubRepository pubRepository) {
        this.pubRepository = pubRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Pub> listall() {
        return this.pubRepository.findByNameNotNull();
    }
}
