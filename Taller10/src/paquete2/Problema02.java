/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String acumulador = "";
        double sumas = 0;
        double[][] ventas = new double[2][5];
        String[] nombres = {"Jessica Cole", "Robert Wallace"};

        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                System.out.printf("Ingrese las ventas diarias de %s\n",
                        nombres[f]);
                ventas[f][c] = entrada.nextDouble();
                sumas = sumas + ventas[f][c];
            }
        }
        for (int f = 0; f < nombres.length; f++) {
                acumulador = String.format("%sVendedor(a) %s\n"
                        ,acumulador, nombres[f]);
            
        }
        System.out.printf("%sHa realizado un total de %.2f en ventas\n"
                , acumulador,sumas);
    }
}
