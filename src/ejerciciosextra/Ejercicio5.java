/*
Una obra social tiene tres clases de socios:

- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.

- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.

- Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.

- Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String categoria = "";
        double costo;

        while (categoria.equals("") || (!categoria.equalsIgnoreCase("A") && !categoria.equalsIgnoreCase("B") && !categoria.equalsIgnoreCase("C"))) {

            System.out.println("Ingrese categoria de socio:");
            categoria = input.nextLine();

            if (!categoria.equalsIgnoreCase("A") && !categoria.equalsIgnoreCase("B") && !categoria.equalsIgnoreCase("C")) {

                System.out.println("Categoria incorrecta, intente nuevamente.");
            }
        }

        System.out.println("Ingrese el costo del tratamiento:");
        costo = input.nextDouble();

        if (categoria.equalsIgnoreCase("A")) {

            costo = costo*0.5;

        } else if ((categoria.equalsIgnoreCase("B"))) {

            costo = costo*0.65;
        }

        System.out.println("Por ser categoria " + categoria.toUpperCase() + " el costo final del tratamiento es: $ " + costo);
    }
}
