package ui;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//This class is heavily inspired by the TellerApp repo
//Many methods inside this UI class are inspired by the TellerApp UI class
//including the methods runGuitarTheoryApp, init, displayMenu, and ProcessCommand
public class GuitarTheoryApp {
    public  FavouriteChords favourites;
    private ChordProgression progression;
    private Scanner input;
    public static final MajorChord C_MAJOR = new MajorChord("CMajor", "C", "E", "G");
    public static final MajorChord D_MAJOR = new MajorChord("DMajor", "D", "F#", "A");
    public static final MajorChord E_MAJOR = new MajorChord("EMajor", "E", "G#", "B");
    public static final MajorChord F_MAJOR = new MajorChord("FMajor", "F", "A", "C");
    public static final MajorChord G_MAJOR = new MajorChord("GMajor", "G", "B", "D");
    public static final MajorChord A_MAJOR = new MajorChord("AMajor", "A", "C#", "E");
    public static final MajorChord B_MAJOR = new MajorChord("BMajor", "B", "D#", "F#");
    public static List<MajorChord> MAJOR_CHORDS;
    public static final MinorChord C_MINOR = new MinorChord("CMinor", "C", "Eb", "G");
    public static final MinorChord D_MINOR = new MinorChord("DMinor", "D", "F", "A");
    public static final MinorChord E_MINOR = new MinorChord("EMinor", "E", "G", "B");
    public static final MinorChord F_MINOR = new MinorChord("FMinor", "F", "Ab", "C");
    public static final MinorChord G_MINOR = new MinorChord("GMinor", "G", "Bb", "D");
    public static final MinorChord A_MINOR = new MinorChord("AMinor", "A", "C", "E");
    public static final MinorChord B_MINOR = new MinorChord("BMinor", "B", "D", "F#");
    public static List<MinorChord> MINOR_CHORDS;
    public static List<String>  CHORD_OPTIONS;
    private Boolean displayMainMenu;

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
        MAJOR_CHORDS = new ArrayList<MajorChord>();
        MAJOR_CHORDS.add(C_MAJOR);
        MAJOR_CHORDS.add(D_MAJOR);
        MAJOR_CHORDS.add(E_MAJOR);
        MAJOR_CHORDS.add(F_MAJOR);
        MAJOR_CHORDS.add(G_MAJOR);
        MAJOR_CHORDS.add(A_MAJOR);
        MAJOR_CHORDS.add(B_MAJOR);
        MINOR_CHORDS = new ArrayList<MinorChord>();
        MINOR_CHORDS.add(C_MINOR);
        MINOR_CHORDS.add(D_MINOR);
        MINOR_CHORDS.add(E_MINOR);
        MINOR_CHORDS.add(F_MINOR);
        MINOR_CHORDS.add(G_MINOR);
        MINOR_CHORDS.add(A_MINOR);
        MINOR_CHORDS.add(B_MINOR);
        CHORD_OPTIONS = new ArrayList<String>();
        CHORD_OPTIONS.add("Major Chords");
    }


    //EFFECTS: displays options available to user
    private void displayMenu() {
        System.out.println("\tc -> Chords");
        System.out.println("\ts -> Scales");
        System.out.println("\tfaves -> Favourites");
        System.out.println("\tprogression -> My Chord Progression");
        System.out.println("\tq -> Quit");
    }

    private void displayChordMenu() {
        System.out.println("\tmajc -> Major Chords");
        System.out.println("\tminc -> Minor Chords");
    }


    //MODIFIES: this
    //EFFECTS: processes user command
    private void processCommand(String command) {
        if (command.equals("c")) {
            displayChordMenu();
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
            displayFavouritesList();
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
            System.out.println(C_MAJOR.getAllNotes());
        } else if (command.equals("dmajor")) {
            System.out.println(D_MAJOR.getAllNotes());
        } else if (command.equals("emajor")) {
            System.out.println(E_MAJOR.getAllNotes());
        } else if (command.equals("fmajor")) {
            System.out.println(F_MAJOR.getAllNotes());
        } else if (command.equals("gmajor")) {
            System.out.println(G_MAJOR.getAllNotes());
        } else if (command.equals("amajor")) {
            System.out.println(A_MAJOR.getAllNotes());
        } else if (command.equals("bmajor")) {
            System.out.println(B_MAJOR.getAllNotes());
        } else {
            processMinorChordCommands(command);
        }
    }


    //REQUIRES: command is a minor chord command
    //MODIFIES: this
    //EFFECTS: processes minor chord commands to print name of notes in each chord
    private void processMinorChordCommands(String command) {
        if (command.equals("cminor")) {
            System.out.println(C_MINOR.getAllNotes());
        } else if (command.equals("dminor")) {
            System.out.println(D_MINOR.getAllNotes());
        } else if (command.equals("eminor")) {
            System.out.println(E_MINOR.getAllNotes());
        } else if (command.equals("fminor")) {
            System.out.println(F_MINOR.getAllNotes());
        } else if (command.equals("gminor")) {
            System.out.println(G_MINOR.getAllNotes());
        } else if (command.equals("aminor")) {
            System.out.println(A_MINOR.getAllNotes());
        } else if (command.equals("bminor")) {
            System.out.println(B_MINOR.getAllNotes());
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


    //MODIFIES: this
    //EFFECTS: adds a selected chord to user's favourite's list
    private void addToFavouritesList() {
        System.out.println("Select 1 to add a Major Chord and Select 2 to add a Minor Chord");
        int select = input.nextInt();
        if (select == 1) {
            addMajorToFavourites();
        } else if (select == 2) {
            addMinorToFavourites();
        } else {
            System.out.println("Invalid Input");
        }
    }

    //REQUIRES: Chord must not already be in favourite's list
    //MODIFIES: this, favourite's list
    //EFFECTS: Adds a selected major chord to user's favourite's list
    private void addMajorToFavourites() {
        System.out.println("Please select an option");

        for (int o = 0; o < MAJOR_CHORDS.size(); o++) {
            System.out.printf("Enter %o for %s\n", o + 1, MAJOR_CHORDS.get(o).getName());
        }
        int selection = input.nextInt() - 1;
        if (selection >= 0 && selection < MAJOR_CHORDS.size()) {
            favourites.addToFavourites(MAJOR_CHORDS.get(selection));
            System.out.println("Added  " + MAJOR_CHORDS.get(selection).getName() + " to Favourite's List");
        } else {
            System.out.println("Invalid Input, Nothing was added to favourite's list");
        }


    }

    //REQUIRES: Chord must not already be in favourite's
    //MODIFIES: this, favourites
    //EFFECTS: adds a selected minor chord to user's favourite's list
    private void addMinorToFavourites() {
        System.out.println("Please select an option");

        for (int o = 0; o < MINOR_CHORDS.size(); o++) {
            System.out.printf("Enter %o for %s\n", o + 1, MINOR_CHORDS.get(o).getName());
        }
        int selection = input.nextInt() - 1;
        if (selection >= 0 && selection < MINOR_CHORDS.size()) {
            favourites.addToFavourites(MINOR_CHORDS.get(selection));
            System.out.println("Added  " + MINOR_CHORDS.get(selection).getName() + " to Favourite's List");
        } else {
            System.out.println("Invalid Input, Nothing was added to favourite's list");
        }

    }

    private void displayFavouritesList() {
        System.out.println(favourites.getAllNames());
    }


    //MODIFIES: this
    //EFFECTS: adds chords to a user's "My Chord Progression" list
    private void makeProgression() {
        System.out.println("Select 1 to add a Major Chord and Select 2 to add a Minor Chord");
        int select = input.nextInt();
        if (select == 1) {
            addMajorToProgression();
        } else if (select == 2)  {
            addMinorToProgression();
        } else {
            System.out.println("Invalid Input");
        }

    }

    //MODIFIES: this, progression
    //EFFECTS: adds a selected major chord to user's "My Chord Progression"
    private void addMajorToProgression() {
        System.out.println("Please select an option");

        for (int o = 0; o < MAJOR_CHORDS.size(); o++) {
            System.out.printf("Enter %o for %s\n", o + 1, MAJOR_CHORDS.get(o).getName());
        }
        int selection = input.nextInt() - 1;
        if (selection >= 0 && selection < MAJOR_CHORDS.size()) {
            progression.addToProgression(MAJOR_CHORDS.get(selection));
            System.out.println("Added  " + MAJOR_CHORDS.get(selection).getName() + " to My Chord Progression");
        } else {
            System.out.println("Nothing was added to My Chord Progression");
        }

    }

    //MODIFIES: this, progression
    //EFFECTS: adds a selected Minor Chord to a user's "My Chord Progression"
    private void addMinorToProgression() {
        System.out.println("Please select an option");

        for (int o = 0; o < MINOR_CHORDS.size(); o++) {
            System.out.printf("Enter %o for %s\n", o + 1, MINOR_CHORDS.get(o).getName());
        }
        int selection = input.nextInt() - 1;
        if (selection >= 0 && selection < MINOR_CHORDS.size()) {
            progression.addToProgression(MINOR_CHORDS.get(selection));
            System.out.println("Added  " + MINOR_CHORDS.get(selection).getName() + " to My Chord Progression");
        } else {
            System.out.println("Nothing was added to My Chord Progression");
        }


    }
}



