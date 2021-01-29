package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Exchange_office;
import mk.ukim.finki.skopjeguide.repository.Exchange_officeRepository;
import mk.ukim.finki.skopjeguide.service.Exchange_OfficeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Exchange_OfficeServiceImpl implements Exchange_OfficeService {

    private final Exchange_officeRepository exchange_officeRepository;

    public Exchange_OfficeServiceImpl(Exchange_officeRepository exchange_officeRepository) {
        this.exchange_officeRepository = exchange_officeRepository;
    }

    @Override
    public List<Exchange_office> listall() {
        return this.exchange_officeRepository.findByNameNotNull();
    }
}
