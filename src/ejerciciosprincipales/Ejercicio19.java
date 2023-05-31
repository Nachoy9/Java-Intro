/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int[][] matriz;
        int[][] matrizt;

        System.out.println("Ingrese la cantidad de filas y columnas de la matriz");
        n = input.nextInt();

        // Ingreso los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        matriz = ingresarMatriz(n);

        // Genero la matriz transpuesta negativa
        matrizt = generarTranspuestaNegativa(n,matriz);

        // Muestro las matrices original y la transpuesta negativa
        System.out.println("La matriz original es:");
        mostrarMatriz(n,matriz);

        System.out.println("La matriz transpuesta es:");
        mostrarMatriz(n,matrizt);

        // Comparo las matrices
        compararMatrices(n,matriz,matrizt);

    }

    // i representa las filas y j las columnas
    public static int[][] ingresarMatriz(int _n) {

        Scanner _input = new Scanner(System.in);

        int[][] _matriz = new int[_n][_n];

        for (int i = 0; i < _n; i++) {

            for (int j = 0; j < _n; j++) {

                System.out.println("Ingrese el elemento [" + (i+1) + "][" + (j+1) + "]");
                _matriz[i][j] = _input.nextInt();
            }
        }
        return _matriz;
    }

    private static int[][] generarTranspuestaNegativa(int _n, int[][] _matriz) {

        int[][] _matrizt = new int[_n][_n];

        for (int j = 0; j < _n; j++) {

            for (int i = 0; i < _n; i++) {

                _matrizt[i][j] = _matriz[j][i];
            }
        }
        return _matrizt;
    }

    private static void mostrarMatriz(int _n, int[][] _matriz) {

        for (int i = 0; i < _n; i++) {

            System.out.print(" |");

            for (int j = 0; j < _n; j++) {

                if (j != _n-1) {
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

    private static void compararMatrices(int _n, int[][] _matriz1, int[][] _matriz2) {

        int contador = _n*_n;

        for (int i = 0; i < _n; i++) {

            for (int j = 0; j < _n; j++) {

                if (_matriz1[i][j] == -_matriz2[i][j]) {
                    contador--;
                }
            }
        }

        if (contador == 0) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }

        System.out.println(contador);
    }
}
