import java.util.Date;

public class Venda {
    private int idPedido;
    private int fkCliente;
    private Cliente cliente;
    private Carrinho carrinho;
    private Date dataPedido;
    private double valorTotal;

    public Venda(int idPedido, Cliente cliente, Carrinho carrinho) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fkCliente = cliente.getIdCliente();
        this.carrinho = carrinho;
        this.dataPedido = new Date();
    }

    public void processarPedido() {
        this.valorTotal = 0;
        for (Produtos p : carrinho.getLista()) {
            this.valorTotal += p.getPreco();
        }

        System.out.println("ID Pedido: " + idPedido + " | FK_Cliente: " + fkCliente);
        System.out.println("Processando pedido de: " + cliente.getNome());

        SistemaPagamento pagamento = SistemaPagamento.getInstancia();
        boolean sucesso = pagamento.processar(this.valorTotal);

        if (sucesso) {
            System.out.println("Pagamento Confirmado! Total: R$ " + valorTotal);
        }
    }
}