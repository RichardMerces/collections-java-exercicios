package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    // atributos
    private Set<String> conjuntoPalavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        if (!conjuntoPalavrasUnicasSet.isEmpty()) {
            for (String p : conjuntoPalavrasUnicasSet) {
                if (p.equals(palavra)) {
                    palavraParaRemover = p;
                    break;
                }
            }
            conjuntoPalavrasUnicasSet.remove(palavraParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!conjuntoPalavrasUnicasSet.isEmpty()) {
            System.out.println(conjuntoPalavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("C#");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("PHP");

        // Exibindo as linguagens únicas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoPalavrasUnicas.removerPalavra("Python");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoPalavrasUnicas.removerPalavra("C++");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
