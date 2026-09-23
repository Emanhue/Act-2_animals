// Main.java
// Actividad Unidad 2: Herencia y Polimorfismo
// Punto de entrada del programa: crea los objetos y los prueba.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> refugio = new ArrayList<>();
        refugio.add(new Perro("Rocky", 3, "Labrador"));
        refugio.add(new Gato("Mishi", 2, "Negro"));
        refugio.add(new Loro("Coco", 5, "¡Hola amigo!"));
        refugio.add(new Perro("Luna", 1, "Poodle"));

        Refugio.presentarRefugio(refugio);

        System.out.println("\n=== Verificación de polimorfismo ===");
        for (Animal animal : refugio) {
            // Todos son tratados como 'Animal', pero getClass().getSimpleName()
            // confirma que en realidad son objetos de su propia subclase.
            System.out.println(animal.nombre + " -> es instancia de Animal: "
                    + (animal instanceof Animal) + ", clase real: "
                    + animal.getClass().getSimpleName());
        }
    }
}
