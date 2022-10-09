package xtm.xtmtask.service.impl;

import xtm.xtmtask.model.User;
import xtm.xtmtask.repository.UserRepository;
import xtm.xtmtask.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteBySurname(String surname) {
        User user = userRepository.findBySurname(surname);
        userRepository.deleteById(user.getId());

    }
}
