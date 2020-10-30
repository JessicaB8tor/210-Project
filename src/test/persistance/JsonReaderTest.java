package persistance;

import model.Chord;
import model.ChordProgression;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

//testclass for JSON reader class
public class JsonReaderTest extends JsonTest {


    @Test
    //Test reading a file that does not exist, expect IOException
    void testReaderNonExistentFile() {
        JsonReader reader = new JsonReader("./data/noSuchFile.json");
        try {
            ChordProgression cp = reader.read();
            fail("IOException expected");
        } catch (IOException e) {
            // pass
        }
    }

    @Test
    //Test reading a file with an empty chord progression
    void testReaderEmptyChordProgression() {
        JsonReader reader = new JsonReader("./data/testReaderEmptyProgression");
        try {
            ChordProgression cp = reader.read();
            assertEquals("My chord progression", cp.getName());
            assertEquals(0, cp.numThingies());
        } catch (IOException e) {
            fail("Couldn't read from file");
        }
    }

    @Test
    //Test reading a file including a chord progression with mulitple chords in it
    void testReaderGeneralChordProgression() {
        JsonReader reader = new JsonReader("./data/testReaderGeneralProgression");
        try {
            ChordProgression cp = reader.read();
            assertEquals("My chord progression", cp.getName());
            List<Chord> progression = cp.getChords();
            assertEquals(2, progression.size());
            checkChord("CMajor", "C", "E", "G", progression.get(0));
            checkChord("EMinor", "E", "G", "B",  progression.get(1));
        } catch (IOException e) {
            fail("Couldn't read from file");
        }
    }
}

