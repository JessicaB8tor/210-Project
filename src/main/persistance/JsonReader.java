package persistance;

import model.Chord;
import model.ChordProgression;
import model.MajorChord;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


//This class is based off the JsonReader class in the JSON serialization demo repo, reads JSON objects/data
public class JsonReader {
    private String source;

        // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

        // EFFECTS: reads chord progression from file and returns it;
        // throws IOException if an error occurs reading data from file
    public ChordProgression read() throws IOException {
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);
        return parseChordProgression(jsonObject);
    }

        // EFFECTS: reads source file as string and returns it
    private String readFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }
        return contentBuilder.toString();
    }

        // EFFECTS: parses chord progression from JSON object and returns it
    private ChordProgression parseChordProgression(JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        ChordProgression cp = new ChordProgression(name);
        addChords(cp, jsonObject);
        return cp;
    }

        // MODIFIES: cp
        // EFFECTS: parses chords from JSON object and adds them to chord progression
    private void addChords(ChordProgression cp, JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONArray("progression");
        for (Object json : jsonArray) {
            JSONObject nextChord = (JSONObject) json;
            addChord(cp, nextChord);
        }
    }

        // MODIFIES: cp
        // EFFECTS: parses chord from JSON object and adds it to chord progression
    private void addChord(ChordProgression cp, JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        String first = jsonObject.getString("first");
        String third = jsonObject.getString("third");
        String fifth = jsonObject.getString("fifth");
        Chord chord = new MajorChord(name, first, third, fifth);
        cp.addToProgression(chord);
    }
}


