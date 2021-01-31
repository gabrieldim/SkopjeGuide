package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Motel;
import mk.ukim.finki.skopjeguide.repository.MotelsRepository;
import mk.ukim.finki.skopjeguide.service.MotelService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class MotelServiceImpl implements MotelService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final MotelsRepository motelsRepository;
    /**
     * Constructor
     *
     * @param motelsRepository
     */
    public MotelServiceImpl(MotelsRepository motelsRepository) {
        this.motelsRepository = motelsRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Motel> listall() {
        return this.motelsRepository.findByNameNotNull();
    }
}
