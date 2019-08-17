/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class TowersOfHanoi extends JFrame implements ActionListener,Runnable {

    public static void main(String[] args) {
       TowersOfHanoi toh=new TowersOfHanoi();
       toh.setVisible(true);
    }
    
    private Container c;
    private ImageIcon img, hm;
    private JLabel imglabel;
    private Font f;

    int n=6;
    int fwidth=1280,fheight=720;
    JButton start=new JButton("Start");
    JButton exit=new JButton("EXit");
    Rectangle []peg=new Rectangle[3];
    Rectangle []disk=new Rectangle[n];
    JLabel numof_moves=new JLabel("Number of Moves : ");
    JLabel present_move=new JLabel("Present Move : ");
    JTextArea title=new JTextArea();
     
    int [][]peg_capacity=new int[3][6];
    int []h=new int[3];
    int num,count=1;
   
   
    
    
   Thread t=new Thread(this);
    
    @Override
    public void run() {
       
        Hanoi(n,1,3,2);
    }
    
    public TowersOfHanoi() {
        
        c=this.getContentPane();
        f = new Font("Algerian", Font.BOLD, 25);
        
        h[0]=6;
        h[1]=0;
        h[2]=0;
        setLayout(null);
        setBounds(10,10,fwidth, fheight);
        setTitle("Towers Of Hanoi ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        img = new ImageIcon(getClass().getResource("bg1R.png"));
        hm = new ImageIcon(getClass().getResource("home (2).png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        start.setBounds(300, 520,150,50);
        start.setFont(f);
        
        exit.setBounds(600, 520,150,50);
        exit.setFont(f);
        numof_moves.setBounds(100,50,300,25);
        numof_moves.setFont(f);
        numof_moves.setForeground(Color.WHITE);
        
        present_move.setBounds(500,50,600,25);
        present_move.setFont(f);
        present_move.setForeground(Color.WHITE);
       //title.setBounds(850,10,100,500);
        imglabel.add(start);
        imglabel.add(exit);
        imglabel.add(numof_moves);
        imglabel.add(present_move);
       // add(title);
        
     //disk[0] large size
        
         for(int i=0;i<n;i++)
         {disk[i]=new Rectangle(150+i*12,475-i*25,200-i*25, 25);
          peg_capacity[0][i]=i; //pushing disk numbers in to first peg                
         }
         
         peg[0]=new Rectangle(250,200,15,300);
         peg[1]=new Rectangle(510,200,15,300);
         peg[2]=new Rectangle(760,200,15,300);
         
      
        start.addActionListener(this);
        exit.addActionListener(this);
      
    }
    
    public int dy(int x){return fheight-x;}
    
   

    @Override
    public void actionPerformed(ActionEvent ae) {
       
      if(ae.getSource()==start){
          t.start();
         
      }
       
        if(ae.getSource()==exit){
            System.exit(0);
        }
    }
    
    
public void Hanoi(int diskCount,int from, int dest, int by)
{
	if (diskCount==1)
	{   int hor_displacement=260;
            try
            {t.sleep(1000);
           
            //maintains number of disks in each peg
            peg_capacity[dest-1][h[dest-1]] =peg_capacity[from-1][--h[from-1]];
                
                if((from==1 && dest==2)|| (from==3 && dest==2))
                     hor_displacement=hor_displacement;
                else if((from==1 && dest==3)|| (from==2 && dest==3))
                      hor_displacement=hor_displacement*2;
                else if((from==3 && dest==1)||(from==2 && dest==1))
                     hor_displacement=0;
        
                 
               num= peg_capacity[dest-1][h[dest-1]++];
               
              
            disk[num].setLocation(150+num*12+hor_displacement,475-(h[dest-1]-1)*25);
            
            repaint();
            numof_moves.setText("Number of Moves :"+(count++));
            present_move.setText("Present Move : Disk "+(num+1)+ " moved from "+(char)(from+64)+" --> "+(char)(dest+64));
            
            }
          catch(Exception e) {}
               
        
        }

        else
	{
		Hanoi(diskCount -1, from, by, dest);
		Hanoi(1, from, dest, by);
		Hanoi(diskCount -1, by, dest, from);
	}
}
    
    
   public void paint(Graphics g){
       super.paint(g);
       g.setColor(Color.BLUE);
      
       for(int i=0;i<3;i++)
       { g.fillRect(peg[i].x,peg[i].y,peg[i].width,peg[i].height);
         g.drawString(""+(char)(i+65),peg[i].x+5,peg[i].y-10);
       }
      
       g.drawLine(100,500, 850,500);
     
       
       //drawing disks
      for(int i=0;i<n;i++)
         { g.setColor(Color.yellow);
           g.fillRoundRect(disk[i].x,disk[i].y,disk[i].width,disk[i].height,10,10);
           g.setColor(Color.BLACK);
           g.drawRoundRect(disk[i].x,disk[i].y,disk[i].width,disk[i].height,10,10);
           g.setColor(Color.black);
           g.drawString(" "+(i+1), disk[i].x+100-i*12,disk[i].y+12);
          
         }
  
      
    }         
}
