package model;

public class MajorChord extends Chord {
    private static final MajorChord cMajor = new MajorChord("CMajor", "C", "E", "G");
    private static final MajorChord dMajor = new MajorChord("DMajor", "D", "F#", "A");
    private static final MajorChord eMajor = new MajorChord("EMajor", "E", "G#", "B");
    private static final MajorChord fMajor = new MajorChord("FMajor", "F", "A", "C");
    private static final MajorChord gMajor = new MajorChord("GMajor", "G", "B", "D");
    private static final MajorChord aMajor = new MajorChord("AMajor", "A", "C#", "E");
    private static final MajorChord bMajor = new MajorChord("BMajor", "B", "D#", "F#");

    public MajorChord(String name, String first, String third, String fifth) {
        super(name, first, third, fifth);
    }

}
