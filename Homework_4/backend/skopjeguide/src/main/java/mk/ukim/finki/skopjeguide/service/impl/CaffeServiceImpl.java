package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Caffe;
import mk.ukim.finki.skopjeguide.repository.CaffeRepository;
import mk.ukim.finki.skopjeguide.service.CaffeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaffeServiceImpl implements CaffeService {

    private final CaffeRepository caffeRepository;

    public CaffeServiceImpl(CaffeRepository caffeRepository) {
        this.caffeRepository = caffeRepository;
    }

    @Override
    public List<Caffe> listall() {
        return this.caffeRepository.findByNameNotNull();
    }
}
