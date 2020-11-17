package ui;


import model.Chord;
import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChordFrame extends JFrame implements ActionListener {
    private JFrame chordFrame;
    private JPanel chordPanel;
    private ChordProgression cp;


    public ChordFrame(ChordProgression cp1) {
        this.cp = cp1;
        chordFrame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        getContentPane().add(chordPanel);
        setVisible(true);
    }

    public void setChordPanel() {
        chordPanel = new JPanel();
        chordPanel.setPreferredSize(new Dimension(500, 500));
        chordPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
        chordPanel.setBackground(Color.BLACK);
        chordFrame.getContentPane().add(chordPanel);
    }

    public void buttonSetup() {
        JButton majorChordsButton = new JButton("Major Chords");
        majorChordsButton.setPreferredSize(new Dimension(300, 300));
        majorChordsButton.addActionListener(this);
        chordPanel.add(majorChordsButton);

        JButton minorChordsButton = new JButton("Minor Chords");
        minorChordsButton.setPreferredSize(new Dimension(300, 300));
        minorChordsButton.addActionListener(this);
        chordPanel.add(minorChordsButton);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Major Chords")) {
            MajorChordsFrame majorChordsFrame = new MajorChordsFrame(cp);
            dispose();
        } else if (e.getActionCommand().equals("Minor Chords")) {
            MinorChordsFrame minorChordsFrame = new MinorChordsFrame(cp);
            dispose();
        }

    }
}




