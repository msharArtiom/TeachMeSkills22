package homework7.ATMmachine;

public class Main {

    public static void main(String[] args) {
        ATM atm1 = new ATM();
        ATM atm2 = new ATM(3,6,2);

        atm1.getInfo();
        atm2.getInfo();
    }
}
