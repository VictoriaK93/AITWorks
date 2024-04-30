package classwork;


public class Conditions {
 public static void main(String[]args) {

     int x = 30;
     int y = 5;

     if(x + y > 0) {
         System.out.println( x + y + "- this is POSITIVE number");
     } else {
         System.out.println( x + y +"- this is NEGATIVE number");
     }
     int daten = -123;

     if(( daten % 2) == 1 | (daten %2 == -1)) {
         System.out.println(daten + " :is odd number.");
     } else {
         System.out.println(daten + ": is even number");
     }

     int age = 18;

     if(age >= 18) {
         System.out.println(" Вам разрешено действовать самостоятельно");
     } else {
         System.out.println( " Vam nado\n" +
                 " prijti s opekunom.");

     }
 }
}
