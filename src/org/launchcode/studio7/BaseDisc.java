package org.launchcode.studio7;

public abstract class BaseDisc {
    private String title;
    private String author;
    private int storageCapacity;
    private int writeSpeed;
    private int readSpeed;
    private String manufacturer;

    public BaseDisc (String title){  };

    public BaseDisc(String title, String author, int storageCapacity, int writeSpeed, int readSpeed, String manufacturer) {};


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return this.getTitle() + "\n" + this.getAuthor();
    }


}


