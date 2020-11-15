package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MinorChordsFrame extends JFrame implements ActionListener {
    private JFrame minorChordFrame;
    private JPanel minorChordPanel;
    private List<JButton> buttons;


    public MinorChordsFrame() {
        minorChordFrame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        getContentPane().add(minorChordPanel);
        setVisible(true);
    }

    public void setChordPanel() {
        minorChordPanel = new JPanel();
        minorChordPanel.setPreferredSize(new Dimension(500, 500));
        minorChordPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        minorChordPanel.setBackground(Color.BLACK);
        minorChordFrame.getContentPane().add(minorChordPanel);
    }

    public void buttonSetup() {
        buttons = new ArrayList<JButton>();

        JButton cminor = new JButton("CMinor");
        JButton dminor = new JButton("DMinor");
        JButton eminor = new JButton("EMinor");
        JButton fminor = new JButton("FMinor");
        JButton gminor = new JButton("GMinor");
        JButton aminor = new JButton("AMinor");
        JButton bminor = new JButton("BMinor");

        buttons.add(cminor);
        buttons.add(dminor);
        buttons.add(eminor);
        buttons.add(fminor);
        buttons.add(gminor);
        buttons.add(aminor);
        buttons.add(bminor);

        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(300, 300));
            button.addActionListener(this);
            minorChordPanel.add(button);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("CMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords("CMinor");
        } else if (e.getActionCommand().equals("DMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords("DMinor");
        } else if (e.getActionCommand().equals("EMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords("EMinor");
        } else if (e.getActionCommand().equals("FMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords("FMinor");
        } else if (e.getActionCommand().equals("GMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords("GMinor");
        } else if (e.getActionCommand().equals("AMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords("AMinor");
        } else if (e.getActionCommand().equals("BMinor")) {
            IndividualMinorChords individualMinorChords = new IndividualMinorChords("BMinor");
        }
        dispose();
    }
}

