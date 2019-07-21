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

public class Homepage2 extends JFrame implements ActionListener {
  private Container c;
    private JButton nxt,prv;
    private CardLayout br1,br2;
    private JPanel panel;
    private ImageIcon icon,img,hm;
    private JLabel label,label1,imglabel,hml;
    private CardLayout card;
    private Font f,f1,f2;
    private JButton graph,search,dp,basics,hb,sorting,bfs,dfs,dij,ff;
    
    Homepage2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 100, 1280, 720);
        this.setTitle("          ALGORITHMS           ");
        this.setResizable(false);
        
        f=new Font("Algerian",Font.BOLD,25);
        f1=new Font("Calibari",Font.BOLD,15);

       
        
        c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null); 
        
        img=new ImageIcon(getClass().getResource("bg1R.png"));
        hm=new ImageIcon(getClass().getResource("home (2).png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0,img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        hb =new JButton(hm);
        hb.setBounds(10,20,hm.getIconWidth(),hm.getIconHeight());
        imglabel.add(hb);
        
        graph = new JButton("GRAPH ALGORITHMS");
        graph.setFont(f);
        graph.setBounds(430,100,350,50);
        imglabel.add(graph);
        
       /*   bfs = new JButton("(i) BFS");
        bfs.setFont(f1);
        bfs.setBounds(70,180,200,40);
        imglabel.add(bfs);
        
          dfs = new JButton("(ii) DFS");
        dfs.setFont(f1);
        dfs.setBounds(70,230,200,40);
        imglabel.add(dfs);
        
          dij = new JButton("(iii) DIJKSTRA");
        dij.setFont(f1);
        dij.setBounds(430,100,350,50);
        imglabel.add(dij);
        
          ff = new JButton("(iv) FLOOD FILL");
        ff.setFont(f1);
        ff.setBounds(70,330,200,40);
        imglabel.add(ff);
        
        */
        
        
        
           dp = new JButton("DYNAMIC PROGRAMMING");
        dp.setFont(f);
        dp.setBounds(430,200,350,50);
        imglabel.add(dp);
        
        
           /* 
         */
            sorting = new JButton("SORTIING ALGORITHMS");
        sorting.setFont(f);
        sorting.setBounds(430,300,350,50);
        imglabel.add(sorting);
       
        search = new JButton("SEARCHING ALGORITHMS");
        search.setFont(f);
        search.setBounds(430,400,350,50);
        imglabel.add(search);
        
         
        hb.addActionListener(this);
        
       /* graph =new JButton("GRAPH");
        graph.setFont(f1);
        graph.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);
*/
    }

    
    public static void main(String[] args) {
       Homepage2 fr = new Homepage2();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==hb)
        {
            dispose();
            Homepage1 fr = new Homepage1();
        fr.setVisible(true);
        }
    }

}
