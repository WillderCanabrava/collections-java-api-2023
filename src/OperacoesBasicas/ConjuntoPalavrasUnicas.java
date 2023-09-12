package OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra (String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra (String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não contida no conjunto.");
            }
        } else {
                System.out.println("O conjunto está vazio!");
            }
        }

    public boolean verificarPalavra (String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("casa");
        palavrasUnicas.adicionarPalavra("balão");
        palavrasUnicas.adicionarPalavra("estádio");
        palavrasUnicas.adicionarPalavra("casa");

        System.out.println("A palavra balão está no conjunto? " + palavrasUnicas.verificarPalavra("balão"));

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("casa");

        palavrasUnicas.exibirPalavrasUnicas();
    }

}
