package homework8.register;

import java.util.Date;
class FinancialInvoice extends Contract {

    private double sumForMonth;
    private int departmentCode;

    public FinancialInvoice(Integer documentNumber, Date date, double sumForMonth, int departmentCode) {
        super(documentNumber, date);
        this.sumForMonth = sumForMonth;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(Integer documentNumber, Date date) {
        super(documentNumber, date);
    }

    public double getSumForMonth() {
        return sumForMonth;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    @Override
    public void print() {
        System.out.println("Finance invoice number: " + this.getDocumentNumber());
        System.out.println("Date: " + this.getDate());
        System.out.println("Department code: " + this.departmentCode);
        System.out.println("Total amount: " + this.sumForMonth);
    }
}
