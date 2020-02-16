package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD musicDisc = new CD("Summer Jamz", "Various Artists", 80, 20, 80, "Memorex");

        DVD movie = new DVD("Avatar", "Christopher Nolan", 300, 40, 120, "Digitex");
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        musicDisc.microwaveDisc();
        movie.microwaveDisc();
    }
}
