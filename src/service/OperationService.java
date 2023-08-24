package service;

import entity.Operation;
import repository.History;
import repository.JDBCHistory;
import repository.Session;

import java.sql.SQLException;
import java.util.List;

public class OperationService {

    private final History history = new JDBCHistory();

    public Operation calculate(Operation operation) throws SQLException {
        switch (operation.getType()) {
            case "sum" -> {
                operation.setResult(operation.getNum1() + operation.getNum2());
                history.save(operation);
            }
            case "sub" -> {
                operation.setResult(operation.getNum1() - operation.getNum2());
                history.save(operation);
            }
            case "mul" -> {
                operation.setResult(operation.getNum1() * operation.getNum2());
                history.save(operation);
            }
            case "div" -> {
                operation.setResult(operation.getNum1() / operation.getNum2());
                history.save(operation);
            }

        }
        return operation;
    }

    public List<Operation> getHistory(Session session) {

        return history.findAll(session.getUser());

    }
}
