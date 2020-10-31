package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<Cars> messages = new ArrayList<>();
        messages.add(new Cars("Mersedes", "model2", "12a12"));
        messages.add(new Cars("BMW", "B3", "384vc3"));
        messages.add(new Cars("Волга", "5641", "gh651"));
        messages.add(new Cars("Toyota", "t453", "09tre56"));
        messages.add(new Cars("Opel", "po5", "65n54"));

        model.addAttribute("cars", messages);
        return "cars";
    }
}
