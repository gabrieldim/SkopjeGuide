package mk.ukim.finki.skopjeguide.repository;

import mk.ukim.finki.skopjeguide.model.Attraction;
import mk.ukim.finki.skopjeguide.model.Caffe;
import mk.ukim.finki.skopjeguide.model.Exchange_office;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * This is java interface that extends from JpaRepository and receives two parameters.
 * First parameter represents the class name accordingly and the second is for the
 * type of value for the Id in that class.
 */
public interface Exchange_officeRepository extends JpaRepository<Exchange_office, Long> {
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return List<Exchange_office>
     */
    List<Exchange_office> findByNameNotNull();
}
