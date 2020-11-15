package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI of main GuitarTheoryAppPanel
public class GuitarTheoryAppGUI extends JFrame implements ActionListener {
    private JFrame frame;
    private MainPanel main;



    public GuitarTheoryAppGUI() {
        super("Guitar Theory App");
        frame = new JFrame();
        frame.setSize(500, 500);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initializeGraphics();
        getContentPane().add(main);
        pack();
        setVisible(true);
    }

    public void initializeGraphics() {
        main = new MainPanel();
        main.setPreferredSize(new Dimension(500, 500));
        main.setLayout(new GridLayout(4,1));
        buttonSetup();
    }

    //This method inspired by createTools method in SimpleDrawingPlayer
    //MODIFIES: this
    //EFFECTS: Creates buttons to display on main menu
    public void buttonSetup() {
        JButton chordsButton = new JButton("Chords");
        chordsButton.setBounds(200, 200, 50, 50);
        chordsButton.addActionListener(this);
        main.add(chordsButton);

        JButton scalesButton = new JButton("Scales");
        scalesButton.addActionListener(this);
        main.add(scalesButton);

        JButton chordProgressionButton = new JButton("Chord Progression");
        chordProgressionButton.addActionListener(this);
        main.add(chordProgressionButton);

        JButton favouritesButton = new JButton("Favourites");
        favouritesButton.addActionListener(this);
        main.add(favouritesButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Chords")) {
            ChordFrame chordFrame = new ChordFrame();
            dispose();
        } else if (e.getActionCommand().equals("Scales")) {
            ScaleFrame scaleFrame = new ScaleFrame();
            dispose();
        } else if (e.getActionCommand().equals("Chord Progression")) {
            ProgressionFrame progressionFrame = new ProgressionFrame();
            dispose();
        }

    }

    public static void main(String[] args) {
        new GuitarTheoryAppGUI();
    }


}
