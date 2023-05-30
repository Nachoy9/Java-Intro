/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
*/

package ejerciciosprincipales;

public class Ejercicio18 {

    public static void main(String[] args) {

        int n = 4;
        int[][] matriz;

        System.out.println("La matriz original es:");
        matriz = rellenarMatriz(n);
        mostrarMatriz(n,matriz);

        System.out.println();

        System.out.println("La matriz transpuesta es:");
        mostrarTranspuesta(n,matriz);
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
    }

    private static void mostrarTranspuesta(int _n, int[][] _matriz) {

        for (int j = 0; j < _n; j++) {

            System.out.print(" |");

            for (int i = 0; i < _n; i++) {

                if (i != _n-1) {
                    System.out.print(_matriz[i][j]);
                    System.out.print(" , ");
                } else {
                    System.out.print(_matriz[i][j]);
                }
            }
            System.out.println(" |");
        }
    }
}
