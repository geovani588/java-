/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author autologon
 */
public class exercicio6 {
     public static void main(String[] args) {
        int [] v = {2,4,5,6,3,1,4,0};
        double soma = 0;
        double media;
        
        
        for (int i = 0; i<v.length;i++) {
            soma+= v[i]; 
        }
        media = soma/v.length;
        
        System.out.println(media);
        
        for (int i = 0; i<v.length;i++){
            if(v[i]> media){
                System.out.print(v[i]+",");
            }
        }

        
    
    }
    
}
