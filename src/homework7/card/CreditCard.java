package homework7.card;


class CreditCard {

    private String accountNumber;
    private double cartMoney;

    public CreditCard(String accountNumber, double cartMoney) {
        this.accountNumber = accountNumber;
        this.cartMoney = cartMoney;
    }

    public void withdrawMoney(double money) {

        if (cartMoney > money) {
            cartMoney -= money;
        } else System.out.println("Not enough funds, you have" + cartMoney + " money");
    }

    public void replenishBalance(double money) {
        if (money > 0) {
            cartMoney += money;
        } else System.out.println("Error");

    }

    public void getAccountInformation() {

        System.out.println("Account number" + accountNumber + "\n"
                + "Cart money = " + cartMoney);
    }

}
