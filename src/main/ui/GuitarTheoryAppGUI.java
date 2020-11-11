package ui;


import model.Chord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI of main GuitarTheoryAppPanel
public class GuitarTheoryAppGUI extends JFrame {
    private JFrame frame;
    private MainPanel main;
    private ChordFrame chordFrame;



    public GuitarTheoryAppGUI() {
        super("Guitar Theory App");
        frame = new JFrame();
        chordFrame = new ChordFrame();
        frame.setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initializeGraphics();
        getContentPane().add(main);
        pack();
        setVisible(true);
    }

    public void initializeGraphics() {
        main = new MainPanel();
        main.setPreferredSize(new Dimension(300, 300));
        main.setLayout(new GridLayout(4, 1));
        buttonSetup();
    }

    //This method inspired by createTools method in SimpleDrawingPlayer
    //MODIFIES: this
    //EFFECTS: Creates buttons to display on main menu
    public void buttonSetup() {
        JButton chordsButton = new JButton("Chords");
        chordsButton.setBounds(200, 200, 50, 50);
        chordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chordFrame.createFrame();
                dispose();
            }
        });
        main.add(chordsButton, BorderLayout.SOUTH);

        JButton scalesButton = new JButton("Scales");
        main.add(scalesButton);

        JButton chordProgressionButton = new JButton("Chord Progression");
        main.add(chordProgressionButton);

        JButton favouritesButton = new JButton("Favourites");
        main.add(favouritesButton);
    }



    public static void main(String[] args) {
        new GuitarTheoryAppGUI();
    }


}
