
//Ejercicio 1:  Estructura de Control If-Else

public class Main {


    public static void main(String[] args) {

        int opcion = 1;

        if (opcion == 1) {
            System.out.println("Has ordenado un Chifa.");
        } else if (opcion == 2) {
            System.out.println("Has ordenado una Hamburguesa.");
        } else {
            System.out.println("Opción no válida. Por favor, elige 1 o 2.");
        }

    }
}

//Ejercicio 2: Estructura de Control For

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iniciando partida en: " + i);
        }

    }
}

// Ejercicio 3: Estructura de Control While

public class Main {
    public static void main(String[] args) {

        int ticketsDeOrden = 3;

        while (ticketsDeOrden > 0) {
            System.out.println("Cocinando orden... Quedan " + ticketsDeOrden + " tickets.");
            ticketsDeOrden--;
        }
        System.out.println("¡No hay más órdenes, buen trabajo!");

    }
}