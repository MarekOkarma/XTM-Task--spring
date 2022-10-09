package xtm.xtmtask.service;

import xtm.xtmtask.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAll();

    void save(Car car);

    void deleteByRegistrationNumber(String registrationNumber);

    Car getById (Integer id);

    Car getByRegistrationNumber(String registrationNumber);

    void update (Car car);

}
