public class ProdutoEletronico extends Produto{
    private int garantia;

    public ProdutoEletronico(){

    }

    public ProdutoEletronico(String nome, double valor, String codigo, int qtd, int garantia){
        setNome(nome);
        setValor(valor);
        setCodigo(codigo);
        setQtd(qtd);
        this.garantia=garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    @Override
    public String toString(){
        return (super.toString()+ ", " + garantia);
    }
    }


