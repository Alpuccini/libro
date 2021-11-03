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
    private int numeroPaginas;
    private String detalles;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numPag)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numPag;
        detalles = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;
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
    
    /**
     * devuelve el numero de paginas
     */
    public int numeroPaginas() {
        return numeroPaginas;
    }
    
    /**
     * imprime el titulo del libro
     */
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    /**
     * imprime el autor del libro
     */
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    /**
     * imprime todos los datos
     */
    public void imprimeDetalles() {
        System.out.println(detalles);
    }
    
    /**
     * devuelve los datos en un String
     */
    public String getDetalles() {
        return detalles;
    }
}
