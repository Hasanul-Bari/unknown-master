package sample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import static javafx.scene.text.Font.font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DFS extends JFrame implements ActionListener {

    private Container c;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6;
    private JButton next, btn1, run;
    private Font f;
    private ImageIcon img, hm;
    private JLabel imglabel, lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    private JTextArea ta;
    private JScrollPane scroll;

    private int V, E, i = 0;   // No. of vertices ,edges
    private LinkedList<Integer> adj[]; //Adjacency Lists 

    DFS() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 1280, 720);
        this.setTitle("          DFS           ");
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

        lb1 = new JLabel("Enter the number of Nodes : ");
        lb1.setBounds(300, 50, 600, 50);
        lb1.setFont(f);
        lb1.setForeground(Color.WHITE);
        imglabel.add(lb1);

        tf1 = new JTextField();
        tf1.setBounds(700, 50, 100, 50);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setFont(f);
        imglabel.add(tf1);

        lb2 = new JLabel("Enter the number of Edges : ");
        lb2.setBounds(300, 150, 600, 50);
        lb2.setFont(f);
        lb2.setForeground(Color.WHITE);

        imglabel.add(lb2);

        tf2 = new JTextField();
        tf2.setBounds(700, 150, 100, 50);
        tf2.setFont(f);
        tf2.setHorizontalAlignment(JTextField.CENTER);

        imglabel.add(tf2);

        btn1 = new JButton("Enter the Edges : ");
        btn1.setBounds(300, 250, 600, 50);
        btn1.setFont(f);

        imglabel.add(btn1);

        lb3 = new JLabel("Edge");
        lb3.setBounds(300, 350, 600, 50);
        lb3.setFont(f);
        lb3.setForeground(Color.WHITE);
        lb3.setVisible(false);
        imglabel.add(lb3);

        tf3 = new JTextField();
        tf3.setBounds(300, 450, 100, 50);
        tf3.setVisible(false);
        tf3.setFont(f);
        tf3.setHorizontalAlignment(JTextField.CENTER);

        imglabel.add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(700, 450, 100, 50);
        tf4.setVisible(false);
        tf4.setFont(f);
        tf4.setHorizontalAlignment(JTextField.CENTER);

        imglabel.add(tf4);

        next = new JButton("Next");
        next.setBounds(700, 550, 100, 50);
        next.setFont(f);
        next.setVisible(false);
        imglabel.add(next);

        lb6 = new JLabel("Enter the source node : ");
        lb6.setBounds(300, 250, 600, 50);
        lb6.setForeground(Color.WHITE);
        lb6.setVisible(false);
        lb6.setFont(f);
        imglabel.add(lb6);

        tf5 = new JTextField();
        tf5.setBounds(700, 250, 100, 50);
        tf5.setHorizontalAlignment(JTextField.CENTER);
        tf5.setFont(f);
        tf5.setVisible(false);
        imglabel.add(tf5);

        lb7 = new JLabel("Enter the destination node : ");
        lb7.setBounds(300, 350, 600, 50);
        lb7.setBackground(Color.red);
        lb7.setForeground(Color.WHITE);
        lb7.setVisible(false);
        lb7.setFont(f);
        imglabel.add(lb7);

        tf6 = new JTextField();
        tf6.setBounds(700, 350, 100, 50);
        tf6.setHorizontalAlignment(JTextField.CENTER);
        tf6.setFont(f);
        tf6.setVisible(false);
        imglabel.add(tf6);

        run = new JButton("Run DFS");
        run.setBounds(300, 500, 600, 50);
        run.setVisible(false);
        run.setFont(f);
        imglabel.add(run);

        ta = new JTextArea();
        ta.setBounds(300, 100, 600, 500);
        ta.setVisible(false);
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(300, 100, 600, 500);

        imglabel.add(ta);

        btn1.addActionListener(this);
        next.addActionListener(this);
        run.addActionListener(this);

    }

    // Function to add an edge into the graph 
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void create() {
        adj = new LinkedList[V];
        for (int i = 0; i < V; ++i) {
            adj[i] = new LinkedList();
        }

    }

    public void printAllPaths(int s, int d) {
        boolean[] isVisited = new boolean[V];
        ArrayList<Integer> pathList = new ArrayList<>();

        //add source to path[] 
        pathList.add(s);

        //Call recursive utility 
        printAllPathsUtil(s, d, isVisited, pathList);
    }

    // A recursive function to print 
    // all paths from 'u' to 'd'. 
    // isVisited[] keeps track of 
    // vertices in current path. 
    // localPathList<> stores actual 
    // vertices in the current path 
    int ck=1;
    private void printAllPathsUtil(Integer u, Integer d,
            boolean[] isVisited,
            List<Integer> localPathList) {

        // Mark the current node 
        isVisited[u] = true;

        if (u.equals(d)) {
            System.out.println(localPathList);
                        ta.append("Path "+ck+++"-->>"+localPathList+"\n");

            // if match found then no need to traverse more till depth 
            isVisited[u] = false;
            return;
        }

        // Recur for all the vertices 
        // adjacent to current vertex 
        for (Integer i : adj[u]) {
            if (!isVisited[i]) {
                // store current node 
                // in path[] 
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);

                // remove current node 
                // in path[] 
                localPathList.remove(i);
            }
        }

        // Mark the current node 
        isVisited[u] = false;
    }

    // Driver method to 
    public static void main(String args[]) {

        DFS fr = new DFS();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            String sn = tf1.getText();
            V = Integer.parseInt(sn);

            String se = tf2.getText();
            E = Integer.parseInt(se);

            ///System.out.println(V+" "+E);
            create();

            i++;
            lb3.setText("Edge " + i + " : ");
            lb3.setVisible(true);
            tf3.setVisible(true);
            tf4.setVisible(true);
            next.setVisible(true);
            tf5.setVisible(true);
            lb6.setVisible(true);

            tf6.setVisible(false);
            lb7.setVisible(false);

        } else if (e.getSource() == next) {
            int u, v;

            String su = tf3.getText();
            u = Integer.parseInt(su);
            String sv = tf4.getText();
            v = Integer.parseInt(sv);

            addEdge(u, v);

            i++;
            if (i > E) {
                lb3.setVisible(false);
                tf3.setVisible(false);
                tf4.setVisible(false);
                next.setVisible(false);
                btn1.setVisible(false);
                run.setVisible(true);
                lb7.setVisible(true);
                tf6.setVisible(true);

            } else {
                lb3.setText("Edge " + i + " : ");
                tf3.setText("");
                tf4.setText("");
            }

        } else if (e.getSource() == run) {
            String ss = tf5.getText();

            int src = Integer.parseInt(ss);

            String ss1 = tf6.getText();

            int dest = Integer.parseInt(ss1);

            lb1.setVisible(false);
            lb2.setVisible(false);
            tf1.setVisible(false);
            tf2.setVisible(false);
            lb6.setVisible(false);
            tf5.setVisible(false);

            lb7.setVisible(false);
            tf6.setVisible(false);

            run.setVisible(false);

            printAllPaths(src,dest);

            ta.append("END");

            ta.setVisible(true);

        }

    }
}


/*
4 6
0 1
0 2
1 2
2 0
2 3
3 3
2
*/