package web.dao;
import web.model.Cars;

import java.util.*;

public class CarsDao {

    private List<Cars> getAllCars() {
        List<Cars> allCars = new ArrayList<>();
        allCars.add(new Cars("Mersedes", "model2", "12a12"));
        allCars.add(new Cars("BMW", "B3", "384vc3"));
        allCars.add(new Cars("Волга", "5641", "gh651"));
        allCars.add(new Cars("Toyota", "t453", "09tre56"));
        allCars.add(new Cars("Opel", "po5", "65n54"));
        return allCars;
    }

    public List<Cars> getSomeCars(int count) {
        List<Cars> someCars = new ArrayList<>();
        int i = 0;
        while (i < 5 && i < count) {
            someCars.add(getAllCars().get(i));
            i++;
        }
        return someCars;
    }
}
