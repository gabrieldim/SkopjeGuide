package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelRepository extends JpaRepository<Hostel,Long> {
}
