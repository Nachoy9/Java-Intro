/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
*/

package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        float[][] registro = new float[10][5];

        cargarNotas(registro,10,5);
        calcularPromedios(registro,10,5);
        mostrarResultados(registro,10,5);
    }

    private static void cargarNotas(float[][] _registro, int _i, int _j) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < _i; i++) {

            for (int j = 0; j < _j-1; j++) {

                switch (j) {
                    case 0:
                        System.out.println("Ingrese la nota del primer trabajo practico evaluativo del alumno Nro " + (i+1) + ":");
                        _registro[i][j] = input.nextFloat();
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del segundo trabajo practico evaluativo del alumno Nro " + (i+1) + ":");
                        _registro[i][j] = input.nextFloat();
                        break;
                    case 2:
                        System.out.println("Ingrese la nota del primer integrador del alumno Nro " + (i+1) + ":");
                        _registro[i][j] = input.nextFloat();
                        break;
                    case 3:
                        System.out.println("Ingrese la nota del segundo integrador del alumno Nro " + (i+1) + ":");
                        _registro[i][j] = input.nextFloat();
                        break;
                }
            }
        }
    }

    private static void calcularPromedios(float[][] _registro, int _i, int _j) {

        for (int i = 0; i < _i; i++) {
            _registro[i][4] = (float) (0.1*_registro[i][0] + 0.15*_registro[i][1] + 0.25*_registro[i][2] + 0.5*_registro[i][3]);
            }
    }

    private static void mostrarResultados(float[][] _registro, int _i, int _j) {

        int aprobados = 0;

        for (int i = 0; i < _i; i++) {

            if (_registro[i][4] >= 7) {
                aprobados++;
            }
        }

        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de no aprobados es: " + (10-aprobados));
    }
}
