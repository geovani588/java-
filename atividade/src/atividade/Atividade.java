/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author cliente
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno alA = new Aluno(888, "Caio", 'M', 5.5f, 8000.0f);
        Aluno alB = new Aluno(333, "Lara", 'F', 9.8f, 5500.0f);
        Aluno alC = new Aluno(666, "Vanessa", 'F', 8.8f, 12000.0f);
        Aluno alD = new Aluno(111, "Luiz", 'M', 6.5f, 23000.0f);
        Aluno alE = new Aluno(999, "Ana", 'F', 9.5f, 25000.0f);

        // Lista de alunos
        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(alA);
        listaAlunos.add(alB);
        listaAlunos.add(alC);
        listaAlunos.add(alD);
        listaAlunos.add(alE);

        // Ordenar a lista em ordem decrescente (inverter a ordem padrão)
        Collections.sort(listaAlunos, Collections.reverseOrder());

        // Exibição dos objetos ordenados
        System.out.println("ordenados pela renda familiar");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
    
}
