package homework7.card;

class Main {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("DB3023423N232323", 300);
        CreditCard card2 = new CreditCard("BY4985739485N237", 200);
        CreditCard card3 = new CreditCard("RU2384298347H238", 500);

        card1.getAccountInformation();
        card2.getAccountInformation();
        card3.getAccountInformation();
        System.out.println();

        card1.withdrawMoney(240.5);
        card2.withdrawMoney(104.9);
        card3.replenishBalance(50.3);

        card1.getAccountInformation();
        card2.getAccountInformation();
        card3.getAccountInformation();

    }
}
