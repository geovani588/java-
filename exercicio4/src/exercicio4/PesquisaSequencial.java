/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author cliente
 */
public class PesquisaSequencial {
    public static int search(int arr[], int x){
        int n = arr.length;
        for(int i = 0;i < n; i++){
            if(arr[i] == x){
                return x;     
            }
        }
        return -1;    
    }
    
}
