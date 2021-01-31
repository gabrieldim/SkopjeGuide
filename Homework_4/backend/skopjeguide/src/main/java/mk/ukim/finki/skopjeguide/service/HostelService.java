package mk.ukim.finki.skopjeguide.service;


import mk.ukim.finki.skopjeguide.model.Hostel;

import java.util.List;
/**
 * This is java interface that is implemented from every class accordingly
 */
public interface HostelService {
    /**
     * Method that is listing valus from the model
     *
     * @return
     */
    List<Hostel> listall();

}
