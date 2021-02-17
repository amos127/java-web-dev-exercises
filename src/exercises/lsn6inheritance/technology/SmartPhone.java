package exercises.lsn6inheritance.technology;

public class SmartPhone extends Computer {

    private int numberOfTwitterFollowers;

    public SmartPhone(String brand, int storage, int ram, int numberOfTwitterFollowers) {
        super(brand, storage, ram);
        this.numberOfTwitterFollowers = numberOfTwitterFollowers;
    }

    public void blockFollowers(int number) {
        if(this.numberOfTwitterFollowers - number < 0) {
            System.out.println("Can't block people who don't exist.");
        } else {
            this.numberOfTwitterFollowers -= number;
        }
    }

}
