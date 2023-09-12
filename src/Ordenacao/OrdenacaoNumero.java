package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {

    private List<Integer> numerosList;

    public OrdenacaoNumero() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero (int numero) {
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return  numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroDescendente = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if(!numerosList.isEmpty()) {
            System.out.println(numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero numeros = new OrdenacaoNumero();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(5);

        numeros.exibirNumeros();

        System.out.println("Os números em ordem crescente são: " + numeros.ordenarAscendente());

        System.out.println("Os números em ordem decrescente são: " + numeros.ordenarDescendente());

    }
}
