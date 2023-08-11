import java.util.List;

public interface History {

    void save(Operation operation);

    List<Operation> findAll();
}
