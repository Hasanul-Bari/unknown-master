/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author tanverlikhon
 */
public final class Graph extends JFrame implements ActionListener {

    private Container c;
    private JButton nxt,prv;
    private CardLayout br1,br2;
    private JPanel panel;
    private ImageIcon icon,home,img,hm;
    private JLabel label,label1,imglabel,hml;
    private CardLayout card;
    private Font f,f1,f2;
    private JButton btn1,btn2,btn3;

     
    
    Graph() {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(10, 10,1280, 720);
       this.setTitle("          GRAPH ALGORITHMS           ");
       this.setResizable(true);
       
       f=new Font("Algerian",Font.BOLD,35);
              f1=new Font("Algerian",Font.ITALIC,20);

       
        
        c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null); 
        
        img=new ImageIcon(getClass().getResource("bg1R.png"));
        hm=new ImageIcon(getClass().getResource("EnterR.png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0,img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        btn1= new JButton("BFS Algorithm");
        btn1.setBounds(300, 100, 300, 50);
        btn1.setFont(f1);
        imglabel.add(btn1);
        
        btn2= new JButton("DFS Algorithm");
        btn2.setBounds(300, 200, 300, 50);
        btn2.setFont(f1);
        imglabel.add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);

       
 
  
}
       @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==btn2)
       {
             DFS fr = new DFS();
        fr.setVisible(true);
       }
       else if(ae.getSource()==btn1)
       {
              BFS fr = new BFS();
        fr.setVisible(true);
       }
             
    }
    public static void main(String[] args) {
        Graph fr = new Graph();
        fr.setVisible(true);
    }

 
}