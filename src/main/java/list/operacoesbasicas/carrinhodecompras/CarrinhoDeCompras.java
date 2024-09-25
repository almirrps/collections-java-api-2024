package main.java.list.operacoesbasicas.carrinhodecompras;

public class CarrinhoDeCompras {

    private String nome;
    private Double preco;
    private Integer quantidade;

    public CarrinhoDeCompras(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                '}';
    }
}
