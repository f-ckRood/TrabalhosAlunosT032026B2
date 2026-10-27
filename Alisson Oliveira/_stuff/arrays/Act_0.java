import java.util.Scanner;
// import java.util.Random;
// import java.text.NumberFormat;
// import java.util.Locale;
// import java.util.Arrays;
// import java.util.Collections;

public class Act_0 {
   static Scanner scan = new Scanner (System.in);
   static String[] names = new String[5];

   public static void main (String[] args) {
      askNames();
      showNames();
      scan.close();
   }

   public static void askNames() {
      for (int i=0; i<names.length; i++) {
         System.out.println("\n" +i+ " | Name? ");
         names[i] = scan.nextLine();
      }
      System.out.println("\n");
   }
   public static void showNames() {
      for (int i=0; i<names.length; i++) {
         System.out.println(+ i +" | Name: " +names[i]);
      }
      System.out.println("\n");
   }
}

