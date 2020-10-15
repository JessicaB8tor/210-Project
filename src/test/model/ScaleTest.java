package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Test class for abstract Scale class
public class ScaleTest {
    private MinorPentatonicScale cMinorPentatonic;
    private MajorScale eMajor;


    @BeforeEach
    public void setup() {
       cMinorPentatonic = new MinorPentatonicScale
               ("CMinorPentatonic", "C", "Eb", "F", "G", "Bb");
       eMajor = new MajorScale
               ("EMajor", "E", "F#", "G#", "A", "B", "C#", "D#");
    }

    @Test
    public void testGetName() {
        assertEquals("CMinorPentatonic", cMinorPentatonic.getName());
        assertEquals("EMajor", eMajor.getName());
    }

    @Test
    public void testGetFirstNote() {
        assertEquals("C", cMinorPentatonic.getFirstNote());
        assertEquals("E", eMajor.getFirstNote());
    }

    @Test
    public void testGetSecondNote() {
        assertEquals("Eb", cMinorPentatonic.getSecondNote());
        assertEquals("F#", eMajor.getSecondNote());
    }

    @Test
    public void testGetThirdNote() {
        assertEquals("F", cMinorPentatonic.getThirdNote());
        assertEquals("G#", eMajor.getThirdNote());
    }

    @Test
    public void testGetFourthNote() {
        assertEquals("G", cMinorPentatonic.getFourthNote());
        assertEquals("A", eMajor.getFourthNote());
    }

    @Test
    public void testGetFifthNote() {
        assertEquals("Bb", cMinorPentatonic.getFifthNote());
        assertEquals("B", eMajor.getFifthNote());
    }
}
