/**
 * BIENVENIDOS AL CURSO DE JAVA PARA PRINCIPIANTES -LECCIÓN 6
 * TUTOR: MAURICIO TERAN ZAVALA
 */
public class Lesson6 {
    public static void main(String[] args) {
        System.out.println("--- Lección 6: Buenas Prácticas y Errores Comunes ---");

        // ERROR 1: Olvidar el punto y coma (;)
        //System.out.println("Falta el punto y coma") 
        
        // ERROR 2: Confundir '=' con '=='
        int numeroMagico = 7;
        
        // Error común (Provoca error de compilación si no es booleano):
        //if (numeroMagico = 10) { 
           //System.out.println("Es diez");
        //}
        
        // Forma correcta (Comparación):
        if (numeroMagico == 7) {
            System.out.println("¡Correcto! El número mágico es 7 (Usando ==).");
        }
        

        // ERROR 3: Sensibilidad a mayúsculas y minúsculas (Case Sensitivity)
        String nombre = "Mauricio";
        //String Nombre = "Profesor"; // Java los detecta como dos variables totalmente distintas

        System.out.println("Mi nombre es: " + nombre);
        
        // ERROR 4: Intentar usar una variable local sin inicializar
        int puntaje;
        // Error común: Intentar leerla o imprimirla antes de darle un valor
        //System.out.println("Tu puntaje es: " + puntaje);
        
        // Forma correcta:
        puntaje = 100;
        System.out.println("Tu puntaje correcto es: " + puntaje);


        // ERROR 5: El temido NullPointerException (Error en tiempo de ejecución)
        String texto = null;
        
        // Error común: Intentar medir su tamaño o usar un método estando vacía
        //System.out.println(texto.length()); // ¡Bum! Lanza un NullPointerException y congela el programa
        
        // Forma correcta (Validar antes de usar):
        if (texto != null) {
            System.out.println(texto.length());
        } else {
            System.out.println("El texto está vacío, no puedo medirlo.");
        }
        
        // ERROR 6: Fuera de rango en arreglos (ArrayIndexOutOfBoundsException)
        int[] notas = {15, 18, 20,80};
        
        // Error común: Olvidar que en programación empezamos a contar desde 0
        //System.out.println(notas[3]); // ¡Error! La posición 3 no existe. El programa se cae.
        
        // Forma correcta:
        System.out.println("La última nota es: " + notas[3]);

        // Próximos pasos: Invitación a modificar el proyecto anterior
        System.out.println("\n¡Felicidades por terminar los fundamentos de Java!");
    }
}