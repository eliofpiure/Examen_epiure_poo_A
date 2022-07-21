package ec.edu.intsuperior.modelo;

public class Empleado {

    Persona persona = new Persona();
    Double sueldo_bruto;

    public Empleado() {
    }

    public Double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(Double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public String mostrar(String nombre, int edad, double sueldo_bruto) {
        return persona.mostrar(nombre, edad) + " " + sueldo_bruto;
    }

}
