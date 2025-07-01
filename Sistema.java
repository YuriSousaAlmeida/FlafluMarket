import java.util.Scanner;
public class Sistema {
    public void cadastrarProdutoEletronico(Produto[] produto){
        Scanner sc = new Scanner(System.in);
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();


        }
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
        for(int i=0;i<10;i++){
        if(produto[i]==null){
            produto[i]=
            break;
        }
    }

    public void cadastrarProdutoAlimenticio(){

    }

 //   public String listarProdutos(){

 //   }

    public void realizarVenda(){

    }

 //   public String listarVendas(){

 //   }

    public void pesquisarProduto(){

    }
}
