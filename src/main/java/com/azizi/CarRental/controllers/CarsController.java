package com.azizi.CarRental.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.azizi.CarRental.models.Car;
import com.azizi.CarRental.repositories.CarRepository;


@RestController
@RequestMapping("/api/b1/cars")
public class CarsController {
	@Autowired
	//inject the bikerepo
	private CarRepository carRepository ;
	@GetMapping
	 public List<Car> list(){

		return carRepository.findAll();

	}

	@PostMapping //pour demande de Post
	@ResponseStatus(HttpStatus.OK) //Pour reponse
	public void create (@RequestBody Car car) {
		carRepository.save(car); 
	}

	 @GetMapping("/{id}") //add to the path
	public Car get(@PathVariable("id") long id ) {
		return carRepository.getOne(id); 
	}
		
}
