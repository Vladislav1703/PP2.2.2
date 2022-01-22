package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(required = false, defaultValue = "0") Integer count, Model model) {
        List<Car> carList = carService.getCars(count);
        model.addAttribute("carList", carList);
        return "carList";
    }

}
