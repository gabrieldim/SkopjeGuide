package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Exchange_office;
import mk.ukim.finki.skopjeguide.model.Fountain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FountainRepository extends JpaRepository<Fountain,Long> {
    List<Fountain> findByNameNotNull();
}
