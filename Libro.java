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
    String numeroReferencia;
    int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numPag)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numPag;
        numeroReferencia = "";
        vecesPrestado = 0;
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
     * devuelve el numero de referencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    /**
     * añade un numero de referencia
     */
    public void setNumeroReferencia(String nuevoNumero) {
        if(nuevoNumero.length() >= 3) {
            numeroReferencia = nuevoNumero;        
        }
        else {
            System.out.println("Error, debe ser mínimo de 3 caracteres");
        }
    }
    
    /**
     * devuelve el numero de veces que ha sido prestado
     */
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    /**
     * presta el libro, habra un contador
     */
    public void prestar() {
        vecesPrestado++;
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
        System.out.println(getDetalles());
    }
    
    /**
     * devuelve los datos en un String
     */
    public String getDetalles() {
        if(numeroReferencia.length() < 3) {
            numeroReferencia = "ZZZ";
        }        
        String detalles = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Número de referencia: " + numeroReferencia + ", Veces prestado: " + vecesPrestado;
        return detalles;
    }
}
