package repository;

import entity.User;

import java.util.Optional;

public interface UserHistory {

    void createUser(User user);

    Optional<User> getUser(String name, String password);

    int getIdByName(String name);

    User getUserByName(String name);
}