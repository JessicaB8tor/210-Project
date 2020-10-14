package model;

import java.util.ArrayList;
import java.util.List;

public class MinorChord extends Chord {
    public static final MinorChord C_MINOR = new MinorChord("CMinor", "C", "Eb", "G");
    public static final MinorChord D_MINOR = new MinorChord("DMinor", "D", "F", "A");
    public static final MinorChord E_MINOR = new MinorChord("EMinor", "E", "G", "B");
    public static final MinorChord F_MINOR = new MinorChord("FMinor", "F", "Ab", "C");
    public static final MinorChord G_MINOR = new MinorChord("GMinor", "G", "Bb", "D");
    public static final MinorChord A_MINOR = new MinorChord("AMinor", "A", "C", "E");
    public static final MinorChord B_MINOR = new MinorChord("BMinor", "B", "D", "F#");
    public static List<MinorChord> MINOR_CHORDS;

    public MinorChord(String name, String first, String third, String fifth) {
        super(name, first, third, fifth);
        MINOR_CHORDS = new ArrayList<MinorChord>();
        MINOR_CHORDS.add(C_MINOR);
        MINOR_CHORDS.add(D_MINOR);
        MINOR_CHORDS.add(E_MINOR);
        MINOR_CHORDS.add(F_MINOR);
        MINOR_CHORDS.add(G_MINOR);
        MINOR_CHORDS.add(A_MINOR);
        MINOR_CHORDS.add(B_MINOR);

    }

}
