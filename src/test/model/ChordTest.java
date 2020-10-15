package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//test class for chord abstract class
public class ChordTest {
    private MajorChord cMajor;
    private MinorChord eMinor;
    private MinorChord fMinor;

    @BeforeEach
    public void setup() {
        cMajor = new MajorChord("CMajor", "C", "E", "G");
        eMinor = new MinorChord("EMinor", "E", "G", "B");
        fMinor = new MinorChord("FMinor", "F", "Ab", "C");
    }

    @Test
    public void testGetName() {
        assertEquals("CMajor", cMajor.getName());
        assertEquals("EMinor", eMinor.getName());
    }

    @Test
    public void testGetFirst() {
        assertEquals("E", eMinor.getFirst());
        assertEquals("C", cMajor.getFirst());
    }

    @Test
    public void testGetThird() {
        assertEquals("E", cMajor.getThird());
        assertEquals("G", eMinor.getThird());
    }

    @Test
    public void testGetFifth() {
        assertEquals("C", fMinor.getFifth());
        assertEquals("G", cMajor.getFifth());
    }

    @Test
    public void testGetAllNotesMajor() {
        assertEquals(3, cMajor.getAllNotes().size());
        assertEquals("C", cMajor.getAllNotes().get(0));
        assertEquals("E", cMajor.getAllNotes().get(1));
        assertEquals("G", cMajor.getAllNotes().get(2));
    }

    @Test
    public void testGetAllNotesMinor() {
        assertEquals(3, fMinor.getAllNotes().size());
        assertEquals("F", fMinor.getAllNotes().get(0));
        assertEquals("Ab", fMinor.getAllNotes().get(1));
        assertEquals("C", fMinor.getAllNotes().get(2));
    }
}
