/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int familias, hijos, edad;
        double contador = 0, suma = 0;

        System.out.println("Ingrese la cantidad de familias que existen:");
        familias = input.nextInt();

        for (int i = 0; i < familias; i++) {

            System.out.println("Ingrese cantidad de hijos para la familia Nro " + (i+1) + ":");
            hijos = input.nextInt();
            contador += hijos;

            for (int j = 0; j < hijos; j++) {

                System.out.println("Ingrese la edad del hijo Nro " + (j+1) + " de la familia Nro " + (i+1) + ":");
                edad = input.nextInt();
                suma += edad;
            }
        }

        System.out.print("El promedio de todas las edades de los hijos de todas las familias es " + suma/contador);
    }
}
