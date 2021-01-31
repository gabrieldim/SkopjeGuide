package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Exchange_office;
import mk.ukim.finki.skopjeguide.repository.Exchange_officeRepository;
import mk.ukim.finki.skopjeguide.service.Exchange_OfficeService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class Exchange_OfficeServiceImpl implements Exchange_OfficeService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final Exchange_officeRepository exchange_officeRepository;
    /**
     * Constructor
     *
     * @param exchange_officeRepository
     */
    public Exchange_OfficeServiceImpl(Exchange_officeRepository exchange_officeRepository) {
        this.exchange_officeRepository = exchange_officeRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Exchange_office> listall() {
        return this.exchange_officeRepository.findByNameNotNull();
    }
}
