/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vector;
        int n, sum;

        System.out.println("Ingrese el tamaño deseado para el vector:");
        n = input.nextInt();

        vector = new int[n];

        llenarVector(vector);
        mostrarVector(vector);
        sum = sumarElemVector(vector);

        System.out.println("La suma de los elementos del vector es: " + sum);
    }

    private static int sumarElemVector(int[] _vector) {

        int _sum = 0;

        for (int i = 0; i < _vector.length; i++) {
            _sum += _vector[i];
        }

        return _sum;
    }

    public static void mostrarVector(int[] _vector) {

        System.out.print("[");

        for (int i = 0; i < _vector.length; i++) {

            if (i == _vector.length-1) {
                System.out.println(_vector[i] + "]");
            } else {
                System.out.print(_vector[i] + ",");
            }
        }
    }

    public static void llenarVector(int[] _vector) {

        Scanner _input = new Scanner(System.in);

        for (int i = 0; i < _vector.length; i++) {

            System.out.println("Ingrese el elemento Nro " + (i+1) + " del vector:");
            _vector[i] = _input.nextInt();
        }
    }


}
