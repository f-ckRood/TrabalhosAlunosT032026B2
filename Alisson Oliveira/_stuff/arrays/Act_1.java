import java.util.Scanner;
// import java.util.Random;
// import java.text.NumberFormat;
// import java.util.Locale;
// import java.util.Arrays;
// import java.util.Collections;

public class Act_1 {
   static double[] notes = {7, 9, 7, 5, 10};
   static double sum=0, average=0, highest, lowest;
   static int countNotes=0, countStudents=0;

   public static void main (String[] args) {
      Scanner scan = new Scanner (System.in);
      calNotes();
      aboveAverage();
      scan.close();
   }
   
   public static void calNotes() {
      for (double oneNote : notes) {
         countNotes ++;
         sum += oneNote;
      }
      average = sum/countNotes;
      System.out.println("\n");
      System.out.println("Class Average: " +sum/countNotes);
      for (int i=0; i<notes.length; i++) {
         if (i == 0) {
            highest = notes[i];
            lowest = notes[i];
         } else if (notes[i] > highest) {
            highest = notes[i];
         } else if (notes[i] < lowest) {
            lowest = notes[i];
         }
      }
      System.out.println("Highest Grade: " +highest);
      System.out.println("Lowest Grade: " +lowest);
   }
   public static void aboveAverage() {
      for (double oneNote : notes) {
         if (oneNote > average) {
            countStudents ++;
         }
      }
      System.out.println("\nStudents Above: " +countStudents);
      System.out.println("\n");
   }
}

