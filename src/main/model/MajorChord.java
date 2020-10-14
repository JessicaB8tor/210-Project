package model;

import java.util.ArrayList;
import java.util.List;

public class MajorChord extends Chord {
    public static final MajorChord C_MAJOR = new MajorChord("CMajor", "C", "E", "G");
    public static final MajorChord D_MAJOR = new MajorChord("DMajor", "D", "F#", "A");
    public static final MajorChord E_MAJOR = new MajorChord("EMajor", "E", "G#", "B");
    public static final MajorChord F_MAJOR = new MajorChord("FMajor", "F", "A", "C");
    public static final MajorChord G_MAJOR = new MajorChord("GMajor", "G", "B", "D");
    public static final MajorChord A_MAJOR = new MajorChord("AMajor", "A", "C#", "E");
    public static final MajorChord B_MAJOR = new MajorChord("BMajor", "B", "D#", "F#");
    public static List<MajorChord> MAJOR_CHORDS;


    public MajorChord(String name, String first, String third, String fifth) {

        super(name, first, third, fifth);
        MAJOR_CHORDS = new ArrayList<MajorChord>();
        MAJOR_CHORDS.add(C_MAJOR);
        MAJOR_CHORDS.add(D_MAJOR);
        MAJOR_CHORDS.add(E_MAJOR);
        MAJOR_CHORDS.add(F_MAJOR);
        MAJOR_CHORDS.add(G_MAJOR);
        MAJOR_CHORDS.add(A_MAJOR);
        MAJOR_CHORDS.add(B_MAJOR);
    }


}
