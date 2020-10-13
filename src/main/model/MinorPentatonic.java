package model;

import java.util.ArrayList;
import java.util.List;

public class MinorPentatonic extends Scale {
    private static final MinorPentatonic cMinorPentatonic =
            new MinorPentatonic("CMinorPentatonic", "C", "Eb", "F", "G", "Bb");
    private static final MinorPentatonic dMinorPentatonic =
            new MinorPentatonic("DMinorPentatonic", "D", "F", "G", "A", "C");
    private static final MinorPentatonic eMinorPentatonic =
            new MinorPentatonic("EMinorPentatonic", "E", "G", "A", "B", "D");
    private static final MinorPentatonic fMinorPentatonic =
            new MinorPentatonic("FMinorPentatonic", "F", "Ab", "Bb", "C", "Eb");
    private static final MinorPentatonic gMinorPentatonic =
            new MinorPentatonic("GMinorPentatonic", "G", "Bb", "C", "D", "F");
    private static final MinorPentatonic aMinorPentatonic =
            new MinorPentatonic("AMinorPentatonic", "A", "C", "D", "E", "G");
    private static final MinorPentatonic bMinorPentatonic =
            new MinorPentatonic("BMinorPentatonic", "B", "D", "E", "F#", "A");

    public MinorPentatonic(String name, String note1, String note2, String note3, String note4, String note5) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.note5 = note5;
    }

    //EFFECTS: Returns all notes in a given Minor Pentatonic scale
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


