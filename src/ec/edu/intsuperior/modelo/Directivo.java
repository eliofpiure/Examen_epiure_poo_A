package ec.edu.intsuperior.modelo;

public class Directivo {

    Empleado empleado = new Empleado();
    String categoria;

    public Directivo() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrar(String nombre, int edad, double sueldo_bruto, String categoria) {
        return empleado.mostrar(nombre, edad, sueldo_bruto) + " " + categoria;
    }
}
