package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import model.MajorChord;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorChordTest {
    private List<MajorChord> mc;
    private MajorChord cMajor;
    private MajorChord dMajor;
    private MajorChord eMajor;

    @BeforeEach
    public void setup() {
        cMajor = new MajorChord("CMajor", "C", "E", "G");
        dMajor = new MajorChord("DMajor", "D", "F#", "A");
        eMajor = new MajorChord("EMajor", "E", "G#", "B");
        mc = new ArrayList<MajorChord>();
        mc.add(cMajor);
        mc.add(dMajor);
        mc.add(eMajor);



    }

    @Test
    public void testGetAllNames() {

    }
}
