/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        int[][] matriz;

        matriz = ingresarMatriz(3,3);

        System.out.println("La matriz ingresada es:");
        mostrarMatriz(3,3,matriz);

        esMagico(3,3,matriz);
    }

    public static int[][] ingresarMatriz(int _i, int _j) {

        Scanner _input = new Scanner(System.in);

        int[][] _matriz = new int[_i][_j];
        boolean check = false;

        for (int i = 0; i < _i; i++) {

            for (int j = 0; j < _j; j++) {

                while (check == false) {

                    System.out.println("Ingrese el elemento [" + (i+1) + "][" + (j+1) + "]");
                    _matriz[i][j] = _input.nextInt();

                    if (1 <= _matriz[i][j] && _matriz[i][j] <= 9 ) {
                        check = true;
                    } else {
                        System.out.println("Valor ingresado no es correcto, intente nuevamente");
                    }
                }
                check = false;
            }
        }
        return _matriz;
    }

    private static void mostrarMatriz(int _i, int _j, int[][] _matriz) {

        for (int i = 0; i < _i; i++) {

            System.out.print(" |");

            for (int j = 0; j < _j; j++) {

                if (j != _j-1) {
                    System.out.print(_matriz[i][j]);
                    System.out.print(" , ");
                } else {
                    System.out.print(_matriz[i][j]);
                }
            }
            System.out.println(" |");
        }
        System.out.println();
    }

    public static void esMagico(int _i, int _j, int[][] _matriz) {

        int suma = 0;
        int aux = 0;
        boolean check = true;

        // Inicializo suma con el valor de la suma de la primer fila
        for (int i = 0; i < _i; i++) {
            suma += _matriz[i][0];
        }

        // Comparo con el resto de las columnas (no cuento la primera)
        for (int j = 1; j < _j; j++) {

            for (int i = 0; i < _i; i++) {
                aux += _matriz[i][j];
            }

            if (aux != suma) {
                check = false;
            }
            aux = 0;
        }

        // Comparo con la suma de las filas
        for (int i = 0; i < _i; i++) {

            for (int j = 0; j < _j; j++) {
                aux += _matriz[i][j];
            }

            if (aux != suma) {
                check = false;
            }
            aux = 0;
        }

        // Comparo con la diagonal principal
        for (int i = 0; i < _i; i++) {

            for (int j = 0; j < _j; j++) {

                if (i == j) {
                    aux += _matriz[i][j];
                }
            }
        }

        if (aux != suma) {
            check = false;
        }

        aux = 0;

        // Comparo con la diagonal secundaria
        for (int i = 0; i < _i; i++) {

            for (int j = 0; j < _j; j++) {

                if (i + j == _i-1) {
                    aux += _matriz[i][j];
                }
            }
        }

        if (aux != suma) {
            check = false;
        }

        aux = 0;

        // Checkeo si la matriz es magica
        if (check) {
            System.out.println("La matriz es magica y la suma de sus columnas/filas/diagonales es: " + suma);
        } else {
            System.out.println("La matriz no es magica");
        }
    }

}
