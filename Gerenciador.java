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

    public void cadastrarDeposito(Deposito deposito) {
        depositos.add(deposito);
        Collections.sort(depositos, Comparator.comparing(Deposito::getCodigo));
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        Collections.sort(clientes, Comparator.comparing(Cliente::getCodigo));
    }

    public void cadastrarItem(Item item) {
        for (Item i : itensPendentes) {
            if (i.getCodigo().equals(item.getCodigo())) {
                System.out.println("Erro: O código do item já existe.");
                return;
            }
        }
        itensPendentes.add(item);
    }

    public void consultarItensArmazenados() {
    }

    public void alterarSituacaoItem() {
    }
}
