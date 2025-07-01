public class ProdutoAlimenticio extends Produto{
    private String validade;

    public ProdutoAlimenticio(){

    }

    public ProdutoAlimenticio(String nome, double valor, String codigo ,int qtd, String validade) {
        setNome(nome);
        setValor(valor);
        setCodigo(codigo);
        setQtd(qtd);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    @Override
    public String toString(){
        return (super.toString()+ " ," + validade);
    }
}
