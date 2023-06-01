/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0, aleat;

        aleat = (int) ((Math.random() * 10 + 1) * (Math.random() * 10 + 1));

        System.out.println("El numero generado es " + aleat);

        while (num != aleat) {

            System.out.println("Intente adivinar el numero:");
            num = input.nextInt();

            if (num == aleat) {
                System.out.println("Numero adivinado!!");
            } else {
                System.out.println("Numero incorrecto, intente nuevamente...");
            }
        }
    }
}
