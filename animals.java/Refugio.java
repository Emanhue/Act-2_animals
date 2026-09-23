// Refugio.java
// Clase con el método que demuestra POLIMORFISMO

import java.util.List;

public class Refugio {

    // Recibe una lista de objetos Animal (o cualquier subclase) y llama a
    // describir()/hacerSonido() en cada uno SIN saber de qué subclase
    // específica se trata. Cada objeto responde según su propia clase:
    // esto es polimorfismo en acción.
    public static void presentarRefugio(List<Animal> animales) {
        System.out.println("=== Animales en el refugio ===\n");
        for (Animal animal : animales) {
            System.out.println(animal.describir());
            System.out.println(" -> " + animal.hacerSonido());
            imprimirLinea();
        }
    }

    // Reemplaza "-".repeat(50), que requiere Java 11+
    private static void imprimirLinea() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
