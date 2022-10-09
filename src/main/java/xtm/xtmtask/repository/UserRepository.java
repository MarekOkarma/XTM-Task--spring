package xtm.xtmtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xtm.xtmtask.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findBySurname(String surname);
}
