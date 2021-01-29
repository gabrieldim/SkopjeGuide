package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Pub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PubRepository extends JpaRepository<Pub, Long> {
    List<Pub> findByNameNotNull();

}
