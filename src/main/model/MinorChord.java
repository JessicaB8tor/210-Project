package model;

public class MinorChord extends Chord {
    private static final MinorChord cMinor = new MinorChord("CMinor", "C", "Eb", "G");
    private static final MinorChord dMinor = new MinorChord("DMinor", "D", "F", "A");
    private static final MinorChord eMinor = new MinorChord("EMinor", "E", "G", "B");
    private static final MinorChord fMinor = new MinorChord("FMinor", "F", "Ab", "C");
    private static final MinorChord gMinor = new MinorChord("GMinor", "G", "Bb", "D");
    private static final MinorChord aMinor = new MinorChord("AMinor", "A", "C", "E");
    private static final MinorChord bMinor = new MinorChord("BMinor", "B", "D", "F#");

    public MinorChord(String name, String first, String third, String fifth) {
        super(name, first, third, fifth);
    }

}
