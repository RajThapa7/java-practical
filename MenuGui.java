import javax.swing.*;
import java.awt.event.*;

class MenuGui implements ActionListener{

  MenuGui(){
    JFrame f = new JFrame("Menu Bar");
    JMenuBar mb = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem m1 = new JMenuItem("item1");
    JMenuItem m2 = new JMenuItem("item2");
    JMenuItem m3 = new JMenuItem("item3");

    JMenu sm = new JMenu("Submenu");

    JMenuItem sm1 = new JMenuItem("sitem1");
    JMenuItem sm2 = new JMenuItem("sitem2");
    JMenuItem sm3 = new JMenuItem("sitem3");

    sm.add(sm1);
    sm.add(sm2);
    sm.add(sm3);



    menu.add(m1);
    menu.add(m2);
    menu.add(m3);
    menu.add(sm);

    mb.add(menu);

    mb.setBounds(0,0,200,20);


    f.add(mb);
    f.setSize(200,200);
    f.setLayout(null);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    // String pass = new String(scrollPassword.getPassword());
    //
    // l.setText(pass);

  }

  public static void main(String[] args) {
new MenuGui();
    
  }
}
