public class MAIN {
    public static void main(String[] args) {
        //1. LOGIN
        Cliente c1 = new Cliente(101, "Joao Silva", "joao@email.com");
        boolean loginSucesso = true;

        if (loginSucesso) {
            System.out.println("Login realizado com sucesso para: " + c1.getNome());
            System.out.println("---------------------------------------");

            // 2. Listar produtos disponíveis
            Produtos p1 = new Produtos(1, "Notebook", "I5 16GB", 3500.0);
            Produtos p2 = new Produtos(2, "Mouse", "Optico", 50.0);

            System.out.println("Produtos disponiveis na loja:");
            System.out.println("ID: " + p1.getIdProduto() + " | " + p1.getNome() + " - R$ " + p1.getPreco());
            System.out.println("ID: " + p2.getIdProduto() + " | " + p2.getNome() + " - R$ " + p2.getPreco());
            System.out.println("---------------------------------------");

            // 3. Adicionar ao carrinho
            Carrinho meuCarrinho = new Carrinho();
            meuCarrinho.adicionar(p1);
            meuCarrinho.adicionar(p2);

            //4. Excluir produto do carrinho conforme UML
            meuCarrinho.Remover("Mouse");

            // 5. Processar via Singleton
            Venda novoPedido = new Venda(5001, c1, meuCarrinho);
            novoPedido.processarPedido();

        } else {
            System.out.println("Falha no login. Encerrando.");
        }
    }
}