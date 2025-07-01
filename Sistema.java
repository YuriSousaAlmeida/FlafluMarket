import java.util.Scanner;
public class Sistema {
    public void cadastrarProdutoEletronico(Produto[] produto) {
        Scanner sc = new Scanner(System.in);
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        System.out.println("digite o nome do produto:");
        produtoEletronico.setNome(sc.nextLine());
        System.out.println("digite o valor:");
        produtoEletronico.setValor(sc.nextDouble());
        sc.nextLine();
        System.out.println("digite o código:");
        produtoEletronico.setCodigo(sc.nextLine());
        System.out.println("digite o tempo da garantia em meses:");
        produtoEletronico.setGarantia(sc.nextInt());
        sc.nextLine();
        System.out.println("digite a quantidade de produtos para serem cadastrados:");
        produtoEletronico.setQtd(sc.nextInt());
        sc.nextLine();
        for (int i = 0; i < produto.length; i++) {
            if (produto[i] == null) {
                produto[i] = produtoEletronico;
                break;
            }
        }
    }


    public void cadastrarProdutoAlimenticio(Produto[] produto) {
        Scanner sc = new Scanner(System.in);
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio();
        System.out.println("digite o nome do produto:");
        produtoAlimenticio.setNome(sc.nextLine());
        System.out.println("digite o valor:");
        produtoAlimenticio.setValor(sc.nextDouble());
        sc.nextLine();
        System.out.println("digite o código:");
        produtoAlimenticio.setCodigo(sc.nextLine());
        System.out.println("digite a data de vencimento(dd/MM/aaaa):");
        produtoAlimenticio.setValidade(sc.nextLine());
        System.out.println("digite a quantidade de produtos para serem cadastrados:");
        produtoAlimenticio.setQtd(sc.nextInt());
        sc.nextLine();
        for (int i = 0; i < produto.length; i++) {
            if (produto[i] == null) {
                produto[i] = produtoAlimenticio;
                break;
            }
        }
    }

    public void listarProdutos(Produto[] produto) {
        for (int i = 0; i < produto.length; i++) {
            if (produto[i] != null) {
                System.out.println(produto[i]);
            }
        }
    }

    public Produto pesquisarProduto(String nome, Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getNome().equalsIgnoreCase(nome)) {
                return produtos[i];
            }
        }
        return null;
    }

    public void realizarVenda(String nome, Produto[] produtos, Venda[] vendas) {
        Produto p = pesquisarProduto(nome, produtos);
        if (p == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade vendida:");
        int qtdVendida = sc.nextInt();

        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] == null) {
                vendas[i] = new Venda(p, qtdVendida);
                System.out.println("Venda registrada com sucesso!");
                return;
            }
        }

        System.out.println("Não há espaço para mais vendas.");

    }

    public void listarVendas(Venda[] vendas) {
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] != null) {
                System.out.println(vendas[i]);
            }
        }
    }
}