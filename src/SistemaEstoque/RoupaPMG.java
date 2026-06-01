package SistemaEstoque;

import java.util.Scanner;
public class RoupaPMG extends Peca {

    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, 0, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }

    @Override
    public void venda() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho vendido P, M ou G: ");
        String tamanho = teclado.nextLine();

        if (tamanho.equalsIgnoreCase("P")) {
            if (quantidadeP > 0) {
                quantidadeP--;
            } else {
                System.out.println("Estoque P insuficiente.");
            }
        } else if (tamanho.equalsIgnoreCase("M")) {
            if (quantidadeM > 0) {
                quantidadeM--;
            } else {
                System.out.println("Estoque M insuficiente.");
            }
        } else if (tamanho.equalsIgnoreCase("G")) {
            if (quantidadeG > 0) {
                quantidadeG--;
            } else {
                System.out.println("Estoque G insuficiente.");
            }
        } else {
            System.out.println("Tamanho invalido.");
        }
    }

    @Override
    public void reposicaoEstoque() {
        if (quantidadeP < getEstoqueMinimo()) {
            quantidadeP = getEstoqueMaximo();
        }

        if (quantidadeM < getEstoqueMinimo()) {
            quantidadeM = getEstoqueMaximo();
        }

        if (quantidadeG < getEstoqueMinimo()) {
            quantidadeG = getEstoqueMaximo();
        }
    }

    @Override
    public String toString() {
        return getDescricao() + " - P: " + quantidadeP + ", M: " + quantidadeM + ", G: " + quantidadeG;
    }
}