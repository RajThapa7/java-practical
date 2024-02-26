import java.awt.*;
import javax.swing.*;

public class Border{

   Border(){
    JFrame f = new JFrame();

    JButton b1 = new JButton("north");
    JButton b2 = new JButton("south");
    JButton b3 = new JButton("east");
    JButton b4 = new JButton("west");
    JButton b5 = new JButton("center");

    // for setting hgap and vgap
    // f.setLayout(new BorderLayout(10,10));

    f.add(b1,BorderLayout.NORTH);
    f.add(b2,BorderLayout.SOUTH);
    f.add(b3,BorderLayout.EAST);
    f.add(b4,BorderLayout.WEST);
    f.add(b5,BorderLayout.CENTER);

    f.setSize(300,300);
    f.setVisible(true);
  }


  public static void main(String[] args) {
    new Border();
    
  }
  

}
