import javax.swing.*;

/* * Clasa Groafa creeaza pagina specifica
ce deriva din actionarea butonului garoafa
 */
public class Garoafa {
    JFrame fr = new JFrame();
    JLabel lab = new JLabel();
    ImageIcon imgGrf = new ImageIcon("garoafa.jpg");
    ImageIcon backgf = new ImageIcon("backg.jpg");


    Garoafa() {
        String[] col = {"General", "Detalii"};
        Object[][] date = {{"Denumire:", "Garoafa"},
                {"Specie:","Caryophyllaceae"},
                {"Pret:", "1,5 lei"},
                {"Ingrijire:", "Se pastreaza la loc foarte luminos, se uda rar, se fereste de locuri inghesuite."},
                {"Culori disponibile:", "Portocaliu, rosu, galben, roz, mov, alb"}
        };
        JTable tb = new JTable(date, col);
        tb.setBounds(600,100,900,400);
        tb.setRowHeight(80);
        fr.add(tb);
        fr.add(lab);

        lab.setBounds(30, 80, 503, 480);
        lab.setIcon(imgGrf);

        JLabel limg = new JLabel("", backgf, JLabel.CENTER);
        limg.setBounds(0,0,1100,750);
        fr.add(limg);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1100, 750);
        fr.setLayout(null);
        fr.setVisible(true);
    }

}
