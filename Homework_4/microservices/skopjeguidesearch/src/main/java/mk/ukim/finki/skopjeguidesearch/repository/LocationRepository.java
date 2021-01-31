package mk.ukim.finki.skopjeguidesearch.repository;
import mk.ukim.finki.skopjeguidesearch.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location,Long> {
    List<Location> findAllByNameLike(String name);
}
