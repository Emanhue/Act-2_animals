
public class Perro extends Animal {
    private String raza;   // Atributo propio

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);   // Reutiliza el constructor del padre
        this.raza = raza;
    }

    @Override
    public String describir() {

        return super.describir() + " | Perro de raza " + raza;
    }

    @Override
    public String hacerSonido() {
        return "¡Guau guau!";
    }
}
