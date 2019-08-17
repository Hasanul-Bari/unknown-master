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

public final class ncr_P extends JFrame implements ActionListener {

    private Container c;
    private JButton nxt, prv;
    private JPanel panel;
    private ImageIcon  img, hm,cf,uva,hr,loj;
    public JLabel label, label1,label2,label3, imglabel, hml;
    private CardLayout card;
    private Font f, f1, f2;
    private JButton btn1;
    private JTextField jf1,jf2,jf3,jf4,jf5;


    ncr_P() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 100, 1280, 720);
        this.setTitle("          Dynamic Programming-nCr%p           ");
        this.setResizable(true);

        f = new Font("Algerian", Font.BOLD, 25);

        c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null);

        img = new ImageIcon("src/dppic/DP_BG.png");

       hm = new ImageIcon(getClass().getResource("home (2).png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        uva = new ImageIcon(getClass().getResource("uva.png"));
        cf = new ImageIcon(getClass().getResource("cf.png"));

        loj = new ImageIcon(getClass().getResource("loj.png"));

        hr = new ImageIcon(getClass().getResource("hackerrank.png"));


        
        btn1 = new JButton("DP menu");
        btn1.setOpaque(true);
       // btn1.setFont(f);
        btn1.setBounds(0, 0, 100,50);

        imglabel.add(btn1);
        btn1.addActionListener(this);
        
        String str1,str2,str3,str4;
        str1="https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=651";
        str2="https://www.hackerrank.com/domains/algorithms?filters%5Bsubdomains%5D%5B%5D=dynamic-programming";
        str3="http://lightoj.com/volume_showproblem.php?problem=1110  http://lightoj.com/volume_showproblem.php?problem=1157 ";
        str4="";
        
         JLabel label=new JLabel(uva);
        label.setBounds(30, 70,400,50);
        label.setOpaque(true);
        imglabel.add(label);
        
        JTextField jf1=new JTextField();
        jf1.setBounds(30, 140, 1000, 50);
        jf1.setText(str1);
        imglabel.add(jf1);
        
         JLabel label1=new JLabel(hr);
        label1.setBounds(30, 225,400,50);
        label1.setOpaque(true);
        imglabel.add(label1);
        
          JTextField jf2=new JTextField();
        jf2.setBounds(30, 285, 1000, 50);
        jf2.setText(str2);
        imglabel.add(jf2);
        
             
         JLabel label2=new JLabel(loj);
        label2.setBounds(30, 350,400,50);
        label2.setOpaque(true);
        imglabel.add(label2);
        
          JTextField jf3=new JTextField();
        jf3.setBounds(30, 415, 1000, 50);
        jf3.setText(str3);
        imglabel.add(jf3);
        
         JLabel label3=new JLabel(cf);
        label3.setBounds(30, 480,400,50);
        label3.setOpaque(true);
        imglabel.add(label3);
        
          JTextField jf4=new JTextField(str4);
        jf4.setBounds(30, 535, 1000, 50);
        jf4.setText(str4);
        imglabel.add(jf4);
        
       
       
    }

  
    public static void main(String[] args) {
       ncr_P fr = new ncr_P();
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
