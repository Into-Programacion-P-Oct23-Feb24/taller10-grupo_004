/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] datos = new double[2][2];
        int contador = 0;
        double valor;
       String acumulador = "";

        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("Ingrese el dato de la posicion [%d]"
                        + "[%d]\n", f, c);
                valor = entrada.nextDouble();
                if (valor > 1000 && valor < 1199) {
                    datos[f][c] = valor;
                } else {
                    datos[f][c] = 10;
                    contador++;
                }
            }
        }
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                acumulador = String.format("%s%.2f\n"
                        ,acumulador,datos[f][c]);
            }
        }
        System.out.printf("%sCantidad de veces fuera de rango: %d\n"
                ,acumulador,contador);
    }
}
