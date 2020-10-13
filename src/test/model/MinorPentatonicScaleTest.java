package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinorPentatonicScaleTest {
    private MinorPentatonic bMinorPentatonic;

    @BeforeEach
    public void setup() {
        bMinorPentatonic = new MinorPentatonic
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
