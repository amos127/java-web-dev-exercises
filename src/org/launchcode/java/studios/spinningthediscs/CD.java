package org.launchcode.java.studios.spinningthediscs;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("This disc spins at 5400rpm");
    }

    @Override
    public void readData() {
        System.out.println("This is a music CD.");
    }
}
