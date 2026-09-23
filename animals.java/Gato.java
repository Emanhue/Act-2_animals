// Gato.java
// Subclase de Animal

public class Gato extends Animal {
    private String color;   // Atributo propio

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public String describir() {
        return super.describir() + " | Gato de color " + color;
    }

    @Override
    public String hacerSonido() {
        return "Miau~";
    }
}
