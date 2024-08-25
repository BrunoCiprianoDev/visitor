package org.example;

public interface Visitor {
    void visitarRelatorio(Relatorio relatorio);
    void visitarPlanilha(Planilha planilha);
    void visitarApresentacao(Apresentacao apresentacao);
}
