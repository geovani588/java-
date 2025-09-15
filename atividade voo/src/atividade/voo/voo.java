/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.voo;



public class voo implements Comparable <voo> {
    private String nome;
    private String origem;
    private String destino;
    private int horas;
    private String aeronave; 
    private int litros;

    public voo(String nome, String origem, String destino, int horas, String aeronave, int litros) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.horas = horas;
        this.aeronave = aeronave;
        this.litros = litros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    @Override
     public String toString() {
        return  "aviao = " +nome+
                ", origem = "+ origem +
                ", destino = "+ destino +
                ", horas = "+ horas +
                ", aeronave = "+ aeronave +
                ", litros = "+ litros 
                ;
    }
    public int compareTo(voo outrovoo) {  // comparamos as rendas familiares
        return Integer.compare(this.litros, outrovoo.litros);
    }
     
}   
    

