package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Motel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotelsRepository extends JpaRepository<Motel, Long> {

    List<Motel> findByNameNotNull();

}
