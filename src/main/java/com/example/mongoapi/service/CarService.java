package com.example.mongoapi.service;

import com.example.mongoapi.document.Car;
import com.example.mongoapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository ;

    //Retorna todos los carros que tenemos en la DB
    public List<Car> findAll(){
        List<Car> cars = carRepository.findAll();
        return cars;
    }

    //Retorna un solo carro, necesita el _id
    public Optional<Car> find(String id){
        Optional<Car> car = carRepository.findById(id);
        return car ;
    }

    //Borra un carro por id
    public Boolean destroy(String id){
        boolean status = false ;

        try{
            carRepository.deleteById(id);
            status = true ;
        }catch (Exception e){
            System.err.println(e);
        }

        return status;
    }
}