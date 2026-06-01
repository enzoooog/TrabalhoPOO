package SistemaEstoque;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         Peca [] estoque = new Peca[5];

         estoque[0] = new RoupaPMG("Camisa",5, 5, 5, 2, 10);
         estoque[1] = new RoupaTamanhoUnico("Saia", 8, 3, 12);
         estoque[2] = new Acessorio("Cinto", 10, 2, 12);
         estoque[3] = new Acessorio("Pulseira",25, 5, 30);
         estoque[4] = new RoupaTamanhoUnico("Saida de praia", 8, 2, 10);

         int opcao = -1;

         while (opcao != 5){
             try{
                 System.out.println("\nMenu");

                 for (int i = 0; i < estoque.length; i++) {
                     System.out.println(i + "-" + estoque[i].getDescricao() );
                 }
                 System.out.println("5 - Sair do Sistema");
                 System.out.println("Escolha uma opção");

                 opcao = sc.nextInt();

                 if (opcao >= 0 && opcao < estoque.length){
                     estoque[opcao].venda();
                     estoque[opcao].reposicaoEstoque();

                     System.out.println("\n Estoque após venda: ");
                     System.out.println(estoque[opcao]);
                 }else if (opcao !=5){
                     System.out.println("Opção invalida.");
                 }

             } catch (Exception e) {
                 System.out.println("Entrada invalida.");
                 sc.nextLine();
             }
         }
        System.out.println("\n Estoque final: ");

        for (int i = 0; i < estoque.length; i++) {
            System.out.println(i + " - " + estoque[i]);
        }
        sc.close();
    }
}
