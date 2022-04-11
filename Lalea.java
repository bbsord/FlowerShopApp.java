import javax.swing.*;

/* * Clasa Lalea creeaza pagina specifica
ce deriva din actionarea butonului lalea
 */
public class Lalea {
    JFrame frm = new JFrame();
    JLabel lb = new JLabel();
    ImageIcon imgLalea = new ImageIcon("lalea.jpg");
    ImageIcon backl = new ImageIcon("backg.jpg");

    Lalea() {
        String[] col = {"General", "Detalii"};
        Object[][] date = {{"Denumire:", "Lalea"},
                {"Specie:","Tulipa suaveolens"},
                {"Pret:", "9 lei"},
                {"Ingrijire:", "Se uda rar si se feresc de temperaturi scazute."},
                {"Culori disponibile:", "Mov, galben, rosu, portocaliu"}
        };
        JTable tb = new JTable(date, col);
        tb.setBounds(600,250,600,400);
        tb.setRowHeight(80);
        frm.add(tb);
        frm.add(lb);

        lb.setBounds(50, 80, 500, 669);
        lb.setIcon(imgLalea);

        JLabel limg = new JLabel("", backl, JLabel.CENTER);
        limg.setBounds(0,0,800,650);
        frm.add(limg);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(800, 650);
        frm.setLayout(null);
        frm.setVisible(true);

    }

}
