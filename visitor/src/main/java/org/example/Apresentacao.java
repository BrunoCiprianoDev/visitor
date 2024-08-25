package org.example;

public class Apresentacao implements Documento {
    private String titulo;
    private int numeroSlides;

    public Apresentacao(String titulo, int numeroSlides) {
        this.titulo = titulo;
        this.numeroSlides = numeroSlides;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroSlides() {
        return numeroSlides;
    }

    @Override
    public void gerar(Visitor visitor) {
        visitor.visitarApresentacao(this);
    }
}