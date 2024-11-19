package Entities;

import Enum.Situacao;

public class Perecivel extends Item {
    private String origem;
    private int tempoMaximoValidade;

    public Perecivel(String origem, int tempoMaximoValidade, String codigo, String descricao, double volume, double valorDeclarado, Situacao situacao) {
        super(codigo, descricao, volume, valorDeclarado, situacao); 
        this.origem = origem;
        this.tempoMaximoValidade = tempoMaximoValidade;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public int getTempoMaximoValidade() {
        return tempoMaximoValidade;
    }

    public void setTempoMaximoValidade(int tempoMaximoValidade) {
        this.tempoMaximoValidade = tempoMaximoValidade;
    }

    public String getDescricao(){
        return "Perecivel";
    }

    @Override
    public String toString() {
        return 
        "\nINFORMAÇÕES DO ITEM PERECÍVEL" + 
            "\nOrigem: " + origem + 
            "\nValidade: " + tempoMaximoValidade + "dias.";
    }
}
