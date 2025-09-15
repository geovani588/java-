/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Scanner;


/**
 *
 * @author cliente
 */
public class exercicio11 {
    public static void main(String[] args) {
        String[] PRIMEIRO = {"Ana", "Beatriz", "Celso", "Diego"};
        int[] b = {3, 0, 1, 2};

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número entre 0 e 3: ");
        int numero = scanner.nextInt();
        
        if (numero >= 0 && numero < b.length) {
            int posicao = b[numero];
            String nome = PRIMEIRO[posicao];
            System.out.println(nome);
        } 

    
    
    }

}
