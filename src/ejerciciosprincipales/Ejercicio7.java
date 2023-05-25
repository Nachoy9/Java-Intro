/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
*/

package ejerciciosprincipales;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese la contraseña:");
        frase = input.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
