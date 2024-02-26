import javax.swing.*;
import java.awt.*;

public class TappedPane {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        JLabel label1 = new JLabel("This is panel 1");
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        JLabel label2 = new JLabel("This is panel 2");
        panel2.add(label2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        JLabel label3 = new JLabel("This is panel 3");
        panel3.add(label3);

        // Add panels to the tabbed pane with titles
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Add the tabbed pane to the frame
        frame.getContentPane().add(tabbedPane);

        // Set the frame visible
        frame.setVisible(true);
    }
}

