package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Motel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotelsRepository extends JpaRepository<Motel, Long> {
}
