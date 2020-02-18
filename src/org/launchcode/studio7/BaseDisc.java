package org.launchcode.studio7;

public abstract class BaseDisc {
    private String title;
    private int storageCapacity;
    private int writeSpeed;
    private int readSpeed;
    private String manufacturer;
    public int spinSpeed;

    public BaseDisc (String title){  };

    public BaseDisc(String title, int storageCapacity, int writeSpeed, int readSpeed) {
        spinSpeed = 300;
        this.title = title;
        this.storageCapacity = storageCapacity;
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
    };


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public String getManufacturer() { return manufacturer;    }

    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer;   }

    @Override
    public String toString() {
        return this.getTitle();
    }


}


