package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Hostel;
import mk.ukim.finki.skopjeguide.repository.HostelRepository;
import mk.ukim.finki.skopjeguide.service.HostelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelServiceImpl implements HostelService {

    private final HostelRepository hostelRepository;

    public HostelServiceImpl(HostelRepository hostelRepository) {
        this.hostelRepository = hostelRepository;
    }

    @Override
    public List<Hostel> listall() {
        return this.hostelRepository.findByNameNotNull();
    }
}
