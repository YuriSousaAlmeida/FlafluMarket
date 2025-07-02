public abstract class Produto {
    private int qtd;
    private String nome;
    private double valor;
    private String codigo;

    public Produto(){

    }

    public Produto(String nome, double valor, String codigo,int qtd) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString(){
        return ("Produto: " + "Nome: " + getNome() + ", " + "valor: " + getValor()+ ", " + "código: " + getCodigo()+ ", " + "quantidade" + getQtd());
    }
}
