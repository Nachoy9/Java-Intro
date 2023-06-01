/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, cant = 0;
        double altura, prom1 = 0, prom2 = 0;

        System.out.println("Ingrese la cantidad de alturas que desea ingresar:");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese la altura numero " + (i+1) + ":");
            altura = input.nextDouble();

            if (altura <= 1.6) {
                prom1 += altura;
                cant++;
            }

            prom2 += altura;
        }

        System.out.println("El promedio de las alturas menores a 1.6m es: " + prom1/cant + "m");
        System.out.println("El promedio general de las alturas es: " + prom2/n + "m");

    }
}
