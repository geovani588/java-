/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exem1;

/**
 *
 * @author autologon
 */
public class exem5 {
    public static void main(String[] args) {
        long fibo [] = new long[50];
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = fibo[0] + fibo[1];


        for(int i = 2;i<fibo.length;i++){
            fibo[i] = fibo[i-2] + fibo[i-1];
            
        }
        for(int i = 0;i<50;i++){
            System.out.println("fibo " + i + " numeros " +fibo[i]);
            
          
        }
        int x = 6765;
        for(int j = 0;j<fibo.length;j++){
            if(fibo[j] == x){
                System.out.println("Digite a posiçao do fibo " +j);
            
            }
        }

        }
    }

    
    
    
    

