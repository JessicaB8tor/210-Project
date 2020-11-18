package ui;

import model.ChordProgression;
import persistance.JsonReader;
import persistance.JsonWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ProgressionFrame extends JFrame implements ActionListener {
    private JFrame progressionFrame;
    private JPanel progressionPanel;
    private ChordProgression chordProgression;
    private JsonWriter jsonWriter = new JsonWriter("My Progression");
    private JsonReader jsonReader = new JsonReader("My Progression");
    private static final String JSON_STORE = "./data/Progression.json";


    public ProgressionFrame(ChordProgression chordProgression) {
        this.chordProgression = chordProgression;
        progressionFrame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setProgressionPanel();
        buttonSetup();
        getContentPane().add(progressionPanel);
        setVisible(true);
    }

    public void setProgressionPanel() {
        progressionPanel = new JPanel();
        progressionPanel.setPreferredSize(new Dimension(500, 500));
        progressionPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
        progressionPanel.setBackground(Color.BLACK);
        progressionFrame.getContentPane().add(progressionPanel);
    }

    public void buttonSetup() {
        JButton view = new JButton("View My Chord Progression");
        view.setPreferredSize(new Dimension(200, 200));
        view.addActionListener(this);
        progressionPanel.add(view);

        JButton save = new JButton("Save Current Progression");
        save.setPreferredSize(new Dimension(200, 200));
        save.addActionListener(this);
        progressionPanel.add(save);

        JButton load = new JButton("Load Chord Progression");
        load.setPreferredSize(new Dimension(200, 200));
        load.addActionListener(this);
        progressionPanel.add(load);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("View My Chord Progression")) {
            ViewProgressionFrame viewProgressionFrame = new ViewProgressionFrame(chordProgression);
            dispose();
        } else if (e.getActionCommand().equals("Load Chord Progression")) {
            GuitarTheoryAppGUI guitarTheoryAppGUI = new GuitarTheoryAppGUI();
            guitarTheoryAppGUI.loadProgression();
            dispose();
        }

    }
}


