package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//Create a frame that displays options for scale types
public class ScaleFrame extends JFrame implements ActionListener {
    private JFrame scaleFrame;
    private JPanel scalePanel;

    //Constructs a new frame
    public ScaleFrame() {
        scaleFrame = new JFrame();
        setSize(new Dimension(500, 500));
        setLayout(new BorderLayout());
        setChordPanel();
        buttonSetup();
        getContentPane().add(scalePanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    //MODIFIES: this
    //EFFECTS: create and setup a new panel
    public void setChordPanel() {
        scalePanel = new JPanel();
        scalePanel.setPreferredSize(new Dimension(1920, 1080));
        scalePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 100));
        scalePanel.setBackground(Color.BLACK);
    }

    //MODIFIES: this
    //EFFECTS: create and setup buttons
    public void buttonSetup() {
        JButton majorScaleButton = new JButton("Major Scale");
        JButton mpButton = new JButton("Minor Pentatonic Scale");
        List<JButton> buttons = new ArrayList<>();
        buttons.add(majorScaleButton);
        buttons.add(mpButton);
        for (JButton button: buttons) {
            button.setPreferredSize(new Dimension(500, 500));
            button.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 25));
            button.addActionListener(this);
            scalePanel.add(button);
        }
    }

    //MODIFIES: this
    //EFFECTS: switches frame depending on button pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO add functionality to scale buttons
    }
}
