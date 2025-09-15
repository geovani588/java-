/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadee;


public class MinHeap {
    Comparable[] data;
    private int heapSize;

    public MinHeap(int capacity) {
        data = new Comparable[capacity];
        heapSize = 0;
    }

    private void examineDown(int nodePos) {
        int leftChildPos, rightChildPos, minPos;
        Comparable temp;

        leftChildPos = getLeftChildPos(nodePos);
        rightChildPos = getRightChildPos(nodePos);

        if (rightChildPos >= heapSize) {
            if (leftChildPos >= heapSize) {
                return; // Nenhum filho, nada a fazer
            } else {
                minPos = leftChildPos; // Tem um único filho esquerdo
            }
        } else {
            // Dois filhos, determinar o menor
            if (data[leftChildPos].compareTo(data[rightChildPos]) <= 0) {
                minPos = leftChildPos;
            } else {
                minPos = rightChildPos;
            }
        }

        // Se o nodo atual for maior que o menor filho, troca os valores
        if (data[nodePos].compareTo(data[minPos]) > 0) {
            temp = data[minPos];
            data[minPos] = data[nodePos];
            data[nodePos] = temp;
            examineDown(minPos); // Chamada recursiva para reorganizar abaixo
        }
    }

    public Comparable deleteMin() {
        Comparable min;
        if (isEmpty()) {
            return null; // Retorna null se o heap está vazio
        } else {
            // Guarda o menor valor do heap para retornar depois
            min = data[0];
            // Coloca o último item do vetor na posição do objeto removido
            data[0] = data[heapSize - 1];
            heapSize--; // O heap terá agora um item a menos

            if (heapSize > 0) {
                examineDown(0); // Reorganiza o heap começando na posição 0
            }
            return min; // Retorna o menor valor removido
        }
    }
    public boolean isEmpty() {
        return heapSize == 0;
    }
    
    
    public int getLeftChildPos(int i) {
        return (2 * i) + 1;
    }

    public int getRightChildPos(int i) {
        return (2 * i) + 2;
    }

   
    
  
}
