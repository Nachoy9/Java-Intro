/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, opc = 0;

        System.out.println("Ingrese cantidad de numeros a analizar:");
        n = input.nextInt();

        while ((opc != 1) && (opc != 2)) {

            System.out.println("Ingrese que procedimiento desea usar:");
            System.out.println("1. 'While'");
            System.out.println("2. 'Do-While'");
            opc = input.nextInt();

            if ((opc != 1) && (opc != 2)) {

                System.out.println("Opcion incorrecta, intente nuevamente.");
            }
        }

        if (opc == 1) {
            procWhile(n);
        } else {
            procDoWhile(n);
        }
    }

    public static void procWhile(int _n) {

        Scanner _input = new Scanner(System.in);
        int num, min = 0, max = 0, i = 0;
        double prom = 0;

        while (i < _n) {

            System.out.println("Ingrese el valor Nro " + (i+1) + ":");
            num = _input.nextInt();

            if (i == 0) {
                max = num;
                min = num;
            }

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            prom += num;
            i++;
        }

        System.out.println("Minimo = " + min + ", Maximo = " + max + ", Promedio = " + prom/_n);
    }

    public static void procDoWhile(int _n) {

        Scanner _input = new Scanner(System.in);
        int num, min = 0, max = 0, i = 0;
        double prom = 0;

        do {

            System.out.println("Ingrese el valor Nro " + (i+1) + ":");
            num = _input.nextInt();

            if (i == 0) {
                max = num;
                min = num;
            }

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            prom += num;
            i++;

        } while (i < _n);

        System.out.println("Minimo = " + min + ", Maximo = " + max + ", Promedio = " + prom/_n);

    }
}
