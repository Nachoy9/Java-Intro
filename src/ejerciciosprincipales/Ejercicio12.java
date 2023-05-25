/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas.
*/

package ejerciciosprincipales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String rs232Str = "";
        int ok = 0;
        int nok = 0;
        int length;

        while (!rs232Str.equalsIgnoreCase("&&&&&")) {

            System.out.println("Ingrese una cadena para ser leida por el dispositivo RS232");
            rs232Str = input.nextLine();
            length = rs232Str.length();

            if (length <= 5 && rs232Str.substring(0, 1).equalsIgnoreCase("x") && rs232Str.substring(length - 1, length).equals("0")) {
                ok++;
            } else if (rs232Str.equals("&&&&&")) {
                break;
            } else {
                nok++;
            }
        }

        System.out.println("Se han leido " + ok + " cadenas de forma correcta");
        System.out.println("Se han leido " + nok + " cadenas de forma incorrecta");

    }
}
