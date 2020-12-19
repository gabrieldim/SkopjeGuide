package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Exchange_office;
import mk.ukim.finki.skopjeguide.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
    List<Hospital> findByNameNotNull();
}
