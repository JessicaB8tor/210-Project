package ui;

import javax.swing.*;
import java.awt.*;

public class IndividualMajorChords extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private String chordName;

    public IndividualMajorChords(String chordName) {
        this.chordName = chordName;
        frame = new JFrame(chordName);
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPanel();
        showNotes();
        getContentPane().add(panel);
        setVisible(true);
    }

    public void setPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new GridLayout(3, 1));
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);
    }

    public void showNotes() {
        if (chordName.equals("CMajor")) {
            cmajor();
        } else if (chordName.equals("DMajor")) {
            dmajor();
        } else if (chordName.equals("EMajor")) {
            emajor();
        } else if (chordName.equals("FMajor")) {
            fmajor();
        } else if (chordName.equals("GMajor")) {
            gmajor();
        } else if (chordName.equals("AMajor")) {
            amajor();
        } else if (chordName.equals("BMajor")) {
            bmajor();
        }
    }

    private void cmajor() {
        JLabel cnote = new JLabel("C");
        JLabel enote = new JLabel("E");
        JLabel gnote = new JLabel("G");
        cnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        enote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(cnote);
        panel.add(enote);
        panel.add(gnote);
    }

    private void dmajor() {
        JLabel dnote = new JLabel("D");
        JLabel fsharpnote = new JLabel("F#");
        JLabel anote = new JLabel("A");
        dnote.setHorizontalAlignment(JLabel.CENTER);
        fsharpnote.setHorizontalAlignment(JLabel.CENTER);
        anote.setHorizontalAlignment(JLabel.CENTER);
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        fsharpnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        anote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(dnote);
        panel.add(fsharpnote);
        panel.add(anote);
    }

    private void emajor() {
        JLabel enote = new JLabel("E");
        JLabel gsharpnote = new JLabel("G#");
        JLabel bnote = new JLabel("B");
        enote.setHorizontalAlignment(JLabel.CENTER);
        gsharpnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        gsharpnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        bnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(gsharpnote);
        panel.add(gsharpnote);
        panel.add(bnote);
    }

    private void fmajor() {
        JLabel fnote = new JLabel("F");
        JLabel anote = new JLabel("A");
        JLabel cnote = new JLabel("C");
        fnote.setHorizontalAlignment(JLabel.CENTER);
        anote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setHorizontalAlignment(JLabel.CENTER);
        fnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        anote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(fnote);
        panel.add(anote);
        panel.add(cnote);
    }

    private void gmajor() {
        JLabel gnote = new JLabel("G");
        JLabel bnote = new JLabel("B");
        JLabel dnote = new JLabel("D");
        gnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setHorizontalAlignment(JLabel.CENTER);
        dnote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        bnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(dnote);
        panel.add(bnote);
        panel.add(dnote);
    }

    private void amajor() {
        JLabel anote = new JLabel("A");
        JLabel csharpnote = new JLabel("C#");
        JLabel enote = new JLabel("E");
        anote.setHorizontalAlignment(JLabel.CENTER);
        csharpnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setHorizontalAlignment(JLabel.CENTER);
        anote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        csharpnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        enote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(anote);
        panel.add(csharpnote);
        panel.add(enote);
    }

    private void bmajor() {
        JLabel bnote = new JLabel("B");
        JLabel dsharpnote = new JLabel("D#");
        JLabel fsharpnote = new JLabel("F#");
        bnote.setHorizontalAlignment(JLabel.CENTER);
        dsharpnote.setHorizontalAlignment(JLabel.CENTER);
        fsharpnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        dsharpnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        fsharpnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(bnote);
        panel.add(dsharpnote);
        panel.add(fsharpnote);
    }

}


