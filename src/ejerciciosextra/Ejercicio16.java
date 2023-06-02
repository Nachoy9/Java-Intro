/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre, opc = "";
        int edad;

        while (!opc.equalsIgnoreCase("No")) {

            System.out.println("Ingrese el nombre de la persona:");
            nombre = input.nextLine();

            System.out.println("Ingrese la edad de " + nombre.toUpperCase() + ":");
            edad = input.nextInt();
            input.nextLine();

            if (edad >= 18) {
                System.out.println(nombre.toUpperCase() + " es mayor de edad.");
            } else {
                System.out.println(nombre.toUpperCase() + " es menor de edad.");
            }

            System.out.println();
            System.out.println("Desea seguir ingresando personas? (Si/No)");
            opc = input.nextLine();
        }

        System.out.println("Cerrando aplicacion...");
    }
}
