package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Attraction;
import mk.ukim.finki.skopjeguide.model.Caffe;
import mk.ukim.finki.skopjeguide.model.Exchange_office;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Exchange_officeRepository extends JpaRepository<Exchange_office, Long> {
    List<Exchange_office> findByNameNotNull();
}
