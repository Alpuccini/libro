/***
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
    }
    
    /**
     * devuelve el nombre del autor del libro
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * devuelve el nombre del libro
     */
    public String getNombreLibro() {
        return titulo;
    }
}
