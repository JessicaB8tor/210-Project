package ui;

import java.io.FileNotFoundException;

public class Main {

    //EFFECTS: runs GuitarTheoryApp that provides various information on scales and chords
    public static void main(String[] args) {
        new GuitarTheoryApp();
        try {
            new GuitarTheoryApp();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to run application: file not found");
        }

    }
}
