package udla.fkarolys.veterinaria;

import java.util.List;

public class Juridica extends Persona {
    private String CIF;

    //COnstructor


    public Juridica(String email, String direccion, String telefono, String animales, String CIF) {
        super(email, direccion, telefono, animales);
        this.CIF = CIF;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }
}
