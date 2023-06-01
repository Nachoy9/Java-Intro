/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String letra;

        System.out.println("Ingrese una letra:");
        letra = input.nextLine();

        if (letra.length() == 1)  {

            if ((letra.equalsIgnoreCase("A")) || (letra.equalsIgnoreCase("E")) || (letra.equalsIgnoreCase("I")) || (letra.equalsIgnoreCase("O")) || (letra.equalsIgnoreCase("U"))) {
                System.out.println("'" + letra + "' es una vocal.");
            } else {
                System.out.println("'" + letra + "' no es una vocal o no es una letra.");
            }
        } else {
            System.out.println("Entrada incorrecta, intente nuevamente.");
        }
    }
}
