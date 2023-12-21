/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma = 0;
        double promedio;
        double[][] notas = {{9, 10, 7, 8},
                            {10, 5, 7, 9},
                            {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jerry Ponce", "Gabriela Lewis",
            "David Bell"};
        double[] promedios = new double[3];
        for (int fila = 0; fila < notas.length; fila++) {
            for (int col = 0; col < notas[fila].length; col++) {
                suma = suma + notas[fila][col];
            }
            promedio = suma / notas[fila].length;
            promedios[fila] = promedio;
            suma = 0;
        }
        for (int fila = 0; fila < promedios.length; fila++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n"
                    , nombresEstudiante[fila],promedios[fila]);
        }
    }

}
