package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String title) {
        super(title);
    }

    public DVD(String title, String author, int storageCapacity, int writeSpeed, int readSpeed, String manufacturer) {
        super(title, author, storageCapacity, writeSpeed, readSpeed, manufacturer);
    }

    @Override
    public void spinDisc() {
        System.out.println();
    }

    @Override
    public void storeData() {
        System.out.println();

    }

    @Override
    public void writeData() {
        System.out.println();

    }

    @Override
    public void readData() {
        System.out.println();

    }

    @Override
    public void reportInfo() {
        System.out.println();

    }

    @Override
    public void storeDisc() {
        System.out.println();

    }

    @Override
    public void microwaveDisc() {
        System.out.println("Your DVD exploded!");

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
