package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarsService;

@Controller
public class CarsController {
    @Autowired
    private Cars cars;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") Integer count, ModelMap model) {
        CarsService messages = new CarsService();
        model.addAttribute("cars", messages.getSomeCars(count));
        return "cars";
    }
}
