public class Libro{

    /** Atributos */
        private String titulo;
        private String autor;
        private int year;

    /** Constructor */
    public Libro(String titulo, String autor, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }

    /** Métdos */
    public void mostrarInfo() {
        System.out.println(" --- Información del libro --- \n");
        System.out.println("Titulo del autor: " + getTitulo() + "\n"); /** Se puede poner un "\n" al final para dar otro salto de linea*/
        System.out.println("Autor del libro: " + getAutor());
        System.out.println("Year del libro: " + getYear());
    }

    /** Getters */
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getYear() {
        return this.year;
    }

}