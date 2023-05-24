/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero entero:");
        num = input.nextInt();

        System.out.println("El doble de " + num + " es: " + 2*num);
        System.out.println("El triple de " + num + " es: " + 3*num);
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));

    }
}
