package ui;

import javax.swing.*;
import java.awt.*;

public class ScaleFrame extends JFrame {
    private JFrame scaleFrame;
    private JPanel scalePanel;


    public ScaleFrame() {
        scaleFrame = new JFrame();
        setSize(new Dimension(500, 500));
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setChordPanel();
        buttonSetup();
        getContentPane().add(scalePanel);
        setVisible(true);
    }

    public void setChordPanel() {
        scalePanel = new JPanel();
        scalePanel.setPreferredSize(new Dimension(500, 500));
        scalePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
        scalePanel.setBackground(Color.BLACK);
        scaleFrame.getContentPane().add(scalePanel);
    }

    public void buttonSetup() {
        JButton majorScaleButton = new JButton("Major Scale");
        majorScaleButton.setPreferredSize(new Dimension(300, 300));
        scalePanel.add(majorScaleButton);

        JButton mpButton = new JButton("Minor Pentatonic Scale");
        mpButton.setPreferredSize(new Dimension(300, 300));
        scalePanel.add(mpButton);
    }

}
