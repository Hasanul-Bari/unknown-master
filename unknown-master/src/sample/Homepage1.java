
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


public final class Homepage1 extends JFrame implements ActionListener {

    private Container c;
    private JButton nxt,prv;
    private CardLayout br1,br2;
    private JPanel panel;
    private ImageIcon icon,home,img,hm;
    private JLabel label,label1,imglabel,hml;
    private CardLayout card;
    private Font f,f1,f2;
    private JButton btn1,btn2,btn3;

     
    
    Homepage1() {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(10, 100,1280, 720);
       this.setTitle("          ALGORITHMS           ");
       this.setResizable(true);
       
       f=new Font("Algerian",Font.BOLD,35);
       
        
        c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null); 
        
        img=new ImageIcon(getClass().getResource("Algo.jpg"));
        hm=new ImageIcon(getClass().getResource("EnterR.png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0,img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        //hml = new JLabel(hm);
      //  hml.setBounds(1, 1,hm.getIconWidth(), hm.getIconHeight());
        //imglabel.add(hml);
       
        
       /* label=new JLabel(" SIMULATIONS ");
        label.setBounds(500,500,300,100);
        label.setFont(f);
        label.setForeground(Color.WHITE);
        imglabel.add(label);
     //   c.add(label);*/
        
       btn1=new JButton(hm);
        btn1.setFont(f);
        btn1.setBounds(500,600,hm.getIconWidth(),hm.getIconHeight());
        
        imglabel.add(btn1);
        
        btn1.addActionListener(this);
       
 
  
}
       @Override
    public void actionPerformed(ActionEvent ae) {
       // dispose();
        Homepage2 fr = new Homepage2();
        fr.setVisible(true);
        
        
        
    }
    public static void main(String[] args) {
        Homepage1 fr = new Homepage1();
        fr.setVisible(true);
    }

  

}

