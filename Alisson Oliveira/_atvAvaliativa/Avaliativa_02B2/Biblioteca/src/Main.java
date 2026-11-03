import models.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   static Scanner scan = new Scanner(System.in);
   static List<Livro> livros = new ArrayList<Livro>();

   public static void main(String[] args) {
      livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
      livros.add(new Livro("O Alquimista", "Paulo Coelho", 1988));
      mostrarMenu();
   }

   public static void mostrarMenu() {
      int escolhaUsuario;
      do {
         System.out.println("\n--------------- | Sistema Biblioteca | ---------------");
         System.out.println("1 - Cadastrar livro");
         System.out.println("2 - Listar livros");
         System.out.println("3 - Alterar livro");
         System.out.println("4 - Remover livro");
         System.out.println("5 - Emprestar livro");
         System.out.println("6 - Devolver livro");
         System.out.println("0 - Sair!");
         System.out.print("Escolha: ");
         escolhaUsuario = scan.nextInt();
         scan.nextLine();
         validarEscolha(escolhaUsuario);
      } while (escolhaUsuario != 0);
   }

   public static void validarEscolha(int escolhaUsuario) { 
      switch (escolhaUsuario) {
         case 1:
         cadastrarLivro();
         break;
        case 2:
         listarLivros();
         break;
        case 3:
         alterarLivro();
         break;
        case 4:
         removerLivro();
         break;
        case 5:
         emprestarLivro();
         break;
        case 6:
         devolverLivro();
         break;
        case 0:
         System.out.println("Obrigado por utilizar o sistema!");
         break;
        default:
         System.out.println("Digite uma opção válida!");
      }
   }

   public static void cadastrarLivro() {
      Livro livro = new Livro();
      System.out.print("Título: ");
      livro.setTitulo(scan.nextLine());
      if (livro.getTitulo().isBlank()) {
         System.out.println("O título não pode ser vazio!");
         return;
      }
      for (Livro livroFor : livros) {
         if (livroFor.getTitulo().equalsIgnoreCase(livro.getTitulo())) {
            System.out.println("Livro já cadastrado!");
            return;
         }
      }
      System.out.print("Autor: ");
      livro.setAutor(scan.nextLine());
      System.out.print("Ano de publicação: ");
      livro.setAno(scan.nextInt());
      scan.nextLine();
      if (livro.getAno() <= 0) {
         System.out.println("O ano deve ser maior que zero!");
         return;
      }
      livros.add(livro);
      System.out.println("Livro cadastrado com sucesso!");
   }

   public static void listarLivros() {
      System.out.println("\n--------------- Lista de livros ---------------");
      if (livros.isEmpty()) {
         System.out.println("Nenhum livro cadastrado.");
         return;
      }
      for (int i = 0; i < livros.size(); i++) {
         Livro livro = livros.get(i);
         String status;
         if (livro.isDisponivel()) {
            status = "Disponível";
         } else {
            status = "Emprestado";
         }
         System.out.printf("%d - %s, %s (%d) - %s%n", i + 1, livro.getTitulo(), livro.getAutor(), livro.getAno(), status);
      }
   }

   public static Livro selecionarLivro(String acao) {
      listarLivros();
      if (livros.isEmpty()) {
        return null;
      }
      System.out.print("Número do livro que deseja " + acao + ": ");
      int escolha = scan.nextInt() - 1;
      scan.nextLine();
      if (escolha < 0 || escolha >= livros.size()) {
        System.out.println("Selecione um número válido!");
        return null;
      }
      return livros.get(escolha);
   }

   public static void alterarLivro() {
      Livro livro = selecionarLivro("alterar");
      if (livro == null) {
         return;
      }

      int escolha;
      do {
         System.out.println("\nO que deseja alterar em \"" + livro.getTitulo() + "\"?");
         System.out.println("1 - Título");
         System.out.println("2 - Autor");
         System.out.println("3 - Ano");
         System.out.println("0 - Voltar");
         escolha = scan.nextInt();
         scan.nextLine();

         if (escolha == 1) {
            System.out.print("Novo título: ");
            livro.setTitulo(scan.nextLine());
            System.out.println("Título alterado com sucesso!");
         } else if (escolha == 2) {
            System.out.print("Novo autor: ");
            livro.setAutor(scan.nextLine());
            System.out.println("Autor alterado com sucesso!");
         } else if (escolha == 3) {
            System.out.print("Novo ano: ");
            int ano = scan.nextInt();
            scan.nextLine();
            if (ano <= 0) {
               System.out.println("O ano deve ser maior que zero!");
            } else {
               livro.setAno(ano);
               System.out.println("Ano alterado com sucesso!");
            }
         }
      } while (escolha != 0);
   }

   public static void removerLivro() {
      Livro livro = selecionarLivro("remover");
      if (livro == null) {
         return;
      }

      if (!livro.isDisponivel()) {
         System.out.println("Não é possível remover um livro emprestado!");
         return;
      }

      System.out.println("Confirma a remoção de \"" + livro.getTitulo() + "\"? 1 - Sim | 2 - Não");
      int confirmacao = scan.nextInt();
      scan.nextLine();
      if (confirmacao == 1) {
         livros.remove(livro);
         System.out.println("Livro removido com sucesso!");
      } else {
         System.out.println("Remoção cancelada.");
      }
   }

   public static void emprestarLivro() {
      Livro livro = selecionarLivro("emprestar");
      if (livro == null) {
         return;
      }
      if (!livro.isDisponivel()) {
         System.out.println("Este livro já está emprestado!");
         return;
      }
      livro.setDisponivel(false);
      System.out.println("\"" + livro.getTitulo() + "\" emprestado com sucesso!");
   }

   public static void devolverLivro() {
      Livro livro = selecionarLivro("Devolver.");
      if (livro == null) {
         return;
      }
      if (livro.isDisponivel()) {
         System.out.println("Este livro não está Emprestado!");
         return;
      }
      livro.setDisponivel(true);
      System.out.println("\"" + livro.getTitulo() + "\" Devolvido com Sucesso...");
   }
}
