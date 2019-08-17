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

public final class DP_INDEX extends JFrame implements ActionListener {

    private Container c;
    private JButton nxt, prv;
    private CardLayout br1, br2;
    private JPanel panel;
    private ImageIcon icon, home, img, hm;
    public JLabel label, label1, imglabel, hml;
    private CardLayout card;
    private Font f, f1, f2;
    private JButton btn1, btn2, btn3, lcs, lcsal, lcsl, lcsp, lcss, coin, knap, ncr;
    private JButton knapal, knapl, knapp, coinal, coinl, coinp;
    private JButton ncral, ncrl, ncrp;
    private Image imm;

    DP_INDEX() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 100, 1280, 720);
        this.setTitle("          Dynamic Programming           ");
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

        imglabel.add(btn1);

        btn2 = new JButton("Introduction");
        btn2.setFont(f);
        btn2.setBounds(25, 100, 250, 50);
        imglabel.add(btn2);

        label = new JLabel("Some Classic DP problems");
        label.setBounds(25, 200, 450, 50);
        label.setOpaque(true);
        label.setFont(f);
        //label.setBackground(Color.red);
        imglabel.add(label);

//lcs-------------------------------------------
        lcs = new JButton("Longest Common Subsequences");
        lcs.setFont(f);
        lcs.setBounds(65, 300, 500, 50);
        imglabel.add(lcs);

        lcsal = new JButton("Algorithm");
        lcsal.setFont(f);
        lcsal.setBounds(700, 300, 500, 50);
        lcsal.setVisible(false);
        imglabel.add(lcsal);

        lcsl = new JButton("LCS Related Articles");
        lcsl.setFont(f);
        lcsl.setBounds(700, 360, 500, 50);
        lcsl.setVisible(false);
        imglabel.add(lcsl);

        lcsp = new JButton("LCS Related Problems");
        lcsp.setFont(f);
        lcsp.setBounds(700, 420, 500, 50);
        lcsp.setVisible(false);
        imglabel.add(lcsp);

        lcss = new JButton("LCS Simulation");
        lcss.setFont(f);
        lcss.setBounds(700, 480, 500, 50);
        lcss.setVisible(false);
        imglabel.add(lcss);

        ////knapsackk----------------------------------------------   
        knap = new JButton("0-1 Knapsack");
        knap.setFont(f);
        knap.setBounds(65, 360, 500, 50);
        imglabel.add(knap);

        knapal = new JButton("Algorithm");
        knapal.setFont(f);
        knapal.setBounds(700, 300, 500, 50);
        knapal.setVisible(false);
        imglabel.add(knapal);

        knapl = new JButton("Knapsack Related Articles");
        knapl.setFont(f);
        knapl.setBounds(700, 360, 500, 50);
        knapl.setVisible(false);
        imglabel.add(knapl);

        knapp = new JButton("Knapsack Related Problems");
        knapp.setFont(f);
        knapp.setBounds(700, 420, 500, 50);
        knapp.setVisible(false);
        imglabel.add(knapp);
////coin-----------------------------------
        coin = new JButton("COIN CHANGE");
        coin.setFont(f);
        coin.setBounds(65, 420, 500, 50);
        imglabel.add(coin);

        coinal = new JButton("Algorithm");
        coinal.setFont(f);
        coinal.setBounds(700, 300, 500, 50);
        coinal.setVisible(false);
        imglabel.add(coinal);

        coinl = new JButton("Coin Change Related Articles");
        coinl.setFont(f);
        coinl.setBounds(700, 360, 500, 50);
        coinl.setVisible(false);
        imglabel.add(coinl);

        coinp = new JButton("Coin Change Related Problems");
        coinp.setFont(f);
        coinp.setBounds(700, 420, 500, 50);
        coinp.setVisible(false);
        imglabel.add(coinp);

////ncr------------------------------------
        ncr = new JButton("nCr%p");
        ncr.setFont(f);
        ncr.setBounds(65, 480, 500, 50);
        imglabel.add(ncr);

        ncral = new JButton("Algorithm");
        ncral.setFont(f);
        ncral.setBounds(700, 300, 500, 50);
        ncral.setVisible(false);
        imglabel.add(ncral);

        ncrl = new JButton("nCr%p Related Articles");
        ncrl.setFont(f);
        ncrl.setBounds(700, 360, 500, 50);
        ncrl.setVisible(false);
        imglabel.add(ncrl);

        ncrp = new JButton("nCr%p Related Problems");
        ncrp.setFont(f);
        ncrp.setBounds(700, 420, 500, 50);
        ncrp.setVisible(false);
        imglabel.add(ncrp);

        //// end of dp
        lcs.addActionListener(this);
        lcsal.addActionListener(this);
        lcsp.addActionListener(this);
        lcsl.addActionListener(this);
        lcss.addActionListener(this);


        knap.addActionListener(this);
        knapal.addActionListener(this);
        knapp.addActionListener(this);
        knapl.addActionListener(this);
                
                
        coin.addActionListener(this);
        coinal.addActionListener(this);
        coinp.addActionListener(this);
        coinl.addActionListener(this);
        
        ncr.addActionListener(this);
       ncral.addActionListener(this);
        ncrp.addActionListener(this);
        ncrl.addActionListener(this);
        
        btn2.addActionListener(this);
        btn1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn2) {
            DP_INTRO fr = new DP_INTRO();
            fr.setVisible(true);

        }
        if (ae.getSource() == btn1) {
            Homepage1 fr = new Homepage1();
            fr.setVisible(true);

        }
        if (ae.getSource() == lcs) {
            lcss.setVisible(true);
            lcsal.setVisible(true);
            lcsp.setVisible(true);
            lcsl.setVisible(true);

        } else if (ae.getSource() == knap) {
            //s.setVisible(true);
            knapal.setVisible(true);
            knapl.setVisible(true);
            knapp.setVisible(true);

            lcss.setVisible(false);
            lcsal.setVisible(false);
            lcsp.setVisible(false);
            lcsl.setVisible(false);

        } else if (ae.getSource() == coin) {

            coinal.setVisible(true);
            coinl.setVisible(true);
            coinp.setVisible(true);

            knapal.setVisible(false);
            knapl.setVisible(false);
            knapp.setVisible(false);

            lcss.setVisible(false);
            lcsal.setVisible(false);
            lcsp.setVisible(false);
            lcsl.setVisible(false);

        } else if (ae.getSource() == ncr) {

            ncral.setVisible(true);
            ncrl.setVisible(true);
            ncrp.setVisible(true);

            coinal.setVisible(false);
            coinl.setVisible(false);
            coinp.setVisible(false);

            knapal.setVisible(false);
            knapl.setVisible(false);
            knapp.setVisible(false);

            lcss.setVisible(false);
            lcsal.setVisible(false);
            lcsp.setVisible(false);
            lcsl.setVisible(false);

        }
        ////for sub menu lcs
        if (ae.getSource() == lcsal) {
            dispose();
            DP_LCS fr = new DP_LCS();
            fr.setVisible(true);
        }
        else if (ae.getSource() == lcsp) {
            dispose();
           LCS_P fr = new LCS_P();
            fr.setVisible(true);
           
        }
        else if (ae.getSource() == lcsl) {
            dispose();
            LCS_LINK fr = new LCS_LINK();
        fr.setVisible(true);
            
        }
        else if (ae.getSource() == lcss) {
            dispose();
            
        }
        
        
         ////for sub menu knapsack
        if (ae.getSource() == knapal) {
            dispose();
            Knapsack fr = new Knapsack();
            fr.setVisible(true);
        }
        else if (ae.getSource() == knapp) {
            dispose();
            Knap_P fr = new Knap_P();
            fr.setVisible(true);
        }
        else if (ae.getSource() == knapl) {
            dispose();
           Knap_LINK fr = new Knap_LINK();
        fr.setVisible(true);
           
        }
        
        
          ////for sub menu coin change
        if (ae.getSource() == coinal) {
            dispose();
            Coin fr = new Coin();
            fr.setVisible(true);
        }
        else if (ae.getSource() == coinp) {
            dispose();
            Coin_P fr = new Coin_P();
            fr.setVisible(true);
        }
        else if (ae.getSource() == coinl) {
            dispose();
           Coin_LINK fr = new Coin_LINK();
        fr.setVisible(true);
        }
        
          ////for sub menu ncr
        if (ae.getSource() == ncral) {
            dispose();
            ncr fr = new ncr();
            fr.setVisible(true);
        }
        else if (ae.getSource() == ncrp) {
            dispose();
            ncr_P fr = new ncr_P();
            fr.setVisible(true);
            
        }
        else if (ae.getSource() == ncrl) {
            dispose();
           ncr_LINK fr = new ncr_LINK();
        fr.setVisible(true);
        }
        
        
        
    }

    public static void main(String[] args) {
        DP_INDEX fr = new DP_INDEX();
        fr.setVisible(true);
    }

}
