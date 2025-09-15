/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treino2024;

/**
 *
 * @author cliente
 */
public class Treino2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v [] =  {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
        
        int find = 30;
        
        for(int i = 0; i<v.length; i++){
            if(v[i] == find){
                System.out.print("encontrou" + v[i]);         
            }
            else
                System.out.println("\nnao encontrou");
    }
        
    }
    
}
