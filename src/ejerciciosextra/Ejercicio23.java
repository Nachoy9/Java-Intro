/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        String[][] matriz = new String[20][20];

        ingresarPalabras(matriz);
        mostrarMatriz(matriz);
    }

    private static void mostrarMatriz(String[][] _matriz) {

        for (int i = 0; i < _matriz.length; i++) {

            System.out.print(" |");

            for (int j = 0; j < _matriz[0].length; j++) {

                if (j != _matriz[0].length-1) {
                    System.out.print(_matriz[i][j]);
                    System.out.print(" ");
                } else {
                    System.out.print(_matriz[i][j]);
                }
            }
            System.out.println(" |");
        }
    }

    private static void ingresarPalabras(String[][] matriz) {

        Scanner input = new Scanner(System.in);
        String palabra;

        // Defino un contador para llevar la cuenta de la cantidad de filas llenas
        int contador = 0;

        while (contador < matriz.length) {

            System.out.println("Ingrese una palabra entre 3 y 5 letras:");
            palabra = input.nextLine().toUpperCase();

            if (3 <= palabra.length() && palabra.length() <= 5) {
                contador += llenarSdL(matriz,palabra);
            } else {
                System.out.println("Largo incorrecto, intente nuevamente...");
            }

            if (contador == matriz.length) {
                System.out.println("\nSopa de letras generada.\n");
            } else {
                System.out.println("Hasta el momento hay " + contador + " filas llenas.");
            }
        }
    }

    private static int llenarSdL(String[][] _matriz, String _palabra) {

        int _contador = 0;
        boolean palabraInsertada = false;

        // Loopeo entre las filas hasta que la palabra (o numeros) haya sido insertada
        while (!palabraInsertada) {

            // Defino la fila de forma aleatoria
            int filaAleatoria = (int) (Math.random() * _matriz.length);

            // Recorro las posiciones de la fila
            for (int j = 0; j < _matriz[0].length; j++) {

                // Encuentro posicion vacia y chequeo distancia al ultimo elemento
                if (_matriz[filaAleatoria][j] == null && _palabra.length() <= (_matriz[0].length - j)) {

                    for (int k = 0; k < _palabra.length(); k++) {

                        _matriz[filaAleatoria][k + j] = String.valueOf(_palabra.charAt(k));
                        palabraInsertada = true;
                    }

                    // Aumento el contador cuando la palabra tiene el mismo largo que los espacios disponibles
                    if (_palabra.length() == (_matriz[0].length - j)) {
                        _contador = 1;
                    }

                    // Dejo de recorrer las posiciones de la fila
                    break;

                // Si no entra la palabra relleno con numeros
                } else if (_matriz[filaAleatoria][j] == null && _palabra.length() > (_matriz[0].length - j)) {

                    for (int k = j; k < _matriz[0].length; k++) {

                        _matriz[filaAleatoria][k] = String.valueOf((int) (Math.random() * 10));
                        palabraInsertada = true;
                        _contador = 1;
                    }
                }
            }
        }
        return _contador;
    }
}
