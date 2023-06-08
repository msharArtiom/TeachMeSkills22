package homework7.computer;

class RAM {

    private String name;
    private int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void getInfoRAM() {

        System.out.println("RAM: " + name + " " + volume + " GB");
    }
}
