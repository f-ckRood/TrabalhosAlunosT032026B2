package models;

public class Estacionamento {
   private String placa;
   private String modelo;
   private int minutosEstacionado;
   private double valorPago;
   private String msgErro;

   public Estacionamento(String placa, String modelo) {
      setPlaca(placa);
      setModelo(modelo);
      this.minutosEstacionado = 0;
      this.valorPago = 0;
   }

   public void setPlaca(String placa) {
      if (placa != null && !placa.isBlank()) {
         this.placa = placa;
      }
   }

   public String getPlaca() {
      return placa;
   }

   public void setModelo(String modelo) {
      if (modelo != null && !modelo.isBlank()) {
         this.modelo = modelo;
      }
   }

   public String setModelo() {
      return modelo;
   }
   
   public int getMinutosEstacionado() {
      return minutosEstacionado;
   }

   public void adicionarTempo(int minutos) {
      if (minutos < 0) {
         msgErro = "Erro! O tempo nao pode ser negativo. ";
         return;
      } 
      this.minutosEstacionado += minutos;
   }

   public double calcularValor() {
      double valor;
      if (minutosEstacionado == 0) {
         valor = 0.00;
      } else if (minutosEstacionado <= 30) {
         valor = 5.00;
      } else {
         int minutosExtras = minutosEstacionado - 30;
         valor = 5.00 + (minutosExtras * 0.10);
      }
      if (valor > 30.00) {
         valor = 30.00;
      }
      this.valorPago = valor;
      return valor;
   }

   public void exibirResumo() {
         System.out.println("\nResumo do Estacionamento ");
         System.out.println("Placa: "+placa);
         System.out.println("Modelo: "+modelo);
         if (msgErro != null) {
            System.out.printf(msgErro);
         } else {
            System.out.println("Tempo Estacionado: "+minutosEstacionado+" min");
            System.out.printf("Valor Pago: R$ %.2f \n", valorPago);
         } 
         System.out.printf("\n");
   }
}