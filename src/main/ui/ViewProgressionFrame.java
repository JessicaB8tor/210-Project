package ui;

import model.Chord;
import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ViewProgressionFrame extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private ChordProgression progression;


    public ViewProgressionFrame(ChordProgression c) {
        progression = c;
        frame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPanel();
        buttonSetup();
        getContentPane().add(panel);
        setVisible(true);
    }

    public void addToProgression(Chord chord) {
        progression.addToProgression(chord);
    }


    public void setPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
        panel.setBackground(Color.WHITE);
        for (String chordName: progression.getAllNames()) {
            JLabel name = new JLabel(chordName);
            name.setPreferredSize(new Dimension(50, 50));
            panel.add(name);
        }
        frame.add(panel);
    }

    public void buttonSetup() {
        JButton home = new JButton("Home");
        home.setPreferredSize(new Dimension(100, 100));
        home.addActionListener(this);
        panel.add(home);

        JButton addAnother = new JButton("Add another chord");
        addAnother.setPreferredSize(new Dimension(200, 100));
        addAnother.addActionListener(this);
        panel.add(addAnother);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Home")) {
            GuitarTheoryAppGUI guitarTheoryAppGUI = new GuitarTheoryAppGUI();
            dispose();
        } else if (e.getActionCommand().equals("Add another chord")) {
            ChordFrame chordFrame = new ChordFrame(progression);
            dispose();
        }
    }
}
