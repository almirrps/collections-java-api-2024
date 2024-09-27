package main.java.set.ordenacao;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto prod1, Produto prod2) {
        return Double.compare(prod1.getPreco(), prod2.getPreco());
    }

}
