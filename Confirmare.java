import javax.swing.*;

public class Confirmare {
    JFrame w = new JFrame();
    JLabel crfm = new JLabel("COMANDA CONFIRMATA!");
    JLabel im = new JLabel();
    ImageIcon imgz = new ImageIcon("zambarici.jpg");
    ImageIcon backgc = new ImageIcon("backg.jpg");

    Confirmare(){

        crfm.setBounds(40, 10, 150, 150);
        im.setBounds(30, 110, 190, 190);
        im.setIcon(imgz);
        w.add(crfm);
        w.add(im);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel limgc = new JLabel("", backgc, JLabel.CENTER);
        limgc.setBounds(0,0,300,300);
        w.add(limgc);
        w.setSize(300, 300);
        w.setLayout(null);
        w.setVisible(true);
    }
}
