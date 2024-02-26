import javax.swing.*;
import java.awt.event.*;

public class ProgressBar {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Progress Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Create JLabel to display progress
        JLabel label = new JLabel("Progress:");
        label.setBounds(20, 20, 80, 30);
        frame.add(label);

        // Create JProgressBar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(110, 20, 150, 30);
        frame.add(progressBar);

        // Create JButton to start progress
        JButton startButton = new JButton("Start");
        startButton.setBounds(20, 60, 80, 30);
        frame.add(startButton);

        // Add ActionListener to startButton
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Start a new thread to simulate progress
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i <= 100; i++) {
                            try {
                                Thread.sleep(100); // Simulate some task
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                            progressBar.setValue(i); // Update progress bar value
                        }
                    }
                });
                thread.start(); // Start the thread
            }
        });

        // Set the frame visible
        frame.setVisible(true);
    }
}

