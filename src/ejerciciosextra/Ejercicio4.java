/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;
        String numRom = "";

        while ((num < 1) || (num > 10)) {

            System.out.println("Ingrese un numero entre 1 y 10 que desee convertir:");
            num = input.nextInt();

            if ((num < 0) || (num > 10)) {
                System.out.println("Numero incorrecto, intente nuevamente.");
            }
        }

        switch (num) {
            case 1:
                numRom = "I";
                break;
            case 2:
                numRom = "II";
                break;
            case 3:
                numRom = "III";
                break;
            case 4:
                numRom = "IV";
                break;
            case 5:
                numRom = "V";
                break;
            case 6:
                numRom = "VI";
                break;
            case 7:
                numRom = "VII";
                break;
            case 8:
                numRom = "VIII";
                break;
            case 9:
                numRom = "IX";
                break;
            case 10:
                numRom = "X";
                break;
            default:
                break;
        }

        System.out.println("El numero " + num + " convertido a romano es: " + numRom);
    }
}
