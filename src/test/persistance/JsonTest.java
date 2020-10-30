package persistance;

import model.Chord;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonTest {
    protected void checkChord(String name, String first, String third, String fifth, Chord chord) {
        assertEquals(name, chord.getName());
        assertEquals(first, chord.getFirst());
        assertEquals(third, chord.getThird());
        assertEquals(fifth, chord.getFifth());
    }
}
