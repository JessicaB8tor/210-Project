package ui;

import model.Chord;
import model.ChordProgression;
import persistance.JsonReader;
import persistance.JsonWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//GUI of main GuitarTheoryAppPanel
public class GuitarTheoryAppGUI extends JFrame implements ActionListener {
    private JFrame frame;
    private ChordProgression cp1;
    private JsonWriter jsonWriter;
    private JsonReader jsonReader;
    private ImageIcon image;
    private JLabel imageLabel;
    private static final String JSON_STORE = "./data/Progression.json";


    //Constructs main frame
    public GuitarTheoryAppGUI() {
        super("Guitar Theory App");
        jsonWriter = new JsonWriter(JSON_STORE);
        jsonReader = new JsonReader(JSON_STORE);
        cp1 = new ChordProgression("My Progression");
        frame = new JFrame();
        frame.setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        image = new ImageIcon("./data/Image.jpg");
        imageLabel = new JLabel(image);
        getContentPane().add(imageLabel);
        imageLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonSetup();
        pack();
        setVisible(true);
    }


    //This method inspired by createTools method in SimpleDrawingPlayer
    //MODIFIES: this
    //EFFECTS: Creates buttons to display on main menu
    public void buttonSetup() {
        JButton chordsButton = new JButton("Chords");
        JButton scalesButton = new JButton("Scales");
        JButton chordProgressionButton = new JButton("Chord Progression");
        JButton favouritesButton = new JButton("Favourites");

        List<JButton> buttons = new ArrayList<>();
        buttons.add(chordsButton);
        buttons.add(scalesButton);
        buttons.add(chordProgressionButton);
        buttons.add(favouritesButton);

        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(300, 100));
            button.setFont(new Font("CopperPlate Gothic Bold", Font.PLAIN, 20));
            button.addActionListener(this);
            imageLabel.add(button);

        }
    }

    //MODIFIES: this
    //EFFECTS: switches the frame depending on button pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Chords")) {
            ChordFrame chordFrame = new ChordFrame(cp1);
        } else if (e.getActionCommand().equals("Scales")) {
            ScaleFrame scaleFrame = new ScaleFrame();
        } else if (e.getActionCommand().equals("Chord Progression")) {
            ProgressionFrame progressionFrame = new ProgressionFrame(cp1);
        } // Todo: add functionality for favourites
        dispose();
    }

    //MODIFIES: this, data folder
    //EFFECTS: Saves chord progression to file
    public void saveProgression(ChordProgression chordProgression) {
        try {
            jsonWriter.open();
            jsonWriter.write(chordProgression);
            jsonWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found exception was caught");
        }
    }

    // MODIFIES: this
    // EFFECTS: loads chord progression from file
    public void loadProgression() {
        try {
            cp1 = jsonReader.read();
            JLabel loaded = new JLabel("Woohoo! Loaded:  ");
            loaded.setHorizontalAlignment(JLabel.CENTER);
            loaded.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
            loaded.setForeground(Color.CYAN);
            imageLabel.add(loaded);
            for (Chord c : cp1.getChords()) {
                JLabel name = new JLabel(c.getName());
                name.setHorizontalAlignment(JLabel.CENTER);
                name.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
                name.setForeground(Color.CYAN);
                imageLabel.add(name);
            }
        } catch (IOException e) {
            ///
        }
    }



    public static void main(String[] args) {
        new GuitarTheoryAppGUI();
    }


}
