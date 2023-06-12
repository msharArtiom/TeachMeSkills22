package homework8.register;

import java.util.Date;

class EmployeeContract extends Contract {

    private String name;
    private Date endDate;

    public String getName() {
        return name;
    }

    public Date getEndDate() {
        return endDate;
    }

    public EmployeeContract(Integer documentNumber, Date date, String name, Date endDate) {
        super(documentNumber, date);
        this.name = name;
        this.endDate = endDate;
    }

    @Override
    public void print() {
        System.out.println("Employee contract number: " + this.getDocumentNumber());
        System.out.println("Employee contract date: " + this.getDate());
        System.out.println("End date: " + this.endDate);
        System.out.println("Employee name: " + this.name);

    }
}
