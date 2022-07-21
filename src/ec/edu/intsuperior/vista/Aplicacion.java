package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;

public class Aplicacion {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.getEdad();
        persona.getNombre();        
        persona.setEdad(19);
        persona.setNombre("Fernando");        
        persona.mostrar("Fernando", 19);
        
        
        Cliente clien = new Cliente();        
        clien.getTelefono_contacto();
        clien.setTelefono_contacto("0968975677");
        clien.mostrar("Luis", 19, "0968965677");
        
        
        Empleado emple = new Empleado();
        emple.getSueldo_bruto();
        emple.setSueldo_bruto(Double.MIN_NORMAL);
        emple.mostrar("Bryan", 19, 400);
        
        
        
        Directivo direc = new Directivo();        
        direc.getCategoria();
        direc.setCategoria("administrador");
        direc.mostrar("Elio", 19, 800, "administrador");
        
        
        
        Empresa empre = new Empresa();
        empre.getNombre();
        empre.setNombre("motoservi");
        empre.setNombre("motoservi");
        
        
        
    }
}
