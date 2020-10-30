package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//test class for chord progression class
public class ChordProgressionTest {
    private ChordProgression cp;
    private MajorChord cMajor;
    private MajorChord dMajor;
    private MajorChord eMajor;


    @BeforeEach
    public void setUp() {
        cMajor = new MajorChord("CMajor", "C", "E", "G");
        dMajor = new MajorChord("DMajor", "D", "F#", "A");
        eMajor = new MajorChord("EMajor", "E", "G#", "B");
        cp = new ChordProgression("My chord progression");

    }

    @Test
    public void testConstructor() {
        ChordProgression prog = new ChordProgression("My chord progression");
        assertEquals(0, prog.length());
    }

    @Test
    public void testAddOneToProgression() {
        cp.addToProgression(cMajor);
        assertEquals(1, cp.length());
        assertTrue(cp.includes(cMajor));


    }

    @Test
    public void testAddMultiple() {
        cp.addToProgression(cMajor);
        cp.addToProgression(dMajor);
        cp.addToProgression(eMajor);
        assertEquals(3, cp.length());
        assertTrue(cp.includes(cMajor));
        assertTrue(cp.includes(dMajor));
        assertTrue(cp.includes(eMajor));
    }

    @Test
    public void testAddSame() {
        cp.addToProgression(cMajor);
        cp.addToProgression(eMajor);
        cp.addToProgression(cMajor);
        cp.addToProgression(dMajor);
        assertEquals(4, cp.length());
        assertTrue(cp.includes(cMajor));
        assertEquals(2, cp.numTimesInProgression(cMajor));
    }

    @Test
    public void testRemoveOne() {
        cp.addToProgression(cMajor);
        cp.addToProgression(dMajor);
        cp.addToProgression(eMajor);
        cp.removeFromProgression(eMajor, 2);
        assertEquals(2, cp.length());
        assertFalse(cp.includes(eMajor));
    }

    @Test
    public void testRemoveManyDifferent() {
        cp.addToProgression(cMajor);
        cp.addToProgression(dMajor);
        cp.addToProgression(eMajor);
        cp.removeFromProgression(cMajor, 0);
        cp.removeFromProgression(dMajor, 1);
        assertEquals(1, cp.length());
        assertFalse(cp.includes(cMajor));
        assertFalse(cp.includes(dMajor));
    }

    @Test
    public void testRemoveOneOfSame() {
        cp.addToProgression(cMajor);
        cp.addToProgression(dMajor);
        cp.addToProgression(cMajor);
        cp.removeFromProgression(cMajor, 2);
        assertEquals(2, cp.length());
        assertTrue(cp.includes(cMajor));
        assertEquals(1, cp.numTimesInProgression(cMajor));
    }

    @Test
    public void testRemoveManySame() {
        cp.addToProgression(eMajor);
        cp.addToProgression(eMajor);
        cp.removeFromProgression(eMajor, 0);
        cp.removeFromProgression(eMajor, 1);
        assertEquals(0, cp.length());
        assertFalse(cp.includes(eMajor));
    }

    @Test
    public void testLength() {
        cp.addToProgression(cMajor);
        cp.addToProgression(dMajor);
        cp.addToProgression(dMajor);
        assertEquals(3, cp.length());
    }

    @Test
    public void testLengthEmpty() {
        assertEquals(0, cp.length());
    }

    @Test
    public void testIncludesDoesNotInclude() {
        cp.addToProgression(cMajor);
        cp.addToProgression(eMajor);
        assertFalse(cp.includes(dMajor));
    }

    @Test
    public void testIncludesIncludes() {
        cp.addToProgression(cMajor);
        cp.addToProgression(eMajor);
        cp.addToProgression(cMajor);
        cp.addToProgression(cMajor);
        assertTrue(cp.includes(cMajor));
    }

    @Test
    public void testNumTimesZero() {
        assertEquals(0, cp.numTimesInProgression(cMajor));
    }

    @Test
    public void testNumTimesMultiple() {
        cp.addToProgression(cMajor);
        cp.addToProgression(eMajor);
        cp.addToProgression(cMajor);
        cp.addToProgression(cMajor);
        assertEquals(3, cp.numTimesInProgression(cMajor));
    }

    @Test
    public void testGetAllNames() {
        cp.addToProgression(cMajor);
        cp.addToProgression(cMajor);
        cp.addToProgression(dMajor);
        assertEquals("CMajor", cp.getAllNames().get(0));
        assertEquals("CMajor", cp.getAllNames().get(1));
        assertEquals("DMajor", cp.getAllNames().get(2));
    }

    @Test
    public void testGetAllNamesEmpty() {
        assertEquals(0, cp.length());
        assertEquals("Empty", cp.getAllNames().get(0));
    }

}
