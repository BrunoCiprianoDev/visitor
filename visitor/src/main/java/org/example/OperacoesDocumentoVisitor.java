package org.example;

public class OperacoesDocumentoVisitor implements Visitor {

    @Override
    public void visitarRelatorio(Relatorio relatorio) {
        System.out.println("Convertendo Relatório \"" + relatorio.getTitulo() + "\" para PDF.");
        System.out.println("Número de Páginas: " + relatorio.getNumeroPaginas());
    }

    @Override
    public void visitarPlanilha(Planilha planilha) {
        System.out.println("Convertendo Planilha \"" + planilha.getNome() + "\" para PDF.");
        System.out.println("Número de Células: " + planilha.getNumeroCelulas());
    }

    @Override
    public void visitarApresentacao(Apresentacao apresentacao) {
        System.out.println("Convertendo Apresentação \"" + apresentacao.getTitulo() + "\" para PDF.");
        System.out.println("Número de Slides: " + apresentacao.getNumeroSlides());
    }
}