package main.java.list.operacoesbasicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tar : tarefaList) {
            if (tar.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tar);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de elementos: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("");
        System.out.println("Adicionando quatro tarefas...");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("Número total de elementos: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefas();

        System.out.println("");
        System.out.println("Removendo tarefas com descricao 1...");
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Número total de elementos: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefas();
    }
}
