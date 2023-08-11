public class OperationService {

    private final History history = new InMemoryOperationStorage();

    public Operation calculate(Operation operation) {
       switch (operation.getType()){
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


}
