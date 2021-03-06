package screens.views.subviews;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import screens.ColorScheme;
import screens.UpdatableColor;
import utils.data.Constants;

public class About extends JPanel implements UpdatableColor {

    public static boolean isOpen = false;

    public About(JFrame frame) {
        JLabel version = new JLabel("Version: " + Constants.VERSION);
        JLabel author = new JLabel("Author: " + Constants.DEVELOPER);
        JLabel copyright = new JLabel("Copyright (c) " + Constants.DEVELOPER + " 2021-2022");
        JLabel disclaimer = new JLabel("Developer does not have any responsibility for any damages caused by this program.");
        JLabel disclaimer2 = new JLabel("This program is currently in development.");

        version.setForeground(ColorScheme.text);
        author.setForeground(ColorScheme.text);
        copyright.setForeground(ColorScheme.text);
        disclaimer.setForeground(ColorScheme.text);
        disclaimer2.setForeground(ColorScheme.text);

        this.setLayout(null);

        version.setBounds(10, 10, 600, 20);
        author.setBounds(10, 30, 600, 20);
        copyright.setBounds(10, 70, 600, 20);
        disclaimer.setBounds(10, 90, 600, 20);
        disclaimer2.setBounds(10, 110, 600, 20);

        this.add(version);
        this.add(author);
        this.add(copyright);
        this.add(disclaimer);
        this.add(disclaimer2);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                isOpen = false;
            }
        });

        frame.setContentPane(this);
        frame.setVisible(true);
    }

    @Override
    public void updateColor() {
        this.setBackground(ColorScheme.background);
        repaint();
    }
    
}
