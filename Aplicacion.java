
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aplicacion extends JFrame {

    JPanel panel;
    JLabel et1;
    JTextField txt1;
    JButton b1, b2;

    public Aplicacion() {
        super("PELICULAS");
        Container contenedor = getContentPane();
        et1 = new JLabel("Nombre: ");
        txt1 = new JTextField(20);
        b1 = new JButton("Aceptar");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                info();
            }
        });
        b2 = new JButton("salir");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });//resive argumento
        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));//filas, columnas, espacio vertial, horizontal
        panel.add(et1);
        panel.add(txt1);
        panel.add(b1);
        panel.add(b2);

        contenedor.add(panel, BorderLayout.CENTER);
        setSize(320, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void info() {
        String pelicula;
        pelicula = txt1.getText();
        switch (pelicula) {
            case "showtime":
                JOptionPane.showMessageDialog(null, "Director: Tom Dey");
                JOptionPane.showMessageDialog(null, "Año de estreno: 2002");
                JOptionPane.showMessageDialog(null, "Reseña:Un policia veterano y otro que sabe de la broma, son puestos en pareha, mientras las camaras filman su trabajo ");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas:77000");
                break;
            case "fuga a la medianoche":
                JOptionPane.showMessageDialog(null, "Director: Martin Brest");
                JOptionPane.showMessageDialog(null, "Año de estreno: 1988");
                JOptionPane.showMessageDialog(null, "Reseña: Un cazarrecompensas tiene cinco días para llevar a un contador fugitivo acusado de fraude desde Nueva York hasta Los Ángeles");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas: 10000");
                break;
            case "el padrino":
                JOptionPane.showMessageDialog(null, "Director: Frnacis Ford Coppola");
                JOptionPane.showMessageDialog(null, "Año de estreno: 1972");
                JOptionPane.showMessageDialog(null, "Reseña:Una adaptación ganadora del Premio de la Academia, de la novela de Mario Puzo acerca de la familia Corleone");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas: 30000");
                break;
            case "forrest gump":
                JOptionPane.showMessageDialog(null, "Director: Robert Zemeckis");
                JOptionPane.showMessageDialog(null, "Año de estreno: 1994");
                JOptionPane.showMessageDialog(null, "Reseña:La simpleza e inocencia de un sureño lo impulsan a través de hechos importantes de la historia moderna de EE.UU");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas: 23442");
                break;
            case "matrix":
                JOptionPane.showMessageDialog(null, "Director: Lana Wachowski y Lilly Wachowski");
                JOptionPane.showMessageDialog(null, "Año de estreno: 1999");
                JOptionPane.showMessageDialog(null, "Reseña:Un experto en computadoras descubre que su mundo es una simulación total creada con maliciosas intenciones por parte de la ciberinteligencia");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas: 93493");
                break;
            case "harry potter y la piedra filosofal":
                JOptionPane.showMessageDialog(null, "Director: Chris Columbus");
                JOptionPane.showMessageDialog(null, "Año de estreno: 2002");
                JOptionPane.showMessageDialog(null, "Reseña:Durante su primer año en Hogwarts, descubre que un malévolo y poderoso mago llamado Voldemort está en busca de una piedra filosofal que alarga la vida de quien la posee");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas: 38456");
                break;
            case "harry potter y la orden del fenix":
                JOptionPane.showMessageDialog(null, "Director: David Yates");
                JOptionPane.showMessageDialog(null, "Año de estreno: 2007");
                JOptionPane.showMessageDialog(null, "Reseña: En su quinto año en Hogwarts, Harry descubre que muchos integrantes de la comunidad de magos no conocen la verdad acerca de su encuentro con Lord Voldemort");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas:98734");
                break;
            case "harry potter y las reliquias de la muerte":
                JOptionPane.showMessageDialog(null, "Director: David Yates");
                JOptionPane.showMessageDialog(null, "Año de estreno: 2010");
                JOptionPane.showMessageDialog(null, "Reseña:DescripciónHarry, Ron y Hermione se marchan de Hogwarts para iniciar su misión más importante: tienen que destruir los horrocruxes, el secreto del poder y la inmortalidad de Voldemort ");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas: 3277");
                break;
            case "bad boys":
                JOptionPane.showMessageDialog(null, "Director: Michael Bay");
                JOptionPane.showMessageDialog(null, "Año de estreno: 1995");
                JOptionPane.showMessageDialog(null, "Reseña:Dos policías de Miami solo tienen 72 horas para encontrar cien millones de dólares en heroína robados del almacén de evidencias de su propia comisaría");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas: 92631");
                break;
            case "avatar":
                JOptionPane.showMessageDialog(null, "Director: James Cameron");
                JOptionPane.showMessageDialog(null, "Año de estreno: 2009");
                JOptionPane.showMessageDialog(null, "Reseña:En un exuberante planeta llamado Pandora viven los Na'vi, seres que aparentan ser primitivos pero que en realidad son muy evolucionados.");
                JOptionPane.showMessageDialog(null, "Total entradas vendidas:8365");
                break;

        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        Aplicacion ap = new Aplicacion();
    }

}
