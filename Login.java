import javax.swing.*;
import java.awt.*;

public class Login {
  Login(){
    JFrame f = new JFrame("Login GUI");
    JButton btn = new JButton("Login");
    JLabel l1,l2;
    JTextField username;
    JPasswordField password = new JPasswordField();

    l1  = new JLabel("Username");
    l2 = new JLabel("Password");
    username = new JTextField();

    l1.setBounds(20,20,150,50);
    username.setBounds(20,60,150,50);
    l2.setBounds(20,110,150,50);
    password.setBounds(20,150,150,50);
    btn.setBounds(20,220,150,50);

    f.setLayout(null);
    f.add(l1);
    f.add(username);
    f.add(l2);
    f.add(password);
    f.add(btn);
    f.setSize(400,400);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new Login();
  }
}
