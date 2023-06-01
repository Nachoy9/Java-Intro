/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.

Por ejemplo: 50 / 13:

50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas

dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
*/

package ejerciciosextra;

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dividendo, divisor, resto, contador = 0;

        System.out.println("Ingrese el valor del dividendo:");
        dividendo = input.nextInt();
        resto = dividendo;

        System.out.println("Ingrese el valor del divisor:");
        divisor = input.nextInt();

        while (resto > divisor) {

            contador++;
            resto -= divisor;
        }

        System.out.println("El cociente es " + contador);
        System.out.println("El resto es " + resto);
    }
}
