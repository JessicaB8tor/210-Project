package model;

import java.util.ArrayList;
import java.util.List;

public class Chords {
    public static List<MajorChord> MAJOR_CHORDS;
    public static List<MinorChord> MINOR_CHORDS;

    public Chords(String name, String chord1, String chord2, String chord3, String chord4, String chord5,
            String chord6, String chord7) {
        MAJOR_CHORDS = new ArrayList<MajorChord>();
        MINOR_CHORDS = new ArrayList<MinorChord>();
        MAJOR_CHORDS.add(MajorChord.C_MAJOR);
        MAJOR_CHORDS.add(MajorChord.D_MAJOR);
        MAJOR_CHORDS.add(MajorChord.E_MAJOR);
        MAJOR_CHORDS.add(MajorChord.F_MAJOR);
        MAJOR_CHORDS.add(MajorChord.G_MAJOR);
        MAJOR_CHORDS.add(MajorChord.A_MAJOR);
        MAJOR_CHORDS.add(MajorChord.B_MAJOR);
        MINOR_CHORDS.add(MinorChord.C_MINOR);
        MINOR_CHORDS.add(MinorChord.D_MINOR);
        MINOR_CHORDS.add(MinorChord.E_MINOR);
        MINOR_CHORDS.add(MinorChord.F_MINOR);
        MINOR_CHORDS.add(MinorChord.G_MINOR);
        MINOR_CHORDS.add(MinorChord.A_MINOR);
        MINOR_CHORDS.add(MinorChord.B_MINOR);

    }

    public String getAllChordNames(List<Chord> chords) {
        String chordNames = new String();
        for (Chord c: chords) {
            chordNames = chordNames + c.getName();
        }
        return chordNames;
    }
}
