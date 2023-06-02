/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, k = 0;

        System.out.println("Ingrese un numero:");
        num = input.nextInt();

        while (num > 9) {

            num = num/10;
            k++;
        }

        System.out.println("El numero tiene " + (k+1) + " digitos");
    }
}
