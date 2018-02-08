package libreria;

import javax.swing.JOptionPane;
import prestamo.Libro;
import prestamo.Prestamo;

/**
 *
 * @author andrea
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prestamo presta = new Prestamo();
        Libro libro = new Libro();
        int op;
        do {
            System.out.println("***********-MENÚ-***********\n1)Engadir libros\n2)Vender\n3)Amosar libros"
                    + "\n4)Dar de baixa\n5)Consultar un libro determinado\n6)Saír?");

            op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción :"));
            switch (op) {
                case 1:
                    libro = new Libro(JOptionPane.showInputDialog("Introduce o titulo: "),
                            JOptionPane.showInputDialog("Introduce o autor: "),
                            JOptionPane.showInputDialog("Introduce ISBN: "),
                            Float.parseFloat(JOptionPane.showInputDialog("Introduce prezo: ")),
                            Integer.parseInt(JOptionPane.showInputDialog("Introduce nº unidades: ")));
                    presta.engadir(libro);
                    break;
                case 2:
                    presta.vender(JOptionPane.showInputDialog("Introduce o titulo: "));
                    break;
                case 3:
                    presta.amosar();
                    break;
                case 4:
                    presta.darDeBaixa();
                    break;
                case 5:
                    presta.consultar(JOptionPane.showInputDialog("Introduce o título a consltar : "));
                    break;
                case 6:
                    System.exit(0);

                    break;
            }
        } while (op <= 6);

    }

}
