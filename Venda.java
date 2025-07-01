public class Venda {
    private Produto produto;
    private int quantidade;

    public Venda(){

    }

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return produto.getValor() * quantidade;
    }

    @Override
    public String toString() {
        return "Venda: " + produto.getNome() + ", Quantidade: " + quantidade + ", Total: R$ " + getTotal();
    }
    }


