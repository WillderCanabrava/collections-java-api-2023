package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Aluno (a) não encontrado (a).");
        }

    }

     public Set<Aluno> exibirAlunosPorNome () {
         Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
         if (!alunoSet.isEmpty()) {
             return alunosPorNome;
         } else {
             throw new RuntimeException("O conjunto está vazio!");
         }
     }

         public Set<Aluno> exibirAlunosPorNotaCrescente () {
             Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
             if (!alunoSet.isEmpty()) {
                 alunosPorNota.addAll(alunoSet);
                 return alunosPorNota;
             } else {
                 throw new RuntimeException("O conjunto está vazio!");
             }

         }

         public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Willder", 15111993L, 9);
        gerenciadorAlunos.adicionarAluno("Hugo", 12031999L, 8);
        gerenciadorAlunos.adicionarAluno("Vladimir", 12031917L, 10.0);

             System.out.println("Os alunos são: " + gerenciadorAlunos.exibirAlunosPorNome());

             gerenciadorAlunos.removerAluno(15111993);

             System.out.println("Os alunos são: " + gerenciadorAlunos.exibirAlunosPorNome());

             gerenciadorAlunos.adicionarAluno("Willder", 15111993L, 9);

             System.out.println("Ordem dos alunos por nota: " + gerenciadorAlunos.exibirAlunosPorNotaCrescente());
    }
}

