import javax.swing.*;
import java.awt.event.*;

class AddTwoNumber implements ActionListener{
  JTextField a,b,c;
  JButton b1,b2;

  AddTwoNumber(){
    JFrame f = new JFrame();

     a = new JTextField(20);
    a.setBounds(200,100,200,50);

     b = new JTextField(20);
    b.setBounds(200,200,200,50);

     c = new JTextField(20);
    c.setBounds(200,500,200,50);

     b1 = new JButton("ADD");
     b2 = new JButton("SUB");
    b1.setBounds(200,300,100,100);
    b2.setBounds(200,400,100,100);

    b1.addActionListener(this);
    b2.addActionListener(this);

    f.setLayout(null);
    f.add(a);
    f.add(b);
    f.add(c);
    f.add(b1);
    f.add(b2);

    f.setSize(200,200);
    f.setVisible(true);

  }

  public void actionPerformed(ActionEvent e){
    String s1 = a.getText();
    String s2 = b.getText();
    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);
    int res = 0;

    if(e.getSource() == b1){
      res = a+b;
    }
    if(e.getSource() == b2){
      res = a-b;
    }
    String result = String.valueOf(res);
    c.setText(result);
  }


  public static void main(String[] args) {
    new AddTwoNumber();
  }
}
