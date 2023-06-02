package ejerciciosextra;

import static ejerciciosextra.Ejercicio18.mostrarVector;

public class Ejercicio20 {

    public static void main(String[] args) {

        int[] vector = new int[10];

        llenarVectorRandom(vector);

        System.out.println("El vector generado es:");
        mostrarVector(vector);
    }

    private static void llenarVectorRandom(int[] _vector) {

        for (int i = 0; i < _vector.length; i++) {
            _vector[i] = (int) (Math.random() * 10 + 1);
        }
    }


}
