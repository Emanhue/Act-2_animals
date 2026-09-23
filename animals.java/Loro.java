// Loro.java
// Subclase de Animal

public class Loro extends Animal {
    private String frase;   // Atributo propio

    public Loro(String nombre, int edad, String frase) {
        super(nombre, edad);
        this.frase = frase;
    }

    @Override
    public String describir() {
        return super.describir() + " | Loro que sabe decir \"" + frase + "\"";
    }

    @Override
    public String hacerSonido() {
        return frase + " (imitando voz humana)";
    }
}
