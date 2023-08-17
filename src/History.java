import java.sql.SQLException;
import java.util.List;

public interface History {

    void save(Operation operation) throws SQLException;

    List<Operation> findAll();
}
