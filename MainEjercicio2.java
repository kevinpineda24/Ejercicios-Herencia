public class MainEjercicio2{

    public static void main(String[]args) {

        /** Creamos un objeto LibroDigital pasando todos los datos */
        LibroDigital mLibroDigital = new LibroDigital("Padre Rico, Padre Pobre", "Robert Kiyosaki", 1997, "PDF", 10);

        /** Llamamos al método del diagrama */
        mLibroDigital.mostrarInfo();
    }
}