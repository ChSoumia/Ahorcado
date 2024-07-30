import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Classe Scaner nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y Asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean plabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: Iterativa (Bucle)

        while (!plabraAdivinada && intentos < intentosMaximos) {
            ////////////////////////////////////// Esto se usa cuando tenemos plabra de
            ////////////////////////////////////// chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ("
                    + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una Letra, por favor ");

            // usamos la classe Scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + "intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                plabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);

            }
        }

        if (!plabraAdivinada) {
            System.out.println("Que pena te has quedado sin intentos ¡GAME OVER! ...");
        }

        scanner.close();

    }
}
