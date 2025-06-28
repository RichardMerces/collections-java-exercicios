import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atrinbutos

    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
       int soma = 0;

        if(!numerosList.isEmpty()) {
            for (int n : numerosList) {
                soma += n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
       int maior = 0;

        if(!numerosList.isEmpty()) {
            for (int n : numerosList) {
                if(n > maior) {
                    maior = n;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = 0;

        if(!numerosList.isEmpty()) {
            menor = numerosList.getFirst();
            for (int n : numerosList) {
                if(n < menor) {
                    menor = n;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }


    public static void main(String[] args) {
        // Criando uma Lista de Números
        SomaNumeros numeros = new SomaNumeros();

        // Adicionando números
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(220);
        numeros.adicionarNumero(49);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(118);
        numeros.adicionarNumero(28);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(999);
        numeros.adicionarNumero(7);

        // Exibindo números
        numeros.exibirNumeros();

        // somando
        System.out.println("A soma dos números é igual a: " + numeros.calcularSoma());
        
        // maior número
        System.out.println("O maior número é: " + numeros.encontrarMaiorNumero());

        // menor número
        System.out.println("O menor número é: " + numeros.encontrarMenorNumero());
    }
}
