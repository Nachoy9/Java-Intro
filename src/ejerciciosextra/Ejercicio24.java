/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci.
En la sucesion de Fibonacci cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
*/

package ejerciciosextra;

import java.util.Scanner;
import static ejerciciosextra.Ejercicio18.mostrarVector;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int[] vectorFibo;

        System.out.println("Ingrese el n deseado:");
        n = input.nextInt();

        vectorFibo = new int[n+1];

        llenarVector(vectorFibo);
        mostrarVector(vectorFibo);
    }

    private static void llenarVector(int[] vectorFibo) {

        for (int i = 0; i < vectorFibo.length; i++) {
            vectorFibo[i] = fibonacci(i);
            }
    }

    private static int fibonacci(int i) {

        if (i == 0) {
            return 0;
        }
        if (i <= 1) {
            return 1;
        } else {
            return (fibonacci(i-1) + fibonacci(i-2));
        }
    }
}
