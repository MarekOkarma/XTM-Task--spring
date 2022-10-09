package xtm.xtmtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xtm.xtmtask.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findCarByRegistrationNumber(String registrationNumber);
}
