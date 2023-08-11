import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationStorage implements History {
    private final List<Operation> operations = new ArrayList<>();
    @Override
    public void save(Operation operation) {
        operations.add(operation);
    }
    @Override
    public List<Operation> findAll() {
        return new ArrayList<>(this.operations);
    }
}
