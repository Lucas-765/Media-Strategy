package model;

import strategy.MediaStrategy;

public class Disciplina{
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;

    /**
     * Construtor que recebe a estratégia de cálculo
     */
    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * Calcula a média usando a estratégia injetada
     */
    public void calcularMedia() {
        this.media = estrategia.calcularMedia(this.p1, this.p2);

        this.situacao = estrategia.verificarSituacao(this.media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public Object getP1() {
        return p1;
    }

    public Object getP2() {
        return p2;
    }

    public Object getMedia() {
        return media;
    }

    public Object getSituacao() {
        return situacao;
    }

}
