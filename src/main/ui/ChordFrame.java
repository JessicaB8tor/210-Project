package ui;

import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChordFrame extends JFrame implements ActionListener {
    private JFrame chordFrame;
    private ChordProgression cp;
    private ImageIcon image;
    private JLabel imageLabel;


    public ChordFrame(ChordProgression cp1) {
        this.cp = cp1;
        chordFrame = new JFrame();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        image = new ImageIcon("./data/prettystrat.jpg");
        imageLabel = new JLabel(image);
        getContentPane().add(imageLabel);
        imageLabel.setLayout(new FlowLayout());
        buttonSetup();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void buttonSetup() {
        JButton majorChordsButton = new JButton("Major Chords");
        majorChordsButton.setPreferredSize(new Dimension(300, 50));
        majorChordsButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
        majorChordsButton.addActionListener(this);
        imageLabel.add(majorChordsButton);

        JButton minorChordsButton = new JButton("Minor Chords");
        minorChordsButton.setPreferredSize(new Dimension(300, 50));
        minorChordsButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
        minorChordsButton.addActionListener(this);
        imageLabel.add(minorChordsButton);


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




