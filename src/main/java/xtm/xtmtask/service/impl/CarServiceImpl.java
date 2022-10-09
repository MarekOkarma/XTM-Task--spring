package xtm.xtmtask.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import xtm.xtmtask.model.Car;
import xtm.xtmtask.repository.CarRepository;
import xtm.xtmtask.service.CarService;

import java.util.List;

@Slf4j
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);

    }

    @Override
    public void deleteByRegistrationNumber(String registrationNumber) {
        Car car = getByRegistrationNumber(registrationNumber);
        carRepository.deleteById(car.getId());

    }

    @Override
    public Car getById(Integer id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car getByRegistrationNumber(String registrationNumber) {
        return carRepository.findCarByRegistrationNumber(registrationNumber);
    }

    @Override
    public void update(Car car) {
        carRepository.save(car);

    }
}
