/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cant;
        double[] cambio;
        cambio = new double[3];

        // Cotizacion [dolar,libra,yen]
        cambio[0] = 0.93;
        cambio[1] = 1.15;
        cambio[2] = 0.0066;

        System.out.println("Ingrese la cantidad de euros que desea convertir:");
        cant = input.nextDouble();

        System.out.println("€ " + cant + " equivalen a $ " + (cant/cambio[0]));
        System.out.println("€ " + cant + " equivalen a £ " + (cant/cambio[1]));
        System.out.println("€ " + cant + " equivalen a ¥ " + (cant/cambio[2]));
    }
}
