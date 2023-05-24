/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float grados;

        System.out.println("Ingrese los grados centigrados que desea convertir:");
        grados = input.nextFloat();

        System.out.println("El equivalente en grados Fahrenheit es: " + (32+(9*grados/5)));
    }
}
