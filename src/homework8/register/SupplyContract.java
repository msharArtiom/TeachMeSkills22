package homework8.register;

import java.util.Date;
class SupplyContract extends Contract {
    private String title;
    private int products;

    public SupplyContract() {
    }

    ;

    public SupplyContract(Integer documentNumber, Date date, String title, int products) {
        super(documentNumber, date);
        this.title = title;
        this.products = products;
    }

    public SupplyContract(Integer documentNumber, Date date) {
        super(documentNumber, date);
    }

    @Override
    public void print() {
        System.out.println("Supply contract number: " + this.getDocumentNumber());
        System.out.println("Supply contract date: " + this.getDate());
        System.out.println("Type of goods: " + this.title);
        System.out.println("Quantity of goods: " + this.products);
    }
}
