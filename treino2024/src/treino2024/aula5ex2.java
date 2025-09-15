/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino2024;

/**
 *
 * @author cliente
 */
public class aula5ex2 {
        
    public static void main(String[] args) {
        
        int v[] = {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
        
        
        int esquerda = 0;//inicio vetor
        int direita = v.length-1; // fim do vetor
        
        while(esquerda <= direita){
            
            int meio = esquerda+(direita - esquerda)/2;
            
            if(v[meio] == 20){
                System.out.print("encontrou");
            return;
            }         
            else if(v[meio] < 20){
                esquerda = meio + 1;}
            else{
                direita = meio - 1;}
        }
                
        
        }

    
}
