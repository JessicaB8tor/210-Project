package ui;

import model.Chord;
import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuccessFrame extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private Chord chord;
    private ViewProgressionFrame viewProgressionFrame;
    private ChordProgression cp;



    public SuccessFrame(Chord chord, ChordProgression cp) {
        this.cp = cp;
        this.chord = chord;
        frame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        getContentPane().add(panel);
        setVisible(true);
    }

    public void setChordPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
        panel.setBackground(Color.PINK);
        JLabel successMessage = new JLabel(chord.getName() + " was added to your progression!");
        successMessage.setFont(new Font("Comic Sans MS", Font.PLAIN, 75));
        panel.add(successMessage);
        frame.getContentPane().add(panel);
    }

    public void buttonSetup() {
        JButton view = new JButton("View Chord Progression");
        view.setPreferredSize(new Dimension(300,100));
        view.addActionListener(this);
        panel.add(view);

        JButton home = new JButton("Home");
        home.setPreferredSize(new Dimension(300, 100));
        home.addActionListener(this);
        panel.add(home);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("View Chord Progression")) {
            viewProgressionFrame = new ViewProgressionFrame(cp);
            dispose();

        } else if (e.getActionCommand().equals("Home")) {
            GuitarTheoryAppGUI guitarTheoryApp = new GuitarTheoryAppGUI();
            dispose();
        }

    }
}
