package ui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    JPanel panel;
    GuitarTheoryAppGUI appGUI;

    public MainPanel() {
        panel = new JPanel();
        setBorder(BorderFactory.createEmptyBorder(300,500,300,500));
        setBackground(Color.PINK);
        this.appGUI = appGUI;



    }
}
