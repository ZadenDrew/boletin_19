package prestamo;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class Prestamo {

   static  ArrayList<Libro> libro = new ArrayList<>();

    public Prestamo() {
    }

    // engadir libros
    public void engadir(Libro e) {
        libro.add(e);
    }
    //vender ( borrar ) libros

    public void vender(String titulo) {

        try {
            for (int i = 0; i < libro.size(); i++) {
                if (libro.get(i).getTitulo().equalsIgnoreCase(titulo)) {

                    int unidades = libro.get(i).getUnidades();
                    if (unidades != 0) {
                        libro.get(i).setUnidades(unidades - 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "No quedan unidades.");
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.print("El array es nulo\nNo hay libros a la Venta!!!!");
        }

    }
    //amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )

    public void amosar() {
        try {

            Iterator it = libro.iterator();
            if (it.next() != null) {
                System.out.println(libro.toString());
            }
        } catch (NullPointerException ep) {
            System.out.println("El Array es nulo\nNo hay libros!!!!");
        }

    }


    /*dar de baixa os libros con numero de unidades =0*/
    public void darDeBaixa() {
        try {
            for (int i = 0; i < libro.size(); i++) {
                if (libro.get(i).getUnidades() == 0) {
                    libro.remove(i);
                    i--;
                }
            }
        } catch (NullPointerException e) {
            System.out.print("El Array es nulo");
        }
    }
//consultar un libro 

    public void consultar(String titulo) {
        try {
            for (Libro l : libro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println(l.toString());
                    break;

                }
            }
        } catch (NullPointerException e) {
            System.out.print("El Array es nulo");
        }
    }

}
/*Nos métodos vender, amosar, baixas e consultar debes comprobar que o array recibido non é null.
        No caso contrario lanza una excepción.*/
