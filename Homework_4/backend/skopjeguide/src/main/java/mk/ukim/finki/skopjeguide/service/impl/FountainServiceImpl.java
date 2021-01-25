package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Fountain;
import mk.ukim.finki.skopjeguide.repository.FountainRepository;
import mk.ukim.finki.skopjeguide.service.FountainService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FountainServiceImpl implements FountainService {

    private final FountainRepository fountainRepository;

    public FountainServiceImpl(FountainRepository fountainRepository) {
        this.fountainRepository = fountainRepository;
    }

    @Override
    public List<Fountain> listall() {
        return this.fountainRepository.findByNameNotNull();
    }
}
