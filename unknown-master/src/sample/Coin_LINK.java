package sample;

import java.awt.Color;
import java.awt.Container;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class Coin_LINK extends JFrame implements ActionListener {

    private Container c;
    private JButton nxt, prv;
    private JPanel panel;
    private ImageIcon  img, hm;
    public JLabel label, label1, imglabel, hml;
    private CardLayout card;
    private Font f, f1, f2;
    private JButton btn1;
    private JTextField jf1,jf2,jf3,jf4,jf5;


    Coin_LINK() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 100, 1280, 720);
        this.setTitle("          Dynamic Programming -Coin Change          ");
        this.setResizable(true);

        f = new Font("Algerian", Font.BOLD, 25);

        c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null);

        img = new ImageIcon("src/dppic/DP_BG.png");

       // hm = new ImageIcon(getClass().getResource("home (2).png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        btn1 = new JButton("DP menu");
        btn1.setOpaque(true);
       // btn1.setFont(f);
        btn1.setBounds(0, 0, 100,50);

        imglabel.add(btn1);
        btn1.addActionListener(this);
        
        String str1,str2,str3;
        str1="CodeDope: https://www.codesdope.com/course/algorithms-coin-change/";
        str2="HackerMoon : https://hackernoon.com/the-coin-change-problem-explained-ddd035a8f22f";
        str3="TutorialHorizon : https://algorithms.tutorialhorizon.com/dynamic-programming-coin-change-problem/";
        
        JTextField jf1=new JTextField();
        jf1.setBounds(30, 70, 1000, 50);
        jf1.setText(str1);
        imglabel.add(jf1);
        
          JTextField jf2=new JTextField();
        jf2.setBounds(30, 140, 1000, 50);
        jf2.setText(str2);
        imglabel.add(jf2);
        
          JTextField jf3=new JTextField();
        jf3.setBounds(30, 210, 1000, 50);
        jf3.setText(str3);
        imglabel.add(jf3);
       
    }

  
    public static void main(String[] args) {
        Coin_LINK fr = new Coin_LINK();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  if(e.getSource()==btn1)
  {
      DP_INDEX fr = new DP_INDEX();
        fr.setVisible(true);
  }
    }

}
