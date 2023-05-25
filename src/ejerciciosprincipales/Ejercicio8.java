/* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una palabra o frase de maximo 8 caracteres:");
        frase = input.nextLine();

        if (frase.length() == 8) {
            System.out.println("Largo correcto");
        } else {
            System.out.println("Largo incorrecto (Ha ingresado " + frase.length() + " caracteres)");
        }
    }
}
