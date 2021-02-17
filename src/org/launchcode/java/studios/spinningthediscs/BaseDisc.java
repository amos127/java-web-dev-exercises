package org.launchcode.java.studios.spinningthediscs;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;

    public BaseDisc(String name, int storageCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
