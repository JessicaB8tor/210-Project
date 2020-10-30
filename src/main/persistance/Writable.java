package persistance;

import org.json.JSONObject;

//This interface taken from the JSON serialization demo repo
public interface Writable {
        // EFFECTS: returns this as JSON object
    JSONObject toJson();
}

