public class SistemaPagamento {
    private static SistemaPagamento instancia;

    private SistemaPagamento() {}

    public static SistemaPagamento getInstancia() {
        if (instancia == null) {
            instancia = new SistemaPagamento();
        }
        return instancia;
    }

    public boolean processar(double valor) {
        System.out.println("Processando pagamento de: " + valor);
        return true;
    }
}