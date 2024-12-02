package udla.fkarolys.veterinaria;

import java.util.List;

public class Fisica extends Persona{
    private String DNI;

    //Constructor


    public Fisica(String nombre, String email, String direccion, String telefono, String DNI) {
        super(nombre, email, direccion, telefono);
        this.DNI = DNI;
    }

}
