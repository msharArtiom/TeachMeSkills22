package homework8.register;

import java.util.Date;

class Contract implements Document{

  private Integer documentNumber;
  private Date date;

  public Contract(Integer documentNumber, Date date) {
    this.documentNumber = documentNumber;
    this.date = date;
  }

  Contract() {
  }

  public Integer getDocumentNumber() {
    return documentNumber;
  }

  public Date getDate() {
    return date;
  }

  @Override
  public void print() {
    System.out.println("Contract number: " + this.documentNumber);
    System.out.println("Document date: " + this.date);
  }
}
