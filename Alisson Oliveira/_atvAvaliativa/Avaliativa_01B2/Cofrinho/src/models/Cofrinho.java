package models;

public class Cofrinho {
   private String dono;
   private double saldo;
   private double metaEconomia;
   
   public Cofrinho(String dono, double metaEconomia) {
      this.dono = dono;
      this.metaEconomia = metaEconomia;
      this.saldo = 0;
   }
   public void depositar(double valor) {
      if (valor <= 0) {
         System.out.println("Erro! Depósito inválido. O valor deve ser positivo. ");
         return;
      }
     saldo += valor;
     System.out.printf("Depósito de R$ %.2f realizado. \n", valor);
   }
   public void retirar(double valor) {
      if (valor <= 0) {
         System.out.println("Erro! Retirada inválida! O valor deve ser positivo. ");
      } else if (valor > saldo) {
         System.out.printf("Erro! Saldo insuficiente! Tentativa de retirar R$ %.2f com saldo de R$ %.2f \n", valor, saldo);
      } else {
         saldo -= valor;
         System.out.printf("Retirada de R$ %.2f realizada! \n", valor);
      }
   }
   public void verificarMeta() {
      if (saldo >= metaEconomia) {
         System.out.println("OKK! Meta de economia atingida! ");
      } else {
         System.out.printf("Meta ainda não atingida! Faltam R$ %.2f \n", metaEconomia - saldo);
      }
   }
   public void exibirSaldo() {
      System.out.println("Dono: "+ dono);
      System.out.printf("Saldo: R$ %.2f \n", saldo);
      System.out.printf("Meta: R$ %.2f \n", metaEconomia);
   }
}