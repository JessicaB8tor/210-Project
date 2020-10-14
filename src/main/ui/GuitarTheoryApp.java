package ui;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//This class is heavily inspired by the TellerApp repo
//Many methods inside this UI class are inspired by the TellerApp UI class
//including the methods runGuitarTheoryApp, init, displayMenu, and ProcessCommand
public class GuitarTheoryApp {
    private FavouriteChords favourites;
    private ChordProgression progression;
    private Scanner input;
    private String chords;


    //EFFECTS: run the guitar theory application
    public GuitarTheoryApp() {
        runGuitarTheoryApp();
    }

    //MODIFIES: this
    //EFFECTS: processes user input
    private void runGuitarTheoryApp() {
        boolean keepGoing = true;
        String command = null;
        init();

        while (keepGoing) {
            displayMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processCommand(command);
            }
        }
    }


    //MODIFIES: this
    //EFFECTS: initializes user saved lists
    private void init() {
        input = new Scanner(System.in);
        favourites = new FavouriteChords();
        progression = new ChordProgression();
        chords = new String();


    }


    //EFFECTS: displays options available to user
    private void displayMenu() {
        System.out.println("\tc -> Chords");
        System.out.println("\ts -> Scales");
        System.out.println("\tfaves -> Favourites");
        System.out.println("\tprogression -> My Chord Progression");
        System.out.println("\tq -> Quit");

    }

    //MODIFIES: this
    //EFFECTS: processes user command
    private void processCommand(String command) {
        if (command.equals("c")) {
            System.out.println("\tmajc -> Major Chords");
            System.out.println("\tminc -> Minor Chords");
        } else if (command.equals("s")) {
            System.out.println("\tmajs -> Major Scales");
            System.out.println("\tmps -> Minor Pentatonic Scales");
        } else if (command.equals("majc")) {
            processChordCommand("majc");
        } else if (command.equals("minc")) {
            processChordCommand("minc");
        } else if (command.equals("majs")) {
            processScaleCommand("majs");
        } else if (command.equals("mps")) {
            processScaleCommand("mps");
        } else if (command.equals("faves")) {
            addToFavouritesList();
        } else if (command.equals("progression")) {
            makeProgression();
        } else {
            processMajorChordCommands(command);

        }
    }

    //REQUIRES: Command is a chord command "majc", "minc" etc.
    //MODIFIES: this
    //EFFECTS: processes user chord command
    private void processChordCommand(String command) {
        if (command.equals("majc")) {
            System.out.println("\tcmajor -> C Major");
            System.out.println("\tdmajor -> D Major");
            System.out.println("\temajor -> E Major");
            System.out.println("\tfmajor -> F Major");
            System.out.println("\tgmajor -> G Major");
            System.out.println("\tamajor -> A Major");
            System.out.println("\tbmajor -> B Major");

        } else if (command.equals("minc")) {
            System.out.println("\tcminor -> C Minor");
            System.out.println("\tdminor -> D Minor");
            System.out.println("\teminor -> E Minor");
            System.out.println("\tfminor -> F Minor");
            System.out.println("\tgminor -> G Minor");
            System.out.println("\taminor -> A Minor");
            System.out.println("\tbminor -> B Minor");

        }
    }


    //REQUIRES: command is a scale command "majs", "mps" etc.
    //MODIFIES: this
    //EFFECTS: processes user scale command
    private void processScaleCommand(String command) {
        if (command.equals("majs")) {
            System.out.println("\tcmajorscale -> C Major Scale");
            System.out.println("\tdmajorscale -> D Major Scale");
            System.out.println("\temajorscale -> E Major Scale");
            System.out.println("\tfmajorscale -> F Major Scale");
            System.out.println("\tgmajorscale -> G Major Scale");
            System.out.println("\tamajorscale -> A Major Scale");
            System.out.println("\tbmajorscale -> B Major Scale");
        } else if (command.equals("mps")) {
            System.out.println("\tcmp -> C Minor Pentatonic");
            System.out.println("\tdmp -> D Minor Pentatonic");
            System.out.println("\temp -> E Minor Pentatonic");
            System.out.println("\tfmp -> F Minor Pentatonic");
            System.out.println("\tgmp -> G Minor Pentatonic");
            System.out.println("\tamp -> A Minor Pentatonic");
            System.out.println("\tbmp -> B Minor Pentatonic");
        }

    }

    //REQUIRES: command is a major chord command
    //MODIFIES: this
    //EFFECTS: processes major chord commands to print name of notes in each chord
    private void processMajorChordCommands(String command) {
        if (command.equals("cmajor")) {
            System.out.println(MajorChord.C_MAJOR.getAllNotes());
        } else if (command.equals("dmajor")) {
            System.out.println(MajorChord.D_MAJOR.getAllNotes());
        } else if (command.equals("emajor")) {
            System.out.println(MajorChord.E_MAJOR.getAllNotes());
        } else if (command.equals("fmajor")) {
            System.out.println(MajorChord.F_MAJOR.getAllNotes());
        } else if (command.equals("gmajor")) {
            System.out.println(MajorChord.G_MAJOR.getAllNotes());
        } else if (command.equals("amajor")) {
            System.out.println(MajorChord.A_MAJOR.getAllNotes());
        } else if (command.equals("bmajor")) {
            System.out.println(MajorChord.B_MAJOR.getAllNotes());
        } else {
            processMinorChordCommands(command);
        }
    }


    //REQUIRES: command is a minor chord command
    //MODIFIES: this
    //EFFECTS: processes minor chord commands to print name of notes in each chord
    private void processMinorChordCommands(String command) {
        if (command.equals("cminor")) {
            System.out.println(MinorChord.C_MINOR.getAllNotes());
        } else if (command.equals("dminor")) {
            System.out.println(MinorChord.D_MINOR.getAllNotes());
        } else if (command.equals("eminor")) {
            System.out.println(MinorChord.E_MINOR.getAllNotes());
        } else if (command.equals("fminor")) {
            System.out.println(MinorChord.F_MINOR.getAllNotes());
        } else if (command.equals("gminor")) {
            System.out.println(MinorChord.G_MINOR.getAllNotes());
        } else if (command.equals("aminor")) {
            System.out.println(MinorChord.A_MINOR.getAllNotes());
        } else if (command.equals("bminor")) {
            System.out.println(MinorChord.B_MINOR.getAllNotes());
        } else {
            processMajorScaleCommands(command);
        }
    }

    //REQUIRES: command is a major scale command
    //MODIFIES: this
    //EFFECTS: processes major scale commands to print names of notes in scale
    private void processMajorScaleCommands(String command) {
        if (command.equals("cmajorscale")) {
            System.out.println(MajorScale.C_MAJOR.getAllNotes());
        } else if (command.equals("dmajorscale")) {
            System.out.println(MajorScale.D_MAJOR.getAllNotes());
        } else if (command.equals("emajorscale")) {
            System.out.println(MajorScale.E_MAJOR.getAllNotes());
        } else if (command.equals("fmajorscale")) {
            System.out.println(MajorScale.F_MAJOR.getAllNotes());
        } else if (command.equals("gmajorscale")) {
            System.out.println(MajorScale.G_MAJOR.getAllNotes());
        } else if (command.equals("amajorscale")) {
            System.out.println(MajorScale.A_MAJOR.getAllNotes());
        } else if (command.equals("bmajorscale")) {
            System.out.println(MajorScale.B_MAJOR.getAllNotes());
        } else {
            processMinorPentatonicScaleCommands(command);
        }
    }

    //REQUIRES: command is a minor pentatonic scale command
    //MODIFIES: this
    //EFFECTS: processes minor pentatonic scale commands to print name of notes in scale
    private void processMinorPentatonicScaleCommands(String command) {
        if (command.equals("cmp")) {
            System.out.println(MinorPentatonic.C_MINOR_PENTATONIC.getAllNotes());
        } else if (command.equals("dmp")) {
            System.out.println(MinorPentatonic.D_MINOR_PENTATONIC.getAllNotes());
        } else if (command.equals("emp")) {
            System.out.println(MinorPentatonic.E_MINOR_PENTATONIC.getAllNotes());
        } else if (command.equals("fmp")) {
            System.out.println(MinorPentatonic.F_MINOR_PENTATONIC.getAllNotes());
        } else if (command.equals("gmp")) {
            System.out.println(MinorPentatonic.G_MINOR_PENTATONIC.getAllNotes());
        } else if (command.equals("amp")) {
            System.out.println(MinorPentatonic.A_MINOR_PENTATONIC.getAllNotes());
        } else if (command.equals("bmp")) {
            System.out.println(MinorPentatonic.B_MINOR_PENTATONIC.getAllNotes());
        } else {
            System.out.println("Invalid Input");
        }
    }

    private void addToFavouritesList() {
        System.out.println("Which chord would you like to add?");
        String possibleChord = input.next();
        if (possibleChord.toLowerCase() == "cmajor") {
            favourites.addToFavourites(MajorChord.C_MAJOR);
        } else if (input.next().toLowerCase() == "dmajor") {
            favourites.addToFavourites(MajorChord.D_MAJOR);
        }
        System.out.println(possibleChord + "was added to favourites");
    }

    private void makeProgression() {
        System.out.println("Which chord would you like to add?");
        String progchord = input.next();
        if (progchord.toLowerCase() == "cmajor") {
            progression.addToProgression(MajorChord.C_MAJOR);
            System.out.println("Added C Major to progression");
        }


    }
}



