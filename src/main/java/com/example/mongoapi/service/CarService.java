package com.example.mongoapi.service;

import com.example.mongoapi.document.Car;
import com.example.mongoapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository ;

    //Retorna todos los carros que tenemos en la DB
    public List<Car> findAll(){
        List<Car> cars = carRepository.findAll();
        return cars;
    }
}