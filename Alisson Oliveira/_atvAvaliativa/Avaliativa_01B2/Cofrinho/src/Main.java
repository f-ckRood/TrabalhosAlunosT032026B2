import models.Cofrinho;

public class Main {
   public static void main(String[] args) {
      Cofrinho cofrinho = new Cofrinho("Lucca", 500.00);

      cofrinho.depositar(200.00);
      cofrinho.depositar(150.00);
      cofrinho.depositar(-20.00);

      cofrinho.retirar(1000.00);

      System.out.println();
      cofrinho.exibirSaldo();
      cofrinho.verificarMeta();
   }
}