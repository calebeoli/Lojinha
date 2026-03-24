public class Produtos {
    private int idProduto;
    private String nome;
    private String descricao;
    private double preco;

    public Produtos(int id, String nome, String descricao, double preco) {
        this.idProduto = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getIdProduto() {
        return idProduto;
    }
}