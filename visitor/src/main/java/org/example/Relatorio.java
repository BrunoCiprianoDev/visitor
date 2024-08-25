package org.example;

public class Relatorio implements Documento {
    private String titulo;
    private int numeroPaginas;

    public Relatorio(String titulo, int numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void gerar(Visitor visitor) {
        visitor.visitarRelatorio(this);
    }
}
