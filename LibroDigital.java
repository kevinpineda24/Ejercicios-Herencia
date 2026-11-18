public class LibroDigital extends Libro{

    /** Atributos */
    private String formato;
    private double sizeMB; /** size: tamaño */

    /** Constructor */
    public LibroDigital(String titulo, String autor, int year, String formato, double sizeMB) {
        /** Llamamos al cosntructor de clase Libro */
        super(titulo, autor, year);
        this.formato = formato;
        this.sizeMB = sizeMB;
    }

    /** Método */
    public void mostrarInfo(){
        super.mostrarInfo(); /** Llama al método de la clase Libro */

        System.out.println("Formato: " + getFormato());
        System.out.println("Tamaño MB: " + getSizeMB());
    }

    /** Getters de está clase */
    public String getFormato() {
        return this.formato;
    }

    public double getSizeMB() {
        return this.sizeMB;
    }
}