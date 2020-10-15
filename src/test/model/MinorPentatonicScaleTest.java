package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Test class for MinorPentatonicScale class
public class MinorPentatonicScaleTest {
    private MinorPentatonicScale bMinorPentatonic;

    @BeforeEach
    public void setup() {
        bMinorPentatonic = new MinorPentatonicScale
                ("BMinorPentatonic", "B", "D", "E", "F#", "A");
    }

    @Test
    public void testGetAllNotes() {
        assertEquals(5, bMinorPentatonic.getAllNotes().size());
        assertEquals("B", bMinorPentatonic.getAllNotes().get(0));
        assertEquals("D", bMinorPentatonic.getAllNotes().get(1));
        assertEquals("E", bMinorPentatonic.getAllNotes().get(2));
        assertEquals("F#", bMinorPentatonic.getAllNotes().get(3));
        assertEquals("A", bMinorPentatonic.getAllNotes().get(4));
    }


}
