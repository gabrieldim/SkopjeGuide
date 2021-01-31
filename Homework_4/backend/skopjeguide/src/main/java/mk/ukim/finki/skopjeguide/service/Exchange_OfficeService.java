package mk.ukim.finki.skopjeguide.service;


import mk.ukim.finki.skopjeguide.model.Exchange_office;

import java.util.List;
/**
 * This is java interface that is implemented from every class accordingly
 */
public interface Exchange_OfficeService {
    /**
     * Method that is listing valus from the model
     *
     * @return
     */
    List<Exchange_office> listall();
}
