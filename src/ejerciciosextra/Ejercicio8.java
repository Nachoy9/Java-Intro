/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 1, pares = 0, impares = 0, contador = 0;

        while (num % 5 != 0) {

            System.out.println("Ingrese un numero o ingrese 5 para salir:");
            num = input.nextInt();

            if (num < 0) {

                System.out.println("Numero incorrecto, intente nuevamente");

            } else if (num % 5 != 0) {

                contador++;

                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Cantidad de numeros leidos: " + contador + ".");
        System.out.println(pares + " pares y " + impares + " impares.");
    }
}
