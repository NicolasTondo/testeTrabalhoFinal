package Entities;

//import java.util.Random;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;

    public Cliente(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    @Override
    public String toString() {
        return 
        "\nINFORMAÇÕES DO CLIENTE" +
            "\nCodigo: " + codigo +
            "\nNome: " + nome +
            "\nTelefone: " + telefone;
    }
}

