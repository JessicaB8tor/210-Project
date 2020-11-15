package ui;

import model.Chord;
import model.MinorChord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndividualMinorChords extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private Chord chord;

    public IndividualMinorChords(MinorChord chord) {
        this.chord = chord;
        frame = new JFrame(chord.getName());
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
        panel.setLayout(new GridLayout(4, 1));
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);
    }

    public void showNotes() {
        if (chord.getName().equals("CMinor")) {
            cminor();
        } else if (chord.getName().equals("DMinor")) {
            dminor();
        } else if (chord.getName().equals("EMinor")) {
            eminor();
        } else if (chord.getName().equals("FMinor")) {
            fminor();
        } else if (chord.getName().equals("GMinor")) {
            gminor();
        } else if (chord.getName().equals("AMinor")) {
            aminor();
        } else if (chord.getName().equals("BMinor")) {
            bminor();
        }
        JButton addto = new JButton("Add to Chord Progression");
        addto.setPreferredSize(new Dimension(100, 100));
        addto.addActionListener(this);
        panel.add(addto);
    }

    private void cminor() {
        JLabel cnote = new JLabel("C");
        JLabel eflatnote = new JLabel("Eb");
        JLabel gnote = new JLabel("G");
        cnote.setHorizontalAlignment(JLabel.CENTER);
        eflatnote.setHorizontalAlignment(JLabel.CENTER);
        gnote.setHorizontalAlignment(JLabel.CENTER);
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        eflatnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
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
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        fnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        anote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
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
        enote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        bnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
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
        fnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        aflatnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
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
        gnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        bflatnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
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
        anote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        cnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        enote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
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
        bnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        dnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        fsharpnote.setFont(new Font("Comic Sans", Font.PLAIN, 200));
        panel.add(bnote);
        panel.add(dnote);
        panel.add(fsharpnote);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}




