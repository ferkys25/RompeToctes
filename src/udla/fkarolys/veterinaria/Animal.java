package udla.fkarolys.veterinaria;

public class Animal{
    private String tipo;
    private String nombre;
    private int edad;
    private Persona dueno;

    public Animal(String tipo, String nombre, int edad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return "Tipo: " + tipo + ", nombre: " + nombre + ", edad: " + edad + ", dueño: " + dueno;
    }
}
