import javax.swing.*;

/* * Clasa Buchet creeaza pagina specifica
ce deriva din actionarea butonului buchet
 */
public class Buchet {
    JFrame frst = new JFrame();
    JLabel i1 = new JLabel();
    JLabel i2 = new JLabel();
    JLabel i3 = new JLabel();
    JLabel i4 = new JLabel();
    JLabel i5 = new JLabel();
    JLabel i6 = new JLabel();
    ImageIcon img1 = new ImageIcon("buchet1.jpg");
    ImageIcon img2 = new ImageIcon("buchet2.jpg");
    ImageIcon img3 = new ImageIcon("buchet3.jpg");
    ImageIcon img4 = new ImageIcon("buchet4.jpg");
    ImageIcon img5 = new ImageIcon("buchet5.jpg");
    ImageIcon img6 = new ImageIcon("buchet6.jpg");
    ImageIcon backb = new ImageIcon("backg.jpg");

    Buchet() {
        String[] col = {"Buchet", "Pret"};
        Object[][] date = {{"   Buchet cu trandafir si frezii", "  35 lei"},
                {"  Buchet cu trandafir si lalele","    50 lei"},
                {"  Buchet lalele", "  100 lei"},
                {"  Buchet trandafir si crini", " 80 lei"},
                {"  Buchet trandafir", "    70 lei"},
                {"  Buchet frezii si lalele", " 60 lei"}
        };
        JTable tb = new JTable(date, col);
        tb.setBounds(640,155,590,480);
        tb.setRowHeight(80);
        frst.add(tb);
        frst.add(i1);
        frst.add(i2);
        frst.add(i3);
        frst.add(i4);
        frst.add(i5);
        frst.add(i6);

        i1.setBounds(30, 40, 500, 500);
        i1.setIcon(img1);
        i2.setBounds(30, 550, 500, 500);
        i2.setIcon(img2);
        i3.setBounds(1000, 650, 500, 500);
        i3.setIcon(img3);
        i4.setBounds(540, 650, 500, 500);
        i4.setIcon(img4);
        i5.setBounds(1290, 30, 310, 320);
        i5.setIcon(img5);
        i6.setBounds(1290, 310, 398, 420);
        i6.setIcon(img6);

        JLabel limg = new JLabel("", backb, JLabel.CENTER);
        limg.setBounds(0,0,1500,1500);
        frst.add(limg);
        frst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frst.setSize(1500, 1500);
        frst.setLayout(null);
        frst.setVisible(true);
    }

}
