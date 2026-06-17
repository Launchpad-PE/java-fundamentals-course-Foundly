// Clase Mascota con encapsulación
class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Mi mascota se llama " + nombre + 
                          ", es un " + especie + 
                          " y tiene " + edad + " años");
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Fluffy", "gato", 3);
        Mascota mascota2 = new Mascota("Max", "perro", 5);
        
        System.out.println("=== Registro de Mascotas ===");
        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
        
        System.out.println("\nCambiando edad de Fluffy...");
        mascota1.setEdad(4);
        mascota1.mostrarInfo();
    }
}