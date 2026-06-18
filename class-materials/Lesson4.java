// Lección 4: Métodos, Entrada/Salida e Introducción a la POO

// ─────────────────────────────────────────────────────────────
// Ejercicio 1: Métodos (funciones reutilizables)
// ─────────────────────────────────────────────────────────────

public class Main {

    // Método que saluda al usuario
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "! Bienvenido al curso de Java.");
    }

    // Método que suma dos números y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Llamamos al método saludar
        saludar("Ana");
        saludar("Carlos");

        // Llamamos al método sumar
        int resultado = sumar(8, 5);
        System.out.println("8 + 5 = " + resultado);

    }
}


// ─────────────────────────────────────────────────────────────
// Ejercicio 2: Entrada del usuario con Scanner
// ─────────────────────────────────────────────────────────────

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + "! Tienes " + edad + " años.");

        scanner.close();
    }
}


// ─────────────────────────────────────────────────────────────
// Ejercicio 3: Introducción a clases y objetos
// ─────────────────────────────────────────────────────────────

// Definimos una clase Mascota
class Mascota {
    String nombre;
    String tipo;
    int edad;

    // Método que muestra la información de la mascota
    public void presentarse() {
        System.out.println("Mi mascota se llama " + nombre +
                           ", es un(a) " + tipo +
                           " y tiene " + edad + " años.");
    }
}

public class Main {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Mascota
        Mascota miMascota = new Mascota();
        miMascota.nombre = "Luna";
        miMascota.tipo   = "perro";
        miMascota.edad   = 3;

        miMascota.presentarse();

        // Creamos otro objeto
        Mascota otraMascota = new Mascota();
        otraMascota.nombre = "Michi";
        otraMascota.tipo   = "gato";
        otraMascota.edad   = 2;

        otraMascota.presentarse();
    }
}


// ─────────────────────────────────────────────────────────────
// Ejercicio 4 (Reto): Combina todo
// Pide el nombre y tipo de mascota al usuario y muestra su info
// ─────────────────────────────────────────────────────────────

import java.util.Scanner;

class Mascota {
    String nombre;
    String tipo;

    public void presentarse() {
        System.out.println("Tu mascota " + nombre + " es un(a) " + tipo + ". ¡Que buena elección!");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Mascota mascota = new Mascota();

        System.out.print("¿Cómo se llama tu mascota? ");
        mascota.nombre = scanner.nextLine();

        System.out.print("¿Qué tipo de animal es? ");
        mascota.tipo = scanner.nextLine();

        mascota.presentarse();

        scanner.close();
    }
}
