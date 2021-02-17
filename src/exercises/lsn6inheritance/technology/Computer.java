package exercises.lsn6inheritance.technology;

public class Computer {

    private String brand;
    private int storage;
    private int ram;

    public Computer(String brand, int storage, int ram) {
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }

    public void addRam(int newRam) {
        this.ram += newRam;
    }

    public String makeBeeDoop() {
        return "BEE DOOP!";
    }
}
