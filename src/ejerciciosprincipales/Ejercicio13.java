/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Ingrese el tamaño del lado del cuadrado:");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            if ((i == 0) || (i == n - 1)) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                System.out.print("*");
                for (int j = 1; j < n-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");
            }
        }
    }
}
