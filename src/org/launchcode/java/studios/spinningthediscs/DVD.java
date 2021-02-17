package org.launchcode.java.studios.spinningthediscs;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("This disc spins at 7000rpm");
    }

    @Override
    public void readData() {
        System.out.println("This is a movie called Best In Show.");
    }
}
