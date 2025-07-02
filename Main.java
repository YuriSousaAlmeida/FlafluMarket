import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();
        Produto[] produtos = new Produto[10];
        Venda[] vendas = new Venda[10];
        int qtdProdutos=0;
        int qtdVendas=0;

        while(true){
            System.out.println("1 - Cadastrar Produto Eletronico");
            System.out.println("2 - Cadastrar Produto Alimentício");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Listar Vendas");
            System.out.println("6 - Pesquisar Produto por Nome");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            sc = new Scanner(System.in);
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    sistema.cadastrarProdutoEletronico(produtos);
                    for(int i=0; i < produtos.length; i++){
                        if (produtos[i]!=null)
                        System.out.println(produtos[i].toString());
                    }
                    break;
                case 2:
                    sistema.cadastrarProdutoAlimenticio(produtos);
                    for (int i=0;i<produtos.length;i++){
                        if (produtos[i]!=null)
                        System.out.println(produtos[i].toString());
                    }
                    break;
                case 3:
                    sistema.listarProdutos(produtos);
                    break;
                case 4:
                    sistema.listarProdutos(produtos);
                    System.out.println("digite um produto para vender");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("digite a quantidade de produtos do tipo para vender");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    sistema.realizarVenda(nome, produtos, vendas); //falta mexer nas quantidades
                    break;
                case 5:
                    sistema.listarVendas(vendas);
                    break;
                case 6:
                    sistema.procurarProduto(produtos);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Número inválido, tente novamente");
            }
        }

    }
}