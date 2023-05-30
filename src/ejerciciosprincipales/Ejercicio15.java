/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/

package ejerciciosprincipales;

public class Ejercicio15 {

    public static void main(String[] args) {

        int n = 100;
        int[] vector;

        vector = rellenarVector(n);
        mostrarVector(n,vector);

    }

    private static int[] rellenarVector(int _n) {

        int[] _vector = new int[_n];

        for (int i = 0; i < _n; i++) {
            _vector[i] = i+1;
        }

        return _vector;
    }

    private static void mostrarVector(int _n, int[] _vector) {

        for (int i = _n-1; 0 < i+1; i--) {
            System.out.println(_vector[i]);
        }
    }
}
