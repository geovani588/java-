/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4.pkg1;

/**
 *
 * @author cliente
 */
public class search {
    public static void search(int arr[], int elemento_procurado){
        int esquerda = 0; 
        int tamanho = arr.length; 
        int direita = tamanho - 1;
        int posicao = -1;
        
        for(esquerda = 0;esquerda <= direita;){
            if(arr[esquerda] == elemento_procurado){
                posicao = esquerda;
                System.out.println("Elemento encontrado na posição " + (posicao +1) 
                +" com "+ (esquerda + 1) + " tentativas.");
                break;
            }
            if (arr[direita] == elemento_procurado){
                posicao = direita;
                System.out.println("Elemento encontrado na posição " + (posicao + 1) 
                    + " com "+ (tamanho - direita) + " tentativas.");
                break;
            }
            esquerda++; 
            direita--;
            if (posicao == -1){
                System.out.println("Elemento não encontrado com "
                + esquerda + " tentativas");}
        }
    
    }
    
}
