package model;

import java.util.ArrayList;
import java.util.List;

//Deals with a type of 5 note scale called a Minor Pentatonic scale
public class MinorPentatonicScale extends Scale {
    public static final MinorPentatonicScale C_MINOR_PENTATONIC =
            new MinorPentatonicScale("CMinorPentatonic", "C", "Eb", "F", "G", "Bb");
    public static final MinorPentatonicScale D_MINOR_PENTATONIC =
            new MinorPentatonicScale("DMinorPentatonic", "D", "F", "G", "A", "C");
    public static final MinorPentatonicScale E_MINOR_PENTATONIC =
            new MinorPentatonicScale("EMinorPentatonic", "E", "G", "A", "B", "D");
    public static final MinorPentatonicScale F_MINOR_PENTATONIC =
            new MinorPentatonicScale("FMinorPentatonic", "F", "Ab", "Bb", "C", "Eb");
    public static final MinorPentatonicScale G_MINOR_PENTATONIC =
            new MinorPentatonicScale("GMinorPentatonic", "G", "Bb", "C", "D", "F");
    public static final MinorPentatonicScale A_MINOR_PENTATONIC =
            new MinorPentatonicScale("AMinorPentatonic", "A", "C", "D", "E", "G");
    public static final MinorPentatonicScale B_MINOR_PENTATONIC =
            new MinorPentatonicScale("BMinorPentatonic", "B", "D", "E", "F#", "A");
    public static List<MinorPentatonicScale> MINOR_PENTATONIC_SCALES;

    //EFFECTS: Constructs a Minor Pentatonic scale made up of a name and 5 different notes
    public MinorPentatonicScale(String name, String note1, String note2, String note3, String note4, String note5) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.note5 = note5;
        MINOR_PENTATONIC_SCALES = new ArrayList<MinorPentatonicScale>();
        MINOR_PENTATONIC_SCALES.add(C_MINOR_PENTATONIC);
        MINOR_PENTATONIC_SCALES.add(D_MINOR_PENTATONIC);
        MINOR_PENTATONIC_SCALES.add(E_MINOR_PENTATONIC);
        MINOR_PENTATONIC_SCALES.add(F_MINOR_PENTATONIC);
        MINOR_PENTATONIC_SCALES.add(G_MINOR_PENTATONIC);
        MINOR_PENTATONIC_SCALES.add(A_MINOR_PENTATONIC);
        MINOR_PENTATONIC_SCALES.add(B_MINOR_PENTATONIC);
    }

    //EFFECTS: Returns all notes in a given Minor Pentatonic scale
    @Override
    public List<String> getAllNotes() {
        List<String> notes = new ArrayList<>();
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        notes.add(note5);
        return notes;
    }
}


