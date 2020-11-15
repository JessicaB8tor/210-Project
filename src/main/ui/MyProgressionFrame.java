package ui;

import model.Chord;

import javax.swing.*;
import java.awt.*;

public class MyProgressionFrame extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private Chord chord;


    public MyProgressionFrame(Chord chord) {
        this.chord = chord;
        frame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPanel();
       // buttonSetup();
        getContentPane().add(panel);
        setVisible(true);
    }

    public void setPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);
    }

}
