/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float num1;
        float num2;
        int opi;
        String ops = "";

        System.out.println("Ingrese el primer numero:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextInt();

        while (!ops.equalsIgnoreCase("S")) {

            System.out.println("Menu Principal");
            System.out.println("1. Sumar (num1+num2)");
            System.out.println("2. Restar (num1-num2)");
            System.out.println("3. Multiplicar (num1*num2)");
            System.out.println("4. Dividir (num1/num2)");
            System.out.println("5. Salir");
            System.out.println("Elija opcion:");
            opi = input.nextInt();
            input.nextLine();

            switch (opi) {
                case 1:
                    System.out.println("La suma num1 + num2 es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta num1 - num2 es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("El producto num1*num2 es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La division num1/num2 es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? (S/N)");
                    ops = input.nextLine();
                    break;
                default:
                    System.out.println("Opcion incorrecta, pulse enter para continuar");
                    ops = input.nextLine();
            }
        }
    }
}
