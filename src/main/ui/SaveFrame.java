package ui;

import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveFrame extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private ChordProgression cp;


    public SaveFrame(ChordProgression cp1) {
        this.cp = cp1;
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
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(Color.RED);
        JLabel warningMessage1 = new JLabel("Warning!");
        JLabel warningMessage2 = new JLabel("Returning home will lose progress for progression.");
        JLabel warningMessage3 = new JLabel("Would you like to save this progression?");
        warningMessage1.setHorizontalAlignment(JLabel.CENTER);
        warningMessage2.setHorizontalAlignment(JLabel.CENTER);
        warningMessage3.setHorizontalAlignment(JLabel.CENTER);
        warningMessage1.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        warningMessage2.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        warningMessage3.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        panel.add(warningMessage1);
        panel.add(warningMessage2);
        panel.add(warningMessage3);
        frame.getContentPane().add(panel);
    }

    public void buttonSetup() {
        JButton yes = new JButton("Yes");
        yes.setPreferredSize(new Dimension(100, 50));
        yes.addActionListener(this);
        panel.add(yes);

        JButton no = new JButton("No");
        no.setPreferredSize(new Dimension(100, 50));
        no.addActionListener(this);
        panel.add(no);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Yes")) {
            GuitarTheoryAppGUI guitarTheoryAppGUI = new GuitarTheoryAppGUI();
            guitarTheoryAppGUI.saveProgression(cp);

        } else if (e.getActionCommand().equals("No")) {
            GuitarTheoryAppGUI guitarTheoryAppGUI = new GuitarTheoryAppGUI();
        }
        dispose();
    }
}





