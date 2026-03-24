public class Cliente {
    private int idCliente;
    private String nome;
    private String email;

    public Cliente(int id, String nome, String email) {
        this.idCliente = id;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdCliente() {
        return idCliente;
    }
}