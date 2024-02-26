import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a DefaultTableModel with data and column names
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Gender");

        // Add some data to the table
        model.addRow(new Object[]{"John", 25, "Male"});
        model.addRow(new Object[]{"Anna", 30, "Female"});
        model.addRow(new Object[]{"Tom", 35, "Male"});
        model.addRow(new Object[]{"Emily", 28, "Female"});

        // Create JTable with the model
        JTable table = new JTable(model);

        // Enable table's scrolling
        JScrollPane scrollPane = new JScrollPane(table);

        // Add table to the frame
        frame.add(scrollPane);

        // Set the frame visible
        frame.setVisible(true);
    }
}

