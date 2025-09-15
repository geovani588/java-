/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author cliente
 */
public class exercicio12 {
    public static int pesquisaBinaria(int arr[], int esquerda, int direita, int x) {
        if (direita >= esquerda) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (arr[meio] == x)
                return meio;

            if (arr[meio] > x)
                return pesquisaBinaria(arr, esquerda, meio - 1, x);

            return pesquisaBinaria(arr, meio + 1, direita, x);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 10, 15, 21, 30};
        int valorProcurado = 10;
        int resultado = pesquisaBinaria(arr, 0, arr.length - 2, valorProcurado);

        if (resultado == -2)
            System.out.println("Elemento não encontrado no array");
        else
            System.out.println("Elemento encontrado no índice: " + resultado);
    }
}
   

