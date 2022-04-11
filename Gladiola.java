import javax.swing.*;

/* * Clasa Gladiola creeaza pagina specifica
ce deriva din actionarea butonului gladiola
 */
public class Gladiola {
    JFrame frame = new JFrame();
    JLabel lb = new JLabel();
    ImageIcon imgGld = new ImageIcon("gladiola.jpg");
    ImageIcon backgl = new ImageIcon("backg.jpg");

    Gladiola() {
        String[] col = {"General", "Detalii"};
        Object[][] date = {{"Denumire:", "Gladiola"},
                {"Specie:","Gladiolus communis"},
                {"Pret:", "5 lei"},
                {"Ingrijire:", "Se uda des si se pastreaza intr-un loc luminos."},
                {"Culori disponibile:", "Alb, violet, rosu, galben, roz"}
        };
        JTable tb = new JTable(date, col);
        tb.setBounds(800,500,700,400);
        tb.setRowHeight(80);
        frame.add(tb);
        frame.add(lb);

        lb.setBounds(50, 80, 600, 906);
        lb.setIcon(imgGld);

        JLabel limg = new JLabel("", backgl, JLabel.CENTER);
        limg.setBounds(0,0,1100,950);
        frame.add(limg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 950);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
