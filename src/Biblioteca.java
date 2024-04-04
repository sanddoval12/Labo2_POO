import javax.swing.*;
import java.util.ArrayList;

public class Biblioteca
{
    ArrayList<Libro> listaLibros = new ArrayList<>();

    //Atributo
    private ArrayList<Libro> libros;
    //CONSTRUCTOR
    public Biblioteca(ArrayList<Libro> libros)
    {
        this.libros = libros;
    }
    //METODOS
    public void agregandoLibros(Libro libros)
    {
        listaLibros.add(libros);
    }
    public void mostrandoLibros()
    {
        //String miLista = "";
        for(int i = 0; i < listaLibros.size(); i++)
        {
            System.out.println("Libro "+(i+1) + "\nNombre Libro: " +listaLibros.get(i).getName() + "\nAutor: " +listaLibros.get(i).getAutor() + "\nPaginas: " +listaLibros.get(i).getPages() + "\nISBN: " +listaLibros.get(i).getISBN() + "\n");
            //miLista += "Libro "+(i+1) + "\n";
            //miLista += "Nombre Libro: " +listaLibros.get(i).getName() + "\n";
            //miLista += "Autor: " +listaLibros.get(i).getAutor() + "\n";
            //miLista += "Paginas: " +listaLibros.get(i).getPages() + "\n";
            //miLista += "ISBN: " +listaLibros.get(i).getISBN() + "\n";


        }
        //JOptionPane.showMessageDialog(null, miLista);
    }
}

