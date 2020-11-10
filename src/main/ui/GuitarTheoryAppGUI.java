package ui;


import javax.swing.*;
import java.awt.*;

//GUI of main GuitarTheoryAppPanel
public class GuitarTheoryAppGUI extends JFrame {
    private JFrame frame;
    private MainPanel main;



    public GuitarTheoryAppGUI() {
        super("Guitar Theory App");
        frame = new JFrame();
        frame.setSize(500, 500);
        pack();
        initializeGraphics();
    }

    public void initializeGraphics() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        main = new MainPanel();
        main.setLayout(new GridLayout(4, 1));
        add(main, BorderLayout.SOUTH);
        buttonSetup();

    }

    //This method inspired by createTools method in SimpleDrawingPlayer
    //MODIFIES: this
    //EFFECTS: Creates buttons to display on main menu
    public void buttonSetup() {
        JButton chordsButton = new JButton("Chords");
        chordsButton.setPreferredSize(new Dimension(5,5));
        main.add(chordsButton);

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
