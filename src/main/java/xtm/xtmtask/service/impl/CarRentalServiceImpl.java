package xtm.xtmtask.service.impl;

import org.springframework.stereotype.Service;
import xtm.xtmtask.repository.CarRepository;
import xtm.xtmtask.repository.UserRepository;
import xtm.xtmtask.service.CarRentalService;


@Service
public class CarRentalServiceImpl implements CarRentalService {

    private final CarRepository carRepository;
    private final UserRepository userRepository;

    public CarRentalServiceImpl(CarRepository carRepository, UserRepository userRepository) {
        this.carRepository = carRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void wrongCarException(String surname, String registrationNumber){

    }
}
