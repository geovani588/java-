/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.voo;
import java.util.Iterator;
import java.util.PriorityQueue;

public class AtividadeVoo {

    
    PriorityQueue heap = new PriorityQueue();
    
    public static void main(String[] args) {
        new AtividadeVoo();
    }
    public AtividadeVoo() {
        criaObjetosIniciais();
        System.out.println("classe voo no heap inicialmente");
        System.out.println(mostraHeap(heap));
        System.out.println("\nRetirando do heap (menor volume de combustível):");        
        esvazia(heap);
    }
     public void criaObjetosIniciais() {
        voo voo1 = new voo("G3 7685", "São Paulo", "Rio de Janeiro", 2, "Airbus 340", 600);
        voo voo2 = new voo("JJ 8063", "Rio de Janeiro", "Brasília", 3, "Boeing 767", 240);
        voo voo3 = new voo("AA 123", "New York", "Los Angeles", 6, "Boeing 777", 1000);
        voo voo4 = new voo("AZ 456", "Roma", "Paris", 4, "Airbus A380", 200);

        
       
        heap.add(voo1);
        heap.add(voo2);
        heap.add(voo3);
        heap.add(voo4);

       
    }
    public void esvazia(PriorityQueue heap) {
        while (!heap.isEmpty()) {
            System.out.print(heap.poll() + "\n"); //elimina o item de menor prioridade
        }
    }
    
    public String mostraHeap(PriorityQueue heap) {
        String str = "";
        Iterator it = heap.iterator();
        while (it.hasNext()) {
            str += it.next().toString() + "\n";
        }
        return(str);
    }
    
}
