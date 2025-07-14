package com.desafio.itau;

public class Operacao {
    public enum TipoOperacao { COMPRA, VENDA }

    public int quantidade;
    public double precoUnitario;
    public TipoOperacao tipo;
    public double corretagem;

    public Operacao(int quantidade, double precoUnitario, TipoOperacao tipo, double corretagem) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.tipo = tipo;
        this.corretagem = corretagem;
    }
}
