    import java.awt.*; 
    import javax.swing.*;  

    public class GridBagLayoutExample{  
        public static void main(String[] args) {  
                new GridBagLayoutExample();  
            }  

            public GridBagLayoutExample() {  
         JFrame f = new JFrame("GridBag Layout");
         GridBagConstraints gbc = new GridBagConstraints();  

         JButton b1 = new JButton("Button 1");
         JButton b2 = new JButton("Button 2");
         JButton b3 = new JButton("Button 3");
         JButton b4 = new JButton("Button 4");
         JButton b5 = new JButton("Button 5");

        f.setLayout(new GridBagLayout());

        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridx = 0;  
        gbc.gridy = 0;  

        f.add(b1, gbc);  

        gbc.gridx = 1;  
        gbc.gridy = 0;  
        f.add(b2, gbc);  

        gbc.gridx = 0;  
        gbc.gridy = 1;  
        f.add(b3, gbc);  

        gbc.gridx = 1;  
        gbc.gridy = 1;  
        f.add(b4, gbc);  

        gbc.gridx = 0;  
        gbc.gridy = 2;  
        gbc.gridwidth = 2;  
        f.add(b5, gbc);  

                f.setSize(300, 300);  
                f.setVisible(true);  
          
            }  
          
    }  
