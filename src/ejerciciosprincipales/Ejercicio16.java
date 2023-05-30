/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int num;
        int[] vector;

        System.out.println("Ingrese el tamaño deseado para el vector:");
        n = input.nextInt();

        vector = rellenarVector(n);
        mostrarVector(n,vector);
        System.out.println();

        System.out.println("Ingrese el numero que desea buscar dentro del vector:");
        num = input.nextInt();

        buscarElemento(n,vector,num);

    }

    private static int[] rellenarVector(int _n) {

        int[] _vector = new int[_n];

        for (int i = 0; i < _n; i++) {
            _vector[i] = (int) (Math.random() * 100 + 1);
        }

        return _vector;
    }

    private static void mostrarVector(int _n, int[] _vector) {

        System.out.println("El vector generado es:");
        System.out.print("[");

        for (int i = 0; i < _n; i++) {

            if (i != _n-1) {
                System.out.print(_vector[i]);
                System.out.print(",");
            } else {
                System.out.print(_vector[i]);
            }

        }

        System.out.print("]");
    }

    private static void buscarElemento(int _n, int[] _vector, int _num) {

        boolean encontrado = false;

        for (int i = 0; i < _n; i++) {

            if (_vector[i] == _num) {
                System.out.println("Elemento encontrado en la posicion " + (i+1));
                encontrado = true;
            }

        }

        if (!encontrado) {
            System.out.println("Elemento no encontrado en el vector");
        }

    }

}
