package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

  private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()) {
           palavraPesquisada = dicionarioMap.get(palavra);
        }
        return palavraPesquisada;
    }



    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Luta", "Ato de lutar.");
        dicionario.adicionarPalavra("Poder", "Possuir força física ou moral.");
        dicionario.adicionarPalavra("Popular", "relativo ou pertencente ao povo.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Poder");

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Poder", "Possuir força física ou moral." );

        dicionario.exibirPalavras();

        System.out.println("Definição de 'popular':  " + dicionario.pesquisarPorPalavra("Popular"));

    }

}

