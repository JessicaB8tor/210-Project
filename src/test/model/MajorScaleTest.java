package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MajorScaleTest {
    private MajorScale fMajor;
    @BeforeEach
    public void setup() {
        fMajor = new MajorScale
                ("FMajor", "F", "G", "A", "Bb", "C", "D", "E");


    }

    @Test
    public void testGetSixthNote() {
        assertEquals("D", fMajor.getSixthNote());
    }

    @Test
    public void testGetSeventhNote() {
        assertEquals("E", fMajor.getSeventhNote());
    }

    @Test
    public void testGetAllNotes() {
        assertEquals(7, fMajor.getAllNotes().size());
        assertEquals("F", fMajor.getAllNotes().get(0));
        assertEquals("G", fMajor.getAllNotes().get(1));
        assertEquals("A", fMajor.getAllNotes().get(2));
        assertEquals("Bb", fMajor.getAllNotes().get(3));
        assertEquals("C", fMajor.getAllNotes().get(4));
        assertEquals("D", fMajor.getAllNotes().get(5));
        assertEquals("E", fMajor.getAllNotes().get(6));
    }
}
