/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre;

        System.out.println("Ingrese su nombre:");
        nombre = input.nextLine();

        System.out.println("El nombre ingresado es: " + nombre);

    }
}
