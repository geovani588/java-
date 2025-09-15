/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino2024;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
            {10, 12, 14},
            {16, 18, 20},
            {22, 24, 26}
        };
        
        System.out.print("digite o numero  procurado: ");
        int numeroProcurado = sc.nextInt();

      

        // Percorrendo a matriz para verificar a presença do número
        if (encontrarNumero(matriz, numeroProcurado)) {
            System.out.println("O numero " + numeroProcurado + " esta presente na matriz.");
        } else {
            System.out.println("O numero " + numeroProcurado + " nao esta presente na matriz.");
        }
    }

    // Método para verificar se o número está presente na matriz
    public static boolean encontrarNumero(int[][] matriz, int alvo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == alvo) {
                    return true; // Retorna true se o número for encontrado
                }
            }
        }
        return false; // Retorna false se o número não for encontrado
    }
}


