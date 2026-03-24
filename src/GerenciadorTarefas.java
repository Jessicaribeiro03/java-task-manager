import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            String status = t.isConcluida() ? "[✔]" : "[ ]";
            System.out.println(i + " - " + status + " " + t.getDescricao());
        }
    }

    public void concluirTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).marcarComoConcluida();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }
    
    
 // Contar tarefas pendentes
    public int contarPendentes() {
        int count = 0;
        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) count++;
        }
        return count;
    }

    // Contar tarefas concluídas
    public int contarConcluidas() {
        int count = 0;
        for (Tarefa t : tarefas) {
            if (t.isConcluida()) count++;
        }
        return count;
    }
}
