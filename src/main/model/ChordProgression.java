package model;

import org.json.JSONArray;
import org.json.JSONObject;
import persistance.Writable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//This class deals with a Chord Progression which is a list of chords that a user can add to and remove
//to as they please
public class ChordProgression implements Writable {
    private List<Chord> progression;
    private String name;

    //EFFECTS: Constructs an empty chord progression idea/list
    public ChordProgression(String name) {
        progression = new ArrayList<Chord>();
        this.name = name;

    }

    //EFFECTS: gets name of progression
    public String getName() {
        return name;
    }

    //MODIFIES: this
    //EFFECTS: Adds a chord to a progression, same chord can be added multiple times
    public void addToProgression(Chord c) {
        progression.add(c);

    }

    //REQUIRES: Chord is currently in progression
    //MODIFIES: this
    //EFFECTS: Removes a chord from a progression, if in progression more than once must select which one to remove
    public void removeFromProgression(Chord c, int i) {
        if (numTimesInProgression(c) > 1) {
            progression.remove(i);
        } else {
            progression.remove(c);
        }

    }

    //EFFECTS: returns count of how many chords in given progression
    public int length() {
        return progression.size();

    }

    //EFFECTS: returns true if chord is in chord progression
    public boolean includes(Chord c) {
        return progression.contains(c);

    }

    //EFFECTS: returns number of times a chord is in a progression
    public int numTimesInProgression(Chord c) {
        int numTimes = 0;
        for (Chord cp: progression) {
            if (cp == c) {
                numTimes++;
            }
        }
        return numTimes;


    }

    //EFFECTS: return List of names of all chords in My Progression, or "Empty" if empty
    public List<String> getAllNames() {
        List<String> myprog = new ArrayList<String>();
        for (Chord c: progression) {
            myprog.add(c.getName());
        }
        if (myprog.isEmpty()) {
            myprog.add("Empty");
        }
        return myprog;
    }

    // EFFECTS: returns an unmodifiable list of thingies in this workroom
    public List<Chord> getChords() {
        return Collections.unmodifiableList(progression);
    }

    // EFFECTS: returns number of thingies in this workroom
    public int numThingies() {
        return progression.size();
    }


    //Following 2 methods based off methods in "Workroom" of JSON Serialization repo
    @Override
    //MODIFIES: this
    //EFFECTS: Transforms Chord Progression to JSON object
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("progression", progressionToJson());
        return json;
    }

    // EFFECTS: returns things in chord progression as a jSON array
    private JSONArray progressionToJson() {
        JSONArray jsonArray = new JSONArray();

        for (Chord c : progression) {
            jsonArray.put(c.toJson());
        }

        return jsonArray;
    }
}







