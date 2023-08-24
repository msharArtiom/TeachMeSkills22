package service;

import entity.User;
import repository.JDBCUserHistory;
import repository.UserHistory;

import java.util.Optional;

public class UserService {
    private final UserHistory userHistory = new JDBCUserHistory();

    public User createUser(String login, String password) {
        User user = new User(login, password);
        userHistory.createUser(user);
        int idByName = userHistory.getIdByName(user.getName());
        if (idByName != -1) {
            user.setId(idByName);
            return user;
        }

        throw new IllegalArgumentException("User not created");
    }

    public Optional<User> getUser(String username, String password) {
        return userHistory.getUser(username, password);
    }

    public boolean canCreate(String name) {
        return userHistory.getIdByName(name) == -1;
    }

    public User getUser(String name) {
        return userHistory.getUserByName(name);
    }
}
