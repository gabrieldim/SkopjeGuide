package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Pub;
import mk.ukim.finki.skopjeguide.repository.PubRepository;
import mk.ukim.finki.skopjeguide.service.PubService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PubServiceImpl implements PubService {

    private final PubRepository pubRepository;

    public PubServiceImpl(PubRepository pubRepository) {
        this.pubRepository = pubRepository;
    }

    @Override
    public List<Pub> listall() {
        return this.pubRepository.findAll();
    }
}
