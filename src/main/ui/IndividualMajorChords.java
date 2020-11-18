package ui;

import model.Chord;
import model.ChordProgression;
import model.MajorChord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndividualMajorChords extends JFrame implements ActionListener {
    public JFrame frame;
    public JPanel panel;
    public Chord chord;
    public ChordProgression myProgression;

    public IndividualMajorChords(MajorChord chord, ChordProgression chordProgression) {
        myProgression = chordProgression;
        this.chord = chord;
        frame = new JFrame(chord.getName());
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPanel();
        showNotes();
        getContentPane().add(panel);
        setVisible(true);
    }

    public void setPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1920, 1080));
        panel.setLayout(new GridLayout(4, 1));
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);
    }

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
        JButton addto = new JButton("Add to Chord Progression");
        addto.setPreferredSize(new Dimension(100, 100));
        addto.addActionListener(this);
        panel.add(addto);
    }


    public void cmajor() {
        Chord cmajor = new MajorChord("CMajor", "C", "E", "G");
        JLabel cnote = new JLabel("C");
        JLabel enote = new JLabel("E");
        JLabel gnote = new JLabel("G");
        cnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        enote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        gnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        panel.add(cnote);
        panel.add(enote);
        panel.add(gnote);
    }

    private void dmajor() {
        JLabel dnote = new JLabel("D");
        JLabel fsharpnote = new JLabel("F#");
        JLabel anote = new JLabel("A");
        dnote.setHorizontalAlignment(JLabel.CENTER);
        fsharpnote.setHorizontalAlignment(JLabel.CENTER);
        anote.setHorizontalAlignment(JLabel.CENTER);
        dnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        fsharpnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        anote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        panel.add(dnote);
        panel.add(fsharpnote);
        panel.add(anote);
    }

    private void emajor() {
        JLabel enote = new JLabel("E");
        JLabel gsharpnote = new JLabel("G#");
        JLabel bnote = new JLabel("B");
        enote.setHorizontalAlignment(JLabel.CENTER);
        gsharpnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        gsharpnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        bnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        panel.add(enote);
        panel.add(gsharpnote);
        panel.add(bnote);
    }

    private void fmajor() {
        JLabel fnote = new JLabel("F");
        JLabel anote = new JLabel("A");
        JLabel cnote = new JLabel("C");
        fnote.setHorizontalAlignment(JLabel.CENTER);
        anote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setHorizontalAlignment(JLabel.CENTER);
        fnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        anote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        cnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        panel.add(fnote);
        panel.add(anote);
        panel.add(cnote);
    }

    private void gmajor() {
        JLabel gnote = new JLabel("G");
        JLabel bnote = new JLabel("B");
        JLabel dnote = new JLabel("D");
        gnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setHorizontalAlignment(JLabel.CENTER);
        dnote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        bnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        dnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        panel.add(gnote);
        panel.add(bnote);
        panel.add(dnote);
    }

    private void amajor() {
        JLabel anote = new JLabel("A");
        JLabel csharpnote = new JLabel("C#");
        JLabel enote = new JLabel("E");
        anote.setHorizontalAlignment(JLabel.CENTER);
        csharpnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setHorizontalAlignment(JLabel.CENTER);
        anote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        csharpnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        enote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        panel.add(anote);
        panel.add(csharpnote);
        panel.add(enote);
    }

    private void bmajor() {
        JLabel bnote = new JLabel("B");
        JLabel dsharpnote = new JLabel("D#");
        JLabel fsharpnote = new JLabel("F#");
        bnote.setHorizontalAlignment(JLabel.CENTER);
        dsharpnote.setHorizontalAlignment(JLabel.CENTER);
        fsharpnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        dsharpnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        fsharpnote.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
        panel.add(bnote);
        panel.add(dsharpnote);
        panel.add(fsharpnote);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add to Chord Progression")) {
            myProgression.addToProgression(chord);
            SuccessFrame successFrame = new SuccessFrame(chord, myProgression);
            dispose();
        }
    }

    public ChordProgression getChordsList() {
        return myProgression;
    }

    public Chord getChord() {
        return chord;
    }

}


