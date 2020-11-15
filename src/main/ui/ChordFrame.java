package ui;

import javax.swing.*;
import java.awt.*;


public class ChordFrame extends JFrame {
    private JFrame chordFrame;
    private JPanel chordPanel;


    public ChordFrame() {
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
        chordPanel.add(majorChordsButton);

        JButton minorChordsButton = new JButton("Minor Chords");
        minorChordsButton.setPreferredSize(new Dimension(300, 300));
        chordPanel.add(minorChordsButton);


    }

}




