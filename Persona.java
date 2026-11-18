public class Persona {

    /** Atributos */
        private String nombre;
        private int edad;
        private String sexo;

    /** Constructor */
        public Persona(String nombre, int edad, String sexo) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
    }

    /** Métodos */

        public void saludar() {
            System.out.println("Hola, soy " + this.nombre);
    }

        public void edad() {
            System.out.println("Tengo " + this.edad + " años");
    }

        public void sexo() {
            System.out.println(this.sexo);
    }

    /** Getters necesarios para usar (nombre, edad, sexo) en Usuario ya que son privados */
        public String getNombre() {
            return nombre;
    }

        public int getEdad() {
            return edad;
    }

        public String getSexo() {
            return sexo;
    }

}