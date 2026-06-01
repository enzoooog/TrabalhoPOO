package SistemaEstoque;

public class RoupaTamanhoUnico extends Peca {
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        try {
            if (getQuantidade() > 0) {
                setQuantidade(getQuantidade() - 1);
                System.out.println("Venda realizada. Estoque de " + getDescricao() + ": " + getQuantidade());
            } else {
                System.out.println("Estoque insuficiente para venda.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao processar a venda.");
        }
    }
}
