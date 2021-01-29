package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Hostel;
import mk.ukim.finki.skopjeguide.model.Pub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * This is java interface that extends from JpaRepository and receives two parameters.
 * First parameter represents the class name accordingly and the second is for the
 * type of value for the Id in that class.
 */

public interface PubRepository extends JpaRepository<Pub, Long> {
  
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return List<Pub>
     */
    List<Pub> findByNameNotNull();




}
