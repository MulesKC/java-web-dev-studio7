package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    private int numTracks;

    public CD(String title) {
        super(title);
    }

    public CD(String title, int storageCapacity, int writeSpeed, int readSpeed, int numTracks) {
        super(title, storageCapacity, writeSpeed, readSpeed);

        this.numTracks = numTracks;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    @Override
    public void spinDisc() {
        System.out.println("The disc spins at " + spinSpeed + "rpm");

    }

    @Override
    public void storeData() {
        System.out.println("Storing a few bites");

    }

    @Override
    public void writeData() {
        System.out.println("Writing data at " + getWriteSpeed() + "MB/sec");

    }

    @Override
    public void readData() {
        System.out.println("Reading data at " + getReadSpeed() + "MB/sec");

    }

    @Override
    public void reportInfo() {
        System.out.println("Bleep bloop, reporting information from CD");

    }

    @Override
    public void storeDisc() {
        System.out.println("Putting " + this.getTitle() + " in the giant CD binder");

    }

    @Override
    public void microwaveDisc() {
        System.out.println("Your CD is making pretty fireworks! It's broken now.");

    }


// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
