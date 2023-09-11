package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {

    private List<Integer> numeros;

    public SomaNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumero somaNumero = new SomaNumero();

        somaNumero.adicionarNumero(5);
        somaNumero.adicionarNumero(7);
        somaNumero.adicionarNumero(9);
        somaNumero.adicionarNumero(10);
        somaNumero.adicionarNumero(-1);

        System.out.println("Os números da lista são: ");
        somaNumero.exibirNumeros();

        System.out.println("A soma dos números da lista é: " + somaNumero.calcularSoma());

        System.out.println("O maior número da lista é: " + somaNumero.encontrarMaiorNumero());

        System.out.println("O menor número da lista é: " + somaNumero.encontrarMenorNumero());
    }
}
