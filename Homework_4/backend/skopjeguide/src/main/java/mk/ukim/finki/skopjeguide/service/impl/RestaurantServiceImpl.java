package mk.ukim.finki.skopjeguide.service.impl;

import mk.ukim.finki.skopjeguide.model.Restaurant;
import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import mk.ukim.finki.skopjeguide.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final RestaurantRepository restaurantRepository;
    /**
     * Constructor
     *
     * @param restaurantRepository
     */
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Restaurant> listall() {
        return this.restaurantRepository.findByNameNotNull();
    }
}
