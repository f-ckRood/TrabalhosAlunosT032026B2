import models.Time;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time("Corinthians");
        Time time2 = new Time("Palmeiras");

        time1.registrarVitoria();
        time1.registrarVitoria();
        time1.registrarEmpate();

        time2.registrarVitoria();
        time2.registrarDerrota();
        time2.registrarEmpate();

        time1.exibirEstatisticas();
        System.out.println();

        time2.exibirEstatisticas();
        System.out.println();

        if (time1.getPontos() > time2.getPontos()) {
            System.out.println(time1.getNome() + " tem mais pontos!");
        } else if (time2.getPontos() > time1.getPontos()) {
            System.out.println(time2.getNome() + " tem mais pontos!");
        } else {
            System.out.println("Houve empate na classificacao!");
        }
    }
}
