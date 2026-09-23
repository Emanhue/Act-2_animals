// Animal.java
// Clase padre (superclase)

public class Animal {
    protected String nombre;   // Atributo
    protected int edad;        // Atributo

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método base: será sobrescrito (polimorfismo) por las subclases
    public String describir() {
        return nombre + " (" + edad + " años)";
    }

    // Método genérico que las subclases redefinirán
    public String hacerSonido() {
        return "Este animal hace un sonido genérico.";
    }
}
