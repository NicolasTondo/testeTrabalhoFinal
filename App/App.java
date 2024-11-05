package App;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import java.util.ArrayList;
import java.util.List;

import Entities.Item;

public class App {
    Scanner scanner = new Scanner(System.in);

    private Gerenciador gerenciador;

    public App(){
        this.gerenciador = gerenciador;
    }

    public void iniciar() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar deposito");
            System.out.println("2. Adicionar cliente ");
            System.out.println("3. Adicionar item");
            //captura dos objetos em array
            System.out.println("4. Consultar item armazenado");
            System.out.println("5. Alterar situação de um item");
            System.out.println("6. Carregar dados do item");
            System.out.println("7. Salvar dados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> gerenciador.cadastrarDeposito();
                case 2 -> cadastrarCliente();
                case 3 -> cadastrarItem();
                case 4 -> consultaItensArmazenado();
                case 5 -> alterarSituacaoItem();
                case 6 -> dadosIniciais();
                case 7 -> salvarDados();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 0);*/
    } 
}
