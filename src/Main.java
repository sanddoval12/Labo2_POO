import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {

        ArrayList<Libro> listaLibros =new ArrayList<>();
        Biblioteca biblio = new Biblioteca(listaLibros);

        Libro miLibro = new Libro("Calculo Integral", "SosaGod", 500, 45678);
        Libro miLibro2 = new Libro("Fisica 1", "Raul", 607, 74150);
        Libro miLibro3 = new Libro("Solo demosttraciones", "Yoceman", 1000);

        biblio.agregandoLibros(miLibro);
        biblio.agregandoLibros(miLibro2);
        biblio.agregandoLibros(miLibro3);
        biblio.mostrandoLibros();
    }
}