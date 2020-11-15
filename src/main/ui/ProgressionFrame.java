package ui;

import com.sun.xml.internal.bind.v2.TODO;
import model.ChordProgression;
import persistance.JsonWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.function.ToDoubleBiFunction;

public class ProgressionFrame extends JFrame implements ActionListener {
    private JFrame progressionFrame;
    private JPanel progressionPanel;
    private JsonWriter jsonWriter;
    private ChordProgression progression;


    public ProgressionFrame() {
        progressionFrame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        getContentPane().add(progressionPanel);
        setVisible(true);
    }

    public void setChordPanel() {
        progressionPanel = new JPanel();
        progressionPanel.setPreferredSize(new Dimension(500, 500));
        progressionPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
        progressionPanel.setBackground(Color.BLACK);
        progressionFrame.getContentPane().add(progressionPanel);
    }

    public void buttonSetup() {
        JButton save = new JButton("Save Current Progression");
        save.setPreferredSize(new Dimension(300, 300));
        save.addActionListener(this);
        progressionPanel.add(save);

        JButton load = new JButton("Load Chord Progression");
        load.setPreferredSize(new Dimension(300, 300));
        load.addActionListener(this);
        progressionPanel.add(load);

        JButton view = new JButton("View My Chord Progression");
        view.setPreferredSize(new Dimension(300, 300));
        view.addActionListener(this);
        progressionPanel.add(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Save Current Progression")) {
            saveProgression();


        } else if (e.getActionCommand().equals("Load Chord Progression")) {
            try {
                GuitarTheoryApp guitarTheoryApp = new GuitarTheoryApp();
                guitarTheoryApp.loadProgression();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        } else if (e.getActionCommand().equals("View My Chord Progrgession")) {
            //TODO: If extra time implement this functionality
        }
    }

    public void saveProgression() {
        try {
            jsonWriter.open();
            jsonWriter.write(progression);
            jsonWriter.close();
            //System.out.println("Saved " + progression.getName() + " to " + JSON_STORE);
        } catch (FileNotFoundException e) {
            //System.out.println("Unable to write to file: " + JSON_STORE);
        }
    }

}

