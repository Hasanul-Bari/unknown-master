package graph;

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
import sample.Homepage1;

public final class GraphMenu extends JFrame implements ActionListener {

    private Container c;
    private JButton nxt, prv;
    private CardLayout br1, br2;
    private JPanel panel;
    private ImageIcon icon, home, img, hm;
    public JLabel lb, label1, imglabel, hml;
    private CardLayout card;
    private Font f, f1, f2;
    private JButton btn1, btn2, back, gr, gt, sssp, apsp, mst;
    private JButton bfs, dfs, top, dij, bell, prim, krus, floyd;
    private JButton runbfs,rundfs;
    private Image imm;

    public GraphMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 1280, 720);
        this.setTitle("          Graph Algorithm           ");
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

        btn1 = new JButton(hm);
        btn1.setFont(f);
        btn1.setBounds(0, 0, hm.getIconWidth(), hm.getIconHeight());

        back = new JButton("Back");
        back.setFont(f);
        back.setVisible(false);
        back.setBounds(0, 0, 150, 50);
        imglabel.add(back);

        imglabel.add(btn1);

        lb = new JLabel();
        lb.setBounds(200, 150, 500, 50);
        lb.setFont(f);
        lb.setForeground(Color.WHITE);
        lb.setVisible(false);
        imglabel.add(lb);

        btn2 = new JButton("Introduction");
        btn2.setFont(f);
        btn2.setBounds(500, 100, 250, 50);
        imglabel.add(btn2);

        //graph representation      
        gr = new JButton("Graph Representation");
        gr.setFont(f);
        gr.setBounds(380, 180, 500, 50);
        imglabel.add(gr);

//graph traversal-------------------------------------------
        gt = new JButton("Graph Traversal");
        gt.setFont(f);
        gt.setBounds(380, 260, 500, 50);
        imglabel.add(gt);

        bfs = new JButton("Breadth-first search (BFS)");
        bfs.setFont(f);
        bfs.setBounds(380, 260, 500, 50);
        bfs.setVisible(false);
        imglabel.add(bfs);

        dfs = new JButton("Depth-first search (DFS)");
        dfs.setFont(f);
        dfs.setBounds(380, 340, 500, 50);
        dfs.setVisible(false);
        imglabel.add(dfs);

        top = new JButton("Topological Sorting");
        top.setFont(f);
        top.setBounds(380, 420, 500, 50);
        top.setVisible(false);
        imglabel.add(top);

        ////SSSP----------------------------------------------   
        sssp = new JButton("Single-Source Shortest Paths ");
        sssp.setFont(f);
        sssp.setBounds(380, 340, 500, 50);
        imglabel.add(sssp);

        dij = new JButton("Dijkstra's Algorithm");
        dij.setFont(f);
        dij.setBounds(380, 260, 500, 50);
        dij.setVisible(false);
        imglabel.add(dij);

        bell = new JButton("Bellman–Ford  Algorithm");
        bell.setFont(f);
        bell.setBounds(380, 340, 500, 50);
        bell.setVisible(false);
        imglabel.add(bell);

////apsp-----------------------------------
        apsp = new JButton("All-Pairs Shortest Paths");
        apsp.setFont(f);
        apsp.setBounds(380, 420, 500, 50);
        imglabel.add(apsp);

        floyd = new JButton("Floyd–Warshall Algorithm");
        floyd.setFont(f);
        floyd.setBounds(380, 260, 500, 50);
        floyd.setVisible(false);
        imglabel.add(floyd);

////mst------------------------------------
        mst = new JButton("Minimum Spanning Tree");
        mst.setFont(f);
        mst.setBounds(380, 500, 500, 50);
        imglabel.add(mst);

        prim = new JButton("Prim’s Algorithm");
        prim.setFont(f);
        prim.setBounds(380, 260, 500, 50);
        prim.setVisible(false);
        imglabel.add(prim);

        krus = new JButton("Kruskal’s  Algorithm");
        krus.setFont(f);
        krus.setBounds(380, 340, 500, 50);
        krus.setVisible(false);
        imglabel.add(krus);
        
        
        runbfs = new JButton("Simulate BFS");
        runbfs.setFont(f);
        runbfs.setBounds(900, 260, 250, 50);
        runbfs.setVisible(false);
        imglabel.add(runbfs);

        rundfs = new JButton("Simulate DFS");
        rundfs.setFont(f);
        rundfs.setBounds(900, 340, 250, 50);
        rundfs.setVisible(false);
        imglabel.add(rundfs);
        
        
        

        gt.addActionListener(this);
        gr.addActionListener(this);

        bfs.addActionListener(this);
        dfs.addActionListener(this);
        top.addActionListener(this);

        sssp.addActionListener(this);
        dij.addActionListener(this);
        bell.addActionListener(this);

        apsp.addActionListener(this);
        floyd.addActionListener(this);

        mst.addActionListener(this);
        prim.addActionListener(this);
        krus.addActionListener(this);

        btn2.addActionListener(this);
        btn1.addActionListener(this);
        back.addActionListener(this);
        
        
        runbfs.addActionListener(this);
        rundfs.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn2) {
            Graph_INTRO fr = new Graph_INTRO();
            fr.setVisible(true);

        } else if (ae.getSource() == btn1) {
            Homepage1 fr = new Homepage1();
            fr.setVisible(true);

        } else if (ae.getSource() == gr) {
            Graph_rep fr = new Graph_rep();
            fr.setVisible(true);

        } else if (ae.getSource() == gt) {

            lb.setText("Graph Traversal :");
            lb.setVisible(true);

            btn2.setVisible(false);

            gt.setVisible(false);
            gr.setVisible(false);
            sssp.setVisible(false);
            apsp.setVisible(false);
            mst.setVisible(false);

            btn1.setVisible(false);
            back.setVisible(true);

            bfs.setVisible(true);
            dfs.setVisible(true);
            top.setVisible(true);
            
            runbfs.setVisible(true);
            rundfs.setVisible(true);

        } else if (ae.getSource() == sssp) {

            lb.setText("Single-Source Shortest Paths :");
            lb.setVisible(true);

            btn2.setVisible(false);
            gt.setVisible(false);
            gr.setVisible(false);
            sssp.setVisible(false);
            apsp.setVisible(false);
            mst.setVisible(false);

            btn1.setVisible(false);
            back.setVisible(true);

            dij.setVisible(true);
            bell.setVisible(true);

        } else if (ae.getSource() == apsp) {

            lb.setText("All-Pairs Shortest Paths :");
            lb.setVisible(true);

            btn2.setVisible(false);
            gt.setVisible(false);
            gr.setVisible(false);
            sssp.setVisible(false);
            apsp.setVisible(false);
            mst.setVisible(false);

            btn1.setVisible(false);
            back.setVisible(true);

            floyd.setVisible(true);

        } else if (ae.getSource() == mst) {

            lb.setText("Minimum Spanning Tree :");
            lb.setVisible(true);

            btn2.setVisible(false);
            gt.setVisible(false);
            gr.setVisible(false);
            sssp.setVisible(false);
            apsp.setVisible(false);
            mst.setVisible(false);

            btn1.setVisible(false);
            back.setVisible(true);

            prim.setVisible(true);
            krus.setVisible(true);
        } else if (ae.getSource() == back) {
            
            dispose();
            GraphMenu fr = new GraphMenu();
            fr.setVisible(true);
            
        }
        ///for sub menu 
        else if (ae.getSource() == bfs) {
            dispose();
            sbfs fr = new sbfs();
            fr.setVisible(true);
        }
        else if (ae.getSource() == dfs) {
            dispose();
            sdfs fr = new sdfs();
            fr.setVisible(true);
        }
        
        else if (ae.getSource() == top) {
            dispose();
            stop fr = new stop();
            fr.setVisible(true);
        }
        else if (ae.getSource() == dij) {
            dispose();
            sdij fr = new sdij();
            fr.setVisible(true);
        }
        else if (ae.getSource() == bell) {
            dispose();
            sbell fr = new sbell();
            fr.setVisible(true);
        }
        else if (ae.getSource() == floyd) {
            dispose();
            sfloyd fr = new sfloyd();
            fr.setVisible(true);
        }
        else if (ae.getSource() == prim) {
            dispose();
            sprim fr = new sprim();
            fr.setVisible(true);
        }
        else if (ae.getSource() == krus) {
            dispose();
            skrus fr = new skrus();
            fr.setVisible(true);
        }
        else if (ae.getSource() == runbfs) {
            dispose();
            BFS fr = new BFS();
            fr.setVisible(true);
        }
        else if (ae.getSource() == rundfs) {
            dispose();
            DFS fr = new DFS();
            fr.setVisible(true);
        }
        
        
        
        
     
    }

    public static void main(String[] args) {
        GraphMenu fr = new GraphMenu();
        fr.setVisible(true);
    }

}
