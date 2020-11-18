package ui;

import model.ChordProgression;
import model.MajorChord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MajorChordsFrame extends JFrame implements ActionListener {
    private JFrame majorChordsFrame;
    private JPanel majorChordsPanel;
    private List<JButton> buttons;
    public static final MajorChord C_MAJOR = new MajorChord("CMajor", "C", "E", "G");
    public static final MajorChord D_MAJOR = new MajorChord("DMajor", "D", "F#", "A");
    public static final MajorChord E_MAJOR = new MajorChord("EMajor", "E", "G#", "B");
    public static final MajorChord F_MAJOR = new MajorChord("FMajor", "F", "A", "C");
    public static final MajorChord G_MAJOR = new MajorChord("GMajor", "G", "B", "D");
    public static final MajorChord A_MAJOR = new MajorChord("AMajor", "A", "C#", "E");
    public static final MajorChord B_MAJOR = new MajorChord("BMajor", "B", "D#", "F#");
    private ChordProgression cp;


    public MajorChordsFrame(ChordProgression chordProgression) {
        this.cp = chordProgression;
        majorChordsFrame = new JFrame();
        setSize(new Dimension(1000, 1000));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        getContentPane().add(majorChordsPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setChordPanel() {
        majorChordsPanel = new JPanel();
        majorChordsPanel.setPreferredSize(new Dimension(1920, 1080));
        majorChordsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        majorChordsPanel.setBackground(Color.BLACK);
        majorChordsFrame.getContentPane().add(majorChordsPanel);
    }

    public void buttonSetup() {
        buttons = new ArrayList<>();

        JButton cmajor = new JButton("CMajor");
        JButton dmajor = new JButton("DMajor");
        JButton emajor = new JButton("EMajor");
        JButton fmajor = new JButton("FMajor");
        JButton gmajor = new JButton("GMajor");
        JButton amajor = new JButton("AMajor");
        JButton bmajor = new JButton("BMajor");

        buttons.add(cmajor);
        buttons.add(dmajor);
        buttons.add(emajor);
        buttons.add(fmajor);
        buttons.add(gmajor);
        buttons.add(amajor);
        buttons.add(bmajor);

        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(300, 300));
            button.addActionListener(this);
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
            majorChordsPanel.add(button);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("CMajor")) {
            IndividualMajorChords indivdualChordFrames = new IndividualMajorChords(C_MAJOR, cp);
        } else if (e.getActionCommand().equals("DMajor")) {
            IndividualMajorChords indivdualChordFrames = new IndividualMajorChords(D_MAJOR, cp);
        } else if (e.getActionCommand().equals("EMajor")) {
            IndividualMajorChords indivdualChordFrames = new IndividualMajorChords(E_MAJOR, cp);
        } else if (e.getActionCommand().equals("FMajor")) {
            IndividualMajorChords indivdualChordFrames = new IndividualMajorChords(F_MAJOR, cp);
        } else if (e.getActionCommand().equals("GMajor")) {
            IndividualMajorChords indivdualChordFrames = new IndividualMajorChords(G_MAJOR, cp);
        } else if (e.getActionCommand().equals("AMajor")) {
            IndividualMajorChords indivdualChordFrames = new IndividualMajorChords(A_MAJOR, cp);
        } else if (e.getActionCommand().equals("BMajor")) {
            IndividualMajorChords indivdualChordFrames = new IndividualMajorChords(B_MAJOR, cp);
        }
        dispose();
    }
}
