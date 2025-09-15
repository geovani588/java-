
package atividade;

/**
 *
 * @author cliente
 */

class Aluno implements Comparable<Aluno> {
    private int matricula;
    private String nome;
    private char genero;
    private float nota;
    private float rendaFamiliar;

    public Aluno(int matricula, String nome, char genero, float nota, float rendaFamiliar) {
        this.matricula = matricula;
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
        this.rendaFamiliar = rendaFamiliar;
    }

    public float getRendaFamiliar() {
        return rendaFamiliar;
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        if (this.rendaFamiliar < outroAluno.getRendaFamiliar()) {
            return -1;
        } else if (this.rendaFamiliar == outroAluno.getRendaFamiliar()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", genero=" + genero +
                ", nota=" + nota +
                ", rendaFamiliar=" + rendaFamiliar +
                '}';
    }
}
