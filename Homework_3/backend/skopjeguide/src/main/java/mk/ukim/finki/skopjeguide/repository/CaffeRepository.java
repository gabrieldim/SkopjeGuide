package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Attraction;
import mk.ukim.finki.skopjeguide.model.Caffe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaffeRepository extends JpaRepository<Caffe, Long> {
    List<Caffe> findByNameNotNull();
    }

