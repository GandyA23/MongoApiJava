package com.example.mongoapi.controller;

import com.example.mongoapi.document.Car;
import com.example.mongoapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/car")
@RestController
public class CarController {
    @Autowired
    private CarService carService ;

    @GetMapping("/findall")
    public List<Car> findAll(){
        return carService.findAll();
    }

    @GetMapping("/find/{id}")
    public Optional<Car> find(@PathVariable("id") String id){
        return carService.find(id);
    }

    @DeleteMapping("/destroy/{id}")
    public Boolean destroy(@PathVariable("id") String id){
        return carService.destroy(id);
    }

    @PostMapping("/save")
    public Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @PutMapping("/update")
    public Car update(@RequestBody Car car){
        return carService.save(car);
    }
}