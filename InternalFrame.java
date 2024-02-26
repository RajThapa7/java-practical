import javax.swing.*;
import java.awt.event.*;

public class InternalFrame {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Internal Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create JDesktopPane to hold internal frames
        JDesktopPane desktopPane = new JDesktopPane();
        frame.add(desktopPane);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("New Internal Frame");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Add ActionListener to the menu item to create new internal frames
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new internal frame
                JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
                internalFrame.setSize(200, 150);
                internalFrame.setVisible(true);

                // Add content to the internal frame
                JPanel panel = new JPanel();
                JLabel label = new JLabel("This is an internal frame");
                panel.add(label);
                internalFrame.add(panel);

                // Add the internal frame to the desktop pane
                desktopPane.add(internalFrame);
            }
        });

        // Set the frame visible
        frame.setVisible(true);
    }
}

