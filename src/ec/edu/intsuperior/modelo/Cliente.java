package ec.edu.intsuperior.modelo;

public class Cliente {

    Persona persona = new Persona();
    String telefono_contacto;

    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public String mostrar(String nombre, int edad, String telefonocontacto) {
        return persona.mostrar(nombre, edad) + " " + telefono_contacto;
    }
}
