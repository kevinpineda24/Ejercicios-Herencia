public class Usuario extends Persona {

    /** Atributos */
    private String correo;
    private String password;

    /** Constructores */
    public Usuario(String nombre, int edad, String sexo, String correo, String password) {
        /** Llamamos al constructor de la clase padre (Persona) */
        super(nombre, edad, sexo);
        this.correo = correo;
        this.password = password;
    }

    /** Métodos */
    public void informacionUsuario() {
        System.out.println(" --- INFORMACIÓN DEL USUARIO --- \n");

        /** Getters de clase Padre */
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());

        System.out.println("Correo: " + getCorreo());
        System.out.println("password: " + getpassword());
    }

        public String getCorreo() {
        return correo;
    }

    public String getpassword() {
        return password;
    }

}