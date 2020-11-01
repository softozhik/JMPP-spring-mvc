package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") Integer count, ModelMap model) {
        CarsDao messages = new CarsDao();
        model.addAttribute("cars", messages.getSomeCars(count));
        return "cars";
    }
}
