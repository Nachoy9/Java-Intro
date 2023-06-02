/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
*/

package ejerciciosextra;

public class Ejercicio12 {

    public static void main(String[] args) {

        int cent = 0, dec = 0, uni = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                for (int k = 0; k < 10; k++) {

                    if (cent == 3) {
                        System.out.println("E - " + dec + " - " + uni);
                    } else if (dec == 3) {
                        System.out.println(cent + " - E - " + uni);
                    } else if (uni == 3) {
                        System.out.println(cent + " - " + dec + " - E");
                    } else {
                        System.out.println(cent + " - " + dec + " - " + uni);
                    }

                    uni++;
                }

                uni = 0;
                dec++;
            }

            dec = 0;
            cent++;
        }
    }
}
