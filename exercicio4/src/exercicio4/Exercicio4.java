
package exercicio4;

import static exercicio4.PesquisaSequencial.search;

/**
 *
 * @author cliente
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arr [] = {2,3,4,10,40};
        int x = 11;
        
        int result = search(arr, x);
     
        if(result == -1){
            System.out.print("nao encontrado");
        }else{
             System.out.print("Encontrado! "+ result);
        }           
    } 
    
}

