import java.util.Random;
import java.util.Scanner;

public class atvs {

   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
      // exUm();
      // exDois();
      // exTres();
      exQuatro();
      scan.close();
   }

   public static void exUm() {
      Random random = new Random();
      int numberRandom = random.nextInt(11);
      boolean green = false;

      while (!green) {
         System.out.println("Number? ");
         int number = scan.nextInt();
         scan.nextLine();

         if (number < numberRandom) {
            System.out.println("Mais Alto");
         } else if (number > numberRandom) {
            System.out.println("Mais Baixo");
         } else {
            System.out.println("GOL!");
            green = true;
         }
      }
   }

   public static void exDois() {
      System.out.println("Number? ");
      int number = scan.nextInt();
      scan.nextLine();
      int soma = 0;
      while (number != 0 ) {
         int dig = number % 10;
         soma += dig;
         number = number / 10;
      }
      System.out.println("Resultado: " +soma);
   }

   public static void exTres() {
      System.out.println("First Number? ");
      int numberF = scan.nextInt();
      scan.nextLine();
      System.out.println("Second Number? ");
      int numberS = scan.nextInt();
      scan.nextLine();
      int soma = 0;
      for (int ind = numberF; ind <= numberS; ind++) {
         if (ind % 2 == 1) {
            soma += ind;
         }
      }
      System.out.println("Soma dos valores Impares: " +soma );
   }

   public static void exQuatro() {
      System.out.println("Base? ");
      int base = scan.nextInt();
      scan.nextLine();
      System.out.println("Limit? ");
      int limit = scan.nextInt();
      scan.nextLine();
      for (int ind = base; ind <= limit; ind++) {
         if (ind % base == 0) {
         System.out.printf("Number %d é div por %d \n", ind, base);
         }
      }
   }

}