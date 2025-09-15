/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;


/**
 *
 * @author autologon
 */
public class exercicio8 {
     public static void main(String[] args) {
        int [] v ={5,8,2,6,8,4,8};
        int cont = 0;
        
      
        for (int i = 0; i<v.length;i++){
            if(v[i] == 2){
                cont++;
            } 
        }
        System.out.print(cont);
    }
}
