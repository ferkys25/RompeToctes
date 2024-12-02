package udla.fkarolys.veterinaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para almacenar personas y animales
        List<Persona> personas = new ArrayList<>();

        int option = 0;
        int option2 = 0;
        int tipo = 0;

        do {
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Listar Animales");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Agregar un animal");
            System.out.println("4. Quitar un animal");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (option) {
                case 1:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        System.out.println("\n=== Lista de Animales por dueño ===");
                        for (Persona persona : personas) {
                            persona.listarAnimales(); // Imprimir animales de cada persona
                        }
                    }

                    break;
                case 2:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        System.out.println("\n=== Lista de Dueños ===");
                        for (Persona persona : personas) {
                            System.out.println("- Nombre: " + persona.getNombre());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Que animal desea añadir:\n");
                    System.out.println("1. Canino, 2. Felino, 3. Otros");
                    option2 = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    if(option2 == 1){

                        System.out.println("Ingrese la informacion del dueño:\n ");
                        System.out.println("1. Cliente fisico, 2. Cliente Juridico");
                        tipo = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        if(tipo == 1){
                            System.out.println("Nombre: ");
                            String name = scanner.next();
                            System.out.println("Email: ");
                            String email = scanner.next();
                            System.out.println("Direccion: ");
                            String direccion = scanner.next();
                            System.out.println("Telefono: ");
                            String telf = scanner.next();
                            System.out.println("DNI: ");
                            String dni = scanner.next();
                            Fisica persona = new Fisica(name,email,direccion,telf,dni);
                            //AÑADIR DUEÑO A LA LISta
                            personas.add(persona);

                            System.out.println("Ingrese la informacion del animal:\n ");

                            System.out.println("Nombre: ");
                            String name1 = scanner.next();

                            System.out.println("Edad: ");
                            int age = scanner.nextInt();

                            persona.agregarAnimal("canino", name1, age);

                        }

                    }else if(option2 == 2){
                        System.out.println("Ingrese la informacion del dueño:\n ");
                        System.out.println("1. Cliente fisico, 2. Cliente Juridico");
                        tipo = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        if(tipo == 1){
                            System.out.println("Nombre: ");
                            String name = scanner.next();
                            System.out.println("Email: ");
                            String email = scanner.next();
                            System.out.println("Direccion: ");
                            String direccion = scanner.next();
                            System.out.println("Telefono: ");
                            String telf = scanner.next();
                            System.out.println("DNI: ");
                            String dni = scanner.next();
                            Fisica persona = new Fisica(name,email,direccion,telf,dni);
                            //AÑADIR DUEÑO A LA LISta
                            personas.add(persona);

                            System.out.println("Ingrese la informacion del animal:\n ");

                            System.out.println("Nombre: ");
                            String name1 = scanner.next();

                            System.out.println("Edad: ");
                            int age = scanner.nextInt();

                            persona.agregarAnimal("felino", name1, age);

                        }
                    } else if (option2 == 3){
                        System.out.println("Ingrese la informacion del dueño:\n ");
                        System.out.println("1. Cliente fisico, 2. Cliente Juridico");
                        tipo = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        if(tipo == 1){
                            System.out.println("Nombre: ");
                            String name = scanner.next();
                            System.out.println("Email: ");
                            String email = scanner.next();
                            System.out.println("Direccion: ");
                            String direccion = scanner.next();
                            System.out.println("Telefono: ");
                            String telf = scanner.next();
                            System.out.println("DNI: ");
                            String dni = scanner.next();
                            Fisica persona = new Fisica(name,email,direccion,telf,dni);
                            //AÑADIR DUEÑO A LA LISta
                            personas.add(persona);

                            System.out.println("Ingrese la informacion del animal:\n ");

                            System.out.println("Nombre: ");
                            String name1 = scanner.next();

                            System.out.println("Edad: ");
                            int age = scanner.nextInt();

                            persona.agregarAnimal("otro", name1, age);
                            Animal perro = new Animal("otro", name1, age);

                        }
                    }
                    break;
                case 4:
                    System.out.println("Funcionalidad no implementada todavía.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }




    }  while (option != 5);
}
}