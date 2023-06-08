package homework7.computer;

public class Computer {

    private int cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void getInfo() {
        System.out.println("Model: " + model);
        System.out.println("Cost: " + cost);
        ram.getInfoRAM();
        hdd.getInfoHDD();
    }
}
