package model;

import java.util.ArrayList;
import java.util.List;

//Deals with different types of music scales, that can have different number/type of notes in them
public abstract class Scale {
    protected String name;
    protected String note1;
    protected String note2;
    protected String note3;
    protected String note4;
    protected String note5;

    //EFFECTS: Gets name of scale
    public String getName() {
        return name;

    }

    //EFFECTS: Gets first/root note of scale
    public String getFirstNote() {
        return note1;

    }

    //EFFECTS: Gets second note of scale
    public String getSecondNote() {
        return note2;

    }

    //EFFECTS: Gets third note of scale
    public String getThirdNote() {
        return note3;

    }

    //EFFECTS: Gets fourth note of scale
    public String getFourthNote() {
        return note4;

    }

    //EFFECTS: Gets fifth note of scale
    public String getFifthNote() {
        return note5;

    }

    //EFFECTS: gets all names of all notes in a scale
    public abstract List<String> getAllNotes();


}
