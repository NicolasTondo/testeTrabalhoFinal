package Entities;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
    private int codigo;
    private String nome;
    private String cidade;
    private String endereco;
    private double capacidadeMaxima;
    private List<Item> itensArmazenados; 

    public Deposito(int codigo, String nome, String cidade, String endereco, double capacidadeMaxima) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
        this.capacidadeMaxima = capacidadeMaxima;
        this.itensArmazenados = new ArrayList<>();  
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public List<Item> getItensArmazenados() {
        return itensArmazenados;
    }

    // Método para alocar um item no depósito
    public void alocarItem(Item item) {
        // Verifica se o depósito tem capacidade suficiente para o item
        if (getCapacidadeMaxima() >= item.getVolume()) {
            itensArmazenados.add(item);  // Aloca o item no depósito
            System.out.println("Item " + item.getCodigo() + " alocado com sucesso no depósito " + this.nome);
        } else {
            System.out.println("Erro: Capacidade insuficiente no depósito para o item " + item.getCodigo());
        }
    }

    // Método para consultar os itens armazenados no depósito
    public void consultarItensArmazenados() {
        if (itensArmazenados.isEmpty()) {
            System.out.println("Não há itens armazenados neste depósito.");
        } else {
            for (Item item : itensArmazenados) {
                System.out.println(item); // Aqui deve imprimir a representação do item (toString)
            }
        }
    }

    @Override
    public String toString() {
        return 
        "DEPOSITO" +
            "\nCodigo: " + codigo +
            "\nNome: " + nome +
            "\nCidade: " + cidade +
            "\nEndereco: " + endereco +
            "\nCapacidade Maxima: " + capacidadeMaxima;
    }
}
