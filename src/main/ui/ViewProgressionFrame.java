package ui;

import model.Chord;
import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//Create a frame that displays chords currently in progression
public class ViewProgressionFrame extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private ChordProgression progression;

    //Constructs a new frame
    public ViewProgressionFrame(ChordProgression c) {
        progression = c;
        frame = new JFrame();
        setSize(new Dimension(1920, 1080));
        setLayout(new BorderLayout());
        setPanel();
        buttonSetup();
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    //MODIFIES: this, progression
    //EFFECTS: adds chord to progression
    public void addToProgression(Chord chord) {
        progression.addToProgression(chord);
    }


    //MODIFIES: this
    //EFFECTS: create and set up a new panel
    public void setPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1920, 1080));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0,  200));
        panel.setBackground(Color.WHITE);
        for (String chordName: progression.getAllNames()) {
            JLabel name = new JLabel(chordName + " ");
            //name.setPreferredSize(new Dimension(50, 50));
            name.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
            panel.add(name);
        }
    }

    //MODIFIES: this
    //EFFECTS: create and setup buttons
    public void buttonSetup() {
        JButton home = new JButton("Home");
        JButton addAnother = new JButton("Add another chord");
        JButton delete = new JButton("Delete Progression");
        List<JButton> buttons = new ArrayList<>();
        buttons.add(home);
        buttons.add(addAnother);
        buttons.add(delete);
        for (JButton button: buttons) {
            button.setPreferredSize(new Dimension(200, 200));
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
            button.addActionListener(this);
            panel.add(button);
        }
    }

    //MODIFIES: this
    //EFFECTS: performs action depending on button pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Home")) {
            SaveFrame saveFrame = new SaveFrame(progression);
        } else if (e.getActionCommand().equals("Add another chord")) {
            ChordFrame chordFrame = new ChordFrame(progression);
        } else if (e.getActionCommand().equals("Delete Progression")) {
            progression.resetProgression();
            //Todo: add message that notifies user that progression has been cleared
            GuitarTheoryAppGUI guitarTheoryAppGUI = new GuitarTheoryAppGUI();
            guitarTheoryAppGUI.saveProgression(progression);
        }
        dispose();
    }

    //EFFECTS: returns chord progression
    public ChordProgression getProgression() {
        return progression;
    }
}
