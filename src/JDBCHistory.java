import java.sql.*;
import java.util.List;

public class JDBCHistory implements History{
    @Override
    public void save(Operation operation) {
        try {
            Connection connection =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into calculator values  (?,?,?)");
            preparedStatement.setDouble(1, operation.getNum1());
            preparedStatement.setDouble(2, operation.getNum2());
            preparedStatement.setString(3, operation.getType());

        }catch (SQLException e){
            e.getStackTrace();
        }

    }

    @Override
    public List<Operation> findAll() {
        return null;
    }
}
