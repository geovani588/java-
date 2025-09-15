/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioaluno;

/**
 *
 * @author autologon
 */
public class ExercicioAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryMinHeap heap = new BinaryMinHeap(200);
    
    public static void main(String[] args) {
        new TesteBinaryMinHeap();
    }

    public TesteBinaryMinHeap() {
        criaObjetosIniciais();
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
        heap.insert(alA);
        heap.insert(alB);
        heap.insert(alC);
        heap.insert(alD);
        heap.insert(alE);
        heap.insert(alF);
        heap.insert(alG);
        heap.insert(alH);

        System.out.println("Objetos da classe Aluno no heap inicialmente");
        System.out.println(heap.toString());
    }

    public void esvazia(BinaryMinHeap heap) {
        while (!heap.isEmpty()) {
            System.out.print(heap.deleteMin() + "\n");
        }
    }
}
    }
    
}
