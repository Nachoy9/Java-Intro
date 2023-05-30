/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int[] vector;

        System.out.println("Ingrese la cantidad de elementos deseados para el vector:");
        n = input.nextInt();

        vector = rellenarVector(n);
        mostrarVector(n,vector);
        System.out.println();

        cuantosDigitos(n,vector);

    }

    private static int[] rellenarVector(int _n) {

        int[] _vector = new int[_n];

        for (int i = 0; i < _n; i++) {
            _vector[i] = (int) (Math.random() * 10000 + 1);
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

    private static void cuantosDigitos(int _n, int[] _vector) {

        //Posicion 0 es para 1 digito y posicion 4 es para 5 digitos
        int[] digitos = new int[5];

        //Inicializo array
        for (int i = 0; i < 5; i++) {
            digitos[i] = 0;
        }

        for (int i = 0; i < _n; i++) {

            if (_vector[i] >= 10000) {
                digitos[4]++;
            } else if (9999 >= _vector[i] && _vector[i] >= 1000) {
                digitos[3]++;
            } else if (999 >= _vector[i] && _vector[i] >= 100) {
                digitos[2]++;
            } else if (99 >= _vector[i] && _vector[i] >= 10) {
                digitos[1]++;
            } else if (9 >= _vector[i] && _vector[i] >= 0) {
                digitos[0]++;
            }
        }

        System.out.println("El vector contiene " + digitos[0] + " numeros de 1 digito");
        System.out.println("El vector contiene " + digitos[1] + " numeros de 2 digitos");
        System.out.println("El vector contiene " + digitos[2] + " numeros de 3 digitos");
        System.out.println("El vector contiene " + digitos[3] + " numeros de 4 digitos");
        System.out.println("El vector contiene " + digitos[4] + " numeros de 5 digitos");
    }
}
