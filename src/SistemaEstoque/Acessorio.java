package SistemaEstoque;

import java.util.Scanner;

public class Acessorio extends Peca {

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        int quantidadeVendida = 0;

        try {
            System.out.print("Digite a quantidade vendida de " + getDescricao() + ": ");
            quantidadeVendida = scanner.nextInt();

            if (quantidadeVendida <= 0) {
                System.out.println("Quantidade inválida. A venda não foi realizada.");
                return;
            }

            if (quantidadeVendida > getQuantidade()) {
                System.out.println("Estoque insuficiente. Disponível: " + getQuantidade());
                return;
            }

            setQuantidade(getQuantidade() - quantidadeVendida);
            System.out.println("Venda realizada. Estoque atual de " + getDescricao() + ": " + getQuantidade());

        } catch (Exception e) {
            System.out.println("Entrada inválida. A venda não foi realizada.");
            scanner.nextLine();
        }
    }
}
