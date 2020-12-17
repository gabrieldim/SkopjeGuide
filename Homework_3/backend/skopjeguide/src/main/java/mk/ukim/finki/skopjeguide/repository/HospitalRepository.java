package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
}
