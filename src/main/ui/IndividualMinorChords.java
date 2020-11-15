package ui;

import javax.swing.*;
import java.awt.*;

public class IndividualMinorChords extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private String chordName;

    public IndividualMinorChords(String chordName) {
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
        if (chordName.equals("CMinor")) {
            cminor();
        } else if (chordName.equals("DMinor")) {
            dminor();
        } else if (chordName.equals("EMinor")) {
            eminor();
        } else if (chordName.equals("FMinor")) {
            fminor();
        } else if (chordName.equals("GMinor")) {
            gminor();
        } else if (chordName.equals("AMinor")) {
            aminor();
        } else if (chordName.equals("BMinor")) {
            bminor();
        }
    }

    private void cminor() {
        JLabel cnote = new JLabel("C");
        JLabel eflatnote = new JLabel("Eb");
        JLabel gnote = new JLabel("G");
        cnote.setHorizontalAlignment(JLabel.CENTER);
        eflatnote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        eflatnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(cnote);
        panel.add(eflatnote);
        panel.add(gnote);
    }

    private void dminor() {
        JLabel dnote = new JLabel("D");
        JLabel fnote = new JLabel("F");
        JLabel anote = new JLabel("A");
        dnote.setHorizontalAlignment(JLabel.CENTER);
        fnote.setHorizontalAlignment(JLabel.CENTER);
        anote.setHorizontalAlignment(JLabel.CENTER);
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        fnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        anote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(dnote);
        panel.add(fnote);
        panel.add(anote);
    }

    private void eminor() {
        JLabel enote = new JLabel("E");
        JLabel gnote = new JLabel("G");
        JLabel bnote = new JLabel("B");
        enote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        bnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(gnote);
        panel.add(gnote);
        panel.add(bnote);
    }

    private void fminor() {
        JLabel fnote = new JLabel("F");
        JLabel aflatnote = new JLabel("Ab");
        JLabel cnote = new JLabel("C");
        fnote.setHorizontalAlignment(JLabel.CENTER);
        aflatnote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setHorizontalAlignment(JLabel.CENTER);
        fnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        aflatnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(fnote);
        panel.add(aflatnote);
        panel.add(cnote);
    }

    private void gminor() {
        JLabel gnote = new JLabel("G");
        JLabel bflatnote = new JLabel("Bb");
        JLabel dnote = new JLabel("D");
        gnote.setHorizontalAlignment(JLabel.CENTER);
        bflatnote.setHorizontalAlignment(JLabel.CENTER);
        dnote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        bflatnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(dnote);
        panel.add(bflatnote);
        panel.add(dnote);
    }

    private void aminor() {
        JLabel anote = new JLabel("A");
        JLabel cnote = new JLabel("C");
        JLabel enote = new JLabel("E");
        anote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setHorizontalAlignment(JLabel.CENTER);
        enote.setHorizontalAlignment(JLabel.CENTER);
        anote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        enote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(anote);
        panel.add(cnote);
        panel.add(enote);
    }

    private void bminor() {
        JLabel bnote = new JLabel("B");
        JLabel dnote = new JLabel("D");
        JLabel fsharpnote = new JLabel("F#");
        bnote.setHorizontalAlignment(JLabel.CENTER);
        dnote.setHorizontalAlignment(JLabel.CENTER);
        fsharpnote.setHorizontalAlignment(JLabel.CENTER);
        bnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        fsharpnote.setFont(new Font("Comic Sans", Font.PLAIN, 250));
        panel.add(bnote);
        panel.add(dnote);
        panel.add(fsharpnote);
    }
}




