/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author autologon
 */
public class exercicio3 {
    public static void main(String[] args) {
        int [] v = {2,4,1,7,8};
        int maior = 0;
        
        for (int i = 0; i<v.length;i++) {
            if(v[i] > maior){
                maior =  v[i];           
            }
        
        }
        System.out.print("o maior numero do vetor e " +maior);
             System.out.println("\n");
        
        int [] vetor = {2,4,1,7,8};
        int m;
        m = vetor[0];//2//
         
        for (int i = 1; i<vetor.length;i++) {
            if(vetor[i]> m){
                m = vetor[i];
          
            }
            System.out.println("\n");
            System.out.print("o maior numero do vetor e " + m);

           

        
        }
                 
         
    }
    
   
  

}
