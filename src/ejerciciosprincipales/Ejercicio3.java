/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una fase:");
        frase = input.nextLine();

        System.out.println("En mayusculas:" + frase.toUpperCase());
        System.out.println("En minusculas:" + frase.toLowerCase());

    }
}
