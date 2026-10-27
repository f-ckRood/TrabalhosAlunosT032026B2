package models;

public class MaquinaRefrigerante {
    private int quantidadeEstoque;
    private double preco;
    private double dinheiroArrecadado;

    public MaquinaRefrigerante(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = 4.50;
        this.dinheiroArrecadado = 0;
    }

    public void comprar(int quantidade, double valorPago) {
        double total = quantidade * preco;

        if (quantidadeEstoque < quantidade) {
            System.out.println("Estoque insuficiente!");
        } else if (valorPago < total) {
            System.out.println("Dinheiro insuficiente!");
        } else {
            quantidadeEstoque -= quantidade;
            dinheiroArrecadado += total;
            System.out.println("Compra realizada!");
            System.out.println("Troco: R$ " + (valorPago - total));
        }
    }

    public void reporEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void exibirEstado() {
        System.out.println("Estoque: " + quantidadeEstoque);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Dinheiro arrecadado: R$ " + dinheiroArrecadado);
    }
}
