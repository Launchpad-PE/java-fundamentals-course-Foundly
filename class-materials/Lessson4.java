public class MyCode {

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
        System.out.println("Tu nombre tiene " + nombre.length() + " letras.");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        saludar("Ana");
        saludar("Beto");
        saludar("Carlos");

        int resultado = sumar(8, 5);
        System.out.println("8 + 5 = " + resultado);
    }
}
