package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Fountain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FountainRepository extends JpaRepository<Fountain,Long> {
}
