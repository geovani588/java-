// © Ledón, 2017-2019.
package filasprioridadesjavalib;

import java.util.PriorityQueue;

public class FilasPrioridadesJavaLib {

    public static void main(String[] args) {
        new FilasPrioridadesJavaLib();
    }

    public FilasPrioridadesJavaLib() { //testes
        
        PriorityQueue fpTextos = new PriorityQueue<String>();
        fpTextos.add("janela");
        fpTextos.add("quadro");
        fpTextos.add("casa");
        fpTextos.add("mesa");
        fpTextos.add("livro");
        fpTextos.add("armário");
        fpTextos.add("estante");
        //obs: provacaria erro filaTextos.add(6.3);
        System.out.println("Fila de prioridade que guarda textos: " + fpTextos.toString());
        System.out.println("Eliminando um elemento por vez: ");
        while (!fpTextos.isEmpty()) {
            System.out.println("poll " + fpTextos.poll());
        }

        System.out.println();

        PriorityQueue fpReais = new PriorityQueue<Double>();
        fpReais.add(5.7);
        fpReais.add(2.1);
        fpReais.add(7.8);
        fpReais.add(1.2);
        fpReais.add(0.5);
        fpReais.add(6.4);
        //provacaria erro: filaTextos.add("algo");
        System.out.println("Fila de prioridade que guarda números reais: " 
                + fpReais.toString());
        System.out.println("Eliminando um elemento por vez: ");
        while (!fpReais.isEmpty()) {
            System.out.println("poll " + fpReais.poll());
        }

    }

}
