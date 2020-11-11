package ui;


import javax.swing.*;
import java.awt.*;


public class ChordFrame extends JFrame {
    private JFrame chordFrame;
    private JPanel chordPanel;

    public ChordFrame() {

    }

    public void createFrame() {
        chordFrame = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        chordFrame.pack();
        chordFrame.setVisible(true);
    }

    public void setChordPanel() {
        chordPanel = new JPanel();
        chordPanel.setLayout(new BoxLayout(chordPanel, BoxLayout.Y_AXIS));
        chordPanel.setBackground(Color.BLACK);
        chordFrame.getContentPane().add(chordPanel);
    }

    public void buttonSetup() {
        JButton majorChordsButton = new JButton("Major Chords");
        majorChordsButton.setBounds(100, 100, 100, 100);
        chordPanel.add(majorChordsButton);

        JButton minorChordsButton = new JButton("Minor Chords");
        minorChordsButton.setBounds(200, 200, 50, 50);
        chordPanel.add(minorChordsButton);


    }

}
