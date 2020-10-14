package model;

import java.util.ArrayList;
import java.util.List;

public class ChordProgression {
    private List<Chord> progression;

    //EFFECTS: Constructs an empty chord progression idea/list
    public ChordProgression() {
        progression = new ArrayList<Chord>();

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


}


