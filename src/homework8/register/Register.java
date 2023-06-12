package homework8.register;

public class Register {

    Contract[] array = new Contract[10];


    public void save(Contract contract) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = new Contract();
            }
        }
    }

    public void getDocumentInfo(Document document) {
        document.print();
    }
}
