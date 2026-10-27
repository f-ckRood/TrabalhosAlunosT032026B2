package models;

public class Time {
    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        vitorias = 0;
        empates = 0;
        derrotas = 0;
        pontos = 0;
    }

    public void registrarVitoria() {
        vitorias++;
        pontos += 3;
    }

    public void registrarEmpate() {
        empates++;
        pontos++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public void exibirEstatisticas() {
        System.out.println("Time: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontos: " + pontos);
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }
}
