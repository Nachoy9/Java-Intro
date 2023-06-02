/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        boolean primo;

        System.out.println("Ingrese un numero:");
        num = input.nextInt();

        primo = esPrimo(num);

        if (primo) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("El numero " + num + " no es primo.");
        }
    }

    private static boolean esPrimo(int _num) {

        int contador = 0;

        for (int i = 1; i < _num+1; i++) {

            if (_num % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
}
