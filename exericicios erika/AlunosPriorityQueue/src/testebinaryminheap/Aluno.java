// © Ledón, 2017-2019.

package testebinaryminheap;

public class Aluno implements Comparable {
    private int rgm;
    private String nomeAluno;
    private char sexo;
    private float media, rendaFamiliar;

    public Aluno(int rgm, String nomeAluno, char sexo, float media, float rendaFamiliar) {
        this.rgm = rgm;
        this.nomeAluno = nomeAluno;
        this.sexo = sexo;
        this.media = media;
        this.rendaFamiliar = rendaFamiliar;
    }
    
    public String toString() {
        return rgm + " - " + nomeAluno + ", sexo: " + sexo + ", média: " + media + ", renda familiar: R$ " + rendaFamiliar;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(float rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }    
  
    public int compareTo(Object outro) {  // comparamos as rendas familiares
        if(rendaFamiliar < ((Aluno)outro).getRendaFamiliar())return -1;
        else if(rendaFamiliar == ((Aluno)outro).getRendaFamiliar())return 0;
        else return  1;
    }
    
}
