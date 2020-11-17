package ui;

import model.ChordProgression;
import model.MinorChord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MinorChordsFrame extends JFrame implements ActionListener {
    private JFrame minorChordFrame;
    private JPanel minorChordPanel;
    private List<JButton> buttons;
    public static final MinorChord C_MINOR = new MinorChord("CMinor", "C", "Eb", "G");
    public static final MinorChord D_MINOR = new MinorChord("DMinor", "D", "F", "A");
    public static final MinorChord E_MINOR = new MinorChord("EMinor", "E", "G", "B");
    public static final MinorChord F_MINOR = new MinorChord("FMinor", "F", "Ab", "C");
    public static final MinorChord G_MINOR = new MinorChord("GMinor", "G", "Bb", "D");
    public static final MinorChord A_MINOR = new MinorChord("AMinor", "A", "C", "E");
    public static final MinorChord B_MINOR = new MinorChord("BMinor", "B", "D", "F#");
    private ChordProgression cp;


    public MinorChordsFrame(ChordProgression chordProgression) {
        this.cp = chordProgression;
        minorChordFrame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        getContentPane().add(minorChordPanel);
        setVisible(true);
    }

    public void setChordPanel() {
        minorChordPanel = new JPanel();
        minorChordPanel.setPreferredSize(new Dimension(500, 500));
        minorChordPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        minorChordPanel.setBackground(Color.BLACK);
        minorChordFrame.getContentPane().add(minorChordPanel);
    }

    public void buttonSetup() {
        buttons = new ArrayList<JButton>();

        JButton cminor = new JButton("CMinor");
        JButton dminor = new JButton("DMinor");
        JButton eminor = new JButton("EMinor");
        JButton fminor = new JButton("FMinor");
        JButton gminor = new JButton("GMinor");
        JButton aminor = new JButton("AMinor");
        JButton bminor = new JButton("BMinor");

        buttons.add(cminor);
        buttons.add(dminor);
        buttons.add(eminor);
        buttons.add(fminor);
        buttons.add(gminor);
        buttons.add(aminor);
        buttons.add(bminor);

        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(300, 300));
            button.addActionListener(this);
            minorChordPanel.add(button);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("CMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords(C_MINOR, cp);
        } else if (e.getActionCommand().equals("DMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords(D_MINOR, cp);
        } else if (e.getActionCommand().equals("EMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords(E_MINOR, cp);
        } else if (e.getActionCommand().equals("FMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords(F_MINOR, cp);
        } else if (e.getActionCommand().equals("GMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords(G_MINOR, cp);
        } else if (e.getActionCommand().equals("AMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords(A_MINOR, cp);
        } else if (e.getActionCommand().equals("BMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords(B_MINOR, cp);
        }
        dispose();
    }
}

