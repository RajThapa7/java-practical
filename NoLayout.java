import javax.swing.*;
class NoLayout{
  NoLayout(){
    JFrame f = new JFrame("No layout container");
    f.setLayout(null);

    JButton b1 = new JButton("Button");
    b1.setBounds(200,200,100,50);

    f.add(b1);

    f.setSize(200,200);
    f.setVisible(true);
    
  }

  public static void main(String[] args) {
    new NoLayout();
    
  }
}
