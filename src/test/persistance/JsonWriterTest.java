package persistance;

import model.Chord;
import model.ChordProgression;
import model.MajorChord;
import model.MinorChord;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

//Test class for the JsonWriter class
public class JsonWriterTest extends JsonTest {

    @Test
    //test writing of invalid file, expect IOException
    void testWriterInvalidFile() {
        try {
            ChordProgression cp = new ChordProgression("My chord progression");
            JsonWriter writer = new JsonWriter("./data/my\0illegal:fileName.json");
            writer.open();
            fail("IOException was expected");
        } catch (IOException e) {
            // pass
        }
    }

    @Test
    //test writing an empty chord progression
    void testWriterEmptyProgression() {
        try {
            ChordProgression cp = new ChordProgression("My chord progression");
            JsonWriter writer = new JsonWriter("./data/testWriterEmptyProgression.json");
            writer.open();
            writer.write(cp);
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterEmptyProgression.json");
            cp = reader.read();
            assertEquals("My chord progression", cp.getName());
            assertEquals(0, cp.numThingies());
        } catch (IOException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    //test writing then reading a well formed chord progression with two chords in it
    void testWriterGeneralProgression() {
        try {
            ChordProgression cp = new ChordProgression("My chord progression");
            cp.addToProgression(new MajorChord("CMajor", "C", "E", "G") {
            });
            cp.addToProgression(new MinorChord("EMinor", "E", "G", "B"));
            JsonWriter writer = new JsonWriter("./data/testWriterGeneralProgression.json");
            writer.open();
            writer.write(cp);
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterGeneralProgression.json");
            cp = reader.read();
            assertEquals("My chord progression", cp.getName());
            List<Chord> progression = cp.getChords();
            assertEquals(2, progression.size());
            checkChord("CMajor", "C", "E", "G", progression.get(0));
            checkChord("EMinor", "E", "G", "B", progression.get(1));

        } catch (IOException e) {
            fail("Exception should not have been thrown");
        }
    }

}
