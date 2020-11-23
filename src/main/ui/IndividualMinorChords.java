package ui;

import model.Chord;
import model.ChordProgression;
import model.MinorChord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//Frame that displays notes of minor chords and option to save to progression
public class IndividualMinorChords extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private Chord chord;
    private ChordProgression myProgression;

    //Constructs a new frame
    public IndividualMinorChords(Chord chord, ChordProgression chordProgression) {
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

    //MODIFIES:this
    //EFFECTS: create and setup a new panel
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
        if (chord.getName().equals("CMinor")) {
            cminor();
        } else if (chord.getName().equals("DMinor")) {
            dminor();
        } else if (chord.getName().equals("EMinor")) {
            eminor();
        } else if (chord.getName().equals("FMinor")) {
            fminor();
        } else if (chord.getName().equals("GMinor")) {
            gminor();
        } else if (chord.getName().equals("AMinor")) {
            aminor();
        } else if (chord.getName().equals("BMinor")) {
            bminor();
        }
    }

    //MODIFIES: this
    //EFFECTS: create and setup buttons
    public void buttonSetup() {
        JButton addto = new JButton("Add to Chord Progression");
        JButton home = new JButton("Home");
        List<JButton> buttons = new ArrayList<>();
        buttons.add(addto);
        buttons.add(home);
        for (JButton button: buttons) {
            button.setPreferredSize(new Dimension(100, 100));
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
            button.addActionListener(this);
            panel.add(button);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in a CMinor chord
    private void cminor() {
        JLabel cnote = new JLabel("C");
        JLabel eflatnote = new JLabel("Eb");
        JLabel gnote = new JLabel("G");
        List<JLabel> notes = new ArrayList<>();
        notes.add(cnote);
        notes.add(eflatnote);
        notes.add(gnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in a DMinor chord
    private void dminor() {
        JLabel dnote = new JLabel("D");
        JLabel fnote = new JLabel("F");
        JLabel anote = new JLabel("A");
        List<JLabel> notes = new ArrayList<>();
        notes.add(dnote);
        notes.add(fnote);
        notes.add(anote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in an Eminor chord
    private void eminor() {
        JLabel enote = new JLabel("E");
        JLabel gnote = new JLabel("G");
        JLabel bnote = new JLabel("B");
        List<JLabel> notes = new ArrayList<>();
        notes.add(enote);
        notes.add(gnote);
        notes.add(bnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in an FMinor chord
    private void fminor() {
        JLabel fnote = new JLabel("F");
        JLabel aflatnote = new JLabel("Ab");
        JLabel cnote = new JLabel("C");
        List<JLabel> notes = new ArrayList<>();
        notes.add(fnote);
        notes.add(aflatnote);
        notes.add(cnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in a GMinor chord
    private void gminor() {
        JLabel gnote = new JLabel("G");
        JLabel bflatnote = new JLabel("Bb");
        JLabel dnote = new JLabel("D");
        List<JLabel> notes = new ArrayList<>();
        notes.add(gnote);
        notes.add(bflatnote);
        notes.add(dnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in an AMinor chord
    private void aminor() {
        JLabel anote = new JLabel("A");
        JLabel cnote = new JLabel("C");
        JLabel enote = new JLabel("E");
        List<JLabel> notes = new ArrayList<>();
        notes.add(anote);
        notes.add(cnote);
        notes.add(enote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: displays notes in a BMinor chord
    private void bminor() {
        JLabel bnote = new JLabel("B");
        JLabel dnote = new JLabel("D");
        JLabel fsharpnote = new JLabel("F#");
        List<JLabel> notes = new ArrayList<>();
        notes.add(bnote);
        notes.add(dnote);
        notes.add(fsharpnote);
        for (JLabel note: notes) {
            note.setHorizontalAlignment(JLabel.CENTER);
            note.setFont(new Font("Comic Sans MS", Font.PLAIN, 150));
            panel.add(note);
        }
    }

    //MODIFIES: this
    //EFFECTS: switches frame when button is pressed
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




