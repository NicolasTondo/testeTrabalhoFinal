package App;

import Entities.*;
import Enum.Situacao;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    private Gerenciador gerenciador;

    public App() {
        this.gerenciador = new Gerenciador();
    }

    public void iniciar() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("\n1. Adicionar depósito");
            System.out.println("2. Adicionar cliente");
            System.out.println("3. Adicionar item");
            System.out.println("4. Consultar itens armazenados");
            System.out.println("5. Alterar situação de um item");
            System.out.println("6. Carregar dados");
            System.out.println("7. Organizar itens para armazenamento");
            System.out.println("8. Salvar dados");
            System.out.println("9. Carregar dados salvos");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1 -> cadastrarDeposito();
                case 2 -> cadastrarCliente();
                case 3 -> cadastrarItem();
                case 4 -> gerenciador.consultarItensArmazenados();
                case 5 -> alterarSituacaoItem();
                case 6 -> gerenciador.carregarDados();
                case 7 -> gerenciador.organizarItensParaArmazenamento();
                case 8 -> gerenciador.salvarDados();
                case 9 -> gerenciador.carregarDadosSalvos();
                case 0 -> gerenciador.finalizarSistema();
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    private void cadastrarDeposito() {
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
    }

    private void cadastrarCliente() {
        System.out.print("Digite o código do cliente: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        Cliente cliente = new Cliente(codigo, nome, telefone);
        gerenciador.cadastrarCliente(cliente);
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
            System.out.print("Digite a situação (PENDENTE, ARMAZENADO, RETIRADO, CANCELADO): ");
            String situacaoInput = scanner.nextLine(); 
            situacaoInput = scanner.nextLine(); 
            Situacao situacao = Situacao.valueOf(situacaoInput.toUpperCase());
    
            Item item = new Item(codigo, descricao, volume, valorDeclarado, situacao);
            gerenciador.cadastrarItem(item);
    
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar item: " + e.getMessage());
            scanner.nextLine(); 
        }
    }
    

    private void alterarSituacaoItem() {
        System.out.print("Digite o código do item a alterar: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite a nova situação (PENDENTE, ARMANZENADO, RETIRADO, CANCELADO): ");
        String situacaoInput = scanner.nextLine().toUpperCase();
        Situacao situacao = Situacao.valueOf(situacaoInput);
        gerenciador.alterarSituacaoItem(codigo, situacao);
    }
}
