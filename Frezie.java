import javax.swing.*;
import java.awt.*;

/* * Clasa Frezie creeaza pagina specifica
ce deriva din actionarea butonului frezie
 */
public class Frezie {
    JFrame fr = new JFrame();
    JLabel lab = new JLabel();
    ImageIcon imgFrz = new ImageIcon("frezie.jpg");
    ImageIcon backf = new ImageIcon("backg.jpg");

    Frezie() {
        String[] col = {"General", "Detalii"};
        Object[][] date = {{"Denumire:", "Frezie"},
                {"Specie:","Freesia"},
                {"Pret:", "3 lei"},
                {"Ingrijire:", "Se pastreaza la loc luminos, se uda regulat, se fereste de ger."},
                {"Culori disponibile:", "Portocaliu, rosu, galben, violet, roz"}
        };
        JTable tb = new JTable(date, col);
        tb.setBounds(900,200,700,400);
        tb.setRowHeight(80);
        fr.add(tb);
        fr.add(lab);

        lab.setBounds(30, 80, 800, 600);
        lab.setIcon(imgFrz);

        JLabel limg = new JLabel("", backf, JLabel.CENTER);
        limg.setBounds(0,0,1100,750);
        fr.add(limg);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1100, 750);
        fr.setLayout(null);
        fr.setVisible(true);
    }

}
