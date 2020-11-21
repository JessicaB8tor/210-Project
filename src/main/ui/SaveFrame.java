package ui;

import model.ChordProgression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//Creates a frame that asks user if they wish to save progression or else it will be lost
public class SaveFrame extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private ChordProgression cp;


    //Constructs a new frame
    public SaveFrame(ChordProgression cp1) {
        this.cp = cp1;
        frame = new JFrame();
        setSize(new Dimension(500, 500));
        setLayout(new BorderLayout());
        setChordPanel();
        buttonSetup();
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    //MODIFIES: this
    //EFFECTS: create and set up panel
    public void setChordPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1920, 1080));
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(Color.RED);
        JLabel warningMessage1 = new JLabel("Warning!");
        JLabel warningMessage2 = new JLabel("Returning home will lose progress for progression.");
        JLabel warningMessage3 = new JLabel("Would you like to save this progression?");
        List<JLabel> messages = new ArrayList<>();
        messages.add(warningMessage1);
        messages.add(warningMessage2);
        messages.add(warningMessage3);
        for (JLabel message : messages) {
            message.setHorizontalAlignment(JLabel.CENTER);
            message.setFont(new Font("Berlin Sans FB", Font.BOLD, 50));
            panel.add(message);
        }
    }

    //MODIFIES: this
    //EFFECTS: create and setup buttons
    public void buttonSetup() {
        JButton yes = new JButton("Yes");
        JButton no = new JButton("No");
        List<JButton> buttons = new ArrayList<>();
        buttons.add(yes);
        buttons.add(no);
        for (JButton button: buttons) {
            button.setPreferredSize(new Dimension(100, 50));
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 100));
            button.addActionListener(this);
            panel.add(button);
        }
    }


    //MODIFIES: this
    //EFFECTS: switches frame depending on button clicked
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





