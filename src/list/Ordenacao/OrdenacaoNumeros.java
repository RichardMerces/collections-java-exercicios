import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAsc = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAsc);
            return numerosAsc;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDesc = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosDesc.sort(Collections.reverseOrder());
            return numerosDesc;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
    if (!numerosList.isEmpty()) {
      System.out.println(this.numerosList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    numeros.adicionarNumero(6);
    numeros.adicionarNumero(14);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(9);
    numeros.adicionarNumero(2);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println(numeros.ordenarAscendente());

    // Exibindo a lista
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem descendente
    System.out.println(numeros.ordenarDescendente());

    // Exibindo a lista
    numeros.exibirNumeros();
  }
}
