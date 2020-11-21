package ui;

import model.Chord;
import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//Create a frame that assures user chord was added and provides options for next stps
public class SuccessFrame extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private Chord chord;
    private ViewProgressionFrame viewProgressionFrame;
    private ChordProgression cp;

    //Constructs a new frame
    public SuccessFrame(Chord chord, ChordProgression cp) {
        this.cp = cp;
        this.chord = chord;
        frame = new JFrame();
        setSize(new Dimension(1920, 1080));
        setLayout(new BorderLayout());
        setChordPanel();
        buttonSetup();
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    //MODIFIES: this
    //EFFECTS: creates a new panel
    public void setChordPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1920, 1080));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 200));
        panel.setBackground(Color.green);
        JLabel successMessage = new JLabel(chord.getName() + " was added to your progression!");
        successMessage.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
        panel.add(successMessage);
    }

    //MODIFIES: this
    //EFFECTS: create and setup buttons
    public void buttonSetup() {
        JButton view = new JButton("View Chord Progression");
        JButton home = new JButton("Home");
        List<JButton> buttons = new ArrayList<>();
        buttons.add(view);
        buttons.add(home);
        for (JButton button: buttons) {
            button.setPreferredSize(new Dimension(500, 100));
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
            button.addActionListener(this);
            panel.add(button);
        }
    }

    //MODIFIES: this
    //EFFECTS: performs action depending on button pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("View Chord Progression")) {
            viewProgressionFrame = new ViewProgressionFrame(cp);
        } else if (e.getActionCommand().equals("Home")) {
            SaveFrame saveFrame = new SaveFrame(cp);
        }
        dispose();
    }
}
