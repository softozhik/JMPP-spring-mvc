package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsService {

    @Autowired
    CarsDao carsDao = new CarsDao();

    public List<Cars> getSomeCars(int count) {
        List<Cars> someCars = new ArrayList<>();
        int i = 0;
        while (i < 5 && i < count) {
            someCars.add(carsDao.getAllCars().get(i));
            i++;
        }
        return someCars;
    }

    public CarsService() {}
}
