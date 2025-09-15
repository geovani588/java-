/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Arrays;

public class exercicio9 {
    public static void main(String[] args) {
        
        int [] v={8,6,4,2,1,0};
        int aux;
        
        for (int i = 0; i < v.length; i++){
            for (int j = i+1; j < v.length; j++){
                if(v[i] > v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                } 
            }
        }
        System.out.print(Arrays.toString(v));
         
    } 
    
}
