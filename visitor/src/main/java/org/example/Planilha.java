package org.example;

public class Planilha implements Documento {
    private String nome;
    private int numeroCelulas;

    public Planilha(String nome, int numeroCelulas) {
        this.nome = nome;
        this.numeroCelulas = numeroCelulas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCelulas() {
        return numeroCelulas;
    }

    @Override
    public void gerar(Visitor visitor) {
        visitor.visitarPlanilha(this);
    }
}
