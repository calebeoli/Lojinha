import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produtos> produtos;

    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    public void adicionar(Produtos p){
        produtos.add(p);
        System.out.println("Produto " + p.getNome() + " adicionado ao carrinho.");
    }

    public void Remover(String nome){
        int codigo = -1;
        for (int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getNome().equalsIgnoreCase(nome)){
                codigo = i;
                produtos.remove(codigo);
                break;
            }
        }

        if (codigo == -1){
            System.out.println("Produto " + nome + " nao encontrado para remocao.");
        } else {
            System.out.println("O produto " + nome + " foi removido do carrinho.");
        }
    }

    public ArrayList<Produtos> getLista(){
        return produtos;
    }
}