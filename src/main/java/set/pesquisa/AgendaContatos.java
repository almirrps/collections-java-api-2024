package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();

        for (Contato con : contatoSet) {
            if (con.getNome().startsWith(nome)) {
                contatoPorNome.add(con);
            }
        }

        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato con : contatoSet) {
            if (con.getNome().equalsIgnoreCase(nome)) {
                con.setNumero(novoNumero);
                contatoAtualizado = con;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("Adicionando contatos");
        agendaContatos.adicionarContato("Almir", 123456);
        agendaContatos.adicionarContato("Almir", 0);
        agendaContatos.adicionarContato("Almir Santos", 1111111);
        agendaContatos.adicionarContato("Almir DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println("");
        System.out.println("Pesquisando por nomes que comecam por Almir");
        System.out.println(agendaContatos.pesquisarPorNome("Almir"));

        System.out.println("");
        System.out.println("Atualizando numero de Maria Silva");
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        System.out.println("");
        System.out.println("Exibindo contatos atualizados");
        agendaContatos.exibirContatos();
    }

}
