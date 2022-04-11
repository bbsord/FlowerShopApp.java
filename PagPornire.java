import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Clasa PagPornire creeaza pagina principala a florariei
 * si extinde ActionListener pentru a facilita notificarea la click-urile pe butoane sau pe meniu
 * Fereastra principala pg cuprinde 7 butoane, un MenuBar m cu mai multe Menu si MeniuItem
 * si Label-ul care contine mesajul de bun venit
 */
public class PagPornire implements ActionListener{

    JFrame pg = new JFrame();
    JFrame fm = new JFrame();
    JLabel porLab = new JLabel();
    JMenuBar m = new JMenuBar();

    //butoanele pentru vizualizarea informatiilor
    JButton trd = new JButton("Trandafiri");
    JButton frz = new JButton("Frezii");
    JButton crin = new JButton("Crini");
    JButton lalea = new JButton("Lalele");
    JButton gld = new JButton("Gladiole");
    JButton grf = new JButton("Garoafe");
    JButton buc = new JButton("Buchete");

    //elementele regasite in meniu
    JMenu com1 = new JMenu("Comanda Flori");
    JMenu com2 = new JMenu("Comanda Buchete");
    JMenu den = new JMenu("Denumire");
    JMenuItem rz = new JMenuItem("Realizare");
    JMenu denf = new JMenu("Denumire");
    JMenu clf = new JMenu("Culoare");
    JMenu t1 = new JMenu("Trandafiri");
    JMenu l1 = new JMenu("Lalele");
    JMenu g1 = new JMenu("Gladiole");
    JMenu g2 = new JMenu("Garoafe");
    JMenu f = new JMenu("Frezii");
    JMenu c = new JMenu("Crini");
    JMenu tp1 = new JMenu("7 lei");
    JMenu lp1 = new JMenu("9 lei");
    JMenu gp1 = new JMenu("5 lei");
    JMenu gp2 = new JMenu("1,5 lei");
    JMenu fp = new JMenu("3 lei");
    JMenu cp = new JMenu("10 lei");
    JMenuItem c1 = new JMenuItem("Rosu");
    JMenuItem c2 = new JMenuItem("Galben");
    JMenuItem c3 = new JMenuItem("Alb");
    JMenuItem c4 = new JMenuItem("Mov");
    JMenuItem c5 = new JMenuItem("Roz");
    JMenuItem c6 = new JMenuItem("Portocaliu");
    JMenu b1 = new JMenu("Buchet cu trandafir si frezii"); JMenuItem bp1 = new JMenuItem("35 lei");
    JMenu b2 = new JMenu("Buchet cu trandafir si lalele"); JMenuItem bp2 = new JMenuItem("50 lei");
    JMenu b3 = new JMenu("Buchet lalele"); JMenuItem bp3 = new JMenuItem("100 lei");
    JMenu b4 = new JMenu("Buchet trandafir si crini"); JMenuItem bp4 = new JMenuItem("80 lei");
    JMenu b5 = new JMenu("Buchet trandafir"); JMenuItem bp5 = new JMenuItem("70 lei");
    JMenu b6 = new JMenu("Buchet frezii si lalele"); JMenuItem bp6 = new JMenuItem(" 60 lei");

    //componentele folosite pentru fereastra de realizare a buchetelor
    JLabel blab = new JLabel("INTRODUCETI IN CASETE PREFERINTELE");
    JLabel labf = new JLabel("FLORI");
    JLabel labc = new JLabel("CULOARE");
    JLabel labn = new JLabel("NUMAR");
    JLabel labmsj = new JLabel("MESAJ DORIT");
    JTextField floare = new JTextField(12);
    JTextField culoare = new JTextField(12);
    JTextField numar = new JTextField(12);
    JTextField msj = new JTextField(100);
    JButton ok = new JButton("OK");

    //imaginea folosita pentru background
    ImageIcon backg = new ImageIcon("backg.jpg");

    PagPornire(String id){

        //setarea dimensiunilor pentru label
        porLab.setBounds(270,100,400,100);
        porLab.setFont(new Font(null, Font.PLAIN,25));
        porLab.setText("Bun venit la Floraria DB, " + id + "!");
        pg.add(porLab);

        //adaugarea componentelor in MenuBar, respectiv in fiecare Menu
        com1.add(denf);
        com2.add(den); com2.add(rz);

        denf.add(t1); denf.add(l1); denf.add(g1); denf.add(g2);denf.add(f); denf.add(c);
        t1.add(tp1); tp1.add(c1); tp1.add(c2); tp1.add(c2); tp1.add(c3); tp1.add(c4); tp1.add(c5); tp1.add(c6);
        l1.add(lp1); lp1.add(c1); lp1.add(c2); lp1.add(c3); lp1.add(c4); lp1.add(c5); lp1.add(c6); lp1.add(c6);
        g1.add(gp1); gp1.add(c1); gp1.add(c2); gp1.add(c3); gp1.add(c4); gp1.add(c5); gp1.add(c6); gp1.add(c6);
        g2.add(gp2); gp2.add(c1); gp2.add(c2); gp2.add(c3); gp2.add(c4); gp2.add(c5); gp2.add(c6); gp2.add(c6);
        f.add(fp); fp.add(c1); fp.add(c2); fp.add(c3); fp.add(c4); fp.add(c5); fp.add(c6); fp.add(c6);
        c.add(cp); cp.add(c1); cp.add(c2); cp.add(c3); cp.add(c4); cp.add(c5); cp.add(c6); cp.add(c6);


        den.add(b1); den.add(b2); den.add(b3); den.add(b4); den.add(b5); den.add(b6);
        b1.add(bp1); b2.add(bp2); b3.add(bp3); b4.add(bp4); b5.add(bp5); b6.add(bp6);

        m.add(com1);
        m.add(com2);
        m.setLayout(new GridBagLayout());

        /*crearea unui nou ActionListener pentru fiecare MenuItem,
        prin care se deschide fereastra speciala de confirmare*/
        bp1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        bp2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        bp3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        bp4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        bp5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        bp6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });

        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });
        c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Confirmare cnf1 = new Confirmare();
            }
        });

        /*crearea unui nou ActionListener pentru realizarea unui buchet din MenuItem,
        prin care se deschide fereastra speciala de confectionare, apoi cea de confirmare a comenzii*/
        rz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blab.setBounds(350, 10, 450, 550);
                labf.setBounds(150, 400, 150, 150);
                labc.setBounds(350, 400, 150, 150);
                labn.setBounds(550, 400, 150, 150);
                labmsj.setBounds(750, 400, 150, 150);
                floare.setBounds(150, 500, 150, 50);
                culoare.setBounds(350, 500, 150, 50);
                numar.setBounds(550, 500, 150, 50);
                msj.setBounds(750, 500, 150, 50);

                fm.add(blab);
                fm.add(labf); fm.add(labc); fm.add(labn); fm.add(labmsj);
                fm.add(floare); fm.add(culoare); fm.add(numar); fm.add(msj);
                fm.add(ok);
                ok.setBounds(750,650,100,25);
                ok.setFocusable(false);
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Confirmare conf = new Confirmare();
                    }
                });

                fm.setSize(1000,750);
                fm.setLayout(null);
                fm.setVisible(true);
            }
        });

        //adaugarea fiecarei componente existente in fereastra principala
        pg.setJMenuBar(m);

        pg.add(trd);
        trd.setBounds(35,350,100,25);
        trd.setFocusable(false);
        trd.addActionListener(this);

        pg.add(frz);
        frz.setBounds(170,350,100,25);
        frz.setFocusable(false);
        frz.addActionListener(this);

        pg.add(crin);
        crin.setBounds(305,350,100,25);
        crin.setFocusable(false);
        crin.addActionListener(this);

        pg.add(gld);
        gld.setBounds(440,350,100,25);
        gld.setFocusable(false);
        gld.addActionListener(this);

        pg.add(grf);
        grf.setBounds(575,350,100,25);
        grf.setFocusable(false);
        grf.addActionListener(this);

        pg.add(lalea);
        lalea.setBounds(710,350,100,25);
        lalea.setFocusable(false);
        lalea.addActionListener(this);

        pg.add(buc);
        buc.setBounds(845,350,100,25);
        buc.setFocusable(false);
        buc.addActionListener(this);

        //setarea corecta a ferestrei si atasarea unei imagini pentru background
        JLabel labimg = new JLabel("", backg, JLabel.CENTER);
        labimg.setBounds(0,0,1000,550);
        pg.add(labimg);
        pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pg.setSize(1000,550);
        pg.setLayout(null);
        pg.setVisible(true);
    }

    /*
     * In metoda actionPerformed se realizeaza actiunea celor 7 butoane
     * In cazul in care dorim sa vizualizam informatii despre fiecare floare
     * sau despre buchete, actiunea butoanelor ne conduce spre ferestrele destinate lor
     */
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == trd){
            Trandafir t = new Trandafir();
        }
        if(e.getSource() == frz){
            Frezie f = new Frezie();
        }
        if(e.getSource() == crin){
            Crin c = new Crin();
        }
        if(e.getSource() == grf){
            Garoafa g = new Garoafa();
        }
        if(e.getSource() == gld){
            Gladiola gl = new Gladiola();
        }
        if(e.getSource() == lalea){
            Lalea l = new Lalea();
        }
        if(e.getSource() == buc){
            Buchet b = new Buchet();
        }
    }
}
