package graph;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import static javafx.scene.text.Font.font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BFS extends JFrame implements ActionListener {

    private Container c;
    private JTextField tf1, tf2, tf3, tf4,tf5;
    private JButton next,btn1,run,back;
    private Font f;
    private ImageIcon img, hm;
    private JLabel imglabel,lb1,lb2,lb3,lb4,lb5,lb6;
    private JTextArea ta;
    private JScrollPane scroll;

    private int V,E,i=0;   // No. of vertices ,edges
    private LinkedList<Integer> adj[]; //Adjacency Lists 

     
    BFS() {
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
        
        back = new JButton("Back");
        back.setBounds(0, 0, 150, 50);
        back.setFont(f);
        c.add(back);
        
        lb1=new JLabel("Enter the number of Nodes : ");
        lb1.setBounds(300,50,600,50);
        lb1.setFont(f);
        lb1.setForeground(Color.WHITE);
        imglabel.add(lb1);
        
        tf1=new JTextField();
        tf1.setBounds(700,50,100,50);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setFont(f);
        imglabel.add(tf1);
        
        
        lb2=new JLabel("Enter the number of Edges : ");
        lb2.setBounds(300,150,600,50);
        lb2.setFont(f);
        lb2.setForeground(Color.WHITE);
       
        imglabel.add(lb2);
        
        tf2=new JTextField();
        tf2.setBounds(700,150,100,50);
        tf2.setFont(f);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        
        imglabel.add(tf2);
        
        btn1=new JButton("Enter the Edges : ");
        btn1.setBounds(300,250,600,50);
        btn1.setFont(f);
     
        imglabel.add(btn1);
        
        
        
        lb3=new JLabel("Edge");
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
        
        
        
        lb6=new JLabel("Enter the source node : ");
        lb6.setBounds(300,250,600,50);
        lb6.setForeground(Color.WHITE);
        lb6.setVisible(false);
        lb6.setFont(f);
        imglabel.add(lb6);
        
        tf5=new JTextField();
        tf5.setBounds(700,250,100,50);
        tf5.setHorizontalAlignment(JTextField.CENTER);
        tf5.setFont(f);
        tf5.setVisible(false);
        imglabel.add(tf5);
        
        run=new JButton("Run BFS");
        run.setBounds(300,350,600,50);
        run.setVisible(false);
        run.setFont(f);
        imglabel.add(run);
        
        ta=new JTextArea();
        ta.setBounds(300,100,600,500);
        ta.setVisible(false);
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        scroll =new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(300,100,600,500);
        
        imglabel.add(ta);
        
        
        btn1.addActionListener(this);
        next.addActionListener(this);
        run.addActionListener(this);
        back.addActionListener(this);
        
        
        
        
        
        
        
            
    }

    // Function to add an edge into the graph 
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void create()
    {
        adj = new LinkedList[V]; 
        for (int i=0; i<V; ++i) 
            adj[i] = new LinkedList(); 
        
    }
    // prints BFS traversal from a given source s 
    void bfs(int s) {
        
        
        // Mark all the vertices as not visited(By default 
        // set as false) 
        int src=s;
        boolean visited[] = new boolean[V];
        
        int level[] =new int[V];
        for(int i=0; i<V; i++)
            level[i]=-1;

        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it 
        visited[s] = true;
        level[s]=0;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it 
            s = queue.poll();
            //System.out.print(s + " ");
            
            String ss=Integer.toString(s);
            //ta.append(ss+" -> ");

            // Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Integer> it = adj[s].listIterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    visited[n] = true;
                    level[n]=level[s]+1;
                    queue.add(n);
                }
            }
        }
        ta.append("     Source :     "+src+"\n");
        ta.append("  Node    -----      Distance\n");
        for(int i=0; i<V; i++)
        {
            if(i!=src)
            {
                if(level[i]!=-1)
                    ta.append("     "+i+"       -----      "+level[i]+"\n");
                else
                    ta.append(i+" is not reachable to "+src+"\n");
            }
        }
    }
    // Driver method to 
    public static void main(String args[]) {
        
        BFS fr = new BFS();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==btn1)
        {
            String sn=tf1.getText();
            V=Integer.parseInt(sn);
            
            String se=tf2.getText();
            E=Integer.parseInt(se);
            
            ///System.out.println(V+" "+E);
            create();
            
            i++;
            lb3.setText("Edge "+ i+" : ");
            lb3.setVisible(true);
            tf3.setVisible(true);
            tf4.setVisible(true);
            next.setVisible(true);
            tf5.setVisible(true);
            lb6.setVisible(true);
            
                   
        }
        else if(e.getSource()==next)
        {
            int u,v;
            
            String su=tf3.getText();
            u=Integer.parseInt(su);
            String sv=tf4.getText();
            v=Integer.parseInt(sv);
            
            addEdge(u,v);
            
            i++;
            if(i>E)
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
                lb3.setText("Edge "+ i+" : ");
                tf3.setText("");
                tf4.setText("");
            }
                
        }
        else if(e.getSource()==run)
        {
            String ss=tf5.getText();
            
            int src=Integer.parseInt(ss);
            
            
            lb1.setVisible(false);
            lb2.setVisible(false);
            tf1.setVisible(false);
            tf2.setVisible(false);
            lb6.setVisible(false);
            tf5.setVisible(false);
            run.setVisible(false);
            
            bfs(src);
            
            //ta.append("END");
            
            ta.setVisible(true);
            
            
            
            
        }
        else if(e.getSource()==back){
            
            dispose();
            GraphMenu fr = new GraphMenu();
            fr.setVisible(true);
            
        }
            
        
        
        
       
        
    }
}
