package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for(int contagem : palavrasMap.values() ) {
            contagemTotal += contagem;
        }
        return contagemTotal;

    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Arroz", 2);
        contagemPalavras.adicionarPalavra("Feijão", 1);
        contagemPalavras.adicionarPalavra("Carne", 3);
        contagemPalavras.adicionarPalavra("Arroz", 5);

        System.out.println("O total de contagem é: " + contagemPalavras.exibirContagemPalavras());

        contagemPalavras.removerPalavra("Arroz");

        System.out.println("Total de contagem: " + contagemPalavras.exibirContagemPalavras());

        contagemPalavras.adicionarPalavra("Arroz", 8);

        System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());

    }

}