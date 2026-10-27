import models.Pedido;

public class Main {
   public static void main(String[] args) {
      Pedido pedido = new Pedido("Mathew");

      pedido.adicionarLanches(2);
      pedido.adicionarLanches(1);

      System.out.printf("Total calculado: R$ %.2f \n", pedido.calcularTotal());
      pedido.finalizarPedido();

      System.out.println("\nTentando adicionar mais um lanche... ");
      pedido.adicionarLanches(1);

      System.out.println();
      pedido.exibirPedido();
   }
}