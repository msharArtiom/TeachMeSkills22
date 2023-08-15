import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationStorage implements History {


    private final List<Operation> operations = new ArrayList<>();
    @Override
    public void save(Operation operation) {

        try (FileWriter file = new FileWriter("history.txt")) {

            file.append("Result --> " + operation.getNum1() + " "
                    + operation.getType() + " "
                    + operation.getNum2() + " = "
                    + operation.getResult());
            file.append((char) 10);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<Operation> findAll() {
       return (List<Operation>) new UnsupportedOperationException();
    }
}
