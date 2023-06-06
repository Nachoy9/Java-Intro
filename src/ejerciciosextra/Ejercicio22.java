/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
*/

package ejerciciosextra;

import javafx.scene.SubScene;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, m;
        int[][] matriz;

        System.out.println("Ingrese la cantidad de filas deseadas para la matriz:");
        n = input.nextInt();

        System.out.println("Ingrese la cantidad de columnas deseadas para la matriz:");
        m = input.nextInt();

        matriz = new int[n][m];

        llenarMatrizRandom(matriz);
        mostrarMatriz(matriz);
    }

    private static void mostrarMatriz(int[][] _matriz) {

        for (int i = 0; i < _matriz.length; i++) {

            System.out.print(" |");

            for (int j = 0; j < _matriz[0].length; j++) {

                if (j != _matriz[0].length-1) {
                    System.out.print(_matriz[i][j]);
                    System.out.print(" , ");
                } else {
                    System.out.print(_matriz[i][j]);
                }
            }
            System.out.println(" |");
        }
    }

    private static void llenarMatrizRandom(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = (int) (Math.random()*10 + 1);
            }
        }
    }
}
