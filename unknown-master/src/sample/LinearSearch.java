/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
//import static javafx.scene.text.Font.font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LinearSearch extends JFrame implements ActionListener {

    private Container c;
    private JTextField tf1, tf2, tf3, tf4,tf5;
    private JButton next,btn1,run;
    private Font f;
    private ImageIcon img, hm;
    private JLabel imglabel,lb1,lb2,lb3,lb4,lb5,lb6;

   private int V,E,i=0,p=0;   // No. of vertices ,edges
   private int ara[]=new int[1000];

     
    LinearSearch() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 1280, 720);
        this.setTitle("          ALGORITHMS           ");
        this.setResizable(false);

        f = new Font("Algerian", Font.BOLD, 25);

        c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null);

        img = new ImageIcon(getClass().getResource("bg1R.png"));
        hm = new ImageIcon(getClass().getResource("home (2).png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        lb1=new JLabel("Enter number of elements: ");
        lb1.setBounds(300,50,600,50);
        lb1.setFont(f);
        lb1.setForeground(Color.WHITE);
        imglabel.add(lb1);
        
        tf1=new JTextField();
        tf1.setBounds(700,50,100,50);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setFont(f);
        imglabel.add(tf1);
        
        
       // lb2=new JLabel("Enter the number of Edges : ");
     //   lb2.setBounds(300,150,600,50);
      //  lb2.setFont(f);
       // lb2.setForeground(Color.WHITE);
       
      //  imglabel.add(lb2);
        
       // tf2=new JTextField();
     //   tf2.setBounds(700,150,100,50);
      //  tf2.setFont(f);
     //   tf2.setHorizontalAlignment(JTextField.CENTER);
        
       // imglabel.add(tf2);
        
        btn1=new JButton("Enter the Elements: ");
        btn1.setBounds(300,250,600,50);
        btn1.setFont(f);
     
        imglabel.add(btn1);
        
        
        
        lb3=new JLabel("Element");
        lb3.setBounds(300,350,600,50);
        lb3.setFont(f);
        lb3.setForeground(Color.WHITE);
        lb3.setVisible(false);
        imglabel.add(lb3);
        
        
        
        tf3=new JTextField();
        tf3.setBounds(300,450,100,50);
        tf3.setVisible(false);
        tf3.setFont(f);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        
        imglabel.add(tf3);
        
        tf4=new JTextField();
       tf4.setBounds(700,450,100,50);
       tf4.setVisible(false);
        tf4.setFont(f);
        tf4.setHorizontalAlignment(JTextField.CENTER);
        
        imglabel.add(tf4);
        
        next=new JButton("Next");
        next.setBounds(700,550,100,50);
        next.setFont(f);
        next.setVisible(false);
        imglabel.add(next);
        
        
        
        lb6=new JLabel("Enter the element to be found : ");
        lb6.setBounds(300,250,600,50);
       lb6.setForeground(Color.WHITE);
        lb6.setVisible(false);
       lb6.setFont(f);
       imglabel.add(lb6);
        
        tf5=new JTextField();
        tf5.setBounds(800,250,100,50);
        tf5.setHorizontalAlignment(JTextField.CENTER);
        tf5.setFont(f);
        tf5.setVisible(false);
        imglabel.add(tf5);
        
        run=new JButton("Search element");
        run.setBounds(300,350,600,50);
        run.setVisible(false);
        run.setFont(f);
        imglabel.add(run);
        
        
        btn1.addActionListener(this);
        next.addActionListener(this);
        run.addActionListener(this);
        
        
    }

    // Function to add an edge into the graph 
  void addEdge(int v) {
       ara[p]=v;
       p++;
    }
  //  void create()
   // {
 //       adj = new LinkedList[V]; 
   //     for (int i=0; i<V; ++i) 
   //         adj[i] = new LinkedList(); 
        
  //  }
    


    void  search(int s) 
    { 

    // int[] arr = { 3, 4, 1, 7, 5 }; 
        int n = V; 
          int ck=0;
        int x = s; 
        for (int i = 0; i < n; i++) { 
            // Return the index of the element if the element 
            // is found 
            if (ara[i] == x){ 
                ck=1;
           
                System.out.println("the element is at indext "+i+"\n");
            }
            
        } 
  
        if(ck!=1) {
// return -1 if the element is not found 
                  System.out.println("the element is not found\n");
                }
    }
      // Driver method to 
    public static void main(String[] args) 
    { 
       
    LinearSearch fr = new LinearSearch();
       fr.setVisible(true);
  
    } 
 

  
        
     

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==btn1)
        {
            String sn=tf1.getText();
           V=Integer.parseInt(sn);
            
         //   String se=tf2.getText();
         //   E=Integer.parseInt(se);
            
            System.out.println(V+" ");
       //     create();
            
            i++;
            lb3.setText("Element "+ i+" : ");
            lb3.setVisible(true);
            tf3.setVisible(true);
          //  tf4.setVisible(true);
            next.setVisible(true);
            tf5.setVisible(true);
            lb6.setVisible(true);
            
                   
        }
        else if(e.getSource()==next)
        {
            int u,v;
            
            String su=tf3.getText();
            u=Integer.parseInt(su);
          //  String sv=tf4.getText();
          //  v=Integer.parseInt(sv);
            
            addEdge(u);
            
            i++;
            if(i>V)
            {
                lb3.setVisible(false);
                tf3.setVisible(false);
                tf4.setVisible(false);
                next.setVisible(false);
                btn1.setVisible(false);
                run.setVisible(true);
                
            }
            else
            {
                lb3.setText("Element "+ i+" : ");
                tf3.setText("");
                tf4.setText("");
            }
                
        }
        else if(e.getSource()==run)
        {
            String ss=tf5.getText();
            
            int s=Integer.parseInt(ss);
            
            search(s);
        }
            
        
        
        
       
        
    }
}
