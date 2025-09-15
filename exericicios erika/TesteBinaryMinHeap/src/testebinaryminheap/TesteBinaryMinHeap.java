package testebinaryminheap;

// © Ledón, 2017-2019.

public class TesteBinaryMinHeap {

    public static void main(String[] args) {
        new TesteBinaryMinHeap();
    }
    
    public TesteBinaryMinHeap() {
        System.out.println("Testando com uma fila de prioridades simples");
        BinaryMinHeap heap1 = new BinaryMinHeap(300); //tamanho máximo 300
        heap1.insert(1);
        heap1.insert(3);
        heap1.insert(6);
        heap1.insert(5);
        heap1.insert(9);
        heap1.insert(8);
        System.out.println(heap1.toString());
        System.out.println("Inserimos -2 e fica:");
        heap1.insert(-2);
        System.out.println(heap1.toString());
        System.out.println("heapSize: " + heap1.getHeapSize());
        System.out.println("mínimo: " + heap1.getMin());
        System.out.println("Esvaziando este heap em ordem de prioridades: ");
        esvazia(heap1);
        
        System.out.println("\n\nTestando com a fila de prioridades da figura do material");
        BinaryMinHeap heap2 = new BinaryMinHeap(300); //tamanho máximo 300
        heap2.insert(10);
        heap2.insert(20);
        heap2.insert(16);
        heap2.insert(25);
        heap2.insert(30);
        heap2.insert(18);
        heap2.insert(69);
        heap2.insert(65);
        heap2.insert(27);
        heap2.insert(33);
        System.out.println(heap2.toString());
        System.out.println("Inserimos 15 e fica:");
        heap2.insert(15);
        System.out.println(heap2.toString());
        System.out.println("Inserimos 17 e fica:");
        heap2.insert(17);
        System.out.println(heap2.toString());
        System.out.println("Esvaziando este heap em ordem de prioridades: ");
        esvazia(heap2);        
        
        System.out.println("\n\nTestando com a fila de prioridades da outra figura do material");
        BinaryMinHeap heap3 = new BinaryMinHeap(300); //tamanho máximo 300
        heap3.insert("B");
        heap3.insert("C");
        heap3.insert("D");
        heap3.insert("F");
        heap3.insert("H");
        heap3.insert("J");
        heap3.insert("M");
        heap3.insert("N");
        heap3.insert("P");
        heap3.insert("Q");
        System.out.println(heap3.toString());
        System.out.println("Inserimos A e fica:");
        heap3.insert("A");
        System.out.println(heap3.toString());   
        System.out.println("Esvaziando este heap em ordem de prioridades: ");
        esvazia(heap3);  

        //Testamos o método estático merge:
        BinaryMinHeap heapA = new BinaryMinHeap(10);
        BinaryMinHeap heapB = new BinaryMinHeap(12);
        heapA.insert("mesa"); heapA.insert("almofada"); heapA.insert("copo");
        heapB.insert("moto"); heapB.insert("automóvel"); heapB.insert("avião"); heapB.insert("foguete"); 
        BinaryMinHeap heapmix = BinaryMinHeap.merge(heapA, heapB);
        System.out.println("\n\nMerge de dois heaps: ");
        esvazia(heapmix);       
                
        System.out.println("\n\n");        
        heap1.clear(); heap2.clear(); heap3.clear(); heapA.clear(); heapB.clear(); heapmix.clear();
    }    
    
    public void esvazia (BinaryMinHeap heap) {
        while (!heap.isEmpty()) {
             System.out.print(heap.deleteMin() + "  ");
        }
    }
}
