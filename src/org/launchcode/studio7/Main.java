package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD music = new CD("Summer Jamz", 80, 20, 80, 12);

        DVD movie = new DVD("Avatar", 300, 40, 120, 127);
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println("Spin methods:");
        music.spinDisc();
        movie.spinDisc();

        System.out.println("\n");

        System.out.println("Store methods:");
        music.storeData();
        movie.storeData();

        System.out.println("\n");

        System.out.println("Write methods:");
        music.writeData();
        movie.writeData();

        System.out.println("\n");

        System.out.println("Read methods:");
        music.readData();
        movie.readData();

        System.out.println("\n");

        System.out.println("Report basic info methods:");
        music.reportInfo();
        movie.reportInfo();

        System.out.println("\n");

        System.out.println("Store physical disc methods:");
        music.storeDisc();
        movie.storeDisc();

        System.out.println("\n");

        System.out.println("Microwave methods:");
        music.microwaveDisc();
        movie.microwaveDisc();

    }
}
