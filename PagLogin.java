import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.awt.event.ActionListener;

/*
 * Clasa PagLogin creeazaferestra login, carora ii corespund componentele necesare:
 * JFrame frm pentru fereastra propriu-zisa
 * JButton logBut si reset pentru butoanele de login si reset
 * JTextField userId si JPasswordField userPar pentru a introduce un user si o parola
 * JLabel usID, usPR si msj pentru a afisa text ce va ajuta user-ul
 * HashMap logInf1 care pastreaza informatiile user si parola corecte
 */

public class PagLogin implements ActionListener{

    JFrame frm = new JFrame();
    JButton logBut = new JButton("Login");
    JButton reset = new JButton("Reset");
    JTextField userId = new JTextField();
    JPasswordField userPar = new JPasswordField();
    JLabel usID = new JLabel("User: ");
    JLabel usPR = new JLabel("Parola: ");
    JLabel msj= new JLabel();
    ImageIcon backgf = new ImageIcon("backg.jpg");
    HashMap<String,String> logInf1 = new HashMap<String,String>();

    PagLogin(HashMap<String,String> logInfo){
        logInf1 = logInfo;

        //setarea dimensiunilor fiecarei componente
        usID.setBounds(50, 100, 75, 25);
        usPR.setBounds(50, 150, 75, 25);

        msj.setBounds(125, 250, 450, 35);
        msj.setFont(new Font(null, Font.ITALIC,25));

        userId.setBounds(125,100,200,25);
        userPar.setBounds(125,150,200,25);

        logBut.setBounds(125,200,100,25);
        logBut.setFocusable(false);
        logBut.addActionListener(this);

        reset.setBounds(225,200,100,25);
        reset.setFocusable(false);
        reset.addActionListener(this);

        //adaugarea componentelor in fereastra
        frm.add(usID);
        frm.add(usPR);
        frm.add(userId);
        frm.add(userPar);
        frm.add(msj);
        frm.add(logBut);
        frm.add(reset);

        //setarea corecta a ferestrei si atasarea unei imagini pentru background
        JLabel limg = new JLabel("", backgf, JLabel.CENTER);
        limg.setBounds(0,0,450,450);
        frm.add(limg);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(450, 450);
        frm.setLayout(null);
        frm.setVisible(true);
    }
    /*
     * In metoda actionPerformed se realizeaza actiunea celor doua butoane
     * In cazul in care dorim sa reintroducem informatiile butonul reset va seta caseta goala
     * In cazul in care informatiile introduse corespund cu cele stocate se va deschide pagina de pornire,
     * altfel se pot expune mesaje in sprijinul utilizatorului
     */
    @Override
    public void actionPerformed(ActionEvent e){
            if(e.getSource() == reset){
                userId.setText("");
                userPar.setText("");
            }

            if(e.getSource() == logBut){
                String id = userId.getText();
                String parola = String.valueOf(userPar.getPassword());
                if(logInf1.containsKey(id)){
                    if(logInf1.get(id).equals(parola)){
                        msj.setForeground(Color.magenta);
                        msj.setText("Actiune incheiata cu succes");
                        frm.dispose();
                        PagPornire prn = new PagPornire(id);
                    }else {
                        msj.setForeground(Color.red);
                        msj.setText("Parola este incorecta!");
                    }
                }else{
                    msj.setForeground(Color.red);
                    msj.setText("Nu a fost gasit acest username!");
                }
            }
    }

}
