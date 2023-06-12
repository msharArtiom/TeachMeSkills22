package homework8.register;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Register register = new Register();

        Contract contract = new EmployeeContract(1, new Date(2009, 12, 2), "Vova",
                new Date(2020, 12, 2));

        Contract contract1 = new SupplyContract(2, new Date(2015, 5, 10), "Title1", 100);
        Contract contract2 = new FinancialInvoice(3, new Date(2015, 5, 10), 234232, 4);


        register.save(contract);
        register.save(contract1);
        register.save(contract2);

        register.getDocumentInfo(contract);
        System.out.println();
        register.getDocumentInfo(contract1);
        System.out.println();
        register.getDocumentInfo(contract2);
    }
}
