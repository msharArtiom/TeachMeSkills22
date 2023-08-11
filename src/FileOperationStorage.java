import java.io.File;
import java.util.List;

public class FileOperationStorage implements History {

    File path = new File("history.txt");
    @Override
    public void save(Operation operation) {

    }

    @Override
    public List<Operation> findAll() {
        return null;
    }
}
