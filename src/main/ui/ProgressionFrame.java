package ui;

import model.ChordProgression;
import persistance.JsonReader;
import persistance.JsonWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//Frame with options when dealing with a chord progression
public class ProgressionFrame extends JFrame implements ActionListener {
    private JFrame progressionFrame;
    private JPanel progressionPanel;
    private ChordProgression chordProgression;
    private JsonWriter jsonWriter = new JsonWriter("My Progression");
    private JsonReader jsonReader = new JsonReader("My Progression");
    private static final String JSON_STORE = "./data/Progression.json";


    //Constructs a new frame
    public ProgressionFrame(ChordProgression chordProgression) {
        this.chordProgression = chordProgression;
        progressionFrame = new JFrame();
        setSize(new Dimension(500, 500));
        setLayout(new BorderLayout());
        setProgressionPanel();
        buttonSetup();
        getContentPane().add(progressionPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    //MODIFIES: this
    //EFFECTS: create and setup a new panel
    public void setProgressionPanel() {
        progressionPanel = new JPanel();
        progressionPanel.setPreferredSize(new Dimension(1920, 1080));
        progressionPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 100));
        progressionPanel.setBackground(Color.BLACK);
        progressionFrame.getContentPane().add(progressionPanel);
    }

    //MODIFIES: this
    //EFFECTS: create and setup buttons
    public void buttonSetup() {
       // JButton view = new JButton("View My Chord Progression");
       //Todo: implement this one:
        // JButton save = new JButton("Save Current Progression");
        JButton load = new JButton("Load Chord Progression");
        List<JButton> buttons = new ArrayList<>();
      //  buttons.add(view);
       // buttons.add(save);
        buttons.add(load);
        for (JButton button: buttons) {
            button.setPreferredSize(new Dimension(500, 500));
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 25));
            button.addActionListener(this);
            progressionPanel.add(button);
        }
    }


    //MODIFIES: this
    //EFFECTS: Acts depending on button clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("View My Chord Progression")) {
           // Todo: add functionality
        } else if (e.getActionCommand().equals("Load Chord Progression")) {
            GuitarTheoryAppGUI guitarTheoryAppGUI = new GuitarTheoryAppGUI();
            guitarTheoryAppGUI.loadProgression();
        }
        dispose();
    }
}


