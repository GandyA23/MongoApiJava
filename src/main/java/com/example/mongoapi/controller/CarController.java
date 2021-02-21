package com.example.mongoapi.controller;

import com.example.mongoapi.document.Car;
import com.example.mongoapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}