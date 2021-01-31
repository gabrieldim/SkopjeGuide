package mk.ukim.finki.skopjeguide.service;


import mk.ukim.finki.skopjeguide.model.Caffe;

import java.util.List;
/**
 * This is java interface that is implemented from every class accordingly
 */
public interface CaffeService {
    /**
     * Method that is listing valus from the model
     *
     * @return
     */
    List<Caffe> listall();
}
