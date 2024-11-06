package App;
import java.io.*;
import java.util.*;

import Entities.Cliente;
import Entities.Deposito;
import Entities.Item;
import Enum.Situacao;

// listas
public class Gerenciador {
    private List<Deposito> depositos;
    private List<Cliente> clientes;
    private List<Item> itensPendentes;

    // construtor
    public Gerenciador() {
        this.depositos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.itensPendentes = new ArrayList<>();
    }

    // getCliente para usar as informações na App depois 
    public List<Cliente> getClientes() {
        return clientes;
    }

    // cadastro de um deposito
    // adiona na lista e ordena com sort
    public void cadastrarDeposito(Deposito deposito) {
        depositos.add(deposito);
        Collections.sort(depositos, Comparator.comparing(Deposito::getCodigo));
    }

    // cadastro de um cliente
    // adiona na lista e ordena com sort
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        Collections.sort(clientes, Comparator.comparing(Cliente::getCodigo));
    }

    // cadastro de um intem
    // verifica se o código já existe e adiciona na lista se não existir
    public void cadastrarItem(Item item) {
        for (Item i : itensPendentes) {
            if (i.getCodigo().equals(item.getCodigo())) {
                System.out.println("Erro: O código do item já existe.");
                return;
            }
        }
        itensPendentes.add(item);
    }

    // consultar os dados dos depositos
    public void consultarItensArmazenados() {
        if (itensPendentes.isEmpty()) {
            System.out.println("Nenhum item armazenado.");
        } else {
            System.out.println("Itens armazenados:");
            for (Item item : itensPendentes) {
                System.out.println(item);
            }
        }
    }

    public void alterarSituacaoItem(String codigo, Situacao novaSituacao) {
        for (Item item : itensPendentes) {
            if (item.getCodigo().equals(codigo)) {
                item.setSituacao(novaSituacao);
                System.out.println("Situação do item alterada com sucesso.");
                return;
            }
        }
        System.out.println("Item não encontrado.");
    }

    // salvar as informações que entraram por teclado do usuario em um arquivo chamado "dados.txt"
    // usei o FileOutputStream para especificar o padrão "UTF-8" para não ter erro nos caracteres
    public void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dados.txt"), "UTF-8"))) {
            for (Deposito deposito : depositos) {
                writer.write(deposito.toString());
                writer.newLine();
            }
            for (Cliente cliente : clientes) {
                writer.write(cliente.toString());
                writer.newLine();
            }
            for (Item item : itensPendentes) {
                writer.write(item.toString());
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso!");
        // fiz o tratamento só para IOException, mas podemos colocar mais, se for o caso
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
}
