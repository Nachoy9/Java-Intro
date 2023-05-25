/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int suma = 0;
        int limite;

        System.out.println("Ingrese el limite superior para la suma:");
        limite = input.nextInt();

        do {
            System.out.println("Ingrese el numero que desea sumar");
            suma += input.nextInt();
            System.out.println("Suma parcial: " + suma);
        } while (suma < limite );

        System.out.println("Suma final: " + suma);

    }

}
