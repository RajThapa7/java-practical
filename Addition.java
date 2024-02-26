import javax.swing.*;

import java.awt.GridLayout;

import java.awt.event.*;


public class Addition extends KeyAdapter

{

 JLabel l1, l2, l3;

 JTextField t1, t2, t3;

 JFrame f = new JFrame(); 

 Addition() 

 {

  l1 = new JLabel("First Number:");

  t1 = new JTextField();

  l2 = new JLabel("Second Number:");

  t2 = new JTextField();

  l3 = new JLabel("Press any key");

  t3 = new JTextField();

  t3.addKeyListener(this);

  

  f.add(l1);

  f.add(t1);

  f.add(l2);

  f.add(t2);

  f.add(l3);

  f.add(t3);

  

  f.setSize(250,150);

  f.setLayout(new GridLayout(3,2));

  f.setLocationRelativeTo(null);

  f.setVisible(true);

  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);  

}


   public void keyReleased(KeyEvent e)    	 

   {

        int num1 = Integer.parseInt(t1.getText()); 

        int num2 = Integer.parseInt(t2.getText()); 

        int sum = num1 + num2;

        // JOptionPane.showMessageDialog(f, "The sum is" +sum);
      String res = String.valueOf(sum);

        t3.setText(res);

   }



 public static void main(String[] args)
 {
    new Addition();

 }
}
