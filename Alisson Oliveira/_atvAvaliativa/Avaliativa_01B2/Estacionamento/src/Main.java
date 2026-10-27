import models.Estacionamento;

public class Main {
   public static void main(String[] args) {
      Estacionamento carro1 = new Estacionamento("AAA7A77", "Mercedes");
      carro1.adicionarTempo(500);
      carro1.calcularValor();
      carro1.exibirResumo();

      Estacionamento carro2 = new Estacionamento("XXX9X15", "BMW");
      carro2.adicionarTempo(-15);
      carro2.calcularValor();
      carro2.exibirResumo();

      Estacionamento carro3 = new Estacionamento("YYY9X99", "FIAT");
      carro3.adicionarTempo(15);
      carro3.calcularValor();
      carro3.exibirResumo();

      Estacionamento carro4 = new Estacionamento("BBB9X75", "RAM");
      carro4.adicionarTempo(33);
      carro4.calcularValor();
      carro4.exibirResumo();
   }
}
