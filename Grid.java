import java.awt.*;
import javax.swing.*;

public class Grid{

  Grid(){
    JFrame f = new JFrame();

    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JButton b4 = new JButton("b4");
    JButton b5 = new JButton("b5");
    JButton b6 = new JButton("b6");
    JButton b7 = new JButton("b7");
    JButton b8 = new JButton("b8");
    JButton b9 = new JButton("b9");

    f.setLayout(new GridLayout(3,3,10,10));

    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);

    f.setSize(300,300);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new Grid();
    
  }



}
