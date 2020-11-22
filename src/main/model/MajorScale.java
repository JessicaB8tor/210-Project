package model;

import java.util.ArrayList;
import java.util.List;

//Deals with a type of 7 note scale called a Major Scale
public class MajorScale extends Scale {
    private String note6;
    private String note7;


    public static final MajorScale C_MAJOR = new
            MajorScale("CMajor", "C", "D", "E", "F", "G", "A", "B");
    public static final MajorScale D_MAJOR = new
            MajorScale("DMajor", "D", "E", "F#", "G", "A", "B", "C#");
    public static final MajorScale E_MAJOR = new
            MajorScale("EMajor", "E", "F#", "G#", "A", "B", "C#", "D#");
    public static final MajorScale F_MAJOR = new
            MajorScale("FMajor", "F", "G", "A", "Bb", "C", "D", "E");
    public static final MajorScale G_MAJOR = new
            MajorScale("GMajor", "G", "A", "B", "C", "D", "E", "F#");
    public static final  MajorScale A_MAJOR = new
            MajorScale("AMajor", "A", "B", "C#", "D", "E", "F#", "G#");
    public static final MajorScale B_MAJOR = new
            MajorScale("BMajor", "B", "C#", "D#", "E", "F#", "G#", "A#");
    public static List<MajorScale> MAJOR_SCALES;

    //EFFECTS: Constructs a Major Scale made of a name, and 7 different notes
    public MajorScale(String name, String note1, String note2, String note3, String note4, String note5,
                      String note6, String note7) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.note5 = note5;
        this.note6 = note6;
        this.note7 = note7;
        MAJOR_SCALES = new ArrayList<>();
        MAJOR_SCALES.add(C_MAJOR);
        MAJOR_SCALES.add(D_MAJOR);
        MAJOR_SCALES.add(E_MAJOR);
        MAJOR_SCALES.add(F_MAJOR);
        MAJOR_SCALES.add(G_MAJOR);
        MAJOR_SCALES.add(A_MAJOR);
        MAJOR_SCALES.add(B_MAJOR);


    }

    //EFFECTS: gets the sixth note in the scale
    public String getSixthNote() {
        return note6;

    }

    //EFFECTS: gets the seventh note in the scale
    public String getSeventhNote() {
        return note7;

    }

    //EFFECTS: returns all notes in a given major scale
    @Override
    public List<String> getAllNotes() {
        List<String> notes = new ArrayList<>();
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        notes.add(note5);
        notes.add(note6);
        notes.add(note7);
        return notes;
    }
}
