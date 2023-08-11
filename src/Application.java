public class Application {

    private final ConsoleWriter consoleWriter = new ConsoleWriter();
    private final ConsoleReader consoleReader = new ConsoleReader();
    private final OperationService operationService = new OperationService();

    public void start(){

        while (true){
            consoleWriter.write("Enter first number ");
            double num1 = consoleReader.readNumber();
            consoleWriter.write("Enter second number ");
            double num2 = consoleReader.readNumber();
            consoleWriter.write("Choose type: sum, sub, mul, div");
            String type = consoleReader.readType();
            Operation operation = new Operation(num1, num2, type);
            Operation result = operationService.calculate(operation);
            consoleWriter.write("Result = " + result.getResult());
        }
    }
}
