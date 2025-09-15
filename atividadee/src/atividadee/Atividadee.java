/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadee;

/**
 *
 * @author cliente
 */
public class Atividadee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MinHeap heap = new MinHeap(10);
        heap.data = new Comparable[]{10,20,16,25,30,18,69,65,27,33};
        
       

        System.out.println("filho a esquerda do 1 no: " + heap.getLeftChildPos(0));
        System.out.println("filho a direita do 1 no: " + heap.getRightChildPos(0));
        
        System.out.println("Deleted Min: " + heap.deleteMin());
        
        

    }

}
    

