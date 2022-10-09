package xtm.xtmtask.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import xtm.xtmtask.model.Car;
import xtm.xtmtask.service.CarService;

import javax.validation.Valid;

@Slf4j
@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/create")
    public String addCarFrom(ModelMap modelMap) {
        modelMap.addAttribute("emptyCar", new Car());
        return"";
    }

    @GetMapping("/cars/delete")
    public String deleteCar(@PathVariable String registrationNumber) {
        log.info("Delate car with registrationNumber" + registrationNumber);
        carService.deleteByRegistrationNumber(registrationNumber);
        return "";
    }
    @GetMapping("cars/edit")
    public String editCar (@PathVariable String registrationNumber, ModelMap modelMap){
        modelMap.addAttribute("Car",carService.getByRegistrationNumber(registrationNumber));
        return "";
    }
    @PostMapping("cars/update")
    public String updateCar(@Valid @ModelAttribute("Car") Car car) {
        log.info("Update Car: " + car);
        carService.update(car);
        return "";
    }
}
