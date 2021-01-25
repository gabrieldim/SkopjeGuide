package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Motel;
import mk.ukim.finki.skopjeguide.repository.MotelsRepository;
import mk.ukim.finki.skopjeguide.service.MotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotelServiceImpl implements MotelService {

    private final MotelsRepository motelsRepository;

    public MotelServiceImpl(MotelsRepository motelsRepository) {
        this.motelsRepository = motelsRepository;
    }

    @Override
    public List<Motel> listall() {
        return this.motelsRepository.findAll();
    }
}
