/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        double valor;
        for (int f = 0; f < notasCuantitativas.length; f++) {
            for (int c = 0; c < notasCuantitativas[f].length; c++) {
                valor = notasCuantitativas[f][c];

                if (valor >= 0 && valor <= 2.9) {
                    notasCualitativas[f][c] = "Insuficiente";
                } else if (valor >= 3 && valor <= 4.9) {
                    notasCualitativas[f][c] = "Regular";
                } else if (valor >= 5 && valor <= 7.9) {
                    notasCualitativas[f][c] = "Buena";
                } else if (valor >= 8 && valor <= 9.5) {
                    notasCualitativas[f][c] = "Muy Buena";
                } else if (valor >= 9.6 && valor <= 10) {
                    notasCualitativas[f][c] = "Sobresaliente";

                }
            }
        }
        for (int f = 0; f < notasCuantitativas.length; f++) {
            for (int c = 0; c < notasCuantitativas[f].length; c++) {
                System.out.printf("La nota: %.2f es %s\n"
                        ,notasCuantitativas[f][c],notasCualitativas[f][c]);
            }
        }
    }
}
