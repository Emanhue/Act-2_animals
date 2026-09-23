# Act-2_animals

## Actividad Unidad 2: Herencia y Polimorfismo

Programa en Java que pone en práctica los conceptos de **herencia** y **polimorfismo** mediante un sistema de animales en un refugio.

## 📋 Descripción

Se identificó como tema un refugio de animales, donde existe una clase general `Animal` y distintos tipos de animales (`Perro`, `Gato`, `Loro`) que heredan de ella pero se comportan de forma diferente. Esto permitió aplicar herencia (reutilizar atributos y comportamiento común) y polimorfismo (tratar distintos objetos de la misma forma pero obteniendo respuestas distintas según su clase real).

## 🧩 Estructura de clases

- **`Animal.java`** — Clase padre (superclase). Contiene los atributos comunes `nombre` y `edad`, y los métodos base `describir()` y `hacerSonido()`.
- **`Perro.java`** — Hereda de `Animal`. Agrega el atributo `raza` y sobrescribe `describir()` y `hacerSonido()`.
- **`Gato.java`** — Hereda de `Animal`. Agrega el atributo `color` y sobrescribe los mismos métodos.
- **`Loro.java`** — Hereda de `Animal`. Agrega el atributo `frase` y sobrescribe los mismos métodos.
- **`Refugio.java`** — Contiene el método `presentarRefugio()`, que recorre una lista de animales tratándolos como `Animal` genérico, pero cada uno responde según su clase real (aquí se demuestra el polimorfismo).
- **`Main.java`** — Clase principal con el método `main()`. Crea los objetos, arma la lista del refugio y ejecuta las pruebas.

## 🔗 Cómo se aplican los conceptos

**Herencia:** `Perro`, `Gato` y `Loro` extienden de `Animal` usando `extends`, heredando `nombre` y `edad`, y reutilizando el constructor del padre con `super(...)`.

**Polimorfismo:** En `Refugio.presentarRefugio()`, cada objeto se maneja dentro de una lista de tipo `List<Animal>`, pero al llamar a `animal.describir()` y `animal.hacerSonido()`, cada uno ejecuta su propia versión sobrescrita del método — sin que el código necesite saber de antemano si es un perro, un gato o un loro.

## ▶️ Cómo ejecutar el programa

1. Clonar o descargar este repositorio.
2. Abrir la carpeta en VS Code (con la extensión de Java instalada) o en cualquier IDE con soporte para Java.
3. Compilar todos los archivos:
   ```bash
   javac *.java
   ```
4. Ejecutar el programa:
   ```bash
   java Main
   ```

## 🖥️ Salida esperada

```
=== Animales en el refugio ===

Rocky (3 años) | Perro de raza Labrador
 -> ¡Guau guau!
--------------------------------------------------
Mishi (2 años) | Gato de color Negro
 -> Miau~
--------------------------------------------------
Coco (5 años) | Loro que sabe decir "¡Hola amigo!"
 -> ¡Hola amigo! (imitando voz humana)
--------------------------------------------------
Luna (1 años) | Perro de raza Poodle
 -> ¡Guau guau!
--------------------------------------------------

=== Verificación de polimorfismo ===
Rocky -> es instancia de Animal: true, clase real: Perro
Mishi -> es instancia de Animal: true, clase real: Gato
Coco -> es instancia de Animal: true, clase real: Loro
Luna -> es instancia de Animal: true, clase real: Perro
```

## 🛠️ Lenguaje y herramientas

- **Lenguaje:** Java
- **Editor:** Visual Studio Code
- **Control de versiones:** Git / GitHub
