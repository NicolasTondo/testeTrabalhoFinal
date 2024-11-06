package App;
import java.util.Scanner;
import Entities.*;
import Enum.Situacao;

public class App {
    Scanner scanner = new Scanner(System.in);
    private Gerenciador gerenciador;

    public App() {
        this.gerenciador = new Gerenciador();
    }

    // menu para o usuario 
    public void iniciar() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("\n1. Adicionar deposito");
            System.out.println("2. Adicionar cliente");
            System.out.println("3. Adicionar item");
            System.out.println("4. Consultar item armazenado");
            System.out.println("5. Alterar situação de um item");
            System.out.println("6. Carregar dados do item");
            System.out.println("7. Salvar dados");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            // switch para chamar os metodos 
            switch (opcao) {
                case 1 -> cadastrarDeposito();
                case 2 -> cadastrarCliente();
                case 3 -> cadastrarItem();
                case 4 -> gerenciador.consultarItensArmazenados();
                case 5 -> alterarSituacaoItem();
                case 6 -> carregarDados();
                case 7 -> gerenciador.salvarDados();
                case 0 -> System.out.println("Saindo");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }


    private void cadastrarDeposito() {
        try {
            System.out.print("Digite o código do depósito: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Digite o nome do depósito: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a cidade do depósito: ");
            String cidade = scanner.nextLine();
            System.out.print("Digite o endereço do depósito: ");
            String endereco = scanner.nextLine();
            System.out.print("Digite a capacidade máxima: ");
            double capacidadeMaxima = scanner.nextDouble();
            Deposito deposito = new Deposito(codigo, nome, cidade, endereco, capacidadeMaxima);
            gerenciador.cadastrarDeposito(deposito);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar depósito: " + e.getMessage());
            scanner.nextLine();  
        }
    }

    private void cadastrarCliente() {
        try {
            System.out.print("Digite o código do cliente: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();
            Cliente cliente = new Cliente(codigo, nome, telefone);
            gerenciador.cadastrarCliente(cliente);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
            scanner.nextLine();  
        }
    }

    private void cadastrarItem() {
        try {
            System.out.print("Digite o código do item: ");
            String codigo = scanner.nextLine();
            System.out.print("Digite a descrição do item: ");
            String descricao = scanner.nextLine();
            System.out.print("Digite o volume do item: ");
            double volume = scanner.nextDouble();
            System.out.print("Digite o valor declarado do item: ");
            double valorDeclarado = scanner.nextDouble();
            System.out.print("Digite a situação (PENDENTE, ARMAZENADO, CANCELADO, RETIRADO): ");
            Situacao situacao = Situacao.valueOf(scanner.next().toUpperCase());
            // fazer diferente 
            Categoria categoria = new Duravel("Setor", "Metal");
            Cliente cliente = gerenciador.getClientes().get(0);
            Item item = new Item(codigo, descricao, categoria, cliente, volume, valorDeclarado, situacao);
            gerenciador.cadastrarItem(item);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar item: " + e.getMessage());
            scanner.nextLine(); 
        }
    }

    private void alterarSituacaoItem() {
        try {
            System.out.print("Digite o código do item a alterar: ");
            String codigo = scanner.nextLine();
            System.out.print("Digite a nova situação (PENDENTE, ARMAZENADO, CANCELADO, RETIRADO): ");
            Situacao novaSituacao = Situacao.valueOf(scanner.next().toUpperCase());
            gerenciador.alterarSituacaoItem(codigo, novaSituacao);
        } catch (Exception e) {
            System.out.println("Erro ao alterar situação: " + e.getMessage());
            scanner.nextLine(); 
        }
    }

    private void carregarDados() {
    }
}
