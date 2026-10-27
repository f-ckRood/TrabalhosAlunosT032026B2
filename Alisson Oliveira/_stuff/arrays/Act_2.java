import java.util.Scanner;
// import java.util.Random;
// import java.text.NumberFormat;
// import java.util.Locale;
// import java.util.Arrays;
// import java.util.Collections;

public class Act_2 {
   static Scanner scan = new Scanner(System.in);
   static String[] names = {"Marco", "Luca", "Vito", "Milto", "Harry"};
   static String nameIn;

   public static void main(String[] args) {
      askName();
      searchName();
      scan.close();
   }

   public static void askName() {
      System.out.println("\nSearch Name? ");
      nameIn = scan.nextLine();
   }
   public static void searchName() {
      int pos=-1;
      boolean flag = false;
      for (String oneName : names) {
         pos ++;
         if (nameIn.equals(oneName)) {
            System.out.println("\nNome Existe! Position: " +pos+ "\n");
            flag = true;
         } 
      }
      if (!flag) {
         System.out.println("\nNome ~Existe! \n");
      }
   }

}