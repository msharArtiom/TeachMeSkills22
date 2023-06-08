package homework7.computer;

class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer(1000, "Samsung");
        computer1.getInfo();

        System.out.println();

        Computer computer2 = new Computer(1500, "Dell",
                new RAM("Kingston", 16),
                new HDD("Seagate", 1000, "Internal"));
        computer2.getInfo();
    }
}
