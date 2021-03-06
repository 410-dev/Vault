package screens;

import javax.swing.JFrame;
import javax.swing.JPanel;

import database.SQLite3;
import utils.data.Constants;

public class Frame {
    public static JFrame frame;

    public static void createFrame() {
        frame = new JFrame("Vault (" + Constants.VERSION + ")");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setMinimumSize(new java.awt.Dimension(400, 400));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                SQLite3.close();
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    public static void setContent(JPanel panel) {
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }
}
