package homework8.phone;

class Main {

    public static void main(String[] args) {

        Phone apple = new Phone(4443333, "14", 6);
        Phone samsung = new Phone(1234567, "S20", 9);
        Phone pixel = new Phone(1222344, "3", 5);


        apple.print();
        samsung.print();
        pixel.print();

        System.out.println();

        apple.receiveCall("Vova");
        samsung.receiveCall("Lena");
        pixel.receiveCall("Vlad");

        System.out.println("apple number is " + apple.getNumber());
        System.out.println("samsung number is " + samsung.getNumber());
        System.out.println("pixel number is " + pixel.getNumber());


        apple.receiveCall("Vova", 4443333);
        samsung.receiveCall("Lena", 1234567);
        pixel.receiveCall("Vlad", 1222344);


        apple.sendMessage(234234234, 234234234, 352323423, 234234234);
        samsung.sendMessage(2342,3234234,23242342);
        pixel.sendMessage(38457983);
    }
}
