package xtm.xtmtask.service;

import xtm.xtmtask.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void save (User user);

    void deleteBySurname (String surname);
}
