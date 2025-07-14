package com.desafio.itau;

import java.util.List;

public class CalculadoraPrecoMedio {
    public static double calcularPrecoMedio(List<Operacao> operacoes) {
        double totalInvestido = 0;
        int quantidadeTotal = 0;

        for (Operacao op : operacoes) {
            if (op.tipo == Operacao.TipoOperacao.COMPRA) {
                totalInvestido += (op.precoUnitario * op.quantidade) + op.corretagem;
                quantidadeTotal += op.quantidade;
            }
        }

        return quantidadeTotal == 0 ? 0 : totalInvestido / quantidadeTotal;
    }
}
