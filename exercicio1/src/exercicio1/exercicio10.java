/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author cliente
 */
public class exercicio10 {
    public static void main(String[] args) {
        
        String [] pessoa ={"Ana", "João", "Maria", "Pedro"}; 
        int [] idade ={24,36,16,18};
        
        int MaiorId = 0;
        int MenorId = 0;
        
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > idade[MaiorId]) {
                MaiorId = i;
            }
            if (idade[i] < idade[MenorId]) {
                MenorId = i;
            }
        }
        System.out.println("Pessoa com maior idade: " + pessoa[MaiorId] + " (idade: " + idade[MaiorId] + ")");
        System.out.println("Pessoa com menor idade: " + pessoa[MenorId] + " (idade: " + idade[MenorId] + ")");
    }

}
