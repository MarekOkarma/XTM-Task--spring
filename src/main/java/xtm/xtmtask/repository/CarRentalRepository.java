package xtm.xtmtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xtm.xtmtask.model.CarRental;

public interface CarRentalRepository extends JpaRepository<CarRental , Integer> {

}
