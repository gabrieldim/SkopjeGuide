package mk.ukim.finki.skopjeguide.service;

import mk.ukim.finki.skopjeguide.model.Fountain;

import java.util.List;
/**
 * This is java interface that is implemented from every class accordingly
 */
public interface FountainService {
    /**
     * Method that is listing valus from the model
     *
     * @return
     */
    List<Fountain> listall();
}
