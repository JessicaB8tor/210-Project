package model;

import java.util.ArrayList;
import java.util.List;

public class MajorScale extends Scale {
    private String note6;
    private String note7;
    private static final MajorScale cMajor = new
            MajorScale("CMajor", "C", "D", "E", "F", "G", "A", "B");
    private static final MajorScale dMajor = new
            MajorScale("DMajor", "D", "E", "F#", "G", "A", "B", "C#");
    private static final MajorScale eMajor = new
            MajorScale("EMajor", "E", "F#", "G#", "A", "B", "C#", "D#");
    private static final MajorScale fMajor = new
            MajorScale("FMajor", "F", "G", "A", "Bb", "C", "D", "E");
    private static final MajorScale gMajor = new
            MajorScale("GMajor", "G", "A", "B", "C", "D", "E", "F#");
    private static final  MajorScale aMajor = new
            MajorScale("AMajor", "A", "B", "C#", "D", "E", "F#", "G#");
    private static final MajorScale bMajor = new
            MajorScale("BMajor", "B", "C#", "D#", "E", "F#", "G#", "A#");

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
