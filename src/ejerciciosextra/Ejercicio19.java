/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/

package ejerciciosextra;

import static ejerciciosextra.Ejercicio18.llenarVector;
import static ejerciciosextra.Ejercicio18.mostrarVector;

public class Ejercicio19 {

    public static void main(String[] args) {

        int[] vector1 = new int[5], vector2 = new int[5];
        boolean iguales = false;

        llenarVector(vector1);
        llenarVector(vector2);

        System.out.println("El vector 1 es:");
        mostrarVector(vector1);

        System.out.println("El vector 2 es:");
        mostrarVector(vector2);

         iguales = compararVectores(vector1,vector2);

         if (iguales) {
             System.out.println("Los vectores son iguales");
         } else {
             System.out.println("Los vectores no son iguales");
         }
    }

    private static boolean compararVectores(int[] _vector1, int[] _vector2) {

        int contador = 0;

        for (int i = 0; i < _vector1.length; i++) {

            if (_vector1[i] == _vector2[i]) {
                contador++;
            } else {
                break;
            }
        }

        return contador == _vector1.length;
    }
}
