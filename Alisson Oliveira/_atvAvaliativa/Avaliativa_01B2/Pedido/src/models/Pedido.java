package models;

public class Pedido {
   private String nomeCliente;
   private int quantidadeLanches;
   private double precoLanche;
   private double taxaEntrega;
   private String status;

   public Pedido(String nomeCliente) {
      this.nomeCliente = nomeCliente;
      this.quantidadeLanches = 0;
      this.precoLanche = 18.00;
      this.taxaEntrega = 7.00;
      this.status = "ABERTO";
   }
   public void adicionarLanches(int quantidade) {
      if (status.equals("FINALIZADO! ")) {
         System.out.println("Operação não permitida! O pedido já foi finalizado... ");
      } else if (quantidade <= 0) {
         System.out.println("Quantidade inválida! Informe um valor positivo... ");
      } else {
         quantidadeLanches += quantidade;
         System.out.println(quantidade +" Lanche adicionado! ");
      }
   }
   public double calcularTotal() {
      double valorLanches = quantidadeLanches * precoLanche;
      if (quantidadeLanches >= 3) {
         valorLanches = valorLanches * 0.90;
      }
      return valorLanches + taxaEntrega;
   }
   public void finalizarPedido() {
      if (status.equals("FINALIZADO. ")) {
         System.out.println("O pedido já está finalizado! ");
      } else if (quantidadeLanches == 0) {
         System.out.println("Não é possível finalizar um pedido sem lanches... ");
      } else {
         status = "FINALIZADO!!! ";
         System.out.println("Pedido finalizado. ");
      }
   }
   public void exibirPedido() {
      System.out.println("Cliente: "+ nomeCliente);
      System.out.println("Lanches: "+ quantidadeLanches);
      System.out.println("Status: "+ status);
      System.out.printf("Total: R$ %.2f \n", calcularTotal());
   }
}