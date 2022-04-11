import javax.swing.*;
import java.awt.*;

/* * Clasa Trandafir creeaza pagina specifica
ce deriva din actionarea butonului trandafir
 */
public class Trandafir {
    JFrame frs = new JFrame();
    JLabel lTrd = new JLabel();
    ImageIcon imgTrd = new ImageIcon("roses.jpg");
    ImageIcon backt = new ImageIcon("backg.jpg");

    Trandafir() {
        String[] col = {"General", "Detalii"};
        Object[][] date = {{"Denumire:", "Trandafir"},
                {"Specie:","Rosa cinnamomea"},
                {"Pret:", "7 lei"},
                {"Ingrijire:", "Se pastreaza la loc luminos si se uda regulat"},
                {"Culori disponibile:", "Alb, rosu, galben, albastru, roz"}
        };
        JTable tb = new JTable(date, col);
        tb.setBounds(600,100,500,400);
        tb.setRowHeight(80);
        frs.add(tb);
        frs.add(lTrd);

        lTrd.setBounds(50, 80, 450, 450);
        lTrd.setIcon(imgTrd);

        JLabel limg = new JLabel("", backt, JLabel.CENTER);
        limg.setBounds(0,0,1100,650);
        frs.add(limg);
        frs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frs.setSize(1100, 650);
        frs.setLayout(null);
        frs.setVisible(true);
    }

}
