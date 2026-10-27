// package arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ActUm {
   static Scanner scan = new Scanner(System.in);
   static ArrayList<String> names = new ArrayList<>(); 
   static String firstName, lastName, nameIn;

   public static void main(String[] args) {
      askNames();
      showNames();
      searchNames();
      scan.close();
   }

   public static void askNames() {
      for (int i=0; i<5; i++) {
         System.out.println("\nName? ");
         names.add(scan.nextLine());
         if (i == 0) {
            firstName = names.get(i);
         } else if (i == 4) {
            lastName = names.get(i);
         }
      }
   }
   public static void showNames() {
      System.out.println("\n");
      for (String oneName : names) {
         System.out.println("" +oneName);
      }
      System.out.println("First: " +firstName);
      System.out.println("Last:" +lastName);
   }
   public static void searchNames() {
      boolean flag = false;
      System.out.println("Search Name? ");
      nameIn = scan.nextLine();
      for (String oneName : names) {
         if (nameIn.equals(oneName)) {
            System.out.println("Name Found! "); 
            flag = true;
         }
      }
      if (!flag) {
         System.out.println("Name Not Found! "); 
      }
   }
}