/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Arrays;

/**
 *
 * @author autologon
 */
public class exercicio2 {
    public static void main(String[] args) {
        int [] v = {1,2,3,4,5,6,7,8,9,10};
        
        for (int i = 9;i>=0;i--){
           System.out.print(v[i]+",");
        }
        System.out.println("\n");
        for (int i =v.length -1;i>=0;i--){
           System.out.print(v[i]+",");
        }
        System.out.println("\n");
        
        int l = v.length;
        for (int i=0; i<v.length;i++) {
            
            v[i] = l;
            l--;
        }
        System.out.print(Arrays.toString(v));
        
       


    }

}
        

