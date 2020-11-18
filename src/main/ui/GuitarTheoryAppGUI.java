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

//GUI of main GuitarTheoryAppPanel
public class GuitarTheoryAppGUI extends JFrame implements ActionListener {
    private JFrame frame;
    private MainPanel main;
    private ChordProgression cp1;
    private JsonWriter jsonWriter;
    private JsonReader jsonReader;
    private ImageIcon image;
    private JLabel imageLabel;
    private static final String JSON_STORE = "./data/Progression.json";


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
        initializeGraphics();
        //getContentPane().add(main);
        pack();
        setVisible(true);
    }

    public void initializeGraphics() {
        //main = new MainPanel();
       // main.setPreferredSize(new Dimension(1000, 1000));
        //main.setLayout(new GridLayout(5,1));
        buttonSetup();
    }

    //This method inspired by createTools method in SimpleDrawingPlayer
    //MODIFIES: this
    //EFFECTS: Creates buttons to display on main menu
    public void buttonSetup() {
        JButton chordsButton = new JButton("Chords");
        chordsButton.setPreferredSize(new Dimension(300, 100));
        chordsButton.addActionListener(this);
        imageLabel.add(chordsButton);

        JButton scalesButton = new JButton("Scales");
        scalesButton.setPreferredSize(new Dimension(300, 100));
        scalesButton.addActionListener(this);
        imageLabel.add(scalesButton);

        JButton chordProgressionButton = new JButton("Chord Progression");
        chordProgressionButton.setPreferredSize(new Dimension(300, 100));
        chordProgressionButton.addActionListener(this);
        imageLabel.add(chordProgressionButton);

        JButton favouritesButton = new JButton("Favourites");
        favouritesButton.setPreferredSize(new Dimension(300, 100));
        favouritesButton.addActionListener(this);
        imageLabel.add(favouritesButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Chords")) {
            ChordFrame chordFrame = new ChordFrame(cp1);
            dispose();
        } else if (e.getActionCommand().equals("Scales")) {
            ScaleFrame scaleFrame = new ScaleFrame();
            dispose();
        } else if (e.getActionCommand().equals("Chord Progression")) {
            ProgressionFrame progressionFrame = new ProgressionFrame(cp1);
            dispose();
        }

    }

    public void saveProgression(ChordProgression chordProgression) {
        try {
            jsonWriter.open();
            jsonWriter.write(chordProgression);
            jsonWriter.close();
            //System.out.println("Saved " + progression.getName() + " to " + JSON_STORE);
        } catch (FileNotFoundException e) {
            //System.out.println("Unable to write to file: " + JSON_STORE);
        }
    }

    // MODIFIES: this
    // EFFECTS: loads chord progression from file
    public void loadProgression() {
        try {
            cp1 = jsonReader.read();
          //System.out.println("Loaded " + cp1.getName() + " from " + JSON_STORE);
        } catch (IOException e) {
            //System.out.println("Unable to read from file: " + JSON_STORE);
        }
        JLabel loaded = new JLabel("Woohoo! Loaded:  ");
        loaded.setHorizontalAlignment(JLabel.CENTER);
        main.add(loaded);
        for (Chord c: cp1.getChords()) {
            JLabel name = new JLabel(c.getName());
            name.setHorizontalAlignment(JLabel.CENTER);
            main.add(name);
        }
    }



    public static void main(String[] args) {

        new GuitarTheoryAppGUI();
    }


}
