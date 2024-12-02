package udla.fkarolys.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Persona{
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private List<Animal> animales = new ArrayList<>() ;

    //Constructor
    public Persona(String nombre, String email, String direccion, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public void agregarAnimal(String tipo, String name, int edad) {
        Animal nuevoAnimal = new Animal(tipo, name, edad);
        animales.add(nuevoAnimal);
        nuevoAnimal.setDueno(this);
        System.out.println("Animal agregado exitosamente: " + nuevoAnimal);
    }

    public void listarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados para " + nombre);
        } else {
            System.out.println("Animales de " + nombre + ":");
            for (Animal animal : animales) {
                System.out.println("- " + animal.getNombre() + " (Tipo: " + animal.getTipo() + ", Edad: " + animal.getEdad() + ")");
            }
        }
    }


    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\''+
                '}';
    }
}
