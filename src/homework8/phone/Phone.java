package homework8.phone;

public class Phone {

    private int number;
    private String model;
    private double weight;


    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){};

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Calling " + name);
    }
    public void receiveCall(String name, int number){
        System.out.println("Colling " + name + " from number " + number);
    }

    public void sendMessage(int... numbers) {
        for (int number : numbers) {
            System.out.println("Sending a message to a number " + number);
        }
    }
    public void print(){
        System.out.println("number " + number + "\n" +
                "model " + model + "\n" +
                "weight " + weight + "\n\n");
    }
}
