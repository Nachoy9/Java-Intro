/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c, d, aux;

        System.out.println("Ingrese el valor para la variable A:");
        a = input.nextInt();

        System.out.println("Ingrese el valor para la variable B:");
        b = input.nextInt();

        System.out.println("Ingrese el valor para la variable C:");
        c = input.nextInt();

        System.out.println("Ingrese el valor para la variable D:");
        d = input.nextInt();

        System.out.println("Los valores iniciales son: A = " + a + ", B = " + b + ", C = " + c + ", D = " + d);

        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.println("Los valores finales son: A = " + a + ", B = " + b + ", C = " + c + ", D = " + d);
    }
}
