import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperationService {

    private final History history = new FileOperationStorage();

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

    public List<String> getHistory() {

        List<Operation> all = history.findAll();
        List<String> result = new ArrayList<>();

        for (Operation operation : all) {
            result.add("Result --> " + operation.getNum1() + " "
                    + operation.getType() + " "
                    + operation.getNum2() + " = "
                    + operation.getResult());
        }
        return result;
    }
}
