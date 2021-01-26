package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Exchange_office;
import mk.ukim.finki.skopjeguide.model.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HostelRepository extends JpaRepository<Hostel,Long> {
    List<Hostel> findByNameNotNull();
}
