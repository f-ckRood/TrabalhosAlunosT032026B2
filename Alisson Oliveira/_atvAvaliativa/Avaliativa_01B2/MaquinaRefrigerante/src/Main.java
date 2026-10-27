import models.MaquinaRefrigerante;

public class Main {
    public static void main(String[] args) {
        MaquinaRefrigerante maquina = new MaquinaRefrigerante(10);

        maquina.exibirEstado();

        System.out.println("\nPrimeira compra:");
        maquina.comprar(2, 10.00);

        System.out.println("\nSegunda compra:");
        maquina.comprar(3, 5.00);

        System.out.println("\nEstado final:");
        maquina.exibirEstado();
    }
}
