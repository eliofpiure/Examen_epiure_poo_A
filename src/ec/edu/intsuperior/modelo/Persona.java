package ec.edu.intsuperior.modelo;

public class Persona {

    String nombre;
    int edad;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrar(String nombre, int edad) {
        return nombre + " " + edad;
    }
}
