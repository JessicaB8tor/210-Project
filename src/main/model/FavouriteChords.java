package model;

import java.util.ArrayList;
import java.util.List;

public class FavouriteChords {
    private List<Chord> favourites;


    //EFFECTS: Creates an empty list of user's favourite chords
    public FavouriteChords() {
        favourites = new ArrayList<Chord>();

    }

    //REQUIRES: Chord not already in favourites
    //MODIFIES: this
    //EFFECTS: adds chord to favourites list
    public void addToFavourites(Chord c) {
        favourites.add(c);

    }

    //REQUIRES: Chord in favourites list
    //MODIFIES: this
    //EFFECTS: Removes chord from favourites list
    public void removeFromFavourites(Chord c) {
        favourites.remove(c);

    }

    //EFFECTS: returns number of chords in favourites list
    public int length() {
        return favourites.size();

    }

    //EFFECTS: returns true if favourite's list includes given chord
    public boolean includes(Chord c) {
        return favourites.contains(c);
    }


}
