package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacoesDocumentoVisitorTest {

    @Test
    void deveExibirRelatorio() {
        Relatorio relatorio = new Relatorio("Relatório de Vendas", 10);

        OperacoesDocumentoVisitor visitor = new OperacoesDocumentoVisitor();
        visitor.visitarRelatorio(relatorio);
        assertEquals("Relatório de Vendas", relatorio.getTitulo());
        assertEquals(10, relatorio.getNumeroPaginas());
    }

    @Test
    void deveExibirPlanilha() {
        Planilha planilha = new Planilha("Planilha Financeira", 100);

        OperacoesDocumentoVisitor visitor = new OperacoesDocumentoVisitor();
        visitor.visitarPlanilha(planilha);
        assertEquals("Planilha Financeira", planilha.getNome());
        assertEquals(100, planilha.getNumeroCelulas());
    }

    @Test
    void deveExibirApresentacao() {
        Apresentacao apresentacao = new Apresentacao("Apresentação de Projetos", 20);

        OperacoesDocumentoVisitor visitor = new OperacoesDocumentoVisitor();
        visitor.visitarApresentacao(apresentacao);
        assertEquals("Apresentação de Projetos", apresentacao.getTitulo());
        assertEquals(20, apresentacao.getNumeroSlides());
    }
}