package main.java.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private List<CarrinhoDeCompras> carrinhoList;

    public Item() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        carrinhoList.add(new CarrinhoDeCompras(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<CarrinhoDeCompras> itensParaRemover = new ArrayList<>();

        for (CarrinhoDeCompras item : carrinhoList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }

        carrinhoList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        Double valorTotal = (double) 0;

        for (CarrinhoDeCompras item : carrinhoList) {
            valorTotal += item.getPreco();
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        Item listaItens = new Item();
        System.out.println("Valor total do carrinho: " + listaItens.calcularValorTotal());

        System.out.println("");
        System.out.println("Adicionando quatro itens...");
        listaItens.adicionarItem("Item 1", 12.00, 2);
        listaItens.adicionarItem("Item 2", 10.00, 1);
        listaItens.adicionarItem("Item 1", 4.00, 3);
        listaItens.adicionarItem("Item 3", 2.00, 10);
        listaItens.exibirItens();
        System.out.println("Valor total do carrinho: " + listaItens.calcularValorTotal());

        System.out.println("");
        System.out.println("Removendo itens com nome Item 1...");
        listaItens.removerItem("Item 1");
        listaItens.exibirItens();
        System.out.println("Valor total do carrinho: " + listaItens.calcularValorTotal());
    }
}
