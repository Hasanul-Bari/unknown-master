package graph;

import java.awt.Color;
import java.awt.Container;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class Graph_rep extends JFrame implements ActionListener {

    private Container c;
    private JButton nxt, prv, dp;
    private CardLayout br1, br2;
    private JPanel panel;
    private ImageIcon icon, icon1, back, forw;
    private JLabel label, label1;
    private CardLayout card;

    Graph_rep() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1280, 720);
        this.setTitle("GRAPH REPRESENTATION");
        this.setResizable(true);

        c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null);

        card = new CardLayout();
        panel = new JPanel(card);
        panel.setBounds(0, 0, 1280, 720);
        c.add(panel);
        back = new ImageIcon(getClass().getResource("prev.png"));
        forw = new ImageIcon(getClass().getResource("nxt.png"));

        dp = new JButton("Graph menu");
        dp.setBounds(0, 0, 150, 50);
        c.add(dp);

        nxt = new JButton(forw);
        nxt.setBounds(1215, 310, 65, 100);
        c.add(nxt);

        prv = new JButton(back);
        prv.setBounds(0, 310, 65, 100);
        c.add(prv);
        showimage();

        nxt.addActionListener(this);
        prv.addActionListener(this);
        dp.addActionListener(this);

    }

    public void showimage() {
        String str[] = {"2.jpg","3.jpg","4.jpg"};
        for (String s : str) {
            icon = new ImageIcon("src/graphpic/1/" + s);
            // icon=new ImageIcon("src/pic/mylogo.png");
            //resizing the photo

            Image img = icon.getImage();
            Image ii = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);

            icon = new ImageIcon(ii);

            label = new JLabel(icon);
            panel.add(label);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == nxt) {
            card.next(panel);
        } else if (ae.getSource() == prv) {
            card.previous(panel);
        } else if (ae.getSource() == dp) {
            dispose();
            GraphMenu fr = new GraphMenu();
            fr.setVisible(true);
        }

    }

    public static void main(String[] args) {
        Graph_rep fr = new Graph_rep();
        fr.setVisible(true);
    }

}
