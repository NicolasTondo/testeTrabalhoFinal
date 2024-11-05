import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gerenciador {
    private List<Deposito> depositos;
    private List<Cliente> clientes;
    private List<Item> itensPendentes;

    public Gerenciador() {
        this.depositos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.itensPendentes = new ArrayList<>();
    }

    // cadastro deposito
    public void cadastrarDeposito(Deposito deposito) {
        depositos.add(deposito);
        Collections.sort(depositos, Comparator.comparing(Deposito::getCodigo));
    }

    // cadastro cliente
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        Collections.sort(clientes, Comparator.comparing(Cliente::getCodigo));
    }

    // cadastro item
    public void cadastrarItem(Item item) {
        for (Item i : itensPendentes) {
            if (i.getCodigo().equals(item.getCodigo())) {
                System.out.println("Erro: O código do item já existe.");
                return;
            }
        }
        itensPendentes.add(item);
    }

    // consultar itens armazenados
    public void consultarItensArmazenados() {
    }

    // alterar situação de um item
    public void alterarSituacaoItem() {
    }

    // carregar dados iniciais de um item
    public void dadosIniciais(){
    }

    // organizar itens para armazenamento 
    public void organizarItens(){
    }

    // salvar dados em um arquivo e mostrar erro 
    // implementar na classe App 
    public void salvarDados(){
    }

}
