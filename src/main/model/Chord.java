package model;

import org.json.JSONObject;
import persistance.Writable;

import java.util.ArrayList;
import java.util.List;

//chords here are made up of a first third and fifth
public abstract class Chord implements Writable {
    private String first;
    private String third;
    private String fifth;
    private String name;                        //name of the chord


    //EFFECTS: creates a chord with the three given notes
    public Chord(String name, String first, String third, String fifth) {
        this.name = name;
        this.first = first;
        this.third = third;
        this.fifth = fifth;


    }

    //EFFECTS: gets name of chord
    public String getName() {
        return name;
    }

    //EFFECTS: gets first of chord
    public String getFirst() {
        return first;
    }

    //EFFECTS: gets third of chord
    public String getThird() {
        return third;
    }

    //EFFECTS: gets fifth of chord
    public String getFifth() {
        return fifth;
    }

    //EFFECTS: returns all notes in a given chord
    public List<String> getAllNotes() {
        List<String> notes = new ArrayList<String>();
        notes.add(first);
        notes.add(third);
        notes.add(fifth);
        return notes;

    }

    @Override
    //This method based off the toJson Method in the JSON Serialization repo
    //MODIFIES: this
    //EFFECTS: Transforms chord into a JSON Object
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("first", first);
        json.put("third", third);
        json.put("fifth", fifth);
        return json;
    }
}
