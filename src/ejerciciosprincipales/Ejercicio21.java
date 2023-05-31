/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
*/

package ejerciciosprincipales;

public class Ejercicio21 {

    public static void main(String[] args) {

        int[][] matrizM;
        int[][] matrizP;

        matrizM = rellenarMatriz(10);
        matrizP = rellenarMatriz(3);

        System.out.println("La matriz M es:");
        mostrarMatriz(10,matrizM);

        System.out.println("La matriz P es:");
        mostrarMatriz(3,matrizP);

        buscarElemento(10,matrizM,3,matrizP);

    }

    private static int[][] rellenarMatriz(int _n) {

        int[][] _matriz = new int[_n][_n];

        for (int i = 0; i < _n; i++) {

            for (int j = 0; j < _n; j++) {
                _matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return _matriz;
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

    private static void buscarElemento(int _n, int[][] _matrizM, int _m, int[][] _matrizP) {

        int contador = 0;

        for (int i = 0; i < _n-_m; i++) {

            for (int j = 0; j < _n-_m; j++) {

                if (_matrizM[i][j] == _matrizP[0][0]) {
                    contador += buscarMatriz(i,j,_matrizM,_m,_matrizP);
                }
            }
        }

        if (contador == 0) {
            System.out.println("La matriz P no se encuentra contenida en la matriz M");
        }
    }

    private static int buscarMatriz(int _i, int _j, int[][] _matrizM, int _m, int[][] _matrizP) {

        int contador = 0;
        int aux = 0;

        for (int i = 0; i < _m; i++) {

            for (int j = 0; j < _m; j++) {

                if (_matrizP[i][j] == _matrizM[_i+i][_j+j]) {
                    contador++;
                }
            }
        }

        if (contador == 9) {
            System.out.println("La matriz P se encuentra contenida en la matriz M");
            System.out.println("La posicion inicial de la matriz P es: [" + (_i+1) + "," + (_j+1) + "]");
            aux = 1;
        }

        return aux;
    }
}
