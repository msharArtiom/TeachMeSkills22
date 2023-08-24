import entity.Operation;
import entity.User;
import repository.Session;
import service.UserService;
import service.OperationService;

import java.sql.SQLException;
import java.util.List;

public class Application {

    private final ConsoleWriter consoleWriter = new ConsoleWriter();
    private final ConsoleReader consoleReader = new ConsoleReader();
    private final OperationService operationService = new OperationService();
    private final UserService userService = new UserService();
    private final Session authorizedSession = new Session();

    public void start() {
        showGuestMenu();
    }

    private void logIn() {

        int answer = (int) consoleReader.readNumber();
        switch (answer) {
            case 1 -> {
                consoleWriter.write("Enter login");
                String name = consoleReader.readeLine();
                while (!userService.canCreate(name)) {
                    consoleWriter.write("User with this name already exist. Enter unique name");
                    name = consoleReader.readeLine();
                }
                consoleWriter.write("Enter password");
                String password = consoleReader.readeLine();
                User user = userService.createUser(name, password);
                consoleWriter.write(String.format("User [%s] created\n", user.getName()));

                authorizedSession.setUser(userService.getUser(name));

            }
            case 2 -> authorization();
            default -> showGuestMenu();
        }
        showUserMenu();
    }

    private void showGuestMenu() {
        consoleWriter.write("1 - Sign in");
        consoleWriter.write("2 - Log In");
        logIn();
    }

    private void showUserMenu() {
        consoleWriter.write("1 - Calculator");
        consoleWriter.write("2 - Show History");
        consoleWriter.write("3 - Logout");
        consoleWriter.write("4 - Exit");

        int answer = (int) consoleReader.readNumber();
        switch (answer) {
            case 1 -> {
                consoleWriter.write("Enter first number ");
                double num1 = consoleReader.readNumber();

                consoleWriter.write("Enter second number ");
                double num2 = consoleReader.readNumber();

                consoleWriter.write("Choose type: sum, sub, mul, div");
                String type = consoleReader.readType();
                Operation result;
                try {
                    Operation operation = new Operation(num1, num2, type, authorizedSession.getUser().getId());
                    result = operationService.calculate(operation);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                consoleWriter.write("Result = " + result.getResult());
                showUserMenu();
            }
            case 2 -> {
                List<Operation> history = operationService.getHistory(authorizedSession);
                for (Operation operation : history) {
                    consoleWriter.write(operation.toString());
                }
                consoleWriter.write("\n");
                showUserMenu();
            }
            case 3 -> logOut();
        }
    }

    private void logOut() {
        showGuestMenu();
    }

    private void authorization() {
        consoleWriter.write("Enter login");
        String name = consoleReader.readeLine();
        consoleWriter.write("Enter password");
        String password = consoleReader.readeLine();
        if (userService.getUser(name, password).isPresent()) {
            authorizedSession.setUser(userService.getUser(name));
            showUserMenu();
        } else {
            consoleWriter.write("Invalid login or password. Try again");
            authorization();
        }
    }
}
