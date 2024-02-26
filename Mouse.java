import java.awt.event.*;
import javax.swing.*;

public class Mouse extends MouseAdapter{

  Mouse(){
    JFrame f = new JFrame();
    JButton b = new JButton("Click");
    b.setBounds(200,200,50,50);
    b.addMouseListener(this);

    f.add(b);
    f.setSize(200,200);
    f.setVisible(true);
  }

  public void mouseClicked(MouseEvent e){
    System.out.println("Mouse clicked");
  }


  public static void main(String[] args) {
    new Mouse();
    
  }
}
