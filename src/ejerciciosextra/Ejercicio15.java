/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float num1, num2, res = 0;
        int opc;
        boolean check = false;


        System.out.println("Ingrese el primer numero:");
        num1 = input.nextFloat();

        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextFloat();

        while (check == false) {

            System.out.println("Menu principal:");
            System.out.println("1. Realizar N1+N2");
            System.out.println("2. Realizar N1*N2");
            System.out.println("3. Realizar N1/N2");
            System.out.println("4. Realizar N2/N1");
            System.out.println("5. Salir");
            System.out.println("Ingrese opcion:");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    res = sumar(num1,num2);
                    break;
                case 2:
                    res = multiplicar(num1,num2);
                    break;
                case 3:
                    res = dividir(num1,num2);
                    break;
                case 4:
                    res = dividir(num2,num1);
                    break;
                case 5:
                    System.out.println("Cerrando calculadora...");
                    check = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    break;
            }

            if (res != 0 && opc != 5) {
                System.out.println("El resultado de la operacion es " + res);
            }
        }
    }

    private static float sumar(float _num1, float _num2) {
        return _num1 + _num2;
    }

    private static float multiplicar(float _num1, float _num2) {
        return _num1 * _num2;
    }

    private static float dividir(float _num1, float _num2) {
        return _num1 / _num2;
    }
}
