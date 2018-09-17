package com.azizi.CarRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizi.CarRental.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
