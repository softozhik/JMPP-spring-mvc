package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Cars;

import java.util.*;

@Repository
public class CarsDao {

    public CarsDao() {}

    public List<Cars> getAllCars() {
        List<Cars> allCars = new ArrayList<>();
        allCars.add(new Cars("Mersedes", "model2", "12a12"));
        allCars.add(new Cars("BMW", "B3", "384vc3"));
        allCars.add(new Cars("Волга", "5641", "gh651"));
        allCars.add(new Cars("Toyota", "t453", "09tre56"));
        allCars.add(new Cars("Opel", "po5", "65n54"));
        return allCars;
    }

}
