
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        int opcao;

        do {
        	System.out.println("\n===== MENU =====");
        	System.out.println("Tarefas pendentes: " + gerenciador.contarPendentes() +
        	                   " | Concluídas: " + gerenciador.contarConcluidas());
        	System.out.println("1 - Adicionar tarefa");
        	System.out.println("2 - Listar tarefas");
        	System.out.println("3 - Concluir tarefa");
        	System.out.println("4 - Remover tarefa");
        	System.out.println("0 - Sair");
        	System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;

                case 2:
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.print("Índice da tarefa: ");
                    int i = scanner.nextInt();
                    gerenciador.concluirTarefa(i);
                    break;

                case 4:
                    System.out.print("Índice da tarefa: ");
                    int r = scanner.nextInt();
                    gerenciador.removerTarefa(r);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
