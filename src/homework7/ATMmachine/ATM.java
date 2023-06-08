package homework7.ATMmachine;

class ATM {

    private int numOf20;
    private int numOf50;
    private int numOf100;

    public ATM() {
    }

    public ATM(int numOf20, int numOf50, int numOf100) {
        this.numOf20 = numOf20;
        this.numOf50 = numOf50;
        this.numOf100 = numOf100;
    }

    public void addMoney(int numOf20, int numOf50, int numOf100) {
        this.numOf20 += numOf20;
        this.numOf50 += numOf50;
        this.numOf100 += numOf100;
    }

    public void getInfo() {
        System.out.println("20$ - " + numOf20 + "\n" +
                "50$ - " + numOf50 + "\n" +
                "100$ - " + numOf100);
    }
}
