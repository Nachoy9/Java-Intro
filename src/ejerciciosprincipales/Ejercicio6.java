/*
Crear un programa que dado un numero determine si es par o impar.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero:");
        num = input.nextInt();

        parimpar(num);
    }

    public static void parimpar(int _num) {

        if (_num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
