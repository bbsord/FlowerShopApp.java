import javax.swing.*;

/* * Clasa Crin creeaza pagina specifica
ce deriva din actionarea butonului crin
 */
public class Crin {
    JFrame frs = new JFrame();
    JLabel lTrd = new JLabel();
    ImageIcon imgCrin = new ImageIcon("crin.jpg");
    ImageIcon backc = new ImageIcon("backg.jpg");

    Crin() {
        String[] col = {"General", "Detalii"};
        Object[][] date = {{"Denumire:", "Crin"},
                {"Specie:","Lilium"},
                {"Pret:", "10 lei"},
                {"Ingrijire:", "Se pastreaza la loc luminos sau semiumbros si se uda regulat"},
                {"Culori disponibile:", "Alb, roz"}
        };
        JTable tb = new JTable(date, col);
        tb.setBounds(800,310,750,400);
        tb.setRowHeight(80);
        frs.add(tb);
        frs.add(lTrd);

        lTrd.setBounds(50, 80, 700, 800);
        lTrd.setIcon(imgCrin);

        JLabel limg = new JLabel("", backc, JLabel.CENTER);
        limg.setBounds(0,0,1100,950);
        frs.add(limg);
        frs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frs.setSize(1100, 950);
        frs.setLayout(null);
        frs.setVisible(true);
    }
}
