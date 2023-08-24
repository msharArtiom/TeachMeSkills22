package repository;

import entity.Operation;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public interface History {

    void save(Operation operation) throws SQLException;

    List<Operation> findAll(User user);
}
