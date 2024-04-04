public class Libro
{
    //Atributos
    private String name;
    private String autor;
    private int pages;
    private int ISBN;

    //Constructores
    public Libro(String name, String autor, int pages, int ISBN)
    {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
        this.ISBN = ISBN;
    }
    public Libro(String name, String autor, int pages)
    {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
        this.ISBN = ISBNGenerator.newISBN();
    }

    //GETTERS
    public String getName()
    {
        return name;
    }

    public String getAutor()
    {
       return autor;
    }

    public int getPages()
    {
        return pages;
    }

    public int getISBN()
    {
        return ISBN;
    }

    //SETTERS
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public void setISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }

}
