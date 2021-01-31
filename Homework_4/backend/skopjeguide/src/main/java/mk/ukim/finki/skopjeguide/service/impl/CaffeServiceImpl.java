package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Caffe;
import mk.ukim.finki.skopjeguide.repository.CaffeRepository;
import mk.ukim.finki.skopjeguide.service.CaffeService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class CaffeServiceImpl implements CaffeService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final CaffeRepository caffeRepository;
    /**
     * Constructor
     *
     * @param caffeRepository
     */
    public CaffeServiceImpl(CaffeRepository caffeRepository) {
        this.caffeRepository = caffeRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Caffe> listall() {
        return this.caffeRepository.findByNameNotNull();
    }
}
