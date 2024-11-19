package Entities;

import Enum.Situacao;

public class Duravel extends Item {
    private String setor;
    private String materialPrincipal;

    public Duravel(String setor, String materialPrincipal, String codigo, String descricao, double volume, double valorDeclarado, Situacao situacao) {
        super(codigo, descricao, volume, valorDeclarado, situacao);
        this.setor = setor;
        this.materialPrincipal = materialPrincipal;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getMaterialPrincipal() {
        return materialPrincipal;
    }

    public void setMaterialPrincipal(String materialPrincipal) {
        this.materialPrincipal = materialPrincipal;
    }

    public String getCategoria() {
        return "Durável";
    }

    @Override
    public String toString() {
        return 
        "\nINFORMAÇÕES DO ITEM DURÁVEL" + 
            "\nSetor: " + setor + 
            "\nMaterial Principal: " + materialPrincipal;
    }
}
