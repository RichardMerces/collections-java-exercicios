
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
    
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;

        if(!itemList.isEmpty()) {
            for(Item i: itemList) {
                double valorItem = i.getPreco() * i.getQuant();
                valorTotal += valorItem;
            }

            return valorTotal;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //adicionando Itens no carrinho
        carrinhoDeCompras.adicionarItem("Fogão", 1500d, 1);
        carrinhoDeCompras.adicionarItem("Geladeira", 2400d, 1);
        carrinhoDeCompras.adicionarItem("Geladeira", 2400d, 1);
        carrinhoDeCompras.adicionarItem("Micro-ondas", 500d, 2);
        carrinhoDeCompras.adicionarItem("Maquina de Lavar", 1200d, 1);
        carrinhoDeCompras.adicionarItem("Ventilador", 230d, 3);

        //exibindo todos os itens
        carrinhoDeCompras.exibirItens();
        
        //Removendo Item
        carrinhoDeCompras.removerItem("Geladeira");
        
        //exibindo todos os itens
        carrinhoDeCompras.exibirItens();
        
        //Imprimindo valor total
        System.out.println("O valor total da compra é: R$" + carrinhoDeCompras.calcularValorTotal());
    }
}
