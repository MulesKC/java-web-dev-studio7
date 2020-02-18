package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    private double runtime;

    public DVD(String title) {
        super(title);
    }

    public DVD(String title, int storageCapacity, int writeSpeed, int readSpeed, double runtime) {
        super(title, storageCapacity, writeSpeed, readSpeed);

        this.runtime = runtime;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    @Override
    public void spinDisc() {
        System.out.println("the disc spins at " + spinSpeed + "rpm");
    }

    @Override
    public void storeData() {
        System.out.println("Storing a few MEGA bites!");

    }

    @Override
    public void writeData() {
        System.out.println("Writing data at " + this.getWriteSpeed() + "MB/sec");

    }

    @Override
    public void readData() {
        System.out.println("Reading data at " + this.getReadSpeed() + "MB/sec");

    }

    @Override
    public void reportInfo() {
        System.out.println("Do not pirate this video");

    }

    @Override
    public void storeDisc() {
        System.out.println("Putting " + this.getTitle() + " in a random DVD case");

    }

    @Override
    public void microwaveDisc() {
        System.out.println("Your DVD exploded!");

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
