// © Ledón, 2017-2019.

package testebinaryminheap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TesteAlunosPriorityQueue {

    PriorityQueue heap = new PriorityQueue();
    
    public static void main(String[] args) {
        new TesteAlunosPriorityQueue();
    }

    public TesteAlunosPriorityQueue() {
        criaObjetosIniciais();
        System.out.println("Objetos da classe Aluno no heap inicialmente");
        System.out.println(mostraHeap(heap));
        System.out.println("\nRetirando do heap (de menor a maior renda familiar):");        
        esvazia(heap);
    }

    public void criaObjetosIniciais() {
        Aluno alA = new Aluno(888, "Caio", 'M', 5.5f, 8000.0f);
        Aluno alB = new Aluno(333, "Lara", 'F', 9.8f, 5500.0f);
        Aluno alC = new Aluno(666, "Vanessa", 'F', 8.8f, 12000.0f);
        Aluno alD = new Aluno(111, "Luiz", 'M', 6.5f, 23000.0f);
        Aluno alE = new Aluno(999, "Ana", 'F', 9.5f, 25000.0f);
        Aluno alF = new Aluno(123, "Rosa", 'F', 4.5f, 7200.0f);
        Aluno alG = new Aluno(444, "Betty", 'F', 9.0f, 9500.0f);
        Aluno alH = new Aluno(222, "Pedro", 'M', 7.0f, 5750.0f);
        
        /*
           Os alunos anteriores serão inseridos em uma fila de prioridades. 
           A prioridade considerada será a renda familiar do aluno. Observe este
           critério no método compareTo da classe Aluno.
        */
        heap.add(alA);
        heap.add(alB);
        heap.add(alC);
        heap.add(alD);
        heap.add(alE);
        heap.add(alF);
        heap.add(alG);
        heap.add(alH);
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
