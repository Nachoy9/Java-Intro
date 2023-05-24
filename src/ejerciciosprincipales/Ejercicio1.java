/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma.
*/

package ejerciciosprincipales;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese el primer numero:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextInt();

        System.out.println("El resultado de la suma es: " + (num1+num2));

    }
}
