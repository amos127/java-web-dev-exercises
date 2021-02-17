package exercises.lsn6inheritance.technology;

public class Main {

    public static void main(String [] args) {

        Computer computer = new Computer("Lenovo", 512, 16);
        Laptop laptop = new Laptop("Apple", 256, 16, 13);
        SmartPhone smartphone = new SmartPhone("Samsung", 128, 8, 201);

        computer.addRam(5);
        System.out.println(laptop.isClunky());
        System.out.println(computer.makeBeeDoop());
        System.out.println(smartphone.makeBeeDoop());
        smartphone.blockFollowers(300);
    }

}
