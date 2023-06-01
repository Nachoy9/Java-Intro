/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m;
        int h;
        int d;

        System.out.println("Ingrese los minutos que desea convertir:");
        m = input.nextInt();

        // Como uso int no hace falta redondearlos, java automaticamente los trunca
        d = m/1440;
        h = (m - d*1440)/60;

        System.out.println(m + " minutos equivalen a " + d + " dias y " + h + " horas.");
    }
}
