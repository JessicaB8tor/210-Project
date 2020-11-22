package ui;

import model.Chord;
import model.ChordProgression;
import model.MajorChord;
import sun.font.BidiUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//Frame that displays notes of major chords and option to save to progression
public class IndividualMajorChords extends JFrame implements ActionListener {
    public JFrame frame;
    public JPanel panel;
    public Chord chord;
    public ChordProgression myProgression;

    //Constructs a new frame
    public IndividualMajorChords(MajorChord chord, ChordProgression chordProgression) {
        myProgression = chordProgression;
        this.chord = chord;
        frame = new JFrame(chord.getName());
        setSize(new Dimension(500, 500));
        setLayout(new BorderLayout());
        setPanel();
        showNotes();
        buttonSetup();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    //MODIFIES: this
    //EFFECTS: creates a new panel and sets it up
    public void setPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1920, 1080));
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);
    }

    //MODIFIES: this
    //EFFECTS: Displays notes for each chord/adds button and adds to panel
    public void showNotes() {
        if (chord.getName().equals("CMajor")) {
            cmajor();
        } else if (chord.getName().equals("DMajor")) {
            dmajor();
        } else if (chord.getName().equals("EMajor")) {
            emajor();
        } else if (chord.getName().equals("FMajor")) {
            fmajor();
        } else if (chord.getName().equals("GMajor")) {
            gmajor();
        } else if (chord.getName().equals("AMajor")) {
            amajor();
        } else if (chord.getName().equals("BMajor")) {
            bmajor();
        }
    }

    //MODIFIES: this
    //EFFECTS: create and setup buttons
    private void buttonSetup() {
        JButton addTo = new JButton("Add to Chord Progression");
        JButton home = new JButton("Home");
        List<JButton> buttons = new ArrayList<>();
        buttons.add(addTo);
        buttons.add(home);
        for (JButton button: buttons) {
            button.setPreferredSize(new Dimension(100, 100));
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
            button.addActionListener(this);
            panel.add(button);
        }
    }


    //MODIFIES: this
    //EFFECTS: displays notes in a CMajor chord
    public void cmajor() {
        Chord cmajor = new MajorChord("CMajor", "C", "E", "G");
        JLabel cnote = new JLabel("C");
        JLabel enote = new JLabel("E");
        JLabel gnote = new JLabel("G");
        List<JLabel> notes = new ArrayList<>();
        notes.add(cnote);
        notes.add(enote);
        notes.add(gnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in a DMajor chord
    private void dmajor() {
        JLabel dnote = new JLabel("D");
        JLabel fsharpnote = new JLabel("F#");
        JLabel anote = new JLabel("A");
        List<JLabel> notes = new ArrayList<>();
        notes.add(dnote);
        notes.add(fsharpnote);
        notes.add(anote);
        for (JLabel note : notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in an EMajor chord
    private void emajor() {
        JLabel enote = new JLabel("E");
        JLabel gsharpnote = new JLabel("G#");
        JLabel bnote = new JLabel("B");
        List<JLabel> notes = new ArrayList<>();
        notes.add(enote);
        notes.add(gsharpnote);
        notes.add(bnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in an FMajor chord
    private void fmajor() {
        JLabel fnote = new JLabel("F");
        JLabel anote = new JLabel("A");
        JLabel cnote = new JLabel("C");
        List<JLabel> notes = new ArrayList<>();
        notes.add(fnote);
        notes.add(anote);
        notes.add(cnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in a GMajor chord
    private void gmajor() {
        JLabel gnote = new JLabel("G");
        JLabel bnote = new JLabel("B");
        JLabel dnote = new JLabel("D");
        List<JLabel> notes = new ArrayList<>();
        notes.add(gnote);
        notes.add(bnote);
        notes.add(dnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in an AMajor chord
    private void amajor() {
        JLabel anote = new JLabel("A");
        JLabel csharpnote = new JLabel("C#");
        JLabel enote = new JLabel("E");
        List<JLabel> notes = new ArrayList<>();
        notes.add(anote);
        notes.add(csharpnote);
        notes.add(enote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in a BMajor chord
    private void bmajor() {
        JLabel bnote = new JLabel("B");
        JLabel dsharpnote = new JLabel("D#");
        JLabel fsharpnote = new JLabel("F#");
        List<JLabel> notes = new ArrayList<>();
        notes.add(bnote);
        notes.add(dsharpnote);
        notes.add(fsharpnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: switches frames depending on button click
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add to Chord Progression")) {
            myProgression.addToProgression(chord);
            SuccessFrame successFrame = new SuccessFrame(chord, myProgression);
        } else if (e.getActionCommand().equals("Home")) {
            SaveFrame saveFrame = new SaveFrame(myProgression);
        }
        dispose();
    }

    //EFFECTS: returns chord progression
    public ChordProgression getChordsList() {
        return myProgression;
    }

}


